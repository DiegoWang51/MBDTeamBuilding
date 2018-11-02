import java.util.Scanner;

/**
 * class InputOutput
 * 
 * Contains input/output methods provided by the IBO for primitive data types and Strings
 * 
 * @authors Kostas Dimitriou & Markos Hatzitaskos 
 * @version 1.0
 */
public abstract class InputOutput
{
     //The methods used here can be found in:
    //The IB Computer Science subject guide (first examination in 2010)
    //Appendix A: Core Computer Science for the IB Diploma Program (International Baccalaureate). Published by Express Publishing.

	private static Scanner scan = new Scanner(System.in);
	
	public static void output(String a) {
		System.out.println(a);
	}
	
	public static String input(String a) {
		output(a);
		String s = scan.next();
		return s;
	}
	
	public static int inputInt(String a) {
		output(a);
		int i = scan.nextInt();
		return i;
	}
	
	public static String inputString(String a) {
		output(a);
		String s = scan.nextLine();
		return s;
	}
	
	public static char inputChar(String a) {
		output(a);
		char c = scan.next().charAt(0);
		return c;
	}
	
}
