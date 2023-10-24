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
        System.out.println("Inside Derived gun...");
   }
}
class DerivedX extends Derived
{
    public int P,Q;

    public DerivedX()
    {
        System.out.println("Inside DerivedX Constructor...");
    }
    public void mun()
    {
        System.out.println("Inside DerivedX mun...");
    }
}
class MultiLevel
{
    public static void main(String args[])
    {
        DerivedX obj=new DerivedX();
        obj.fun();
        obj.gun();
        obj.mun();
    }
}