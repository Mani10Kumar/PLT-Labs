import java.util.*;
public class P6lab {

	public static void main(String[] args) {
         int i,n,t=1,tp;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter value: ");
         n=sc.nextInt();
         for(i=1;i<n;i++)
         {
        	 System.out.print(i+" ");
        	 tp=i+t;
        	 i=tp;
        	 t=t+2;
         }
	}

}
//1 3 7 13 21 31 43 57 73 91...N