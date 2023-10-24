abstract class Base
{
   public int X;    //non static characterstic
   public static int Y;   //static characterstics

   static
   {
       System.out.println("Inside static block");
       Y=20;
   }

   public Base()   //abstract class contain constructor also to initialise non static characterstic  
   {
      this.X=20;
      System.out.println("Inside Base Constructor....");
   }
   public void fun()  //abstract class contain concreat method also
   {
       System.out.println("Inside Base fun...");
       System.out.println("Value of X is :"+this.X);
        System.out.println("Value of Y is :"+Y);
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
