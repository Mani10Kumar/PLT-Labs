import java.util.*;
public class P19lab {
//in this program we are checking matrix is identity matrix or not
	public static void main(String[] args) {
		int r,c,i,j;
		boolean flag=true;
		//intitaliz array
		int array[][]= {{1,0,0},{0,1,0},{0,0,1}};
		//calculating lenth of row and column
		r=array.length;
		c=array[0].length;
		if(r!=c) {
			System.out.print("Not square matrix");
		}else {
			
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				if(i==j&&array[i][j]!=1) {
					flag=false;
					break;
				}
			 if(i!=j&&array[i][j]!=0) {
					flag=false;
					break;
				}
			}
		}}
     if(flag) {
    	 System.out.print("identity matrix");
     }else {
    	 System.out.print("Not identity matrix");
     }
	}

}
