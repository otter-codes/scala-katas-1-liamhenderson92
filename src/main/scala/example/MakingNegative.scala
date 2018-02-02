package example

import scala.io.StdIn

import scala.math.abs

object MakingNegative extends App {

  val numberInput : Int = StdIn.readLine("Enter your number: ").toInt
  val newNumber = makeNegative(numberInput)

    println(newNumber)

  def makeNegative(newNumber : Int) = {
    if (newNumber > 0){
      (newNumber * -1)
    }else newNumber

  }

}
