#The Power of Words

#1
words.power <- function() {
  print("The power of words is undeniable")
}

#2
word_meaning <- read.csv('word_meanings.csv')

#3
word_sentiment <- function(phrase) {
  phrase_words <- str_split(phrase, ' ')
  sentiment <- 0
  for (word in phrase_words) {
    if (word_meaning$Word %in% word) {
      sentiment <- sentiment + word_meaning$Sentiment[word_meaning$Word %in% word]
    }
  }
  return(sentiment)
}

#4
sentiment_statistics <- function(words) {
  sentiment_scores <- data.frame()
  for (word in words) {
    sentiment_scores <- rbind(sentiment_scores, c(word, word_sentiment(word)))
  }
  colnames(sentiment_scores) <- c('Word', 'Sentiment Score')
  return(sentiment_scores)
}

#5
word_frequency <- function(sentences) {
  words <- unlist(str_split(sentences, ' '))
  word_table <- as.data.frame(table(words))
  colnames(word_table) <- c('Word', 'Frequency')
  return(word_table)
}

#6
word_clustering <- function(sentences, groups) {
  library(cluster)
  library(ggplot2)
  words <- unlist(str_split(sentences, ' '))
  coordinates <- word_sentiment_coordinates(sentences)
  kmeans_model <- kmeans(coordinates, groups)
  clustering_table <- data.frame()
  for (i in 1:groups) {
    group_words <- words[kmeans_model$cluster == i]
    clustering_table <- rbind(clustering_table, c(paste(group_words, collapse = ', '), round(mean(kmeans_model$centers[i,]), 2)))
  }
  colnames(clustering_table) <- c('Group Words', 'Group Sentiment')
  return(clustering_table)
}

#7
word_sentiment_coordinates <- function(sentence) {
  words <- unlist(str_split(sentence, ' '))
  coordinates <- c()
  for (word in words) {
    coordinates <- rbind(coordinates, c(word_sentiment(word)))
  }
  return(coordinates)
}

#8
word_plot <- function(sentences) {
  library(ggplot2)
  coordinates <- word_sentiment_coordinates(sentences)
  words <- unlist(str_split(sentences, ' '))
  sentiment_plot <- ggplot(data = coordinates, aes(x = coordinates[,1], y = coordinates[,2])) + geom_point(colour = 'darkred') + xlab('Positive Sentiment') + ylab('Negative Sentiment') + ggtitle('Word Sentiment Plot')
  for (i in 1:length(words)) {
    sentiment_plot <- sentiment_plot + annotate("text", x = coordinates[i,1], y = coordinates[i,2], label = words[i], size = 3, fontface = 'bold', hjust = 0, vjust = 0)
  }
  return(sentiment_plot)
}

#9
word_influence <- function(sentences, influence_sentiment) {
  library(dplyr)
  words <- unlist(str_split(sentences, ' '))
  influence_words <- c()
  for (word in words) {
    if (word_sentiment(word) == influence_sentiment) {
      influence_words <- c(influence_words, word)
    }
  }
  greatly_influence_words <- c()
  for (influence_word in influence_words) {
    if (word_sentiment(paste(sentences, influence_word, sep = ' ')) > influence_sentiment) {
      greatly_influence_words <- c(greatly_influence_words, influence_word)
    }
  }
  greatly_influence_words <- data.frame(Word = greatly_influence_words)
  return(greatly_influence_words)
}

#10
word_power_analysis <- function(sentences, groups) {
  sentiment_scores <- sentiment_statistics(sentences)
  word_frequencies <- word_frequency(sentences)
  word_clusters <- word_clustering(sentences, groups)
  word_plot <- word_plot(sentences)
  return(list(sentiment_scores, word_frequencies, word_clusters, word_plot))
}

#11
word_power_summary <- function(sentences) {
  summary_table <- data.frame()
  for (sentiment in c(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)) {
    influence_words <- word_influence(sentences, sentiment)
    summary_table <- rbind(summary_table, c(sentiment, paste(influence_words$Word, collapse = ', ')))
  }
  colnames(summary_table) <- c('Sentiment', 'Influence Words')
  return(summary_table)
}