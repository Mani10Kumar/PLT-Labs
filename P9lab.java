import java.util.*;
public class P9lab {
	static int a,m=0;
	static int count=0;
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
         System.out.println("Enter last value of N: ");
         int n=sc.nextInt();
         for(int i=1;i<=n/55;i++) {
        	 m=i*i;
        	 System.out.println(m);
        	 if(m%10==9) {
        		 count++;
        	 }
         }
         System.out.println("Count "+count);
//         for(int i=1;i<=n;i++) {
//        	 a=i*i;
//        	 if(a<=n) {
//        		 System.out.println(a);
//        		 if(a%10==9) {
//        			 count++;
//        		 }
//        	 }
//         }
//         System.out.print("NO of count :"+count);
         sc.close();
	}

}
//not satisfied me