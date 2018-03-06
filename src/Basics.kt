fun main(args: Array<String>) {
    // Variable Assignments
    val sample1: Byte = 0x3a
    var sample2: Byte = 58
    var heartRate: Int = 85
    var deposits: Double = 135002796.0
    val acceleration: Float = 9.800F
    var mass: Float = 14.6F
    var distance: Double = 129.763001
    var lost: Boolean = true // Originally: True
    var expensive: Boolean = true // Originally: True
    var choice: Int = 2
    val integral: Char = '\u222B'
    val greeting: String = "Hello"
    var name: String = "Karen"

    if(sample1.equals(sample2)) {
        println("The samples are equal.")
    } else {
        println("The samples are not equal.")
    }

    if(heartRate in 40..80) {
        println("Heart rate is normal.")
    } else {
        println("Heart rate is not normal.")
    }

    if(deposits >= 100000000 ) {
        println("You are exceedingly wealthy.")
    } else {
        println("Sorry you are so poor.")
    }

    var force: Float = mass * acceleration
    println("force = " + force)

    println("%f is the distance".format(distance))

    if(lost.equals(true)) {
        if(expensive.equals(true)) {
            println("I am really sorry! I will get the manager.")
        } else {
            println("Here is a coupon for 10% off.")
        }
    }

    when (choice) {
        1 -> println("You chose 1.")
        2 -> println("You chose 2.")
        3 -> println("You chose 3.")
        else -> println("You made an unknown choice.")
    }

    println("%c is an integral".format(integral))

    for(i in 5..10) {
        println("i = "+i)
    }

    var age: Int = 0
    while(age < 6) {
        println("age = "+age)
        age++
    }

    println("%s %s".format(greeting, name))
}