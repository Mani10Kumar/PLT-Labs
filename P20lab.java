import java.util.*;
public class P20lab{
	public static void main(String args[]) {
		int flag=1;
	
	Scanner sc=new Scanner(System.in);
	int r,c;
	
	System.out.print("Enter row no: ");
	r=sc.nextInt();
	System.out.println("Enter col no: ");
    c=sc.nextInt();
    int arr[][]=new int[r][c];//here declaring array
    int transpose[][]=new int[r][c];  //another matrix for transpose
    if(r!=c)//here we are checking row != col or not 
    {
    	System.out.println("IT is not squre so not symetrix");
    }
    else 
    {
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		arr[i][j]=sc.nextInt();//taking input in matrix
    		
    	}
    	}
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		System.out.print(arr[i][j]+" ");//output of matrix
    		
    	}System.out.println();
    	}
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		transpose[j][i]=arr[i][j];//here i am tranfering data in transpose form
    		
    	}//System.out.println();
    	}    
    System.out.println("Transpose matrix: ");
    for(int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		System.out.print(transpose[i][j]);
    		
    	}System.out.println();
    	}
    if(r==c) {
    	for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		if(transpose[i][j]!=arr[i][j])//here compering
        		{
        			flag=0;
        			break;
        		}
        		
        	}//System.out.println();
        	}	
    }
    if(flag==0) {
    	System.out.println("Not symmetric");
    }else {
    	System.out.println("Symetric");
    }
    }
   
}}