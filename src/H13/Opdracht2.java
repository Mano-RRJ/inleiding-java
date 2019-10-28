package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    @Override
    public void init() {
        setSize(600, 400);
    }

    public void paint(Graphics graphics){

        graphics.setColor(Color.red);
        TekenRoodeBaksteenMuur(graphics,50,50,100,50);
        TekenRoodeBaksteenMuur(graphics,151,152,100,50);
        TekenRoodeBaksteenMuur(graphics,50,152,100,50);
        TekenRoodeBaksteenMuur(graphics,252,152,100,50);
        TekenRoodeBaksteenMuur(graphics,353,152,100,50);
        TekenRoodeBaksteenMuur(graphics,454,152,100,50);
        TekenRoodeBaksteenMuur(graphics,101,101,100,50);
        TekenRoodeBaksteenMuur(graphics,151,50,100,50);
        TekenRoodeBaksteenMuur(graphics,202,101,100,50);
        TekenRoodeBaksteenMuur(graphics,303,101,100,50);
        TekenRoodeBaksteenMuur(graphics,404,101,100,50);
        TekenRoodeBaksteenMuur(graphics,252,50,100,50);
        TekenRoodeBaksteenMuur(graphics,353,50,100,50);
        TekenRoodeBaksteenMuur(graphics,454,50,100,50);
        TekenRoodeBaksteenMuur(graphics,101,203,100,50);
        TekenRoodeBaksteenMuur(graphics,202,203,100,50);
        TekenRoodeBaksteenMuur(graphics,303,203,100,50);
        TekenRoodeBaksteenMuur(graphics,404,203,100,50);
        TekenRoodeBaksteenMuur(graphics,50,254,100,50);
        TekenRoodeBaksteenMuur(graphics,151,254,100,50);
        TekenRoodeBaksteenMuur(graphics,252,254,100,50);
        TekenRoodeBaksteenMuur(graphics,353,254,100,50);
        TekenRoodeBaksteenMuur(graphics,454,254,100,50);

    }
    void TekenRoodeBaksteenMuur (Graphics graphics,int x1, int y1, int width, int height){
        graphics.fillRect(x1,y1,width,height);
    }
}