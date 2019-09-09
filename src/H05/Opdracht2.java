package H05;


import java.applet.*;
import java.awt.*;


public class Opdracht2 extends Applet {

    int gewichtValerie;
    int gewichthans;
    int gewichtjeroen;
    int hoogteXas;

    @Override
    public void init() {
        setSize(400, 400);
        gewichtValerie = 40;
        hoogteXas = 350;
        gewichthans = 80;
        gewichtjeroen = 100;

    }   @Override
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(50, 50, 50, hoogteXas);
        g.drawLine(50, hoogteXas, hoogteXas, hoogteXas);
        g.setColor(Color.red);
        g.fillRect(50, hoogteXas - gewichtValerie, 80, gewichtValerie);
        g.setColor(Color.orange);
        g.fillRect(135, hoogteXas - gewichtjeroen, 80, gewichtjeroen);
        g.setColor(Color.yellow);
        g.fillRect(220, hoogteXas - gewichthans, 80, gewichthans);
        g.setColor(Color.orange);
        g.drawString("hans", 150, 375);
        g.setColor(Color.red);
        g.drawString("valerie", 70, 375);
        g.setColor(Color.yellow);
        g.drawString("jeroen", 225, 375);
        g.setColor(Color.black);
        g.drawString("40", 25, 317);
        g.drawString("80", 25, 275);
        g.drawString("100", 20, 255);
    }
}