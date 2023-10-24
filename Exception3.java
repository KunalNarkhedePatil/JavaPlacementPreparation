//we can also create user define exception

import java.util.Scanner;
class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}
public class Exception3 
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter age");
        int Age=sobj.nextInt();

        try
        {
            if(Age<18)
            {
                throw new AgeInvalid("Age is less than 18");
            }
            else
            {
                System.out.println("You are eligible");
            }
        }
        catch(AgeInvalid obj)
        {
           System.out.println("Exception occured"+obj);
        }
    }    
}
