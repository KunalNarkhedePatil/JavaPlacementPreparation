//one class can implements one interface
interface Demo
{
    //characterstic of interface by default public,static,and final and it should be initialised
    int iNo=10;

    public void fun();
    public void gun();
}
class Derived implements Demo
{
    public void fun()
    {
        System.out.println("Inside Derived fun..");
        System.out.println("Value of iNo is :"+iNo);
    }
    public void gun()
    {
        System.out.println("Inside Derived gun..");
    }
}

public class Interface1 
{
    public static void main(String[] args) 
    {
        Derived dobj=new Derived();

        dobj.fun();
        dobj.gun();
    }
}
