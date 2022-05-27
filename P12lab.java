import java.util.*;

public class P12lab {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n=sc.nextInt();
		int i,a=1,b=4,c=7,d;
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		
		for(i=1;i<=n;i++) {
			d=a+b+c;
			if(d<=n) {
				a=b;
				b=c;
				c=d;
				System.out.print(d+" ");
			}
		}
	}

}//1 4 7 12 23...N
