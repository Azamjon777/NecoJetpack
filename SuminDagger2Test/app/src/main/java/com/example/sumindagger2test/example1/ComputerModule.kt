package com.example.sumindagger2test.example1

import dagger.Module
import dagger.Provides

/*@Module позволяет предоставлять реализацию интерфейсов или экземпляры каких то классов, если на
них нельзя повесить аннотацию @Inject*/
@Module
class ComputerModule {

    /*снизу например мы не можем повесить @Inject, так как это может класс какой то другой
    библиотеки. В таких случаях мы создаем метод возврашающий Monitor(). Dagger Посмотрит на класс
    Monitor() и увидет что нету аннотации @Inject в конструкторе. и поэтому будет искать реализайцию
    в модулях. а модуле найдет соответствующий метод возвращающий Monitor() и вызовит его*/
    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideComputerTown(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTown {
        return ComputerTown(storage, memory, processor)
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTown: ComputerTown,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTown, keyboard, mouse)
    }

    // потом необходимо положить этот модуль внутрь нашего компонента

}