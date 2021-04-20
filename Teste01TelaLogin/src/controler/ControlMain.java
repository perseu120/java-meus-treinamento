/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import view.JFramePrincipal;
import view.JPanelPrincipal;


/**
 *
 * @author willi
 */
public class ControlMain {
    
    private static ControlJFPrincipal controllPrincipal;
    private static JPanelPrincipal jPanelPrincipal;
    private static JFramePrincipal frame;
    
    public static void main(String[] args){
        getFrame().setContentPane(getTlPrin());
        getFrame().repaint();
        getFrame().revalidate();
        getCtlPrin();
    }

    public static ControlJFPrincipal getCtlPrin() {
        if(controllPrincipal == null){
            controllPrincipal = new ControlJFPrincipal(getTlPrin(), getFrame());
        }
        return controllPrincipal;
    }

    public static JFramePrincipal getFrame() {
        if(frame == null){
            frame = new JFramePrincipal();
        }
        return frame;
    }

    public static JPanelPrincipal getTlPrin() {
        if(jPanelPrincipal == null){
            jPanelPrincipal = new JPanelPrincipal(getFrame());
        }
        return jPanelPrincipal;
    }

  
  
    
}
