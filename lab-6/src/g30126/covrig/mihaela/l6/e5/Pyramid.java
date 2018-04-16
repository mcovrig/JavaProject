package g30126.covrig.mihaela.l6.e5;

import java.awt.Color;
import java.awt.Shape;

public class Pyramid extends Rectangle{
	
	public Pyramid(Color color, int length, int width) {
		super(color, length, width);
	}
	private static final int nr = 5;
	private static final int width = 32;
	private static final int length = 15;
	
	public static void createPyramid() {
		  DrawingBoard b1 = new DrawingBoard();
		int i,j,k=nr;
		
		for(i=0;i<k;i++) {			
			for(j=i;j>0;j--) {
			Rectangle brick = new Rectangle(Color.RED, length, width);
				brick.setCoord(100+length*(j+1)+(k-i)*length/2 ,300-width*(k-i+1));
				brick.setfilled(false);
				brick.setId(" ");
				b1.setShape((Shape) brick);
				
			}
		} 
	}
	public static void main(String[] args) {
		createPyramid();
	}
}