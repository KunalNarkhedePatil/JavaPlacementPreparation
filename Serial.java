class Demo
{
    public void Display()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class Hello
{
    public void Display()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
public class Serial 
{
   public static void main(String[] args) 
   {
        Demo obj1=new Demo();
        Hello obj2=new Hello();

        obj1.Display();
        obj2.Display();
   }    
}
