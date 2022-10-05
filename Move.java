import java.awt.event.KeyEvent;
public class Move {

  // instance variables
   private  double rx, ry;        // position
   private final double radius;  // radius
   private int move;
   //constructor
   public Move()
   {
     //initial positions
     rx  = 1.0;;
     ry = 0.05 ;
     radius = .05;
     move = 0;
   }
   
   //left wall
   private void l_wall()
   {
     rx = 0.05;
   }
   
   
   //right wall
   private void r_wall()
   {
     rx = 1.95;
   }
   
   //ship moves right
   public void move_right()
   {
     rx+=0.025;
     if ( rx > 1.95)
     {
       r_wall();
     }
   }
   
   //ship moves left
   public void move_left()
   {
     rx-=0.025;
     if ( rx < 0.05)
     {
       l_wall();
     }
   }
   
   //ship moves stops
   public void move_stop()
   {
     rx = rx;
   }
   
   
   // move the cannon
   public void move() 
   {
     //moving to the right
     if(StdDraw.isKeyPressed(KeyEvent.VK_C))
     {
       move = 1;
     }
     
     //Moving to the left
     if(StdDraw.isKeyPressed(KeyEvent.VK_Z))
     { 
       move = 2;
     }  
     
     //Stops moving
     if(StdDraw.isKeyPressed(KeyEvent.VK_X))
     {
       move = 0;
     }
     
     
     
     
     if(move == 0)
     {
       move_stop();
     }
     
     if(move == 1)
     {
       move_right();
     }
     
     if(move == 2)
     {
       move_left();
     }
     
   }
   

   
   // draw the the cannon
   public void draw(Shooter a) {
    // StdDraw.filledSquare(rx, ry, radius);
      StdDraw.picture(rx,ry,"destroyer.png",0.3,0.3,a.degree()-90);
   }
   
    //x direction
   public double x_direction()
   {
     return rx;    
   }
   //y direction
   public double y_direction()
   {
     return ry;    
   }
         
        
   
   
}
