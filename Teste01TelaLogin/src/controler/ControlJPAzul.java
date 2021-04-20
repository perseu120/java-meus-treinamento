/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.JFramePrincipal;
import view.JPanelBlue;
import view.JPanelPrincipal;

/**
 *
 * @author willi
 */
public class ControlJPAzul implements ActionListener {
    
    private JPanelBlue jPanelAzul;
    private JPanelPrincipal jPanelPrincipal;
    private JFramePrincipal frame;

    public ControlJPAzul(JFramePrincipal frame) {
        this.frame = frame;
    }

    
    public JPanelBlue getjPanelAzul() {
        return jPanelAzul;
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
