import scala.io.StdIn

val textInput = StdIn.readLine("Enter some text: ")

val newtext = textInput.replaceAll(" ", "")

print(newtext)


