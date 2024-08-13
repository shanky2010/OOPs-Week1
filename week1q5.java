import java.util.*;

public class week1q5{
	//question 5
	public static void main(String args[]){		
        	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(temp > 0){
			int rem = temp%10;
			temp/=10;
			rev = (rev*10) + rem;
		}
		if(rem == n)
			System.out.println("The reversed number is "+rev+". It is the same as the original.");
		else
			System.out.println("The reversed number is "+rev+". It is not the same as the original.");
	}
}