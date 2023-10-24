class Base
{
   public int X;

   public Base()
   {
      System.out.println("Inside Base Constructor...");
   }
   public void fun()
   {
        System.out.println("Inside Base fun");
   }
   public void gun()
   {
    System.out.println("Inside Base gun");
   }
}
class Derived extends Base
{
    public int Y;
    public Derived()
    {
        System.out.println("Inside Derived Constructor...");
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
    public void sun()
    {
System.out.println("Inside Derived sun");
    }
}
public class OverridingDemo 
{
    public static void main(String args[])    
    {
        Base obj=new Derived();

        obj.fun();
        obj.gun();
        //obj.sun();
    }
}
