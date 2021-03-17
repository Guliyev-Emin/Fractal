package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        // write your code here
        JFrame myFrame = new JFrame("Draw Line");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawLine l = new DrawLine();
        myFrame.add(l);
        myFrame.setSize(1366, 768);
        myFrame.setVisible(true);

    }
}