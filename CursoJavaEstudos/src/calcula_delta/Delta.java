package calcula_delta;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Delta extends JFrame implements ChangeListener, ActionListener{
	
	
	private JPanel painel;
	private JSpinner valorA;
	private JSpinner valorB;
	private JSpinner valorC;
	private JButton calcular;
	private JLabel x1;
	private JLabel x2;
	private JLabel igual;
	private JLabel delta;
	private JLabel A;
	private JLabel B;
	private JLabel C;
	private JLabel quadrado;
	private JLabel condicao;
	private JLabel valorDelta;
	
	
	Delta(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(getPainel());
		this.setVisible(true);
		this.setSize(400, 400);
		
		
		
	}

	
	
	
	
	
	public JPanel getPainel() {
		
		if(painel == null){
	
			painel = new JPanel();
			painel.setLayout(null);
			painel.validate();
			painel.repaint();
			painel.setBounds(400, 400, 400, 400);
			painel.add(getValorA());
			painel.add(getValorB());
			painel.add(getValorC());
			painel.add(getCalcular());
			painel.add(getX1());
			painel.add(getX2());
			painel.add(getIgual());
			painel.add(getA());
			painel.add(getB());
			painel.add(getC());
			painel.add(getQuadrado());
			painel.add(getCondicao());
			painel.add(getValorDelta());
			addEvent();
	
		}
		return painel;
	}






	public JSpinner getValorA() {
		
		if(valorA == null){
	
			valorA = new JSpinner();
			valorA.setBounds(60, 62, 40, 30);
	
		}
		return valorA;
	}


	public JSpinner getValorB() {
		
		if(valorB == null){
	
			valorB = new JSpinner();
			valorB.setBounds(152, 62, 40, 30);
	
		}
		return valorB;
	}






	public JSpinner getValorC() {
		
		if(valorC == null){
	
			valorC = new JSpinner();
			valorC.setBounds(238, 62, 40, 30);
	
		}
		return valorC;
	}






	public JButton getCalcular() {
		
		if(calcular == null){
	
			calcular = new JButton("Calcular");
			calcular.setLocation(138, 320);
			calcular.setSize(90, 30);
	
		}
		return calcular;
	}

	
	public JLabel getX1() {
		
		if(x1 == null){
	
			x1 = new JLabel("X² +");
			x1.setBounds(110, 70, 40, 22);
			x1.setFont(new Font( "Tahoma", Font.PLAIN, 18));
	
		}
		return x1;
	}






	public JLabel getX2() {
		
		if(x2 == null){
	
			x2 = new JLabel("X +");
			x2.setBounds(198, 70, 30, 22);
			x2.setFont(new Font( "Tahoma", Font.PLAIN, 18));
	
		}
		return x2;
	}


	
	




	public JLabel getIgual() {
		
		if(igual == null){
	
			igual = new JLabel(" = 0");
			igual.setBounds(284, 62, 46, 30);
			igual.setFont(new Font("Tahoma" , Font.PLAIN, 18));
	
		}
		return igual;
	}

	





	public JLabel getDelta() {
		
		if(delta == null){
	
			delta = new JLabel("<html> &Delta; = </html> ");
			delta.setBounds(62, 148, 38, 30);
			delta.setFont(new Font("Tahoma" , Font.PLAIN, 18));
		}
		return delta;
	}






	public JLabel getA(){
		
		if(A == null){
	
			A = new JLabel("A");
			A.setBounds(143, 148, 20, 30);
			A.setFont(new Font("Tohoma", Font.PLAIN, 18));
	
		}
		return A;
	}






	public JLabel getB() {
		
		if(B == null){
	
			B = new JLabel( "B");
			B.setBounds(97, 148, 20, 30);
			B.setFont(new Font("Tohoma", Font.PLAIN, 18));
	
		}
		return B;
	}






	public JLabel getC() {
		
		if(C == null){
	
			C = new JLabel("C");
			C.setBounds(156, 148, 20, 30);
			C.setFont(new Font("Tohoma", Font.PLAIN, 18));
	
		}
		return C;
	}



	



	public JLabel getQuadrado() {
		
		if(quadrado == null){
	
			quadrado = new JLabel("<html> <sup>2</sup> -4 </html>");
			quadrado.setBounds(110, 143, 30, 30);
			quadrado.setFont(new Font("Tohoma", Font.PLAIN, 18));
	
		}
		return quadrado;
	}

	
	
	

	public JLabel getCondicao() {
		
		if(condicao == null){
	
			condicao = new JLabel();
			condicao.setBounds(97, 222, 233, 30);
			condicao.setFont(new Font("Tohoma", Font.PLAIN, 18));
	
		}
		return condicao;
	}






	public JLabel getValorDelta() {
		
		if(valorDelta == null){
	
			valorDelta = new JLabel();
			valorDelta.setBounds(97, 189, 78, 22);
			valorDelta.setFont(new Font("Tohoma", Font.PLAIN, 18));
	
		}
		return valorDelta;
	}






	public static void main(String arg[]) {
		
		Delta frame = new Delta();
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
	}
		public void addEvent() {
		
		
		getValorA().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				getA().setText(getValorA().getValue().toString());
			}
		});
		
		
		getValorB().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				getB().setText(getValorB().getValue().toString());
			}
		});
		
		getValorC().addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				getC().setText(getValorC().getValue().toString());
			}
		});
		
		getCalcular().addActionListener(this);
		
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		int a, b, c, resultado;
		
		if(e.getSource() == getCalcular()) {
			
			a = Integer.parseInt(getA().getText());
			b = Integer.parseInt(getB().getText());
			c = Integer.parseInt(getC().getText());
			
			resultado = (b*b)-4*a*c; 
			
			getValorDelta().setText(Integer.toString(resultado));
			
			if(resultado == 0) {
				
				getCondicao().setText("Existe apenas uma raiz real");
				
			}else if(resultado > 0) {
				
				getCondicao().setText("Existe duas raizes reais");
				
			}else {
				getCondicao().setText("não existe raizes reais");
			}
			
		}
		
	}
	
}
