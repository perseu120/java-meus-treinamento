/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author willian
 */
public class JFramePrincipal extends javax.swing.JFrame{
    
    
    public JFramePrincipal(){
        initComponents();
    }
    
    
    private void initComponents(){
        this.setLayout(new BorderLayout());
        this.setTitle("Frame Main");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(800,600);
        this.setVisible(true);
    }
    
    
    public void resetFrame(){ // Reseta o frame depois de mudanças de
            // componentes na tela.
        repaint();
        validate();
    }
}
