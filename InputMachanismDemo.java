import java.util.Scanner;

class InputMachanismDemo {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        float fNo = 0.0f;
        double dNo = 0;
        char ch = '\0';
        String str = null;

        System.out.println("Enter integer number");
        iNo = sobj.nextInt();

        System.out.println("Enter float number");
        fNo = sobj.nextFloat();

        System.out.println("Enter double number");
        dNo = sobj.nextDouble();

        System.out.println("Enter character ");
        ch = sobj.next().charAt(0);

        System.out.println("Enter string");
        str = sobj.nextLine();

        System.out.println("iNo is :" + iNo);
        System.out.println("fNo is :" + fNo);
        System.out.println("dNo is :" + dNo);
        System.out.println("ch is :" + ch);
        System.out.println("str is :" + str);

    }
}