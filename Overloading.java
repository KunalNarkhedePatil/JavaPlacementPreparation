class Demo
{
    public void Addition(int iNo1,int iNo2)
    {
        System.out.println("Addition is "+(iNo1+iNo2));
    }
    public void Addition(int iNo1,int iNo2,int iNo3)
    {
        System.out.println("Addition is "+(iNo1+iNo2+iNo3));
    }
    public void Addition(float fNo1,float fNo2)
    {
        System.out.println("Addition is "+(fNo1+fNo2));
    }
    public void fun(float fNo1,int iNo2)
    {
        System.out.println("One float and one int");
    }
    public void fun(int iNo1,float fNo2)
    {
        System.out.println("One int and one float");
    }
}
public class Overloading 
{
    public static void main(String args[])    
    {
        Demo dobj=new Demo();

        dobj.Addition(10, 20);
        dobj.Addition(10,20,30);
        dobj.Addition(10.20f, 20.20f);
        dobj.fun(10,20.20f);
        dobj.fun(20.20f, 10);
    }
}
