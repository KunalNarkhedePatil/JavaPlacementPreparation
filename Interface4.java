interface Base
{
    public void fun();
}
interface Derived extends Base
{
    public void gun();
}
class DerivedX implements Derived
{
    public void fun()
    {
        System.out.println("Inside DerivedX fun....");
    }
    public void gun()
    {
        System.out.println("Inside DerivedX gun....");
    }
}
public class Interface4 
{
    public static void main(String[] args) 
    {
        DerivedX dobj=new DerivedX();

        dobj.fun();
        dobj.gun();
    }    
}
