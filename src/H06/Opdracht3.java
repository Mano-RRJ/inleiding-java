package H06;


import java.applet.*;
import java.awt.*;

public class Opdracht3 extends Applet {
    int a;
    int b;
    int uitkomst;

    @Override
    public void init() {
        a = 2147483647;
        b = 7788374;
        uitkomst = ( a + b );
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("2147483647 + 7788374 =" + uitkomst, 20, 20);
    }
}