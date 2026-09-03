import java.util.*;

public class Employee {

  int empId;
  String name;
  String department;
  double salary;
  double perfomanceRating;

  Employee(int empId, String name, String department, double salary, double perfomanceRating) {
    this.empId = empId;
    this.name = name; // missing assignment
    this.department = department;
    this.salary = salary;
    this.perfomanceRating = perfomanceRating;
  }

  public String toString() {
    return empId + " " + name + " " + department + " " + salary + " " + perfomanceRating;
  }

  public static void main(String[] arg) {
    ArrayList<Employee> li = new ArrayList<>();
    li.add(new Employee(101, "Ramesh", "cse", 21311.56, 4.2));
    li.add(new Employee(104, "Suresh", "ece", 71311.56, 3.2));
    li.add(new Employee(106, "Alex", "mech", 51311.56, 7.2));
    li.add(new Employee(107, "Ram", "cse", 57311.56, 8.2));
    li.add(new Employee(103, "Raman", "IT", 31311.56, 3.2));
    li.add(new Employee(102, "Suman", "AI", 91311.56, 5.0));
    li.add(new Employee(109, "Ajit", "cse", 44311.56, 2.2));
    // li.add(new Employee(108, "Kamal", "ec", 671311.56, 4.6));
    li.add(new Employee(100, "Preet", "cse", 64311.56, 3.2));
    li.add(new Employee(112, "Ryan", "cse", 81311.56, 4.2));

    // li.stream().filter(x -> x.perfomanceRating >= 4.0).forEach(System.out::println);

    // li.stream().filter(x -> x.department.equals("cse")).forEach(System.out::println);

    // li.stream().map(x -> x.name).forEach(System.out::println);

    li.stream().sorted((x1,x2)->Double.compare(x2.salary, x1.salary)).forEach(System.out::println);

    double res = li.stream().max((x1, x2))->double.compare((x1.perfomanceRating, x2.perfomanceRating)).orElse(null);
    System.out.println(res);
    
  }
}