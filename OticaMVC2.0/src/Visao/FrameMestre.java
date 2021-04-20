package Visao;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameMestre extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menuOp��es;
	private JMenuItem menuItemLogoff;
	
	private TelaLogin telaLogin;


	public FrameMestre(){
		setSize(455, 350);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setJMenuBar(getMenuBar_1());
			
	}
	
	
	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMenuOp��es());
		}
		return menuBar;
	}
	
	public JMenu getMenuOp��es() {
		if (menuOp��es == null) {
			menuOp��es = new JMenu("Op��es");
			menuOp��es.add(getMenuItemLogoff());
		}
		return menuOp��es;
	}
	public JMenuItem getMenuItemLogoff() {
		if (menuItemLogoff == null) {
			menuItemLogoff = new JMenuItem("Logoff");
		}
		return menuItemLogoff;
	}
}
