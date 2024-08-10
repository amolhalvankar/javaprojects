import java.util.Scanner;
public class Hello{

	static int Addition(int a , int b){
		int ans = a + b;
		return ans;

	}
 	public static void main(String [] args){

 		System.out.println("Hello, This is first to Add two numbers!");
 		Scanner sc = new Scanner(System.in);

 		System.out.print("Enter First number :");
 		int num1 = sc.nextInt();
 		System.out.print("Enter Second number :");
 		int num2 = sc.nextInt();

 		int output = Addition(num1 , num2) ;
 		System.out.println("Addition of two numbers is :" + output);

 	}
}