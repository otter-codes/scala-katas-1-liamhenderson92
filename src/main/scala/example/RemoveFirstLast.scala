package example

import scala.io.StdIn

object RemoveFirstLast extends App {

  val textInput = StdIn.readLine("Enter your text: ")
  val newText = removeFirstLast(textInput)

  println(s"Your text without the first and last characters is: $newText")

  def removeFirstLast(newText : String) = {
    newText.drop(1).dropRight(1)
  }

}
