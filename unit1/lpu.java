import java.util.*;
class lpu
{
    public static void main(String arg[])
    {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(7);
        li.add(4);

        //1st way
        System.out.println(li);
        //Traditional for loop
        for(int i=0;i<li.size();i++)
            System.out.println(li.get(i));
        //for each loop
        for(Integer i:li)
            System.out.println(i);
        //By using Iterator
        Iterator<Integer> it=li.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //Using Lamda expression
        li.forEach(n->System.out.println(n));
    }
}