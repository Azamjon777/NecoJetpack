package com.example.sumindagger2test.example1

class MyComponent {
    private fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTown = ComputerTown(Storage(), Memory(), Processor())

        return Computer(monitor, computerTown, keyboard, mouse)
    }

    fun inject(activity: Activity) {
        //activity.keyboard = Keyboard()
    }
}