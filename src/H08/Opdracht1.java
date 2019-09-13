package H08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
   Button OkKnop;
   Button ResetKnop;
   Label label;
   TextField tekstvak;
   String s;


    public void init() {

        OkKnop = new Button("OK");
        ResetKnop = new Button("Reset");
        label = new Label("Type hier iets in");
        tekstvak = new TextField("",30);
        add(tekstvak);
        add(OkKnop);
        add(ResetKnop);
        add(label);
        OkKnop.addActionListener(new OkKnopActionListener());
        ResetKnop.addActionListener(new ResetKnopActionListener());

    }

    public void paint(Graphics g) {
    }

    class OkKnopActionListener implements ActionListener  {
        public void actionPerformed(ActionEvent e) {
    s = tekstvak.getText();
    label.setText(s);
    repaint();

        }
    }
    class ResetKnopActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            label.setText("");
            repaint();

        }
    }
}