package Mypkg;
import java.util.*;

public class Calculator {
	
	public int add(int x, int y) {
		return (x+y);
	}
	
	public int sub(int x, int y) {
		return (x-y);
	}
	
	public int mul(int x, int y) {
		return (x*y);
	}
	
	public int div(int x, int y) {
		return (x/y);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Calculator obj = new Calculator();
		
		System.out.print("Enter first number: ");
		int a= sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b= sc.nextInt();
		
		System.out.println("Sum of numbers is: " +obj.add(a,b));
		System.out.println("Difference of numbers is: " +obj.sub(a,b));
		System.out.println("Product of numbers is: " +obj.mul(a,b));
		System.out.println("Division of numbers is: " +obj.div(a,b));
	}
}