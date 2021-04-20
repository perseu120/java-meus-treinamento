package Modelo;

public class Lente {

	 private String material;
	 private float precomaterial = 50.00f;
	 private String tipo;
	 private float precotipo = 20.00f;
	 private String grau;
	 private float precograu = 100.00f;
	 

	 
	public Lente(String material, String tipo, String grau) {
		
		this.material = material;
		this.precomaterial = precomaterial;
		this.tipo = tipo;
		this.precotipo = precotipo;
		this.grau = grau;
		this.precograu = precograu;
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
	
	public String getTipo() {

		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public float getPrecotipo() {
		
		return precotipo;
	}
	
	public void setPrecotipo(float precotipo) {
		this.precotipo = precotipo;
	}
	
	public String getGrau() {
		
		return grau;
	}
	
	public void setGrau(String grau) {
		this.grau = grau;
	}
	
	public float getPrecograu() {
	
		return precograu;
	}
	public void setPrecograu(float precograu) {
		this.precograu = precograu;
	}
	 
	 
}
