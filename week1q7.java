import java.util.*;

public class week1q7{
	//question 7
	public static void main(String args[]){		
        	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<n-i-1 ; j++)
				System.out.print(" ");
			for(int j=0 ; j<=i ; j++)
				System.out.print(" " + fact(i)/(fact(j)*fact(i-j)));
			System.out.println();
		}
		for(int i=n-2 ; i>=0 ; i--){
			for(int j=n-i ; j>0 ; j--)
				System.out.print(" ");
			System.out.print("1");
			for(int j=i-1 ; j>=0 ; j--)
				System.out.print(" " + fact(i)/(fact(j)*fact(i-j)));
			System.out.println();
		}
	}
	
	public static int fact(int n){
		if(n==0)
			return 1;
		return (n*fact(n-1));
	}
}