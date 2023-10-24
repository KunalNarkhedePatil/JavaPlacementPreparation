//one class can inherit other class as well as implement interface also
interface Demo
{
    int i=10;

    public void fun();
    public void gun();
}
class Base
{
    public void mun()
    {
         System.out.println("Inside Base mun..");
    }
    public void sun()
    {
        System.out.println("Inside Base sun..");
    }
}

class Derived extends Base implements Demo //sequence is important
{
     public void fun()
     {
        System.out.println("Inside Derived fun..");
        System.out.println("Value of i is "+i);
     }
     public void gun()
     {
        System.out.println("Inside Derived gun..");
     }
}
class Interface3
{
    public static void main(String[] args)
    {
          Derived obj=new Derived();
          
          obj.fun();
          obj.gun();
          obj.mun();
          obj.sun();
    }
}