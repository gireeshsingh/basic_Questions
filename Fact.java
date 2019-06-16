import java.io.*;
import java.util.*;

public class Fact{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enther the number whose factorial is to be calculated:");
		int n=sc.nextInt();

		System.out.println("Factorial calculated by recursion:"+factorial(n));
		System.out.println("Factorial calculated by iteration:"+factorial_iter(n));
	}

	public static int factorial_iter(int n){

		if(n==0||n==1){
			return 1;
		}
		else if(n<0){
			return -1;
		}

		int result=1,i;
		
		for(i=1;i<=n;i++){
			result=result*i;
		}

		return result;
	}

	public static int factorial(int n){
		if(n==0||n==1){
			return 1;
		}
		else if(n<0){
			return 0;
		}
		else{
			return n*factorial(n-1);
		}
	}
}