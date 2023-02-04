package methods;

import java.util.Scanner;

public class Methodscalling {
	static int sub(int a, int b) {
		int result=a-b;
		return result;
	}

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter your numbers for subtractions");
	
	int num1=scan.nextInt();
	
	int num2=scan.nextInt();
	
	System.out.println("Your result is  "+sub(num1,num2));
	
	}
	
}
