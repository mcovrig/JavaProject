package g30126.covrig.mihaela.l2.e2;

import java.util.Scanner;

public class PrintNumberInWord {

	static void f1() {
		System.out.println("Apel functie 1");
		
		int number = 1;
        String numberString="other";
        do {
        switch (number) {
            case 1:  numberString = "unu";
                     break;
            case 2:  numberString = "doi";
                     break;
            case 3:  numberString = "trei";
                     break;
            case 4:  numberString = "patru";
                     break;
            case 5:  numberString = "cinci";
                     break;
            case 6:  numberString = "sase";
                     break;
            case 7:  numberString = "sapte";
                     break;
            case 8:  numberString = "opt";
                     break;
            case 9:  numberString = "noua";
                     break;
    
          
        }
        number++;
        System.out.println(numberString);
        }while (number<10);
        

	}

	
	public static void main(String[] args) {

		f1();

	}
}
