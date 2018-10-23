package com.ittg.curvas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

public class Bezier extends JFrame{
    
    public static void main(String [] args){
     Bezier x=new Bezier();
        x.setTitle("Curvas de bezier");
        x.setSize(600,600);
        x.setVisible(true);
    }
    public void paint(Graphics g){
           
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        g2d.setStroke(new BasicStroke(3.0f));
        QuadCurve2D q=new  QuadCurve2D.Float(
                40.0f, 70.0f,40.0f, 170.0f, 190.0f,220.0f );
        g2d.draw(q);
        g2d.setColor(Color.blue);
        g2d.draw(new Rectangle2D.Float(40.0f, 70.0f, 1.0f, 1.0f));
        g2d.draw(new Rectangle2D.Float(40.0f, 170.0f, 1.0f, 1.0f));
        g2d.draw(new Rectangle2D.Float(190.0f, 220.0f, 1.0f, 1.0f));
    }
    
}
