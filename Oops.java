import java.util.Scanner;

class Arithmathic
{
    public int iNo1;
    public int iNo2;

    public Arithmathic()
    {
        System.out.println("Inside Default Construtor...");
    }
    public Arithmathic(int iNo1,int iNo2)
    {
        this.iNo1=iNo1;
        this.iNo2=iNo2;
    }
    public int Addition()
    {
        return this.iNo1+this.iNo2;
    }
}
class Oops
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1=sc.nextInt();

        System.out.println("Enter second number");
        int iNo2=sc.nextInt();

        Arithmathic obj=new Arithmathic(iNo1,iNo2);

        int iRet=obj.Addition();

        System.out.println("Addition is :"+iRet);
    }
}