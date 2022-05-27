import java.util.*;
public class P13lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float i,n;
        System.out.print("Enter the value of N: ");
        n=sc.nextInt();
        for(i=1;i<n;i++) {
        	if((i/2)%2==0)//bcz i dont want 4 8 12 squre so i write this line 
        	{
        		System.out.print("");
        	}else {
        		System.out.print(i*i+" ");
        	}
        }   
	}
}//1 4 9 25 36 49 81 . . N
