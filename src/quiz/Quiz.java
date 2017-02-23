/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author niralikantaria
 */
public class Quiz {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create new city 
        City kw = new City();

        //create a robot 
        RobotSE nini = new RobotSE(kw, 4, 0, Direction.EAST);

        // create staircase wall
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        //place thinga on staircase
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);

        //karel go up the staircase and pick up the things 
        nini.move();
        nini.pickThing();
        nini.turnLeft();
        nini.move();
        nini.turnRight();
        nini.move();
        nini.pickThing();
        nini.turnLeft();
        nini.move();
        nini.turnRight();
        nini.move();
        nini.pickThing();
        nini.turnLeft();
        nini.move();
        nini.turnRight();
        nini.move();
        nini.pickThing();

        // going down the staris: drop thing 
        nini.move();
        nini.putThing();
        nini.move();
        nini.turnRight();
        nini.move();
        nini.putThing();
        nini.turnLeft();
        nini.move();
        nini.turnRight();
        nini.move();
        nini.putThing();
        nini.turnLeft();
        nini.move();
        nini.turnRight();
        nini.move();
        nini.putThing();
        nini.turnLeft();

    }
}
