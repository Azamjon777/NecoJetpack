package com.example.sumindagger2test.example1

import javax.inject.Inject

//мы представляем что это настоящий активити
class Activity {

    //    @Inject //помечаем это поле @Inject так как нужно сделать иньекцию зависимостей в поле
//    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
//
//    val mouse: Mouse = DaggerNewComponent.create().getMouse()
//
//    val monitor: Monitor = DaggerNewComponent.create().getMonitor()

//    @Inject
//    lateinit var keyboard: Keyboard
//
//    @Inject
//    lateinit var mouse: Mouse
//
//    @Inject
//    lateinit var monitor: Monitor

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }

}