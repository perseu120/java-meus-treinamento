/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

/**
 *
 * @author willian
 */
public class JPanelRed extends JPanel{
    
    public JPanelRed(){
        initcomponets();
    }

    private void initcomponets() {
        setLayout(null);
        setPreferredSize(new Dimension(800,500));
        setBackground(Color.RED);
        setVisible(true);
    }
    
}