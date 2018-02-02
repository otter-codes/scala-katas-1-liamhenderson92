package example

object RemoveSpaces extends App {

  import scala.io.StdIn

  val textInput = StdIn.readLine("Enter your text: ")

  println(replace(textInput))

  def replace(newText : String) = {
    newText.replaceAll(" ", "")

  }

}

