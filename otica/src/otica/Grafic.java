package otica;


import javax.swing.JFrame;// cria uma janela grafica
import javax.swing.JPanel;// coloca um painei para monta a interfaçe 
import javax.swing.JButton;// coloca botão
import javax.swing.JTextField;// coloca campo em branco para digita testo
import javax.swing.JLabel;// coloca rotulo nas coisas
import java.awt.Color;// mudar as cores do programas
import java.awt.Font; //mudar a fonte dos textos

public class Grafic extends JFrame
{
    private JPanel painel;
    private JButton confirmar;
	private JButton cancelar;
	private JLabel textoBemVindo;
	private JTextField usuario;
	
    
    
public Grafic(){
    super("Otica sua vis�o");
    this.setVisible(true);
    this.setSize(500, 500);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(getPainel());
}

    
    public JPanel getPainel(){
        if(painel == null){
        	painel = new JPanel();
        	painel.setLayout(null);
        	painel.add(getConfirmarButton());
        	painel.add(getCancelarButton());
        	painel.add(getTextoBemVindo());
        	//painel.add(getTextFieldUsuario());
        	painel.setBackground(Color.black);
 
        }
        return painel;
    }

    public JButton getConfirmarButton() {
    	if(confirmar == null) {
    		confirmar = new JButton();
    		confirmar.setBounds(130, 300, 100, 30);
    		confirmar.setText("Confimar");
    		confirmar.setBackground(Color.WHITE);

    	}
    	
		return confirmar;
	}


	public JButton getCancelarButton() {
		
    	if(cancelar == null) {
    		cancelar = new JButton();
    		cancelar.setText("Cancelar");
    		cancelar.setBounds(250, 300, 100, 30);
    		cancelar.setBackground(Color.WHITE);

    	}
		
		return cancelar;
	}


	public JLabel getTextoBemVindo() {
		
		if(textoBemVindo == null) {
			textoBemVindo = new JLabel("Seja Bem Vindo");
			Font fonte = new Font("Arial", Font.BOLD, 48);
			textoBemVindo.setBounds(80, 20, 500, 200);
			textoBemVindo.setFont(fonte);
			textoBemVindo.setForeground(Color.WHITE);

		}
		
		
		return textoBemVindo;
	}


	public JTextField getTextFieldUsuario() {
		if(usuario == null) {
			
			usuario = new JTextField();
			usuario.setBounds(100, 200, 30, 100);
		}
		
		return usuario;
	}
	
	


}
    

