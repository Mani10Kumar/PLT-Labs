
public class P8lab {

	public static void main(String[] args) {
       int n=4,count=0;
       System.out.println("The multiple are: ");
       for(int i=7;true;i+=7) {
    	   if(i%2==1&&i%3==1&&i%4==1&&i%5==1&&i%6==1)
    	   {
    		   count++;
    		   
    		   if(count==3) {
    			   continue;
    		   }
    		   System.out.println(i);
    		   if(count==n)
    		   {
    			   break;
    		   }
    	   } 
       }
		}

	}
//WAP 1,2,4 is multiple of 7 and rem 1 when divide by 2,3,4,5,6

