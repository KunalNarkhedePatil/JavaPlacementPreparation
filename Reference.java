class Demo
{
    public int iNo;

    public void fun()
    {
        System.out.println("Jay Ganesh....");
    }
}
public class Reference {
    public static void main(String rags[])
    {
        Demo obj;    //its reference
        obj=new Demo();   //now its object
        obj.fun();
    }
}
