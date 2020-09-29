#####
###  hill's test program    : alloc memory in VM
###  Java -Xmx1024m AllocMem 9  
###  about alloc 830M in win10
#####
import java.util.Date; 

public class AllocMem { 
 

public static void main(String[] args) throws Exception{ 
		
	int a = 1024 * 1024 * 10;：
//	final long[] ar = new long[ a ];	
	final long[][] ar ;
    int i=Integer.parseInt(args[0]);
	ar = new long[i][a];

		System.out.print("press a char to stop :"); 
         char ii = (char) System.in.read(); 
         System.out.println("your char is :"+ii); 
		
} 
} 


 

