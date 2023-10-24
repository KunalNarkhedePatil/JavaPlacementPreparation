//one class can implements more than one interface
interface Demo1
{
    public void fun();
}
interface Demo2
{
    public void gun();
}
class Derived implements Demo1,Demo2
{
    public void fun()
    {
        System.out.println("Inside Derived fun");
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}
public class Interface2 
{
    public static void main(String args[])
    {
        Derived dobj=new Derived();

        dobj.fun();
        dobj.gun();
    }
}
