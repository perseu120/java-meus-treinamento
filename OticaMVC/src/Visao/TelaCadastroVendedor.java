package Visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class TelaCadastroVendedor extends JPanel {

	private JLabel jLabelImagemInicial;
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private JTextField textFieldPis;
	private JButton jButtonConfimar;
	private JButton jButtonCancelar;
	
	public TelaCadastroVendedor() {
		setLayout(null);
		repaint();
		validate();
		add(getTextFieldNome());
		add(getTextFieldCpf());
		add(getTextFieldPis());
		add(getJButtonConfimar());
		add(getJButtonCancelar());
		add(getJLabelImagemInicial());
	}

	
	public JLabel getJLabelImagemInicial() {
		if (jLabelImagemInicial == null) {
			jLabelImagemInicial = new JLabel("");
			jLabelImagemInicial.setIcon(new ImageIcon("C:\\Users\\Perseu\\Documents\\eclipse\\Otica\\src\\imagem\\oculos colorido.jpg"));
			jLabelImagemInicial.setBounds(-599, -15, 1200, 1200);
		}
		return jLabelImagemInicial;
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBorder(new TitledBorder(null, "Nome", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			textFieldNome.setBounds(50, 53, 320, 36);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JTextField getTextFieldCpf() {
		if (textFieldCpf == null) {
			textFieldCpf = new JTextField();
			textFieldCpf.setBorder(new TitledBorder(null, "CPF", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			textFieldCpf.setBounds(50, 100, 157, 30);
			textFieldCpf.setColumns(10);
		}
		return textFieldCpf;
	}
	public JTextField getTextFieldPis() {
		if (textFieldPis == null) {
			textFieldPis = new JTextField();
			textFieldPis.setBorder(new TitledBorder(null, "PIS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			textFieldPis.setBounds(239, 100, 131, 30);
			textFieldPis.setColumns(10);
		}
		return textFieldPis;
	}
	public JButton getJButtonConfimar() {
		if (jButtonConfimar == null) {
			jButtonConfimar = new JButton("Confirmar");
			jButtonConfimar.setBounds(110, 250, 89, 23);
		}
		return jButtonConfimar;
	}
	public JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton("Cancelar");
			jButtonCancelar.setBounds(262, 250, 89, 23);
		}
		return jButtonCancelar;
	}
}
