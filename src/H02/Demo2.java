package H02;


import java.applet.Applet;
import java.awt.*;

public class Demo2 extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawString("Romano", 40, 40);
        g.setColor(Color.red);
        g.drawString("Torbed", 40, 50); }
}
