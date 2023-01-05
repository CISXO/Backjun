package java_practice;
import java.util.Scanner;

public class max1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("3 inputs for max");
		System.out.print("a:"); int a = stdIn.nextInt();
		System.out.print("b:"); int b = stdIn.nextInt();
		System.out.print("c:"); int c = stdIn.nextInt();
	
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		System.out.println("max" + max );
	}

}
