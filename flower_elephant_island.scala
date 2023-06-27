object ThePowerOfWords {

  // Lines 1 - 10
  val words = Seq("kindness","compassion","encouragement","love","gratitude","forgiveness","patience","trust","unity","hope")

  def createPositiveVibe(words: Seq[String]): Option[String] = {
    Some(words.mkString(" "))
  }

  def createPositiveEnergy(words: Seq[String]): Option[String] = {
    Some(words.map(_.capitalize).mkString(" "))
  }

  def transformIntoPower(words: Seq[String]): Option[String] = {
    Some(words.map(_.toUpperCase).mkString(" "))
  }

  def createMotivationalMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s"""
        |The power of words is strong! Speak only with ${positiveVibe}.
        |Express with ${positiveEnergy} to create a positive environment.
        |${power} brings the power to lead and inspire!
        |""".stripMargin
  }

  // Lines 11 - 20
  def createInspiringMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s"""
        |Let ${positiveVibe} be your guide.
        |Bring ${positiveEnergy} to every interaction.
        |Lead with ${power} to create a lasting impact.
        |""".stripMargin
  }

  def createEmpoweringMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s"""
        |Words have the power to move mountains.
        |Speak of ${positiveVibe} and you will be heard.
        |Express with ${positiveEnergy} to create an atmosphere of trust.
        |Lead with ${power} and let your message be felt.
        |""".stripMargin
  }

  // Lines 21 - 30
  def createPowerMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s"""
        |Use ${positiveVibe} to build bridges and connect with others.
        |Express with ${positiveEnergy} to empower and inspire. 
        |Lead with ${power} to create lasting change in the world.
        |""".stripMargin
  }

  def createUpliftingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s"""
        |Choose ${positiveVibe} to spread a message of joy.
        |Express with ${positiveEnergy} to make the world a better place.
        |Lead with ${power} and take the first step towards a brighter future.
        |""".stripMargin
  }

  // Lines 31 - 40
  def createInspirationalMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s"""
        |Speak with ${positiveVibe} and transform your world.
        |Express with ${positiveEnergy} and create a positive atmosphere.
        |Lead with ${power} to create powerful and lasting change.
        |""".stripMargin
  }

  def createTransformationalMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |Words have the power to bring light to dark places.
        |Speak with ${positiveVibe} to create a safe haven.
        |Express with ${positiveEnergy} to inspire and empower others.
        |Lead with ${power} to create an environment of acceptance and understanding.
        |"""
  }

  // Lines 41 - 50
  def createEnergizingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can open doors.
        |Speak of ${positiveVibe} to create a path forward.
        |Express with ${positiveEnergy} to encourage and heal.
        |Lead with ${power} to ignite sparks of transformation.
        |"""
  }

  def createEnlighteningMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words has no boundaries.
        |Speak with ${positiveVibe} to bring peace and harmony.
        |Express with ${positiveEnergy} to share knowledge and understanding.
        |Lead with ${power} to create a culture of respect and cooperation.
        |"""
  }

  // Lines 51 - 60
  def createImpactingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can have a deep impact.
        |Speak with ${positiveVibe} to foster connection and belonging.
        |Express with ${positiveEnergy} to have a positive influence.
        |Lead with ${power} to empower and inspire.
        |"""
  }

  def createUnitingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can bring people together.
        |Speak with ${positiveVibe} to foster understanding and respect.
        |Express with ${positiveEnergy} to promote collaboration and teamwork.
        |Lead with ${power} to create unity and harmony.
        |"""
  }

  // Lines 61 - 70
  def createUpliftingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can lift people up.
        |Speak of ${positiveVibe} to create an atmosphere of positivity.
        |Express with ${positiveEnergy} to raise spirits and motivate.
        |Lead with ${power} to bring joy and hope.
        |"""
  }

  def createNurturingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can nurture and heal.
        |Speak of ${positiveVibe} to offer comfort and support.
        |Express with ${positiveEnergy} to build relationships and trust.
        |Lead with ${power} to encourage and empower.
        |"""
  }

  // Lines 71 - 80
  def createTransformingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can transform lives.
        |Speak with ${positiveVibe} to inspire courage and strength.
        |Express with ${positiveEnergy} to create a safe environment.
        |Lead with ${power} to effect change and make a difference.
        |"""
  }

  def createRestoringMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can restore faith.
        |Speak of ${positiveVibe} to kindle hope and courage.
        |Express with ${positiveEnergy} to bring peace and joy.
        |Lead with ${power} and spread love and kindness.
        |"""
  }

  // Lines 81 - 90
  def create ImpactfulMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can have a lasting impact.
        |Speak with ${positiveVibe} to bring about positive change.
        |Express with ${positiveEnergy} to manifest a new reality.
        |Lead with ${power} and create a better world.
        |"""
  }

  def createRevitalizingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can revive the soul.
        |Speak of ${positiveVibe} to bring harmony and balance.
        |Express with ${positiveEnergy} to promote growth and healing.
        |Lead with ${power} and create a brighter future.
        |"""
  }

  // Lines 91 - 100
  def createGratefulMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can help us to remember.
        |Speak with ${positiveVibe} to express our gratitude.
        |Express with ${positiveEnergy} to honor who we are.
        |Lead with ${power} and embrace the joy of life.
        |"""
  }

  def createLiberatingMessage(words: Seq[String]): Option[String] = {
    for {
      positiveVibe <- createPositiveVibe(words)
      positiveEnergy <- createPositiveEnergy(words)
      power <- transformIntoPower(words)
    } yield
      s""" 
        |The power of words can free us from the shackles of our past.
        |Speak with ${positiveVibe} to open the door to a new future.
        |Express with ${positiveEnergy} to create possibilities for growth and renewal.
        |Lead with ${power} and celebrate the unlimited potential of humanity.
        |"""
  }

  def main(args: String*) : Unit = {
    val message = createInspirationalMessage(words)
    message.foreach(println)
  }


}