package Visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaCadastroVendedor extends JPanel {
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private JTextField textFieldPis;
	private JButton jButtonConfimar;
	private JButton jButtonCancelar;
	private JLabel JLabelImagemVendedor;
	
	public TelaCadastroVendedor() {
		setLayout(null);
		repaint();
		validate();
		add(getTextFieldNome());
		add(getTextFieldCpf());
		add(getTextFieldPis());
		add(getJButtonConfimar());
		add(getJButtonCancelar());
		add(getJLabelImagemVendedor());
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			textFieldNome.setBorder(new TitledBorder(null, "Nome", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			textFieldNome.setBounds(50, 50, 320, 39);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JTextField getTextFieldCpf() {
		if (textFieldCpf == null) {
			
			try{

		           javax.swing.text.MaskFormatter format_textField4 = new javax.swing.text.MaskFormatter("###.###.###-##");

		           textFieldCpf = new javax.swing.JFormattedTextField(format_textField4);
		           textFieldCpf.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		    }catch (Exception e){
		    	
		    }
			
			//textFieldCpf = new JTextField();
			textFieldCpf.setBorder(new TitledBorder(null, "CPF", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			textFieldCpf.setBounds(50, 100, 157, 39);
			textFieldCpf.setColumns(10);
		}
		return textFieldCpf;
	}
	public JTextField getTextFieldPis() {
		if (textFieldPis == null) {
			textFieldPis = new JTextField();
			textFieldPis.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			textFieldPis.setBorder(new TitledBorder(null, "PIS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			textFieldPis.setBounds(239, 100, 131, 39);
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
	public JLabel getJLabelImagemVendedor() {
		if (JLabelImagemVendedor == null) {
			JLabelImagemVendedor = new JLabel("");
			JLabelImagemVendedor.setVerticalAlignment(SwingConstants.TOP);
			JLabelImagemVendedor.setIcon(new ImageIcon(TelaCadastroVendedor.class.getResource("/imagem/vendedor.jpg")));
			JLabelImagemVendedor.setBounds(0, 0, 453, 300);
		}
		return JLabelImagemVendedor;
	}
	
	
	
}
