import java.util.*;
import java.util.Scanner;
public class P11lab {

//	public static void main(String[] args) {

       
//	}
	//package new_javaClass;

	

//	public class Apr30 {
		
		
		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			int total=0;
			String str1,str2="y";
			
			System.out.println("Enter y if you want purchase else anything click");
			str1=sc.nextLine();
			if(str1.equals(str2)) {
			
			do
			{
				System.out.println("Enter item code: ");
			int itemCode=Integer.parseInt(sc.nextLine());
			System.out.println("Enter price: ");
			int price=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Qty: ");
			int qty=Integer.parseInt(sc.nextLine());
			//String description=sc.nextLine();
			total=total+price*qty;
			System.out.println("Now you want purchase again write y : ");
			}
			while(sc.nextLine().equals("y"));
			}
			sc.close();
			if(total>10000)
			{
				System.out.println("you purchase more than 10000 so 10 % dis grand total =="+(total-((total*10)/100)));
			}
			 
			if(total<1000)
			{
				System.out.println("you got 2.5 % dis grand total =="+(total+((total*2.5)/100)));
			}
			
		}

	}
//}
