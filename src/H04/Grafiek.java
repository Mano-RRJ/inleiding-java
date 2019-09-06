package H04;

import java.applet.Applet;
import java.awt.*;


public class Grafiek extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(800,800,800,400);
        g.drawLine(800,800,1200,800);
        g.setColor(Color.black);
        g.drawString("20",775,750);
        g.drawString("40",775,700);
        g.drawString("60",775,650);
        g.drawString("80",775,600);
        g.drawString("100",770,550);
        g.drawString("Valerie",815,850);
        g.drawString("Jeroen",885,850);
        g.drawString("Hans",960,850);
        g.setColor(Color.red);
        g.fillRect(801,690,70,110);
        g.setColor(Color.blue);
        g.fillRect(871,543,70,257);
        g.setColor(Color.green);
        g.fillRect(941,596,70,204);
    }
}