class Demo
{
   public int X;
   //public final int Y=10;    avoid such type declaration
   public final int Y;

   public Demo()
   {
      this.X=10;
      this.Y=20;
   }

   public void fun()
   {
      X++;
      //Y++;  can't change final characterstics

      System.out.println("Value of X is "+this.X);
      System.out.println("Value of Y is "+this.Y);
   }

}
public class FinalCharactersticDemo {
    public static void main(String[] args) 
    {
         Demo dobj=new Demo();

         dobj.fun();

         dobj.X++;
         //dobj.Y++;  can't change final characterstics

         System.out.println("Value of X is "+dobj.X);
         System.out.println("Value of Y is "+dobj.Y);


    }
}
