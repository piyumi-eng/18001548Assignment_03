package questions

object q06 {
  def main(args:Array[String])
  {
    println("Enter the number : ")
    var n = scala.io.StdIn.readInt()
    println("The Fibonacci Sequence of "+n+" is,")
    println(fibonacci_sequence(n))
  }
  
  def fibonacci(x:Int):Int=
  {
    if (x==0)
      return 0
     
    if (x==1)
      return 1
      
    else
      return fibonacci(x-1)+fibonacci(x-2)
  }
  
  def fibonacci_sequence(y:Int):Unit=
  {
    if (y>0)
      fibonacci_sequence(y-1)
      println(fibonacci(y))
  }
}