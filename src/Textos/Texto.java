/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;

/**
 *
 * @author DellLatitude1
 */
public class Texto extends JFrame{
    public static void main(String [] args){
    Texto x=new Texto();
        x.setTitle("Texto java 2D");
        x.setSize(600,600);
        x.setVisible(true);
      }
    
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        AffineTransform a=g2.getTransform();
        a.translate(100, 170);
        g2.transform(a);
        a.setToScale(2.5f, 2.5f);
        for(int i=0; i<3; i++){
            g2.drawString("Ejemplo Textos", 0.0f, 0.0f);
            g2.transform(a);
        
        }
        
        
    
    }
}
