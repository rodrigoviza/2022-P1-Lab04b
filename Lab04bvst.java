// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(50,50,250,250);
        g.drawRect(125,125,250,250);
        g.drawLine(50,50,125,125);
        g.drawLine(300,50,375,125);
        g.drawLine(50,300,125,375);
        g.drawLine(300,300,375,375);


        // DRAW SPHERE
        g.drawOval(75,75,275,275);
        g.drawOval(75,110,275,200);
        g.drawOval(75,145,275,125);
        g.drawOval(75,180,275,50);
        g.drawOval(110,75,200,275);
        g.drawOval(145,75,125,275);
        g.drawOval(180,75,50,275);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(600,300,200,200);
        g.drawLine(600,400,785,350);
        g.drawLine(600,400,700,500);
        g.drawLine(700,500,785,350);
        g.drawOval(643,377,94,94);


        // DRAW APCS
        g.fillRect(50,400,30,150);
        g.fillRect(80,400,30,30);
        g.fillRect(110,400,30,150);
        g.fillRect(80,460, 30,30);

        g.fillRect(170,400,30,150);
        g.fillRect(200,400,30,30);
        g.fillRect(230,400,30,60);
        g.fillRect(200,460,60,30);

        g.fillRect(280,400,100,30);
        g.fillRect(280,400,30,150);
        g.fillRect(280,520,100,30);

        g.fillRect(400,400,100,30);
        g.fillRect(400,430,30,30);
        g.fillRect(400,460,100,30);
        g.fillRect(470,490,30,30);
        g.fillRect(400,520,100,30);


        // DRAW PACMEN FLOWER
        g.fillArc(540,150,100,100,40,270);
        g.fillArc(400,150,100,100,220,270);
        g.fillArc(470,82,100,100,130,270);
        g.fillArc(470,215,100,100,320,270);


    }

}


