//if method is final then it not be override
class Base
{
    public int X;

    public void fun()
    {
        final int iNo=10; //we can also create final variable
        //iNo++;
        System.out.println("Inside Base fun...");
    }
    public  final void gun()
    {
        
        System.out.println("Inside Base gun...");
    }
}
class Derived extends Base
{
    public int Y;

    public void gun()   //can not override because its gun is final in Base class
    {
        System.out.println("Inside Derived gun...");
    }
}
public class FinalMethodDemo 
{
   public static void main(String[] args) 
   {
        Base obj=new Derived();

        obj.fun();
        //obj.gun();
   }
}
