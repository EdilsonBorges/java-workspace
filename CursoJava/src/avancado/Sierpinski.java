package avancado;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class Sierpinski extends GraphicsProgram {

    public void run() {
        GRect box = new GRect(40, 40, 242, 342);
        box.setFilled(true);
        add(box);
        drawGasket(40, 40, 343);
    }

    private void drawGasket(int x, int y, int side) {
        int sub = side / 3;
        GRect box = new GRect(x + sub, y + sub, sub - 1, sub - 1);
        box.setFilled(true);
        box.setColor(Color.GRAY);
        add(box);

        if (sub >= 3) {
            drawGasket(x, y, sub);
            drawGasket(x + sub, y, sub);
            drawGasket(x + 2 * sub, y, sub);
            drawGasket(x, y + sub, sub);
            drawGasket(x + 2 * sub, y + sub, sub);
            drawGasket(x, y + 2 * sub, sub);
            drawGasket(x + sub, y + 2 * sub, sub);
            drawGasket(x + 2 * sub, y + 2 * sub, sub);
        }
    }

}