/**Square every digit of a number and concatenate them.
 * Note: The function accepts an integer and returns an integer
 */

fun main() {
    squareDigitTest()
}

fun squareDigitTest() {
    println(squareDigit("9119")) //811181
    println(squareDigit("0"))    //0
    println(squareDigit("1234")) //14916
}

fun squareDigit(s: String): String {
    return s.toCharArray().map {
        it.toString().toInt() * it.toString().toInt()
    }.joinToString("")
}
