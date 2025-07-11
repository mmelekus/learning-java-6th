package com.example;

import java.awt.*;
import javax.swing.*;

public class HelloComponent extends JComponent{
    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java!", 125, 95);
    }
}
