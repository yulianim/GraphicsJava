/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milysoft.traslate;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author DellLatitude1
 */
public class Rotacion extends JFrame{
    public static void main(String [] args){
        Rotacion x=new Rotacion();
        x.setTitle("Rotacion");
        x.setSize(600,600);
        x.setVisible(true);
    }
    public void paint(Graphics g){
           
    Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        g2d.fillRect(200, 200, 80, 50);
        g2d.rotate(Math.PI/10); //gira el sistema de coordenadas
        g2d.fillRect(200, 200, 80, 50);
        
    }
}
