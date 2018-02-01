package example

object RemoveSpaces extends App {

  import scala.io.StdIn

  val textInput = StdIn.readLine("Enter your text: ")

  val newtext = textInput.replaceAll(" ", "")

  println(s"Your text with no spaces is $newtext")

}
