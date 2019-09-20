package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht4 extends Applet {
    TextField tekstvak,tekstvakjaar;
    Label label;
    String s, tekst;
    int dag,jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekstvakjaar = new TextField("",20);
        setSize(600,400);
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
                    tekst = "januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "februari heeft 28/29 dagen";
                    jaartal = Integer.parseInt( s);
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        tekst = ""+ " februari heeft 29 dagen";
                    }
                    else {
                        tekst = "" + " februari heeft 28 dagen";
                    }
                    repaint();
                    break;
                case 3:
                    tekst = "maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "april heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "september heeft 30 dagen";
                    break;
                case 10:
                    tekst = "oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "november heeft 30 dagen";
                    break;
                case 12:
                    tekst = "december heeft 31 dagen";
                    break;
                default:

                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}