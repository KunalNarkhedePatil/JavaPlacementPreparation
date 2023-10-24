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
class Derived1 extends Base
{
   public int A,B;

   public Derived1()
   {
    System.out.println("Inside Derived1 Constructor...");
   }
   public void gun()
   {
        System.out.println("Inside Derived1 gun...");
   }
}
class Derived2 extends Base
{
    public int P,Q;

    public Derived2()
    {
        System.out.println("Inside Derived2 Constructor...");
    }
    public void mun()
    {
        System.out.println("Inside Derived2 mun...");
    }
}
class Hierarchal
{
    public static void main(String args[])
    {
        Derived1 obj1=new Derived1();
        obj1.fun();
        obj1.gun();

        Derived2 obj2=new Derived2();

        obj2.fun();
        obj2.mun();
    }
}