package H10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "januari";
                    break;
                case 2:
                    tekst = "februari";
                    break;
                case 3:
                    tekst = "maart";
                    break;
                case 4:
                    tekst = "april";
                    break;
                case 5:
                    tekst = "mei";
                    break;
                case 6:
                    tekst = "juni";
                    break;
                case 7:
                    tekst = "juli";
                    break;
                case 8:
                    tekst ="augustus";
                    break;
                case 9:
                    tekst ="september";
                case 10:
                    tekst ="oktober";
                    break;
                case 11:
                    tekst ="november";
                    break;
                case 12:
                    tekst ="december";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}