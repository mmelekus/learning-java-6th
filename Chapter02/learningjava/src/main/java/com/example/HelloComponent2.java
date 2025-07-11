package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloComponent2 extends JComponent implements MouseMotionListener {
    String theMessage;
    int messageX = 125; // X coordinate for the message
    int messageY = 95; // Y coordinate for the message

    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Save the mouse coordinates and paint the message.
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        // No action needed for mouse movement.
    }
}
