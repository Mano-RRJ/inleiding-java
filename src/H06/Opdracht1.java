package H06;


import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;
    @Override
    public void init() {
        a = 113;
        b = 0;
        c = 4;
        uitkomst = ( a + b ) / c;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("113 : 4 =" + uitkomst, 20, 20);
        g.drawString("Jan krijgt 28 euro.", 20, 40);
        g.drawString("Ali krijgt 28 euro.", 20, 60);
        g.drawString("Jeannette krijgt 28 euro.", 20, 80);
        g.drawString("Ik krijg 28 euro.", 20, 100);
    }
}