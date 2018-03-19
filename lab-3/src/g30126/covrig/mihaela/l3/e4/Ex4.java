package g30126.covrig.mihaela.l3.e4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

public class Ex4
{
   public static void main(String[] args)
   {
      // Set up the initial situation
      City ny = new City();
      Wall blockAve0 = new Wall(ny, 1, 1, Direction.WEST);
      Wall blockAve1 = new Wall(ny, 2, 1, Direction.WEST);
      Wall blockAve2 = new Wall(ny, 1, 2, Direction.EAST);
      Wall blockAve3 = new Wall(ny, 2, 2, Direction.EAST);
      Wall blockAve4 = new Wall(ny, 1, 1, Direction.NORTH);
      Wall blockAve5 = new Wall(ny, 1, 2, Direction.NORTH);
      Wall blockAve6 = new Wall(ny, 2, 1, Direction.SOUTH);
      Wall blockAve7 = new Wall(ny, 2, 2, Direction.SOUTH);
      Robot mark = new Robot(ny, 0, 2, Direction.WEST);
      //Robot ann = new Robot(ny, 0, 1, Direction.EAST);
 
 
      // mark goes around the roadblock
      //mark.turnLeft();
      mark.move();
      mark.move();
      mark.turnLeft();     // start turning right as three turn lefts
      //mark.turnLeft();
     // mark.turnLeft();     // finished turning right
      mark.move();
      mark.move();
      mark.move();
      mark.turnLeft();
      mark.move();
      mark.move();
      mark.move();
      mark.turnLeft();
      mark.move();
      mark.move();
      mark.move();
      mark.turnLeft();
      mark.move();
      
      
 
     
   }
} 
