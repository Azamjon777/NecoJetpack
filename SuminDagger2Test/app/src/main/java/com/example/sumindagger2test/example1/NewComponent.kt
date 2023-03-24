package com.example.sumindagger2test.example1

import dagger.Component

//помечаем аннотацией Component, чтобы Dagger сам написал реализацию интерфейса
@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)

}
