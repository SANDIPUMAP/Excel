package basic;
import java.util.Scanner;

public class InputInt {
	
	void method1()
	{
		Scanner in = new Scanner(System.in);
		int sandipage = in.nextInt();
	 int pradipage=sandipage-2;
	 System.out.println(pradipage);
	
	}

	public static void main(String[] args) {
		
		 
		
		InputInt abc = new InputInt();
		abc.method1();

	}

}
