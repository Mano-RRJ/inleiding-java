package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    @Override
    public void init() {
        setSize(600,400);
    }

    @Override
    public void paint(Graphics g) {
        tekenDriehoek(g, 100, 400, 200, 400, 150, 50);
    }
        void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3, y3);
            g.drawLine(x3, y3, x1, y1);
    }
}