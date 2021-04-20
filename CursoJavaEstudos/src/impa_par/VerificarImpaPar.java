package impa_par;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerificarImpaPar extends JFrame implements ActionListener {
	
	
	JPanel painel;
	JButton butao;
	JLabel valor;
	JLabel resposta;
	JTextField campo;
	
	
	
	public VerificarImpaPar() {
		// TODO Auto-generated constructor stub
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(200, 50, 200, 250);
		this.setContentPane(getPainel());
		
	}
	
	
	
	
	public JPanel getPainel() {
		
		if(painel == null){
	
			painel = new JPanel();
			painel.setSize(200, 250);
			painel.setBackground(Color.BLACK);
			painel.setLayout(null);
			painel.add(getButao());
			painel.add(getCampo());
			painel.add(getValor());
			painel.add(getResposta());
			
		}
		return painel;
	}




	public JButton getButao() {
		
		if(butao == null){
	
			butao = new JButton("Verificar");
			butao.setLocation(44, 100);
			butao.setSize(91, 30);
			addEvent();
	
		}
		return butao;
	}




	public JLabel getValor() {
		
		if(valor == null){
	
			valor = new JLabel("Valor");
			valor.setFont(new Font("Dialog", Font.PLAIN, 22));
			valor.setForeground(Color.WHITE);
			valor.setLocation(10, 52);
			valor.setSize(66 , 30);
			
	
		}
		return valor;
	}




	public JLabel getResposta() {
		
		if(resposta == null){
	
			resposta = new JLabel("Resposta");
			resposta.setBounds(10, 149, 144, 30);
			resposta.setForeground(Color.WHITE);
			resposta.setFont(new Font("Dialog", Font.PLAIN, 30));
	
		}
		return resposta;
	}




	public JTextField getCampo() {
		
		if(campo == null){
	
			campo = new JTextField();
			campo.setLocation(93, 52);
			campo.setSize(81, 30);
	
		}
		return campo;
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == getButao()) {
			
			int valor =  Integer.parseInt( getCampo().getText());
			
			if(valor%2 == 0) {
				getResposta().setText("Par!");
			}else {
				getResposta().setText("Impar!");
			}
			
		}
		
	}
	public void addEvent() {
			getButao().addActionListener(this);
	}


	public static void main(String args[]) {
		
		VerificarImpaPar frame = new VerificarImpaPar();
		
	}


	

}
