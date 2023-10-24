public class OneDArray {
    public static void main(String args[])
    {
        int Arr[]=new int[5];
        Arr[0]=10;
        Arr[1]=20;
        Arr[2]=30;
        Arr[3]=40;
        Arr[4]=50;

        int Brr[]={1,2,3,4,5};
        int Crr[]=new int[]{1,2,3,4,5};

        //access by for
        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
         //access by while
        int i=0;
        while(i<Brr.length)
        {
            System.out.print(Brr[i]+" ");
            i++;
        }
        System.out.println();
         //access by foreach
        for(int no:Crr)
        {
            System.out.print(no+" ");
        }
    }
}
