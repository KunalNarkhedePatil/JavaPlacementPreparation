class Base
{
    public int iNo;

    public Base()
    {
        System.out.println("Inside Base Constructor...");
        this.iNo=10;
    }
    public void fun()
    {
        System.out.println("Inside Base fun...");
    }
}
class Derived extends Base
{
    public int X;

    public Derived()
    {
        super();
        System.out.println("Inside Derived Constructor...");
    }
    public void gun()
    {
        super.fun();
        System.out.println("Inside Derived gun...");
        System.out.println("Value of iNo:"+super.iNo);
    }
}
class SuperDemo
{
    public static void main(String args[])
    {
        Derived dobj=new Derived();
        dobj.gun();
    }
}