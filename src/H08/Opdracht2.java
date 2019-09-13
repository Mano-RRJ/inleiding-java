package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    Button Vrouwenknop;
    Button Mannenknop;
    Button Jongensknop;
    Button Meisjesknop;
    Label label;

    int Vrouwenaantal = 0;
    int Mannenaantal = 0;
    int Jongensaantal = 0;
    int Meisjesaantal = 0;
    int Totaalaantal = 0;


    public void init() {

        Vrouwenknop = new Button("Vrouwen");
        Mannenknop = new Button("Mannen");
        Jongensknop = new Button("Jongens");
        Meisjesknop = new Button("Meisjes");
        label = new Label("Type hier iets in");
        add(Vrouwenknop);
        add(Mannenknop);
        add(Jongensknop);
        add(Meisjesknop);
        Vrouwenknop.addActionListener(new VrouwenActionListener());
        Mannenknop.addActionListener(new MannenActionlistener());
        Jongensknop.addActionListener(new JongensActionlistener());
        Meisjesknop.addActionListener(new MeisjesActionlistener());
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("Vrouwenaantal" + Vrouwenaantal, 50, 50);
        g.drawString("Mannenaanrtal" + Mannenaantal, 50, 100);
        g.drawString("Jongensaantal" + Jongensaantal, 50, 150);
        g.drawString("Meisjesaantal" + Meisjesaantal,50, 200);
        g.drawString("Totaalaantal" + Totaalaantal + ( Vrouwenaantal + Mannenaantal + Jongensaantal + Meisjesaantal), 50, 250);
    }

    class VrouwenActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Vrouwenaantal++;
            repaint();
        }
    }
    class MannenActionlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Mannenaantal++;
            repaint();
        }
    }
    class JongensActionlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Jongensaantal++;
            repaint();
        }
    }
    class MeisjesActionlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Meisjesaantal++;
            repaint();
        }
    }
    class TotaalActionlistener implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Totaalaantal++;
            repaint();
        }
    }
}