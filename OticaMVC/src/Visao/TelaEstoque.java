package Visao;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaEstoque extends JPanel {

	
	private JLabel jLabelImagemInicial;
	private JMenuBar jMenuBarTelas;
	private JMenu menuOpcao;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnConfirmar;
	private JButton btnCancelar;
	
	
	public TelaEstoque() {
		setLayout(null);
		repaint();
		validate();
		add(getTextField());
		add(getTextField_1());
		add(getTextField_2());
		add(getJLabelImagemInicial());
		add(getBtnConfirmar());
		add(getBtnCancelar());

		
		
		
		

	}

	
	public JLabel getJLabelImagemInicial() {
		if (jLabelImagemInicial == null) {
			jLabelImagemInicial = new JLabel("");
			jLabelImagemInicial.setIcon(new ImageIcon("C:\\Users\\Perseu\\Documents\\eclipse\\Otica\\src\\imagem\\oculos colorido.jpg"));
			jLabelImagemInicial.setBounds(0, 0, 450, 289);
		}
		return jLabelImagemInicial;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(33, 65, 310, 27);
			textField.setColumns(10);
		}
		return textField;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(33, 122, 118, 27);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(244, 123, 99, 26);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	public JButton getBtnConfirmar() {
		if (btnConfirmar == null) {
			btnConfirmar = new JButton("confirmar");
			btnConfirmar.setBounds(33, 225, 89, 23);
		}
		return btnConfirmar;
	}
	public JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("cancelar");
			btnCancelar.setBounds(254, 225, 89, 23);
		}
		return btnCancelar;
	}
}
