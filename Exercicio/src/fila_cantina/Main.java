package fila_cantina;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Josimar Cruz Souza
 * @date 08/10/2020
 * @title Fila da Cantina
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	int N, M, cont = 0, aux;
    	Scanner input = new Scanner(System.in);
    	
    	N = input.nextInt();
    	
    	while(N>0) {
    		
    		M = input.nextInt();
    		
    		int fila[] = new int [M];
    		int comparacao[] = new int [M];
    		
    		for(int i=0; i<M; i++) {
    			fila[i] = input.nextInt();
    			comparacao[i]= fila[i];
    		}
    		
    		for(int i=0; i<M ; i++) {
    			for(int j = i; j<M ; j++) {
    				if(fila[i]<fila[j]) {
    					
    					aux=fila[i];
    					fila[i]=fila[j];
    					fila[j]=aux;
    					
    				}
    				
    			}
    		}
    		
    		for(int i =0; i<M;i++) {
    			if(comparacao[i]==fila[i])
    				cont++;
    			
    		}
    		
    		System.out.println(cont);
    		
    		cont=0;
    		N--;
    	}
        
 
    }
 
}