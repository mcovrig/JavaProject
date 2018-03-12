package g30126.covrig.mihaela.l2.e3;
import java.util.Scanner;

public class Ex3 {
	 public static void main(String[] args) {
		 
		 Scanner in = new Scanner(System.in);
	     System.out.println(" A este:");
	     int A = in.nextInt();
	     
	     System.out.println(" B este:");
	     int B = in.nextInt();
	     
	     int x=A;
	     int nr=0;
	     for (int i=A; i<B; i++) {
	    	 int ok;
	    	 int d;
	    	 ok=1;
	    	 for (d=2;d<=i/2;d++) 
	    		 if(i%d==0)ok=0;
	    	 if(ok==1) {
	    		 nr=nr+1;
	    		 System.out.println(i);
	    		 
	    	 }
	     }
	     
	     System.out.println(nr);
	     
	     
	     
	 
	 } 
	 
}
