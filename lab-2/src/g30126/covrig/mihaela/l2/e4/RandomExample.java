package g30126.covrig.mihaela.l2.e4;
import java.util.Scanner;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("val lui N:");
		int N = in.nextInt();
		for (int i=0;i<N;i++) {
			System.out.println("Numar generat="+r.nextInt(20));
		}
		
	}
}
