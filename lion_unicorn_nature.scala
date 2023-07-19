//Here's 2000 lines of Scala code to illustrate the power of words!

//Lines 1-50
object ThePowerOfWords {
  def main(args: Array[String]): Unit = {
    println("Words have the power to shape our thoughts, inform our decisions, and influence our actions.")
    println("It's no wonder that words are often used to hold people back, as well as to lift them up.")
    println("In this code, we explore the power of words to reveal the deeper meaning and emotion behind them.")
    println()

    val words = List(
      "love",
      "truth",
      "freedom",
      "joy",
      "hope",
      "kindness",
      "compassion",
      "courage",
      "forgiveness",
      "gratitude",
      )

    def wordPower(word: String): String = {
      word match {
        case "love" => 
          "Love is the basis for all other emotions and is the most powerful force in the universe."
        case "truth" =>
          "Truth is not only about facts, but involves principles and values as well."
        case "freedom" =>
          "Freedom is the right to do what we choose, be who we choose, and think how we choose."
        case "joy" =>
          "Joy is an emotion that comes from within and is the result of gratitude and contentment."
        case "hope" =>
          "Hope is the belief and expectation that good can come from difficult or challenging situations."
        case "kindness" =>
          "Kindness is a form of respect and is found in small acts of generosity and thoughtfulness."
        case "compassion" =>
          "Compassion is the ability to understand the feelings of another and to take action to help."
        case "courage" =>
          "Courage is the strength to confront fear and to take risks even when it seems impossible."
        case "forgiveness" =>
          "Forgiveness is the ability to let go of resentment and anger and to accept the past."
        case "gratitude" =>
          "Gratitude is the acknowledgement and appreciation of the people, places, and things in our lives."
        case _ =>
          "That word is not in the list."
      }
    }

    println("Let's explore the meaning of some words...")
    words.foreach { word =>
      println(s"The power of '$word' is: ${wordPower(word)}")
    }
    println()
    println("As you can see, words have tremendous power. Choose your words carefully!")
  }
}

//Lines 51-100
object WordsToActions {
  def main(args: Array[String]): Unit = {
    println("The power of words can extend beyond understanding and into action.")
    println("Let us explore how words can help us act for the betterment of ourselves and others.")
    println()

    val words = List(
      "listen",
      "inspire",
      "connect",
      "create",
      "encourage",
      "explore",
      "celebrate",
      "persist",
      "nurture",
      "acknowledge",
      )

    def wordAction(word: String): String = {
      word match {
        case "listen" => 
          "Listen to others without judgement to gain understanding and perspective."
        case "inspire" =>
          "Inspire others by living your dreams and sharing your knowledge and experience."
        case "connect" =>
          "Connect with others by building trusting relationships and working together."
        case "create" =>
          "Create something new and beautiful, and explore possibilities beyond what you know."
        case "encourage" =>
          "Encourage and empower others by recognizing and celebrating their successes."
        case "explore" =>
          "Explore new ideas and experiences to gain knowledge and expand your horizons."
        case "celebrate" =>
          "Celebrate the diversity of people and experiences and learn something from everyone."
        case "persist" =>
          "Persist in the face of challenges and set-backs to keep moving forward towards your goals."
        case "nurture" =>
          "Nurture yourself and others with kindness and self-care, to maintain balance and well-being."
        case "acknowledge" =>
          "Acknowledge the power of words to help us express our thoughts and feelings."
        case _ =>
          "That word is not in the list."
      }
    }

    println("Let's put some words into action...")
    words.foreach { word =>
      println(s"One way to use the word '$word' is to: ${wordAction(word)}")
    }
    println()
    println("By taking action, words can become a powerful force for positive change in our world!")
  }
}

//Lines 101-150
object WordsInContext {
  def main(args: Array[String]): Unit = {
    println("Words have the power to convey more than just their literal meaning.")
    println("Let us explore how words can be used in different contexts to convey a variety of messages.")
    println()

    val words = List(
      "strength",
      "joyful",
      "resilience",
      "renewal",
      "freedom",
      "vibrant",
      "harmony",
      "renaissance",
      "entrepreneurial",
      "dynamic",
      )

    def contextMeaning(word: String): String = {
      word match {
        case "strength" => 
          "Strength can be physical, mental, and emotional, and is found in persevering through challenges."
        case "joyful" =>
          "Joyful living involves embracing the present moment as well as the good that life brings us."
        case "resilience" =>
          "Resilience is the ability to bounce back from life's challenges with courage and determination."
        case "renewal" =>
          "Renewal is the process of rediscovering our true selves and allowing our lives to be refreshed."
        case "freedom" =>
          "Freedom is the right to choose our lifestyles, experiences, and beliefs without restrictions."
        case "vibrant" =>
          "A vibrant life is full of energy, enthusiasm, and creativity, fuelled by a positive attitude."
        case "harmony" =>
          "Harmony is the balance of different elements in our lives working together for harmony and balance."
        case "renaissance" =>
          "A renaissance is the rebirth of culture and art, involving growth, change, and creativity."
        case "entrepreneurial" =>
          "Entrepreneurial spirit is the drive and ambition to create something valuable for the world."
        case "dynamic" =>
          "A dynamic life is one that is always changing and evolving, while staying true to our values."
        case _ =>
          "That word is not in the list." 
      }
    }

    println("Let's explore the meaning of words in different contexts...")
    words.foreach { word =>
      println(s"The meaning of '$word' in context is: ${contextMeaning(word)}")
    }
    println()
    println("Words have the power to evoke a range of emotions and inspire change in the world.")
  }
}

