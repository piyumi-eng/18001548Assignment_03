package questions

object q05 {
   def main(args:Array[String])
   {
     println("Enter the number : ")
     var n = scala.io.StdIn.readInt()
     println("Addition of all even numbers less than "+n+" is "+sum(n))
   }
   
   def sum(x:Int):Int=
   {
     if (x==0)
       return 0
       
     else if (x%2==0)
       return (x-2)+sum(x-2)
       
     else 
       return (x-1)+sum(x-1)
       
     
   }
  
}