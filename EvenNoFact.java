import java.io.*;

class EvenNoFact
{
  public static void evenNoFact(int n)
{ 
  for(int i=1;i<=n;i++)
  {
     if(i%2==0)
    {
      Factorial f=new Factorial();
      System.out.println("Factorial of the number "+i+" is"+f.fact(i));
    }
  }
}
  public static void main(String[] args)
{ 
   evenNoFact(Integer.parseInt(args[0]));
} 
}
    
   