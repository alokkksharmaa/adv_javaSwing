import java.util.*;
import java.util.stream.*;

class lpu1
{
    public static void main(String arg[])
    {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(7);
        li.add(4);
        li.add(2);
        li.add(3);
        li.add(6);

        //Convert list to stream
        //	li.stream().filter(n->n%2==0).filter(n->n>3).forEach(System.out::println);

        //find all the even elements and the Sort all the elemnts
//	li.stream().filter(n->n%2==0).sorted().forEach(System.out::println);

        // filter , sort and keep elements in anther ArrayList

        List<Integer> result = li.stream().filter(x -> x > 3).collect(Collectors.toList());

        System.out.println(result);
    }
}