package com.example.sumindagger2test.example1

import dagger.Component

//помечаем аннотацией Component, чтобы Dagger сам написал реализацию интерфейса
@Component(modules = [ComputerModule::class])
interface NewComponent {

//    fun getKeyboard(): Keyboard
//
//    fun getMouse(): Mouse
//
//    fun getMonitor(): Monitor

    fun inject(activity: Activity)// после забилдить нужно чтобы даггер создал реализацию

}
