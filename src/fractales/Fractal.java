package fractales;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Fractal extends JFrame{

    double xp1 = 300;
    double yp1 = 300;
    double xp2 = 10;
    double yp2 = 300;
    double sin60 = Math.sin(3.14 / 3.);
    int nivel_de_recursividad = 10;

     public static void main(String[] args) {
         Fractal x=new Fractal();
        x.setTitle("Curvas de bezier");
        x.setSize(600,600);
        x.setVisible(true);

    }

    public void paint(Graphics g) {
        paintRecursivo(g, nivel_de_recursividad, xp1, yp1, xp2, yp2);
    }

    private void paintRecursivo(Graphics g, int i, double xp12, double yp12, double xp22, double yp22) {

        double dx = (xp22 - xp12) / 2.;
        double dy = (yp22 - yp12) / 2.;
        double xp32 = xp12 + dx - 2 * dy * sin60;
        double yp32 = yp12 + dy + 2 * dx * sin60;

        double dx1 = (xp22 + xp12) / 2.;
        double dy1 = (yp22 + yp12) / 2.;
        double dx2 = (xp32 + xp22) / 2.;
        double dy2 = (yp32 + yp22) / 2.;
        double dx3 = (xp12 + xp32) / 2.;
        double dy3 = (yp12 + yp32) / 2.;

        if (i <= 0) {
            g.drawLine((int) xp12, (int) yp12, (int) xp22, (int) yp22);
            g.drawLine((int) xp22, (int) yp22, (int) xp32, (int) yp32);
            g.drawLine((int) xp32, (int) yp32, (int) xp12, (int) yp12);
        } else {
            paintRecursivo(g, i - 1, xp12, yp12, dx1, dy1);
            paintRecursivo(g, i - 1, dx1, dy1, xp22, yp22);
            paintRecursivo(g, i - 1, dx3, dy3, dx2, dy2);
        }

    }
}

