/**
Create a function add(n)/Add(n) which returns a function that always adds n to any number
Note for Java: the return type and methods have not been provided to make it a bit more challenging.
add_one = add(1)
add_one(3)  # 4
add_three = add(3)
add_three(3) # 6
 */

fun main() {
    addTest()
}


fun add(num1: Int): (Int) -> Int = { x -> x + num1 }

fun addTest() {
    val addOne = add(1)
    println(addOne(3) == 4)
    val addThree = add(3)
    println(addThree(2) == 5)
}

