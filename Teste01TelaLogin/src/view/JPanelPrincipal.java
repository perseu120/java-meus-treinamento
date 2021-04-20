/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author willian
 */
public class JPanelPrincipal extends javax.swing.JPanel{
    
    private JButton jButtonMenu;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JPanel jPanelWest;
    private JPanel jPanelNorth;
    private JPanel jPanelWest_User;
    private JFramePrincipal frame;
    
    public JPanelPrincipal(JFramePrincipal frame){
        initComponents();
        this.frame = frame;
    }
    
    
    private void initComponents(){
        this.getPnlBase();
        this.getJPanelNorth().add(this.getjButtonMenu());
        this.getJPanelWest().add(this.getjPanelWest_User());
        this.getJPanelWest().add(this.getJButton1());
        this.getJPanelWest().add(this.getJButton2());
        this.getJPanelWest().add(this.getJButton3());
        this.add(BorderLayout.NORTH,this.getJPanelNorth());
        this.add(BorderLayout.WEST, this.getJPanelWest());
    }
    
    
    public JPanelPrincipal getPnlBase(){
        setLayout(new BorderLayout());
        setSize(800,600);
        setVisible(true);
        return JPanelPrincipal.this;
    }
    
    
    public JPanel getJPanelWest(){
        if(jPanelWest == null){
            jPanelWest = new JPanel();
            jPanelWest.setLayout(null);
            jPanelWest.setPreferredSize(new java.awt.Dimension(0, 500));
            jPanelWest.setBackground(new Color(51,51,51));
            jPanelWest.setVisible(true);
        }
        return jPanelWest;
    }
    
    
    public JPanel getJPanelNorth(){
        if(jPanelNorth == null){
            jPanelNorth = new JPanel();
            jPanelNorth.setLayout(null);
            jPanelNorth.setPreferredSize(new Dimension(500, 100));
            jPanelNorth.setBackground(new Color(219,131,0));
            jPanelNorth.setVisible(true);
        }        
        return jPanelNorth;
    }

    public JPanel getjPanelWest_User() {
        if(jPanelWest_User == null){
            jPanelWest_User = new JPanel();
            jPanelWest_User.setLayout(null);
            jPanelWest_User.setBounds(1,1,220,200);
            jPanelWest_User.setBackground(new Color(51,51,120));
            jPanelWest_User.setVisible(true);
        }
        return jPanelWest_User;
    }

    public JButton getjButtonMenu() {
        if(jButtonMenu == null){
           jButtonMenu = new JButton("Menu");
           jButtonMenu.setBounds(10, 10, 80, 80);
        }
        return jButtonMenu;
    }


    public JButton getJButton1() {
        if(jButton1 == null){
           jButton1 = new JButton("Tela Azul");
           jButton1.setBounds(6, 206, 208, 40);
        }
        return jButton1;
    }
    
    
    public JButton getJButton2() {
        if(jButton2 == null){
           jButton2 = new JButton("Tela Vermelha");
           jButton2.setBounds(6, 252, 208, 40);
        }
        return jButton2;
    }
    
    
    public JButton getJButton3() {
        if(jButton3 == null){
           jButton3 = new JButton("BTN");
           jButton3.setBounds(6, 298, 208, 40);
        }
        return jButton3;
    }
    
    
    public JFramePrincipal getFrame(){
        if(frame == null){
            frame = new JFramePrincipal();
        }
        return frame;
    }
    
    
    public void setJPanelCenter(JPanel panelIn, JPanel panelOut){
        if(panelOut == null){
            System.out.println("Isert");
            this.remove(new JPanel());
        }else{
            System.out.println("Remuve");
            this.remove(panelOut);
        }
        add(BorderLayout.CENTER, panelIn);
        getFrame().resetFrame();
    }
    
}
