package questions

object q04 {
  def main(args:Array[String])
  {
    println("Enter the number : ")
    var n = scala.io.StdIn.readInt()
    println(IsEvenOdd(n))
  }
  
  def IsEvenOdd(x:Int):String=
  {
    if (x==0)
      return "Even number"
      
    else if (x==1)
      return "Odd Number"
      
    else
      return IsEvenOdd(x-2)
  }
}