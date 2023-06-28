object PowerOfWords {
  def main(args: Array[String]): Unit = {
    val words: Array[String] = Array("strong", "courage", "worthiness", "character", "resilience", "confidence", "honesty", "trust", 
      "spirituality", "inspiration", "determination", "optimism", "gratitude", "kindness", "love", "wisdom", "persistence", 
      "forgiveness", "vision", "insight", "passion") 

    def stringToWord(str: String): Unit = {
      str.split(" ").foreach(word => println(word))
    }

    def stringToSentence(str: String): Unit = {
      str.split(".").foreach(sentence => println(sentence))
    }

    // prints the words in the words array
    println("The power of words: ")
 	words.foreach(word => println(word))

    println("\n")
    // prints the words in the phrase
    println("The power of words in a phrase: ")
    val phrase = "Words have power, and they are the most powerful weapon we can use to shape our lives and the lives of others."
    stringToWord(phrase)

    println("\n")
    // prints out the sentences in the poem
    println("The power of words in a poem: ")
    val poem = """
    Some words are sharp like a knife,
    That cut deep and leave a scar.
    Other words are sweet like honey,
    That make us feel like we can do anything, no matter how hard."""
    stringToSentence(poem)
  }
}