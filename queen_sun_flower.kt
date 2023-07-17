//Kotlin File:

//1
fun main(args : Array<String>) {
    println("The power of words is immense.")
}

//2
class Word {
    var phrase : String = ""
    fun enterPhrase(phrase: String) {
        this.phrase = phrase
    }
    fun printPhrase() {
        println(phrase)
    }
}

//3
fun concatenateWords(words: Array<String>) : String{
    var concatString = ""
    for (word in words) {
        concatString += word
    }
    return concatString
}

//4
fun useWords(phrase : String, fn : (String) -> Unit) {
    print("Using words to say:")
    fn(phrase)
}

//5
fun powerOfWords(): ArrayList<String>{
    val wordList = arrayListOf<String>()
    wordList.add("words ")
    wordList.add("can ")
    wordList.add("transform ")
    wordList.add("the ")
    wordList.add("world.")
    return wordList
}

//6
fun addWords(wordList : ArrayList<String>) {
    wordList.add("From ")
    wordList.add("love ")
    wordList.add("to ")
    wordList.add("hate, ")
    wordList.add("words ")
    wordList.add("have ")
    wordList.add("the ")
    wordList.add("power ")
    wordList.add("to ")
    wordList.add("change.")
}

//7
fun buildPhrase(wordList : ArrayList<String>) : String {
    var phrase = ""
    for (word in wordList) {
        phrase += word
    }
    return phrase
}

//8
fun printThePowerOfWords() {
    val phrase = Word()
    phrase.enterPhrase("The power of words can never be underestimated.")
    phrase.printPhrase()
}

//9
fun displayWords() {
    val sentence = "Words can do amazing things."
    val words = sentence.split(" ")
    for (word in words) {
        println(word)
    }
}

//10
fun sayIt(phrase : String) {
    println(phrase)
}

//11
fun sayWords(phrase : String) {
    useWords(phrase, ::sayIt)
}

//12
fun listPower() {
    val power = powerOfWords()
    addWords(power)
    println(buildPhrase(power))
}

//13
fun messageOfWords() : String{
    return "Words can bring us together or tear us apart."
}

//14
fun sayMessage() {
    println(messageOfWords())
}

//15
fun getMessage() : String{
    return "Words often speak louder than actions."
}

//16
fun spreadMessage() {
    println(getMessage())
}

//17
fun combinePhrases(phrase1: String, phrase2 : String) : String{
    return phrase1 + " " + phrase2
}

//18
fun spreadBothMessages() {
    val phrase1 = messageOfWords()
    val phrase2 = getMessage()
    println(combinePhrases(phrase1, phrase2))
}

//19
fun powerWithAction() {
    println("Words are strong, but actions are even stronger.")
}

//20
fun impactWords() {
    println("The power of words is undeniable.")
}

//21
fun displayAll() {
    printThePowerOfWords()
    displayWords()
    sayWords("Words have power.")
    listPower()
    sayMessage()
    spreadMessage()
    spreadBothMessages()
    powerWithAction()
    impactWords()
    println("The power of words is immense.")
}

//22
fun main() {
    displayAll()
}