package otica;


/**
 * Escreva a descrição da classe Vendedor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Vendedor
{
    
    private String nome;
    private String cpf;
    private String pis;
    private float salario;
    private float comissao;

    public Vendedor(String nome, String cpf, String pis, float salario)
    {
        this.nome=nome;
        this.cpf = cpf;
        this.pis = pis;
        this.salario = salario;
        
        
    }
    
    public float getSalario(){
        return salario;
    }
    
    public float getComissao(){
        return comissao;
    }
    
    public void setComissao(float comissao){
        this.comissao= comissao;
        
    }
    
    public int baixaEstoque( int estoque){
        
        return estoque-1;
        
    }
    
    
}
