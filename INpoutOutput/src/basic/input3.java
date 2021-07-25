package basic;
import java.util.Scanner;
/** this program is all about how to 
 * get input from console for program
 * @author SANDIP
 *
 */

public class input3 {
	public static void main(String[] args)
	 {
	 Scanner in = new Scanner(System.in);
	
 // get first input
	 System.out.print("What is your name? ");
	 String name = in.nextLine();
	
	 // get second input
	System.out.print("How old are you? ");
	 int age = in.nextInt();

	 // display output on console
	 System.out.println("Hello, " + name + ". Next year, you'll be " + age );
	 }
	

}
