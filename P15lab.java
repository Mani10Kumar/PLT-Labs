import java.util.*;
public class P15lab {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,p1=1,p2=2,n;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print(p1+" ");
			p1=p1+3;
			System.out.print(p2+" ");
			p2=p2+4;
		}
	}

}
//1 2 4 7 10 10 14 ..N