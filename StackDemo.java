import java.io.*;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;
public class StackDemo 
{
    public static void main(String[] args) 
    {
        Stack<Integer> obj=new Stack<Integer>();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);

        obj.add(3, 23);

        obj.addElement(21);

        // Object copy=obj.clone();

        // System.out.println(copy);

        obj.remove(3);
        obj.pop();

        System.out.println("Capacity:"+obj.capacity());

        System.out.println(obj);

        java.util.Iterator<Integer> itr=obj.iterator();

        while(itr.hasNext())
        {
            System.out.println("Element is "+itr.next());
        }
    }    
}
