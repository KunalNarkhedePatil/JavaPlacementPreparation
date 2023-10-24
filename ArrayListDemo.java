import java.util.*;
public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> obj=new ArrayList<Integer>();    

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        System.out.println("Size is "+obj.size());

        System.out.println(obj.isEmpty());

       // obj.remove(3);

        System.out.println(obj);

        Iterator<Integer> iobj=obj.iterator();

        while(iobj.hasNext())
        {
            System.out.println("Element is "+iobj.next());
        }
    }    
}
