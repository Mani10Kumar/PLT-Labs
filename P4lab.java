import java.util.*;
public class P4lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,total,n;
		System.out.print("Enter the value: ");
		n=sc.nextInt();
		for(i=2;i<n;i+=2) {
			total=i*i;
			System.out.print(total+" ");
		}

	}

}
