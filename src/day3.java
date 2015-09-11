import TurtleGraphics.*;
import java.awt.Color;
        
public class day3 {

    
    public static void main(String[] args) {
        SketchPadWindow win = new SketchPadWindow(600,400);
       Pen p= new WigglePen(win);
       p.setWidth(10);
       int size = 100;
       p.setColor(Color.blue);
       p.move(size);
       p.turn(90);
       p.move(size);
       p.turn(90);
       p.move(size);
       p.turn(90);
       p.move(size);
      
    
    //move over and draw another square
       p.setColor(Color.yellow);
       p.up();
       p.move(200);
       p.down();
       p.turn(90);
       
       p.setColor(Color.orange);
       p.move(size);
       p.turn(90);
       p.move(size);
       p.turn(90);
       p.move(size);
       p.turn(90);
       p.move(size);
       
    }
    
}
