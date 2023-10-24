import java.util.*;
public class LinkedListDemo 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> obj=new LinkedList<Integer>();

        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);

        System.out.println("Element of LinkedList");

        obj.addFirst(5);
        obj.addLast(60);

        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());

        obj.remove(2);
        obj.removeFirst();
        obj.removeLast();

        obj.add(40);
        obj.add(60);

        System.out.println(obj);

        Iterator<Integer> itr=obj.iterator();

        while(itr.hasNext())
        {
            System.out.println("Element is :"+itr.next());
        }




    }

}
