/*Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
 */

fun main() {
    highTest()
}


fun high(str: String) : String {
    val letters = "abcdefghijklmnopqrstuvwxyz"
    var wordMax = 0
    var wordRez = ""
    for (word in str.split(' ')) {
        var wordNew = 0
        for (let in word){
            wordNew += letters.indexOf(let)+1
        }
        if (wordNew > wordMax) {
            wordMax = wordNew
            wordRez = word
        }
    }
    return wordRez
}

fun highTest() {
    println(high("man i need a taxi up to ubud"))                // "taxi"
    println(high("what time are we climbing up the volcano"))    // "volcano
    println(high("take me to semynak"))                          // "semynak"
    println(high("aa b"))                                        // "aa"
    println(high("b aa"))                                        // "b"
}