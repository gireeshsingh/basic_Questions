import java.io.*;
import java.util.*;

public class Fib{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of fibonacci elements to be displayed :");
		int n=sc.nextInt();
		int i;

		int first=1;
		int second=1;
		int third;
		System.out.println("-------------------OUTPUT------------------");
		System.out.println(first);
		System.out.println(second);

		for(i=0;i<n-2;i++){
			third=first+second;
			first=second;
			second=third;
			System.out.println(third);
		}
	}
}