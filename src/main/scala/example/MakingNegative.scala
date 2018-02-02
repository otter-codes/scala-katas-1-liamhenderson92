package example

import scala.io.StdIn

import scala.math.abs

object MakingNegative extends App {

  val numberInput : Int = StdIn.readLine("Enter your number: ").toInt


  if(numberInput > 0){

    println((numberInput * -1))
  }
  else
    println(numberInput)
}
