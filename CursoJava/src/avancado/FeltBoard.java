package avancado;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
 
public class FeltBoard extends GraphicsProgram {
 
/** Runs the program */
   public void run() {
      GRect rect = new GRect(100, 50, 100, 100 / PHI);
      rect.setFilled(true);
      rect.setColor(Color.RED);
      add(rect);
      GOval oval = new GOval(150, 50 + 50 / PHI, 100, 100 / PHI);
      oval.setFilled(true);
      oval.setColor(Color.GREEN);
      add(oval);
   }
 
   public static final double PHI = 1.618;
 
} 