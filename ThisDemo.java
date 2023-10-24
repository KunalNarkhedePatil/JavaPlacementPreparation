class Demo
{
    public int iNo;

    public Demo()
    {
        this(10);
        System.out.println("Inside Default Constructor...");
    }
    public Demo(int iNo)
    {
        System.out.println("Inside Parameterised Constructor...");
        this.iNo=iNo;
    }
    public void fun()
    {
        this.gun();
        System.out.println("Inside fun...");
    }
    public void gun()
    {
        System.out.println("Inside gun...");
        System.out.println("Value of iNo:"+this.iNo);
    }
}
public class ThisDemo 
{
    public static void main(String args[])    
    {
        Demo obj=new Demo();

        obj.fun();
    }
}
