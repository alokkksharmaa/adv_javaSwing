import java.util.*;
import java.util.stream.*;

public class example {
    // Demonstrates common Stream API operations on lists.

    public static void main(String[] args) {
    // Convert each name to uppercase.
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ramesh", "Alex", "Harish"));
    names.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(79, 20, 23, 12, 13, 25, 78, 89));

    // Filter numbers greater than or equal to 20.
    ArrayList<Integer> filtered = numbers.stream()
        .filter(n -> n >= 20)
        .collect(Collectors.toCollection(ArrayList::new));
    System.out.println(filtered);

    // Add all elements using reduce.
    int sumWithReduce = numbers.stream().reduce(0, Integer::sum);
    System.out.println(sumWithReduce);

    // Add all elements using mapToInt + sum.
    int sumWithoutReduce = numbers.stream().mapToInt(n -> n).sum();
    System.out.println(sumWithoutReduce);

    // Find the largest element using reduce.
    int maxWithReduce = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
    System.out.println(maxWithReduce);

    // max/min/average on primitive streams return OptionalInt/OptionalDouble.
    int maxWithMax = numbers.stream().mapToInt(n -> n).max().orElse(0);
    System.out.println(maxWithMax);

    // findFirst returns Optional<T> for object streams.
    Optional<Integer> firstNumber = numbers.stream().findFirst();
    firstNumber.ifPresent(System.out::println);

    // Find the first name that starts with 'A'.
    ArrayList<String> nameList = new ArrayList<>(Arrays.asList("alok", "Alex", "Aman"));
    String name = nameList.stream().filter(n->n.startsWith("A")).findFirst().orElse(" ");
    System.out.println(name);


    // WAP to check wether any negative number present in a list or not
    ArrayList<Integer> li = new ArrayList<>(Arrays.asList(10, 20, 60, 123, 90));
    boolean ans = li.stream().anyMatch(n->n<0);
    System.out.println(ans);

    // WAP to print the 1st three element
    List<Integer> firstThree = Arrays.asList(10 ,20 , 30, 40 , 50);
    firstThree.stream().limit(3).forEach(System.out::println);
    

    // WAP to print the first 3 elements, skip 1st, 2nd element
    List<Integer> firstTwo = Arrays.asList(10 ,20 , 30, 40 , 50);
    firstTwo.stream().skip(3).forEach(System.out::println);

    // WAP sort all elements ascending order
    firstTwo.stream().sorted().forEach(System.out::println);
    // WAP sort all elements descinding order
    firstTwo.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    // WAP to find out 2nd largest element from a list
    // Comparator.reverseOrder() -- sort in reverse
    ArrayList<Integer> SecondLargest = new ArrayList<>(Arrays.asList(20, 30,60, 40, 50, 10));
    int res = SecondLargest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
    System.err.println(res);

    // WAP to to calculate the sum of square of even number
    List<Integer> evenSquareNumbers =  Arrays.asList(12, 3, 4, 1, 63,89, 54, 22, 26);
    int result = evenSquareNumbers.stream().filter(n->n%2==0).map(n->n*n).reduce(0, (a,b)->a+b);
    System.out.println(result);

    // WAP to find the names starts with capital "A", convert it to upppercase and sort
    List<String> namesList = Arrays.asList("alok","Amit","Alex", "Aman");
    namesList.stream().filter(n->n.startsWith("A")).map(n->n.toUpperCase()).sorted().forEach(System.out::println);

    // count the names having more than 5 characters
    List<String> countChar = Arrays.asList("Vishal","alok","Amit","Himanshu","Alex", "Aman");
    long count = countChar.stream().filter(n->n.length()>5).count();
    System.out.println(count);

    //write a programme to convert every name first char to uppercase 
    List<String> convertName = Arrays.asList("Vishal","alok","Amit","Himanshu","Alex", "Aman");
    convertName.stream()
        .map(n -> Character.toUpperCase(n.charAt(0)) + n.substring(1))
        .forEach(System.out::println);

    // string to uppeercase
    // string s = "ramesh"  ----> s = s.toUppercase();
    // character to uppercase
    // char c = "ab"  ----> character.toUppercase();


    // WAP to group the names of the students

    }
}