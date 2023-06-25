class PowerOfWords
  def initialize
    @words = []
  end
  
  def add_word(word)
    @words.push(word)
  end
  
  def get_words
    return @words
  end
  
  def combine_words
    sentence = ""
    @words.each do |word| 
      sentence += word + " "
    end 
    return sentence
  end
  
  def insert_synonym(word, index)
    thesaurus = {
      "strong" => ["powerful", "sturdy", "robust"],
      "eloquent" => ["expressive", "articulate", "persuasive"],
      "inspire" => ["motivate", "encourage", "uplift"]
    }
    synonyms = thesaurus[word]
    @words.insert(index, synonyms[rand(synonyms.length)])
  end
  
  #Counts the number of words in the sentence
  def count_words 
    return @words.length
  end 
  
  #Finds the index of a given word in the sentence
  def search_word(word)
    index = 0
    @words.each do |w| 
      if (w == word) 
        return index 
      end
      index += 1
    end
    return -1
  end
  
  #Replaces one word with another throughout the entire sentence
  def replace_word(word_to_replace, new_word)
    index = 0 
    @words.each do |word|
      if (word == word_to_replace)
        @words[index] = new_word
      end
      index += 1
    end
  end
  
  #Determines if two sentences have the same words (in any order)
  def compare(other_sentence)
    other_words = other_sentence.split(" ")
    if other_words.length != @words.length
      return false
    end
    @words.each do |word| 
      if !other_words.include? word
        return false 
      end
    end
    return true
  end 
  
  #Removes all words from the sentence
  def clear_words
    @words.clear
  end
  
  #Adds punctuation to the end of the sentence
  def add_punctuation(punctuation)
    @words.push(punctuation)
  end
  
  #Changes the capitalization of the sentences
  def change_capitalization
    index = 0 
    @words.each do |word|
      @words[index] = word.swapcase
      index += 1
    end
  end
  
  #Determines if the sentence starts and ends with the same word 
  def check_first_last
    return @words[0] == @words[@words.length - 1]
  end
end

poetry = PowerOfWords.new
poetry.add_word("The")
poetry.add_word("power")
poetry.add_word("of")
poetry.add_word("words")
poetry.add_word("is")
poetry.insert_synonym("strong", 2)
poetry.add_word("and")
poetry.insert_synonym("eloquent", 4)
poetry.add_word("and")
poetry.insert_synonym("inspire", 6)
poetry.add_punctuation("!")
puts poetry.combine_words