package Visao;

import javax.swing.JFrame;// cria uma janela grafica
import javax.swing.JPanel;// coloca um painei para monta a interfaçe 
import javax.swing.JButton;// coloca botão
import javax.swing.JTextField;// coloca campo em branco para digita testo
import javax.swing.JLabel;// coloca rotulo nas coisas
import java.awt.Color;// mudar as cores do programas
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants; //mudar a fonte dos textos




public class TelaLogin extends JPanel{
	
	
    
    private JButton confirmar;
    private JButton cancelar;
    private JLabel textoNomeDaOtica;
    private JTextField usuario;
    private JLabel textoUsuario;
    private JLabel textoSenha;
    private JPasswordField passwordField;
    private JLabel jLabelImagemLogin;
    
    
    
    public TelaLogin() {
    	setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		this.add(getJButtonConfirmar());
		
		this.add(getTextoNomeDaOtica());
		this.add(getTextoUsuario());
		this.add(getJLabelSenha());
		this.add(getJLabelUsuario());
		add(getPasswordField());
		add(getJLabelImagemLogin());
		
		
	}
	
    


	public JButton getJButtonConfirmar() {
        if(confirmar == null) {
            confirmar = new JButton();
            confirmar.setBounds(93, 234, 197, 30);
            confirmar.setText("Confimar");
            confirmar.setBackground(Color.WHITE);

        }
        
        return confirmar;
    }


    public JLabel getTextoNomeDaOtica() {
        
        if(textoNomeDaOtica == null) {
            textoNomeDaOtica = new JLabel("\u00D3tica Sua Vis\u00E3o");
            Font fonte = new Font("Arial", Font.BOLD, 48);
            textoNomeDaOtica.setBounds(20, 43, 383, 85);
            textoNomeDaOtica.setFont(new Font("Arial", Font.BOLD, 51));
            textoNomeDaOtica.setForeground(Color.WHITE);

        }
        
        
        return textoNomeDaOtica;
    }


    public JTextField getTextoUsuario() {
        if(usuario == null) {
            usuario = new JTextField();
            usuario.setBounds(170, 158, 120, 20);
        }
        
        return usuario;
    }

    public JLabel getJLabelUsuario() {
        
        if(textoUsuario == null) {
            textoUsuario = new JLabel("Usuario");
            Font fonte = new Font("Arial", Font.BOLD, 20);
            textoUsuario.setBounds(93, 155, 82, 20);
            textoUsuario.setFont(fonte);
            textoUsuario.setForeground(Color.WHITE);

        }
       // (130, 270, 100, 20);
        
        return textoUsuario;
    }
    
    public JLabel getJLabelSenha() {
        
        if(textoSenha == null) {
            textoSenha = new JLabel("Senha");
            Font fonte = new Font("Arial", Font.BOLD, 20);
            textoSenha.setBounds(93, 193, 73, 20);
            textoSenha.setFont(fonte);
            textoSenha.setForeground(Color.WHITE);

        }
        
        return textoSenha;
    }    
	public JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(170, 195, 120, 18);
		}
		return passwordField;
	}
	public JLabel getJLabelImagemLogin() {
		if (jLabelImagemLogin == null) {
			jLabelImagemLogin = new JLabel("");
			jLabelImagemLogin.setFont(new Font("Arial", Font.BOLD, 60));
			jLabelImagemLogin.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelImagemLogin.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagem/oculos fone de ouvido.jpg")));
			jLabelImagemLogin.setBounds(0, 0, 450, 300);
		}
		return jLabelImagemLogin;
	}
}
