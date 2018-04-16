package g30126.covrig.mihaela.l6.e1;

import java.awt.*;

public class Circle extends Shape{

	private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
   
    @Override
    public void draw(Graphics g) {
        System.out.println("Drawing a circle "+this.radius+" "+getColor().toString());
        g.setColor(getColor());
        if (getfilled()==true) {
        	g.fillOval(getX(), getY(), radius, radius);
        }
        else
        g.drawOval(getX(), getY(), radius, radius);
    }
}
