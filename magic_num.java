import java.io.*;
import java.util.*;

public class magic_num{

	public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		while((n/10)>0){
			n=magic_num_check(n);
		}

		if(n==1||n==10){
			System.out.println("It is a magic number");
		}
		else{
			System.out.println("It is not a magic number");
		}
		
		
	}

	public static int magic_num_check(int n){
		int result=0;

		while(n/10>0){
			result=result+n%10;
			n=n/10;
		}

		return result+n;
	}
}