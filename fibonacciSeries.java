package java_concepts;
import java.util.Scanner;

public class fibonacciSeries {
	/**
	 * Fibonacci series are the numbers in the following integer sequence.
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
	 * Fn = Fn-1 + Fn-2
	 */

	public static void main(String args[]) {
		
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the length of fibonacci series :");
		int length= inp.nextInt();
		int a=0,b=1,c;
		System.out.println(a+"\n"+b);
		for(int i=0;i<length-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}	
	}
}
