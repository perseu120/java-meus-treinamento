package Visao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;

public class TelaInicial extends JPanel {
	private JButton jButtonVender;
	private JButton jButtonEstoque;
	private JButton jButtonCadastro;
	private JButton jButtonRelatorio;
	private JLabel jLabelImagemInicial;
	private JMenuBar jMenuBarTelas;
	private JMenu menuOpcao;
	

	public TelaInicial() {
		setLayout(null);
		add(getJButtonVender());
		add(getJButtonEstoque());
		add(getJButtonCadastro());
		add(getJButtonRelatorio());
		//add(getJMenuBarTelas());
		
		add(getJLabelImagemInicial());
		
		
		

		this.repaint();
		this.validate();
		
	}

	public JButton getJButtonVender() {
		if (jButtonVender == null) {
			jButtonVender = new JButton("Vendas");
			jButtonVender.setBackground(new Color(30, 144, 255));
			jButtonVender.setForeground(new Color(255, 255, 240));
			jButtonVender.setFont(new Font("Arial", Font.BOLD, 35));
			jButtonVender.setBounds(21, 43, 185, 73);
		}
		return jButtonVender;
	}
	public JButton getJButtonEstoque() {
		if (jButtonEstoque == null) {
			jButtonEstoque = new JButton("Estoque");
			jButtonEstoque.setBackground(Color.ORANGE);
			jButtonEstoque.setForeground(new Color(255, 255, 240));
			jButtonEstoque.setFont(new Font("Arial", Font.BOLD, 35));
			jButtonEstoque.setBounds(244, 43, 185, 73);
		}
		return jButtonEstoque;
	}
	public JButton getJButtonCadastro() {
		if (jButtonCadastro == null) {
			jButtonCadastro = new JButton("Cadasto");
			jButtonCadastro.setForeground(new Color(255, 255, 240));
			jButtonCadastro.setFont(new Font("Arial", Font.BOLD, 35));
			jButtonCadastro.setBackground(new Color(255, 0, 153));
			jButtonCadastro.setBounds(21, 182, 185, 73);
		}
		return jButtonCadastro;
	}
	public JButton getJButtonRelatorio() {
		if (jButtonRelatorio == null) {
			jButtonRelatorio = new JButton("Relat\u00F3rio");
			jButtonRelatorio.setForeground(new Color(255, 255, 240));
			jButtonRelatorio.setFont(new Font("Arial", Font.BOLD, 35));
			jButtonRelatorio.setBackground(new Color(51, 255, 255));
			jButtonRelatorio.setBounds(244, 182, 185, 73);
		}
		return jButtonRelatorio;
	}
	public JLabel getJLabelImagemInicial() {
		if (jLabelImagemInicial == null) {
			jLabelImagemInicial = new JLabel("");
			jLabelImagemInicial.setIcon(new ImageIcon(TelaInicial.class.getResource("/imagem/oculos colorido.jpg")));
			jLabelImagemInicial.setBounds(0, 0, 450, 300);
		}
		return jLabelImagemInicial;
	}
	
}