//Lines 151-200
object WordsForChange {
  def main(args: Array[String]): Unit = {
    println("The power of words can extend beyond self-improvement and into social change.")
    println("Let us explore how words can be used to drive progress and create a better world.")
    println()

    val words = List(
      "equality",
      "solidarity",
      "democracy",
      "accountability",
      "dignity",
      "compassion",
      "advocacy",
      "empowerment",
      "inclusion",
      "sustainability",
      )

    def wordChange(word: String): String = {
      word match {
        case "equality" => 
          "Equality is the understanding that all people have the right to be treated as equals."
        case "solidarity" =>
          "Solidarity is standing in unison with others to achieve a common goal, with respect and compassion."
        case "democracy" =>
          "Democracy is based on the principle of self-rule by the people, with participation and consent."
        case "accountability" =>
          "Accountability is the responsibility for our decisions and actions, and taking ownership of their outcomes."
        case "dignity" =>
          "Dignity is the right to respect and be treated with worth and self-respect, no matter our differences."
        case "compassion" =>
          "Compassion is understanding and empathy towards others, and taking action to help those in need."
        case "advocacy" =>
          "Advocacy is speaking out in support of our beliefs and advocating for positive change in our world."
        case "empowerment" =>
          "Empowerment is the act of believing in oneself and others, and having an active voice in society."
        case "inclusion" =>
          "Inclusion is the understanding that everyone is unique and contributing in their own ways to the world."
        case "sustainability" =>
          "Sustainability is the conscious effort to protect and preserve our environment and resources for future generations."
        case _ =>
          "That word is not in the list."
      }
    }

    println("Let's put some words into action for social change...")
    words.foreach { word =>
      println(s"The concept of '$word' is: ${wordChange(word)}")
    }
    println()
    println("Words have the power to ignite positive change in our society, and make the world a better place!")
  }
}

//Lines 201-250
object WordsInTheWorld {
  def main(args: Array[String]): Unit = {
    println("The power of words is immense, and can be found throughout our world and beyond.")
    println("Let us explore the many expressions of words in different cultures and languages.")
    println()

    val words = List(
      "começar",
      "encontrar",
      "abrazar",
      "comprender",
      "perdonar",
      "crecer",
      "volver",
      "soñar",
      "caminar",
      "mirar",
      )

    def wordMeaning(word: String): String = {
      word match {
        case "começar" => 
          "Começar in Portuguese means to start, to begin a journey or a new chapter of life."
        case "encontrar" =>
          "Encontrar in Spanish means to find, to discover something new or unexpected in the world."
        case "abrazar" =>
          "Abrazar in Spanish means to embrace, to bring together and to show love and acceptance."
        case "comprender" =>
          "Comprender in Spanish means to understand, to gain insight and knowledge from experience."
        case "perdonar" =>
          "Perdonar in Spanish means to forgive, to let go of anger and forgive oneself and others."
        case "crecer" =>
          "Crecer in Spanish means to grow, to develop and to improve oneself with each passing day."
        case "volver" =>
          "Volver in Spanish means to return, to come back to something that once was, but now is different."
        case "soñar" =>
          "Soñar in Spanish means to dream, to imagine and to bring to life that which was once only in thought."
        case "caminar" =>
          "Caminar in Spanish means to walk, to take small steps and to keep on going forward in life."
        case "mirar" =>
          "Mirar in Spanish means to look, to notice and take in the beauty of the world around us."
        case _ =>
          "That word is not in the list."
      }
    }

    println("Let's explore the power of words in different languages...")
    words.foreach { word =>
      println(s"The meaning of '$word' is: ${wordMeaning(word)}")
    }
    println()
    println("Words have the power to cross boundaries of culture, language, and time, and to bring us closer together.")
  }
}

//Lines 251-300
object WordsAreEverything {
  def main(args: Array[String]): Unit = {
    println("Words have the power to do more than inform, persuade, or influence.")
    println("Let us explore how words have the power to transform our lives and our world.")
    println()

    val words = List(
      "inspire",
      "uplift",
      "motivate",
      "teach",
      "insight",
      "connect",
      "encourage",
      "transform",
      "discover",
      "enlighten",
      )

    def wordPower(word: String): String = {
      word match {
        case "inspire" => 
          "Inspire others to dream big and to take action to make those dreams a reality."
        case "uplift" =>
          "Uplift those around you and in your community with your kind words, actions, and energy."
        case "motivate" =>
          "Motivate yourself and others to keep learning and growing, and to find the joy in life's journey."
        case "teach" =>
          "Teach others to be kind and compassionate, to think for themselves and challenge the status quo."
        case "insight" =>
          "Gain insight into the minds and hearts of others, and use it to better understand our world."
        case "connect" =>
          "Connect with others, and recognize the common humanity we all share, despite our differences."
        case "encourage" =>
          "Encourage and empower those around you to think independently, take risks, and lead the way."
        case "transform" =>
          "Transform your life and the lives of others by taking small steps every day to make a positive difference."
        case "discover" =>
          "Discover the beauty in everyday life, the joy in simple experiences, and the purpose in our lives."
        case "enlighten" =>
          "Enlighten yourself and the world around you, spreading knowledge, understanding and acceptance."
        case _ =>
          "That word is not in the list."
      }
    }

    println("Let's explore the power of words in our world...")
    words.foreach { word =>
      println(s"One way to use the word '$word' to is to: ${wordPower(word)}")
    }
    println()
    println("Words have the power to bring people together, to create understanding and to bring about positive change.")
  }
}

//Lines 301-350
object WordsInTheUniverse {
  def main(args: Array[String]): Unit = {
    println("The power of words can go beyond what we see in our world and into the universe.")
    println("Let us explore how