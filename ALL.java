import java.lang.*;
import java.util.*;

class ALL
{
    public static void main(String arg[])
    {
        LinkedList<String> obj = new LinkedList<String>();

        obj.add("January");
        obj.add("February");
        obj.add("March");
        obj.add("April");
        obj.add(2,"New");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");

        System.out.println("Arraylist contains : "+obj);
        System.out.println("Size is :"+obj.size());

        if(obj.contains("January"))
        {
            System.out.println("Element is there");
        }

        System.out.println("Element are using for loop :");
        for(int i = 0; i< obj.size(); i++)
        {
            System.out.println(obj.get(i));
        }

        String str;
        int Cnt = 0;
        int i = 0;
        for(i = 0; i<obj.size(); i++)
        {
            str = obj.get(i);
            if(str.equals("Marvellous"))
            {
                Cnt++;
            }
        }
        System.out.println("occourance in Marvellous: "+Cnt   +"times in arraylist :");



        int ret = obj.indexOf("April");
        System.out.println("Element is at:"+ret);

        System.out.println("Element of index 3 is :"+obj.get(3));
        obj.remove(3);
        System.out.println("updated list is :"+obj);
        
        Iterator iobj = obj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        obj.clear();
        System.out.println("updated list is :"+obj);
    }
}