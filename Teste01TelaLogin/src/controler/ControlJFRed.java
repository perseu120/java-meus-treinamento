/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.JFramePrincipal;
import view.JPanelPrincipal;
import view.JPanelRed;

/**
 *
 * @author willian
 */
public class ControlJFRed implements ActionListener {
    
    private JPanelRed jPanelRed;
    private JPanelPrincipal jPanelPrincipal;
    private JFramePrincipal frame;

    public ControlJFRed(JFramePrincipal frame) {
        this.frame = frame;
    }

    
    public JPanelRed getjPanelRed() {
        return jPanelRed;
    }

    
    public JPanelPrincipal getjPanelPrincipal() {
        return jPanelPrincipal;
    }

    
    public JFramePrincipal getFrame() {
        return frame;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
    
}
