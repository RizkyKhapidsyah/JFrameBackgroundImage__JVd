package com.rk.jfbi;

import javax.swing.*;
import java.awt.*;

public class PanelBackground extends JPanel {

    Image A;

    public PanelBackground(Image A_Param) {
        this.A = A_Param;
    }

    @Override
    public void paintComponents(Graphics g) {
        g.drawImage(A, 0, 0, null);
    }
}