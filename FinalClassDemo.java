//if class is final then we can not inherit that class
//final class Base
class Base
{
    public int X;

    public void fun()
    {
        System.out.println("Inside Base fun method....");
    }
}
class Derived extends Base
{
    public int Y;

    public void gun()
    {
        System.out.println("Inside Derived gun method....");
    }
}
public class FinalClassDemo 
{
    public static void main(String[] args) 
    {
        Derived dobj=new Derived();

        dobj.fun();
        dobj.gun();
    }    
}
