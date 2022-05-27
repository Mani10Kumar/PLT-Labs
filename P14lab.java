import java.util.*;
public class P14lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,count=1,j;
		System.out.print("Enter the N value: ");
		n=sc.nextInt();
		
			
		for(i=1;i<n;i++) {
			if(i%2==0) {
				System.out.print(-i*i+" ");	
			}else {
				System.out.print(i*i+" ");
			}
			
		}
	}

}
//1 -4 9 -16 25 -36..N