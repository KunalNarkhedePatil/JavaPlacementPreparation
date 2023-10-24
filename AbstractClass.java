abstract class Base
{
   public int X;

   public Base()
   {
      this.X=20;
      System.out.println("Inside Base Constructor....");
   }
   public void fun()
   {
       System.out.println("Inside Base fun...");
       System.out.println("Value of X is :"+this.X);
   }
   public abstract void gun();
}
class Derived extends Base
{
    public int Y;

    public Derived()
    {
         System.out.println("Inside Derived Constructor....");
    }

    public void mun()
    {
        System.out.println("Inside mun...");
    }

    public void gun()
    {
        System.out.println("Inside Derived gun...");
    }
}
public class AbstractClass 
{
   public static void main(String[] args) 
   {
       // Base obj=new Base();  //we can not create object of abstact class because its incomple if they contain abstact method

        Derived dobj=new Derived();

        dobj.fun();
        dobj.gun();
        dobj.mun();
   }    
}
