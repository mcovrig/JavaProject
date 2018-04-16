package g30126.covrig.mihaela.l6.e3;

import java.awt.Color;


public class Main {
    public static void main(String[] args) {
        DrawingBoard b1 = new DrawingBoard();
        Shape s1 = new Circle(Color.RED, 90);
        b1.addShape(s1);
        s1.setId("a");
        s1.setfill(false);
        Shape s2 = new Circle(Color.GREEN, 100);
        b1.addShape(s2);
        s2.setId(12);
        s2.setId(20);
        s2.setId("");
        s2.setfill(false);
        Shape s3= new Rectangle(Color.BLACK,100,100);
        b1.addShape(s3);
        s2.setId(12);
        s3.setId(20);
        s3.setId("");
        s3.setfill(false);
        b1.deleteById("a");
    }
}