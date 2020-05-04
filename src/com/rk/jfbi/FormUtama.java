package com.rk.jfbi;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {
    Image B;
    PanelBackground C;

    public FormUtama() {
        super("JFrame Dengan Background Image");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        B = new ImageIcon("image/aaa.jpg").getImage();
        C = new PanelBackground(B);
        add(C);
        setPreferredSize(new Dimension(B.getWidth(null), B.getHeight(null)));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}