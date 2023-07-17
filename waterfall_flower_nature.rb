#The Power of Words

# A program exploring the power of words

#Initialize a string array
words_array = []

#Loop through the alphabet
('a'..'z').each do |letter|

#Create a word using the letter
  word = letter

#Console log each word
  puts word

#Append each word to the string array
  words_array.push(word)

end

#Construct a sentence for each word
words_array.each do |word|
  sentence = "The word '#{word}' is powerful!"
  puts sentence
end

#Print each word in Capitals
words_array.each do |word|
  puts word.upcase
end

#Construct a phrase using all the words
phrase = words_array.join(" ")
puts "The collective power of words is #{phrase}"

#Loop through the string array
words_array.each do |word|

#Remove vowels from each word
  new_word = word.delete('aeiou')
  puts new_word

#Print a message containing all new words
  no_vowels = words_array.map { |word| word.delete('aeiou') }
  puts "The collective power of words without vowels is #{no_vowels.join(" ")}"
end

#Sort the words in the string array
sorted_words = words_array.sort

#Construct a sentence using all sorted words
puts "The collective power of words sorted is #{sorted_words.join(" ")}"

#Find the longest word
longest_word = words_array.max_by(&:length)

#Print a message containing the longest word
puts "The longest word is '#{longest_word}', and it is powerful!"