import java.util.*;
public class P10lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=1,i,n;
		System.out.print("Enter the value of n : ");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			t=t+i*i;
			System.out.print(t+" ");
		}
	}
}//1 2 6 15 31 56 .. N
