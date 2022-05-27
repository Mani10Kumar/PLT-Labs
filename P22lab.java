import java.util.*;
public class P22lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,t=1,j,k;
		System.out.print("Enter n value: ");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i-1;j++) {
				System.out.print(" ");
			}for(k=1;k<=t;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			t++;
		}

	}

}
//     *
//    **
//   ***
//  ****
// *****
//******
