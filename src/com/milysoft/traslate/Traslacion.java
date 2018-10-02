package com.milysoft.traslate;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @Yuliani Moreno
 */
public class Traslacion extends JFrame{
    public static void main(String [] args){
        Traslacion x=new Traslacion();
        x.setTitle("Traslacion");
        x.setSize(600,600);
        x.setVisible(true);
    }
    public void paint(Graphics g){
        Thread t=new Thread();
        
            g.setColor(Color.yellow);
            g.fillRect(20, 20, 80, 50);
            g.translate(180, 0); //Recibe dos parametros traslate (x, y)
            g.fillRect(20, 20, 80, 50);
            
            g.dispose();
        
        
    }
    
}
