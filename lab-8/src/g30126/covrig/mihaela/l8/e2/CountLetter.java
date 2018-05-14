package g30126.covrig.mihaela.l8.e2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountLetter {


    private static Scanner sc;

	public static void main(String [] args) throws IOException{
    System.out.print("Dati caracterul:");
    sc = new Scanner(System.in);
    char i = sc.next().charAt(0);
     BufferedReader in = new BufferedReader(
                new FileReader("data.txt"));
              String s, s2 = new String();
              while((s = in.readLine())!= null)
                s2 += s + "\n";
              in.close();
             int count = 0; 
              for(int j=0;j<s2.length();j++) {
                  if(s2.charAt(j)==i){
                      System.out.println("number="+i);
                      count++;
                  }
              }
              System.out.println("Total count="+count);
                
            }
}
