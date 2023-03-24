package com.example.sumindagger2test.example1

import dagger.Module
import dagger.Provides

/*Если нельзя использовать @Inject в конструкторах, надо использовать модули с аннотацией @Module
* и внутри реализовать функции которые должны вернуть нужные типы*/
@Module
class ComputerModule {


    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
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

}