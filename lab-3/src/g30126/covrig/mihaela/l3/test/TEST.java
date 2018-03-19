package g30126.covrig.mihaela.l3.test;

import java.util.Scanner;

public class TEST {

	public static int solution(int[] A){
    	int i;
    	int b=0;
    	int nr=0;
    	for(i=0;i<A.length;i++)
    	{
    		int j;
    		
    		if(A[i]!=0) 
    		{
    			b=0;
    			for(j=i+1;j<A.length;j++)
    				if(A[j]==A[i] && b==0)
    			{ 
    				A[i]=0;
    				A[j]=0;
    				b=1;
    			}	
    		if(b==0) 
    			nr=A[i];
    		}
    	}    	
    	return nr;
     
    }

    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
         System.out.println("Dati numarul: ");
         int n = in.nextInt();
         System.out.println("Dati elementele: ");
         int[] A = new int[n];
         for(int i=0;i<n;i++){
        	System.out.println("A["+i+"]=");
         	A[i]=in.nextInt(30);
         }
        int result = solution(A);
        System.out.println("Rezultatul este:"+result+".");
    }
}
