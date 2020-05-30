package questions

object q03 {
  def main(args:Array[String])
  {
     println("Enter the number : ")
     var n = scala.io.StdIn.readInt()
     println("Addition of 1 to "+n+" is "+sum(n))
  }
  
  def sum(x:Int):Int=
  {
     if (x==0)
       return 0;
     
     else
       return x+sum(x-1)
  }
}