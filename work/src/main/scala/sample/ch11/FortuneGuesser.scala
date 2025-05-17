package sample.ch11

import scala.io.StdIn
import scala.util.Random

object FortuneGuesser {
  def main(args: Array[String]): Unit =  {
    val r = new Random
    val ans: Int = r.nextInt(99) + 1;
    var life = 5;
    
    while(life > 0){
      var input = StdIn.readLine("Enter your guess: ").toIntOption.getOrElse(0);
      input.compareTo(ans) match {
        case 1 => println("Too high")
        case -1 => println("Too low")
        case 0 =>
          println("Correct!")
          sys.exit(0)
      }
      life = life - 1;
    }

    println(s"The answer was ${ans}! Better luck next time.")

  }
}