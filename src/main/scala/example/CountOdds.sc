import scala.io.StdIn

def isEven(number: Int) = number % 2 == 0
def isOdd(number: Int) = !isEven(number)

val enteredVal = StdIn.readLine("Enter a number: ").toInt


val oddnumbers = List.range(0,999999999)