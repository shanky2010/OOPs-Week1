import java.util.*;

public class week1q6{
	//question 6
	public static void main(String args[]){		
        	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n-i-1 ; j++)
				System.out.print(" ");
			for(int j=0 ; j<=i ; j++)
				System.out.print("*");
			for(int j=i ; j>0 ; j--)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n-1 ; i>0 ; i--){
			for(int j=0 ; j<n-i ; j++)
				System.out.print(" ");
			for(int j=0 ; j<i ; j++)
				System.out.print("*");
			for(int j=i-1 ; j>0 ; j--)
				System.out.print("*");
			System.out.println();
		}
	}
}