import java.util.*;
public class P3lab {
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int Total,avg,hin,eng,math;
    String name;
    System.out.println("Enter the Name : ");
    name=sc.nextLine();
    System.out.println("enter the marks of \nHindi\nEnglish\nMath\n");
    hin=sc.nextInt();
    eng=sc.nextInt();
    math=sc.nextInt();
    Total=hin+eng+math;
    avg=Total/3;
    System.out.println("Name: "+name);
    System.out.println("\nTotal Marks "+Total);
    System.out.println("\nAverage Marks "+avg);
    if(avg>60&&avg<=100)
    {
        System.out.println("\n1st Division");
    }else if(avg>50)
    {
        System.out.println("\n2nd Division");
    }else if(avg>35){
        System.out.println("\nPass");
    }else {
        System.out.println("\nFail");
    }
    }
}
