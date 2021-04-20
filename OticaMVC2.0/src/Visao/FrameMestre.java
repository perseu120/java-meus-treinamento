package Visao;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrameMestre extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menuOpções;
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
			menuBar.add(getMenuOpções());
		}
		return menuBar;
	}
	
	public JMenu getMenuOpções() {
		if (menuOpções == null) {
			menuOpções = new JMenu("Opções");
			menuOpções.add(getMenuItemLogoff());
		}
		return menuOpções;
	}
	public JMenuItem getMenuItemLogoff() {
		if (menuItemLogoff == null) {
			menuItemLogoff = new JMenuItem("Logoff");
		}
		return menuItemLogoff;
	}
}
