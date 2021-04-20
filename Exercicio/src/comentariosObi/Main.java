package comentariosObi;

import java.io.IOException;
import java.util.Scanner;
	/**
	* @author Josimar Cruz Souza
	* @date 22/09/2020
	* @title ComentariosObi
	*/
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N , K, op;
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        
        while(N>0) {
        	
        	K = input.nextInt();
        	int vet[] = new int [K];
        	
        	for(int i =0; i<K; i++) {
        		vet[i] = input.nextInt();
        	}
        	
        	for(int i = 0; i <K ; i++) {
        		switch(vet[i]) {
        			
        			case 1:
        				System.out.println("Rolien");
        				break;
        			case 2:
        				System.out.println("Naej");
        				break;
        			case 3:
        				System.out.println("Elehcim");
        				break;
        			case 4:
        				System.out.println("Odranoel");
        				break;
        			default:
        				break;
        		}
        		
        	}
        	
        	
        	
        	N--;
        }
        	
 
    }
 
}