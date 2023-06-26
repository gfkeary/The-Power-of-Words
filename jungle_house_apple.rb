class PowerOfWords
  # Initialize a new instance of the PowerOfWords class
  def initialize
    @words = []
  end

  # Adds the given words to the @words array
  def add_words(words)
    @words.push(*words)
  end

  # Returns the count of words in the @words array
  def word_count
    @words.count
  end

  # Returns an array of unique words from the @words array
  def unique_words
    @words.uniq
  end

  # Returns true if the given word is present in the @words array
  def word_present?(word)
    @words.include?(word)
  end

  # Shuffles the words in the @words array
  def shuffle_words
    @words.shuffle!
  end

  # Returns the longest word from the @words array
  def longest_word
    @words.max_by(&:length)
  end

  # Counts the occurrences of each word in the @words array
  def word_occurrences
    counts = Hash.new(0)
    @words.each { |word| counts[word] += 1 }
    counts
  end

  # Finds all the words with the given lengthin the @words array
  def find_words_by_length(length)
    @words.select { |word| word.length == length }
  end

  # Truncates the @words array to the given size
  def truncate_words(size)
    @words = @words[0...size]
  end

  # Deletes all the words matching the given string 
  # from the @words array
  def delete_words(string)
    @words.delete_if { |word| word.include?(string) }
  end

  # Reverses the words in the @words array
  def reverse_words
    @words.map!(&:reverse)
  end

  # Converts string to symbol all the words in @words array
  def string_to_symbol
    @words.map!(&:to_sym)
  end
  
  # Returns the average length of words in the @words array
  def avg_word_length
    @words.map(&:length).inject(:+).fdiv(@words.size)
  end
  
  #Joins all the words in the @words array
  def join_words
    @words.join(' ')
  end
  
  # Returns all the words starting with the given letter
  def words_starting_with(letter)
    @words.select { |word| word[0] == letter }
  end

end