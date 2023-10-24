public class Exception1 
{
    public static void main(String[] args) 
    {
        int Arr[]={1,2,3,4,5};

       
        try
        {
            System.out.println("Element is :"+Arr[4]);
            //System.out.println("Element is :"+Arr[7]);

        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Exception occured:"+obj);
        }
        finally
        {
            System.out.println("End of program...");
        }
        
        

    }    
}
