//hill test program :alloc memory in VM
// Java -Xmx1024m AllocMem 9 
//  about alloc 830M in win10
//


public class AllocMem { 


public static void main(String[] args) throws Exception{ 
		
	System.out.println("Args number :"+args.length);
	if (args.length< 1) {
	    System.out.println(" usage: java  -Xmx1024m AllocMem  N  ");
	    System.out.println(" N mean's a number , which have  90M memory space per unit  ");		
	    return;
	}
	int a = 1024 * 1024 * 10;
//	final long[] ar = new long[ a ];	
	final long[][] ar ;
                int i=Integer.parseInt(args[0]);
	ar = new long[i][a];

	System.out.print("press a char to stop :"); 
         	char ii = (char) System.in.read(); 
         	System.out.println("your char is :"+ii); 		
	} 
} 
