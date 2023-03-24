package com.example.sumindagger2test.example1

import javax.inject.Inject

//мы представляем что это настоящий активити
class Activity {

    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }

}