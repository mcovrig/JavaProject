package g30126.covrig.mihaela.l2.e7;

import java.util.Scanner;
import java.util.Random;

public class Ex7 {
	public static void main(String[] args){
		Random r = new Random();
		int a=r.nextInt(30);
		System.out.println(a);
		int k=0;
		Scanner in = new Scanner(System.in);
		while(a!=k)
		{
			System.out.println("Numarul:");
			k=in.nextInt();
			if(k>a)
				System.out.println("Numarul este mai mic.");
			else
				if(k<a)
					System.out.println("Numarul este mai mare.");
				else
					System.out.println("Ai ghicit.");
		}
	}
}