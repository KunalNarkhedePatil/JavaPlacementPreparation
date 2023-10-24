//we can write multiple catch block with one try block
import java.util.Scanner;

public class Exception2 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1=sobj.nextInt();

        System.out.println("Enter second number");
        int iNo2=sobj.nextInt();
        try
        {
            int Ans=iNo1/iNo2;
            System.out.println("Division is :"+Ans);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Exception occured:"+obj);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured:"+obj);
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured:"+obj);
        }

        
    }    
}
