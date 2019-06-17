import java.io.*;
import java.util.*;

public class perfectNum{
	
	public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int i=0,total=0,n=sc.nextInt();
		int limit=n/2+1;
		for(i=1;i<limit;i++){
			if(n%i==0){
				total=total+i;
			}
		}
		if(total==n){
			System.out.printf("%d is a perfect Number\n",n);
		}
		else{
			System.out.printf("%d is not a perfect Number\n",n);
		}
	}

}