/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers.
 *Example1)C:\>java Sample 10 20O/P 
 *Expected : The sum of 10 and 20 is 30
 */
public class LanguageBasicsEx3 {
          public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("SUM = "+(a+b));
	}
}
