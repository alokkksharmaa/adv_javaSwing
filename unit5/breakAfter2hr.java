//Accept the time from the user and provide a break after 2hrs, print the break time.
import java.time.*;
import java.util.*;
class BreakAfter2hr
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Exam Time");
		String s=sc.nextLine();
		LocalTime t=LocalTime.parse(s);
		LocalTime breaktime=t.plusHours(2);
		LocalTime entrytime=t.minusMinutes(30);
		System.out.println("Break will be at: "+breaktime);
		System.out.println("Entry time will be at: "+entrytime);
	}
}