package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawLine extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.CYAN);

            //DrLine(200,400,500,400, g);
            DrLine(100, 0, 600, 550, g);

    }

    public void DrLine(double x1, double x2, double y1, double y2, Graphics g) {
        //double c = 0.8;
        double l = Math.sqrt(square((x2 - x1)) + square((y2 - y1)));
        //double l_new = l * c;

        int xmove = (int) (Math.cos(Math.toRadians(x2 + 90)) * x1);
        int ymove = (int) (Math.sin(Math.toRadians(x2 - 90)) * x1);
        g.drawLine((int)y1,(int)y2, (int)y1 + xmove, (int)y2 + ymove);

        if(x1 >= 1) {
           DrLine(x1 - 10 , x2 + 45 , y1 + xmove, y2 + ymove,g);
                DrLine(x1 - 10 , x2 - 45 , y1 + xmove, y2 + ymove,g);
        }
    }
    static double square(double a) { return a * a; }
}
