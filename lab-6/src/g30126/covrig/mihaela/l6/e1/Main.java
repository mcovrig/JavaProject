package g30126.covrig.mihaela.l6.e1;

import java.awt.*;

public class Main {
	 public static void main(String[] args) {
	        DrawingBoard b1 = new DrawingBoard();
	        Shape s1 = new Circle(Color.RED, 90);
	        b1.addShape(s1);
	        s1.setX(10);
	        s1.setY(220);
	        s1.setId("");
	        s1.setfilled(true);
	        Shape s2 = new Circle(Color.GREEN, 100);
	        b1.addShape(s2);
	        s2.setX(13);
	        s2.setY(22);
	        s2.setId("black");
	        s2.setfilled(false);
	        Shape s3 = new Rectangle(Color.BLACK, 110,100);
	        b1.addShape(s3);
	        s3.setX(13);
	        s3.setY(22);
	        s3.setId("red");
	        s3.setfilled(false);
	       
	        
	    }
}
