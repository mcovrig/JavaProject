package g30126.covrig.mihaela.l2.e6;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args){
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Variabila:");
		a=in.nextInt();
		int i;
		int suma=1;
		for(i=1;i<=a;i++)
			suma=suma*i;
		System.out.println("Suma:");
		System.out.println(suma);
	}
}