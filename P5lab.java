import java.util.*;
public class P5lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       String name;
       long EmpId,BasicSal,SplAllowance,Bonus,FD,GrosMonSal,AnSal;
       System.out.println("Enter Emp Nmae : ");
       name=sc.nextLine();
       System.out.println("Enter emp id : ");
       EmpId=sc.nextLong();
       System.out.println("Enter Basic Salary");
       BasicSal=sc.nextLong();
       System.out.println("Enter special allowance : ");
       SplAllowance=sc.nextLong();
       System.out.println("Enter percentage of bonous: ");
       Bonus=sc.nextLong();
       Bonus=BasicSal*Bonus/100;
       System.out.println("Enter FD: ");
       FD=sc.nextLong();
       FD=FD*12;
       GrosMonSal=BasicSal+SplAllowance+Bonus;
       System.out.println("your gross mothly sal: "+GrosMonSal);
       AnSal=GrosMonSal*12;
       System.out.println("Your Anual Salary: "+AnSal);
       if(AnSal<250000) {
    	   System.out.println("your sal is less so no tax.");
       }else if(AnSal>250000&&AnSal<400000&&FD==150000) {
    	   System.out.println("You have no need to pay any tax : ");
    	  
    	   System.out.println("After deduction your sal : "+AnSal);
       }else if(AnSal>400000 && AnSal<500000){
    	   System.out.println("You have  to pay 5% tax : ");
     	   long Ansal=(AnSal*5)/100;
     	   AnSal=AnSal-Ansal;
     	   System.out.println("After deduction your sal : "+AnSal);
       }
       else if(AnSal>500000&&AnSal<1000000) {
       
    	   System.out.println("You have to pay tax 20% : ");
    	   long Ansal=AnSal*20/100;
    	   AnSal=AnSal-Ansal;
    	   System.out.println("After deduction your sal : "+AnSal);
       }else if(AnSal>=1000000) {
    	   System.out.println("You have to pay tax 30% : ");
    	   long Ansal=AnSal*30/100;
    	   AnSal=AnSal-Ansal;
    	   System.out.println("After deduction your sal : "+AnSal);
       }else {
    	   System.out.println("Something wrong");
       }
      
     
      
	}

}
