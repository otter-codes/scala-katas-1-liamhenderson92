package example

import scala.io.StdIn

import scala.math.abs

object MakingNegative extends App {

  val numberInput : Int = StdIn.readLine("Enter your number: ").toInt

  

//  val newNumber : Int

  if(numberInput > 0){

//    (numberInput*-1 = newNumber)

    println("-" + numberInput)
  }
  else
    println(numberInput)
}
