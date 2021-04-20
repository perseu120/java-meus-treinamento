package dividindo_coca;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Josimar Cruz Souza
 * @date 08/10/2020
 * @title Dividindo a coca
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	int C, N, L, b, B, H;
    	double volumeCopo, quantidadeCoca, h = 0;
    	
    	Scanner input = new Scanner(System.in);
    	
    	double alturaP, volumeP, volumeM, alturaM, volumeG, alturaG;
    	
    	
    	
    	C = input.nextInt();
    	
    	for(int i=0; i<C;i++) {
    		
	    	N = input.nextInt();
	    	L = input.nextInt();
	    	b = input.nextInt();
	    	B = input.nextInt();
	    	H = input.nextInt();

	    	volumeCopo = (double) (Math.PI*H* ( Math.pow(B, 2) + b*B + Math.pow(b, 2)  )/3 );
	    	quantidadeCoca = (double) L/N;
	    	
	    	if(b==B) {
	    		h = (H*quantidadeCoca)/volumeCopo;
	    	}
	    	else {
	    		alturaP = (double) (H*b)/(B-b);
		    	alturaG = alturaP+H;
		    	volumeP =  (Math.PI* Math.pow(b, 2)* alturaP)/3;
		    	volumeG =  (Math.PI* Math.pow(B, 2)*(alturaG) )/3;
		    	volumeM =  volumeP + (quantidadeCoca);
		    	alturaM =  Math.cbrt(( volumeM * Math.pow(alturaG, 3))/volumeG );
		    	
		    	h = alturaM-alturaP;
	    	}
	    	
	    	System.out.printf("%.2f%n", h);
	    	
	    	
	    	
    	}
    	
    	
    	
    }
}