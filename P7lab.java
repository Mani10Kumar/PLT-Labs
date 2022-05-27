import java.util.*;
public class P7lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n,i=1,k,j=1,t;
		System.out.print("Enter value: ");
		n=sc.nextInt();
		System.out.print(i+" "+j+" ");
		for(k=1;k<n;k++) {
			t=i+j;
			System.out.print(t+" ");
			i=j;
			j=t;
		}

	}

}
//1 1 2 3 5 8 13 ....N