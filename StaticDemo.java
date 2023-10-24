//non static characterstic are access by object
//static characterstic are access by class Name
class Demo
{
    public int X;
    //public static int Y=10;  //avoid such type of initialisation
    public static int Y;

    Demo()  //constructor is used to initialise 
    {
        System.out.println("Inside Constructor...");
        this.X=10;
    }
    //static block is used to initialise the static characterstic
    //static block execute when .class file gets loaded into the 
    //JVM
    static
    {
        System.out.println("Inside Static block");
        Y=20;
    }

    //non static method can access static as well as non static characterstic
    public void fun()
    {
        System.out.println("Value of X :"+this.X);  //Allowed
        System.out.println("Value of Y :"+Y); //Allowed
    }
    //static method only access static characterstic
    public static void gun()
    {
        //System.out.println("Value of X :"+this.X);   // Not Allowed
        System.out.println("Value of Y :"+Y);  //Allowed
    }
}
class StaticDemo
{
    public static void main(String[] args) 
    {
        Demo obj=new Demo();

        obj.fun();
        System.out.println("Value of Y :"+Demo.Y);

        obj.gun();
        
    }
}