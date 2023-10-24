public class JaggedArray {
    public static void main(String[] args) {
        int Arr[][]=new int[3][];

        Arr[0]=new int[3];
        Arr[1]=new int[2];
        Arr[2]=new int[3];

        Arr[0][0]=1;
        Arr[0][1]=2;
        Arr[0][2]=3;
        Arr[1][0]=4;
        Arr[1][1]=5;
        Arr[2][0]=6;
        Arr[2][1]=7;
        Arr[2][2]=8;

        System.out.println("Jagged Array...");
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
