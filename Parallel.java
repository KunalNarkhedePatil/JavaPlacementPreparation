class Demo extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured "+obj);
        }
    }
}
public class Parallel 
{
    public static void main(String[] args) throws Exception 
    {
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();

        System.out.println("End of main");

    }
}
