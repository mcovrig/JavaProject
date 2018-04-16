package g30126.covrig.mihaela.l6.e5;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard  extends JFrame {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Shape[] shapes = new Shape[10];
	    //ArrayList<Shape> shapes = new ArrayList<>();

	    public DrawingBoard() {
	        super();
	        this.setTitle("Drawing board example");
	        this.setSize(300,500);
	        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        this.setVisible(true);
	    }

	    public void addShape(Rectangle brick){
	        for(int i=0;i<shapes.length;i++){
	            if(shapes[i]==null){
	                shapes[i] = brick;
	                break;
	            }
	        }
//	        shapes.add(s1);
	        this.repaint();
	    }
	   public void paint(Graphics g){
	        for(int i=0;i<shapes.length;i++){
	            if(shapes[i]!=null)
	                shapes[i].draw(g);
	        }
//	        for(Shape s:shapes)
//	            s.draw(g);
	    }
	   public void deleteById(String id) {
		   for(int i=0;i<shapes.length;i++){
	           if(shapes[i].getId().equals(id)){
	        	   shapes[i]=null;
	           }
	           repaint();
	   }
	}
}
