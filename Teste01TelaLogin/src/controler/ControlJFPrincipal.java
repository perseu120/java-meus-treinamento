/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import view.JFramePrincipal;
import view.JPanelBlue;
import view.JPanelPrincipal;
import view.JPanelRed;

/**
 *
 * @author willi
 */
public class ControlJFPrincipal implements java.awt.event.ActionListener {
    
    
    private JPanelPrincipal jPanelPrincipal;
    private JPanelBlue jPanelAzul;
    private JPanelRed jPanelRed;
    private JPanel panelOut;
    private JFramePrincipal frame;
    
    
    public ControlJFPrincipal(JPanelPrincipal tela, JFramePrincipal frame){
        this.jPanelPrincipal = tela;
        this.frame = frame;
        this.addEvent();
    }
    
    private void addEvent(){
        this.getJPanelPrincipal().getjButtonMenu().addActionListener(this);
        this.getJPanelPrincipal().getJButton1().addActionListener(this);
        this.getJPanelPrincipal().getJButton2().addActionListener(this);
    }
            
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.getJPanelPrincipal().getjButtonMenu()){
            this.open_closeJPanelWest(220,0,1000);
        }
        if(e.getSource() == this.getJPanelPrincipal().getJButton1()){
            this.getJPanelPrincipal().setJPanelCenter(this.getjPanelAzul(), panelOut);
            panelOut = getjPanelAzul();
        }
        if(e.getSource() == this.getJPanelPrincipal().getJButton2()){
            this.getJPanelPrincipal().setJPanelCenter(this.getjPanelRed(), panelOut);
            panelOut = getjPanelRed();
        }
    }

    
    public JFramePrincipal getFrame(){
        if(frame == null){
            frame = new JFramePrincipal();
        }
        return frame;
    }
    
    
    public JPanelPrincipal getJPanelPrincipal() {
        if(jPanelPrincipal == null){
            jPanelPrincipal = new JPanelPrincipal(getFrame());
        }
        return jPanelPrincipal;
    }

    
    public JPanelBlue getjPanelAzul() {
        if(jPanelAzul == null){
            jPanelAzul = new JPanelBlue();
        }
        return jPanelAzul;
    }

    
    public JPanelRed getjPanelRed() {
        if(jPanelRed == null){
            jPanelRed = new JPanelRed();
        }
        return jPanelRed;
    }
    
    
    private void open_closeJPanelWest(int open, int close, int heigth){
        int heigtJPanelWest;
        heigtJPanelWest = this.getJPanelPrincipal().getJPanelWest().getWidth();
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    if(heigtJPanelWest > 0){ // Se JPanelWest aberto
                        for(int x = open; x >= close; x--){
                            Thread.sleep(1);
                            getJPanelPrincipal().getJPanelWest().setSize(x,heigth);
                        }
                    }else{
                        for(int x = close; x <= open; x++){
                            Thread.sleep(1);
                            getJPanelPrincipal().getJPanelWest().setSize(x,heigth);
                        }
                    }
                } catch (InterruptedException ex) {
                }
            } 
        };thread.start();
        
        
        
    
    }
    
}
