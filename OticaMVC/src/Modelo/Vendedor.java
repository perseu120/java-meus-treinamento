package Modelo;

public class Vendedor {

	 private String nome;
	 private String cpf;
	 private String pis;
	 private float salario = 998.00f;
	 private float comissao;
	
	 public Vendedor(String nome, String cpf, String pis) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.pis = pis;
		this.salario = salario;
		this.comissao = comissao;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPis() {
		
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public float getSalario() {
		
		
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComissao() {
		
		
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
	 
}
