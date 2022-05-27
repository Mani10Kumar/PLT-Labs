//900
//800 802 806 812 820 830 842 856 872 890 
//8 10 14 11 10 11 14 19 17 17 

import java.util.*;
public class P23lab {int count=0;
	void mani(int m) {
		int sum=0;
		while(m!=0) {
			sum=sum+m%10;
			m=m/10;
		}
		System.out.print(sum+" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      P23lab m=new P23lab();
		int i,d=1,n,t=0;
		n=sc.nextInt();
		
		for(i=800;i<n;i++) {
			System.out.print(i+" ");
			i=i+d;
			d=d+2;
		}
		
		System.out.println("\n");
		int d1=1;
		for(i=800;i<n;i++) {
			
			m.mani(i);
			i=i+d1;
			d1=d1+2;
		}
		
	}
}
