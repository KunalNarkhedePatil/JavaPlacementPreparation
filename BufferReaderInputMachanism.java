import java.io.*;
class BufferReaderInputMachanism
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader iobj=new InputStreamReader(System.in);

        BufferedReader obj=new BufferedReader(iobj);

        System.out.println("Enter name");
        String str=obj.readLine();

        System.out.println("Enter Age");
        int Age=Integer.parseInt(obj.readLine());

        System.out.println("Name is "+str);
        System.out.println("Age is "+Age);


    }
}