/* Your function takes two arguments:
current father's age (years)
current age of his son (years)
Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
 */

import kotlin.math.abs


fun main() {
    twiceAsOldTest()
}


fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int = abs(dadYearsOld-sonYearsOld*2)
fun twiceAsOldTest() {
    println(twiceAsOld(36,7))       // 22
    println(twiceAsOld(55,30))      // 5
    println(twiceAsOld(42,21))      // 0
    println(twiceAsOld(22,1))       // 20
    println(twiceAsOld(29,0))       // 29
}