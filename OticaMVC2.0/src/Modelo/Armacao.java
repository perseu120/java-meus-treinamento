package Modelo;

public class Armacao {

	private String material;
    private float precomaterial = 50.00f;
    
    private String cor;
    private float precocor= 10.00f;
    
    private String formato;
    private float precoformato = 30.00f;
    
    private String marca;
    private float precomarca = 40.00f;
    
    private String tamanho;
    private float precotamanho = 15.00f;
    
    private int estoque = 10;
    
    
    

	public Armacao(String material, String cor, String formato, 
			String marca,  String tamanho) {
		
		
		this.material = material;
		this.precomaterial = precomaterial;
		this.cor = cor;
		this.precocor = precocor;
		this.formato = formato;
		this.precoformato = precoformato;
		this.marca = marca;
		this.precomarca = precomarca;
		this.tamanho = tamanho;
		this.precotamanho = precotamanho;
		this.estoque = estoque;
		
	}

	public String getMaterial() {
		
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrecomaterial() {
		
		
		return precomaterial;
	}

	public void setPrecomaterial(float precomaterial) {
		this.precomaterial = precomaterial;
	}

	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPrecocor() {
		
		return precocor;
	}

	public void setPrecocor(float precocor) {
		this.precocor = precocor;
	}

	public String getFormato() {
		
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public float getPrecoformato() {
		
		
		return precoformato;
	}

	public void setPrecoformato(float precoformato) {
		this.precoformato = precoformato;
	}

	public String getMarca() {
		
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecomarca() {
		
		
		return precomarca;
	}

	public void setPrecomarca(float precomarca) {
		this.precomarca = precomarca;
	}

	public String getTamanho() {
		
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public float getPrecotamanho() {
		
		return precotamanho;
	}

	public void setPrecotamanho(float precotamanho) {
		this.precotamanho = precotamanho;
	}

	public int getEstoque() {
		
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
      
    
}

