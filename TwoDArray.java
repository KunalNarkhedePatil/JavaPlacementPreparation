public class TwoDArray {
    public static void main(String[] args) {
        int Arr[][]=new int[2][2];

        Arr[0][0]=10;
        Arr[0][1]=20;
        
        Arr[1][0]=30;
        Arr[1][1]=40;

        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
