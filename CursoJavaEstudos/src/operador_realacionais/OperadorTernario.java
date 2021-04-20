package operador_realacionais;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class OperadorTernario extends JFrame implements ActionListener{
	
	
	private JLabel data;
	private JLabel mostraIdade;
	private JLabel valorIdade;
	private JLabel situacao;
	private JLabel situacaoValor;
	
	private JTextField dataField;
	
	private JButton calcular;
	
	private JPanel painel;
	
	
	
	public OperadorTernario() {
		
		this.setContentPane(getPainel());
		this.setSize(500, 300);
		
		this.setVisible(true);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	

	
	
	public static void main(String arg[]) {
		
		OperadorTernario tela = new OperadorTernario();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == getCalcular() ) {
			
			int data ;	
			data = Integer.parseInt(getDataField().getText());
			
			
			
			data = 2020 - data;
			
			getValorIdade().setText( Integer.toString(data) );
			getValorIdade().setVisible(true);
			
			
			String situacao;
			
			situacao = (((data)<18 && (data)>=16) || (data>=70)) ?"Opcional":"Obrigatorio";
			
			getSituacaoValor().setText(situacao);
			getSituacaoValor().setVisible(true);
			
		}
		
	}
	
	private void addEvent(){
		
		getCalcular().addActionListener(this);
		
	}
	

	public JLabel getData() {
		
		if(data == null){
	
			data = new JLabel("Ano de Nascimento");
			data.setBounds(45, 60, 119, 30);
	
		}
		return data;
	}

	public JLabel getMostraIdade() {
		
		if(mostraIdade == null){
	
			mostraIdade = new JLabel("Idade");
			mostraIdade.setBounds(69, 167, 95, 23);
	
		}
		return mostraIdade;
	}

	public JLabel getValorIdade() {
		
		if(valorIdade == null){
			
			valorIdade = new JLabel(" 0 ");
			valorIdade.setBounds(240, 160, 113, 30);
			valorIdade.setVisible(false);
			
		}
		return valorIdade;
	}

	public JLabel getSituacao() {
		
		if(situacao == null){
	
			situacao = new JLabel("Situação");
			situacao.setBounds(67, 201, 82, 30);
	
		}
		return situacao;
	}

	public JLabel getSituacaoValor() {
		
		if(situacaoValor == null){
			
			
			situacaoValor = new JLabel(" 0");
			situacaoValor.setBounds(240, 201, 113, 30);
			situacaoValor.setVisible(false);
	
		}
		return situacaoValor;
	}

	public JTextField getDataField() {
		
		if(dataField == null){
	
			dataField = new JTextField();
			dataField.setBounds(200, 60, 119, 30);
	
		}
		return dataField;
	}

	public JButton getCalcular() {
		
		if(calcular == null){
	
			calcular = new JButton("Calcular");
			calcular.setBounds(95, 105, 170, 40);
	
		}
		return calcular;
	}


	public JPanel getPainel() {
		
		if(painel == null){
	
			painel = new JPanel();
			painel.setBackground(Color.GRAY);
			painel.setLayout(null);
			painel.add(getCalcular());
			painel.add(getData());
			painel.add(getDataField());
			painel.add(getMostraIdade());
			painel.add(getValorIdade());
			painel.add(getSituacao());
			painel.add(getSituacaoValor());
			
			addEvent();
	
		}
		return painel;
	}
	
	
	
	
	
	

}
