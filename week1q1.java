import java.util.*;

public class week1{
	//question 1
	public static void main(String args[]){		
        	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0 ; i<t ; i++){
			try{
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if(x>=-128 && x<=127)
					System.out.println(" byte");
				if(x>=-32768 && x<=32767)
					System.out.println(" short");
				if(x>=-(int)Math.pow(2,31) && x<=(int)Math.pow(2,31))
					System.out.println(" int");
				if(x>=-(long)Math.pow(2,63) && x<=(long)Math.pow(2,63))
					System.out.println(" long");
			}
			catch(Exception e){
				System.out.println("Can't be fitted anywhere.");
			}
			System.out.println();
		}
	}
}