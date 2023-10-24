class Base
{
   public int X,Y;

   Base()
   {
       System.out.println("Inside Base Constructor...");
   }
   public void fun()
   {
      System.out.println("Inside Base fun...");
   }
}
class Derived extends Base
{
   public int A,B;

   public Derived()
   {
    System.out.println("Inside Derived Constructor...");
   }
   public void gun()
   {
        System.out.println("Inside Derived fun...");
   }
}
class SingleLevel
{
    public static void main(String args[])
    {
        Derived obj=new Derived();
        obj.fun();
        obj.gun();
    }
}