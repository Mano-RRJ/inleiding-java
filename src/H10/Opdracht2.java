package H10;


import javax.swing.*;
import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    TextField Tekstvak;
    String s;
    Label label;
    int HoogsteGetal;
    int LaagsteGetal;

    public void init() {
        label = new Label("typ hier uw getal");
        add(label);

        Tekstvak = new TextField("", 20);
        Tekstvak.addActionListener(new TekstvakListener());
        add(Tekstvak);
        LaagsteGetal = Integer.MAX_VALUE;
        HoogsteGetal = Integer. MIN_VALUE;
        ;

    }

    public void paint(Graphics g) {
        g.drawString("" + HoogsteGetal, 50, 45);
        g.drawString("" + LaagsteGetal, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = Tekstvak.getText();
            int Getal = Integer.parseInt(s);
            if (Getal > HoogsteGetal) {
                HoogsteGetal = Getal;
                repaint();
            }
            s = Tekstvak.getText();
            int Getal2 = Integer.parseInt(s);
            if (Getal2 < LaagsteGetal) {
                LaagsteGetal = Getal2;
                repaint();
            }

        }
    }
}
