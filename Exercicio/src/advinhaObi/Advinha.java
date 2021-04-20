package advinhaObi;


import java.io.IOException;
import java.util.Scanner;
/**
 * @author Josimar Cruz Souza
 * @date 22/09/2020
 * @title Advinha
 */
public class Advinha {
 
    public static void main(String[] args) throws IOException {
    	
    	Scanner input = new Scanner(System.in);

        int N , QT, S, aux= 0, pos =0, menor=0;



        N = input.nextInt();


        while(N>0) {

            QT = input.nextInt();
            S = input.nextInt();
            int vet[] = new int[QT];

            for(int i = 0; i<QT; i++) {
                vet[i] = input.nextInt();
            }

            
            for(int i = 0; i<QT; i++) {
               
                if(vet[i] == S) {
                    pos= i+1;
                    aux = 1;
                    break;
                }
            }

                        
                       
            if(aux == 0) {

                menor = Math.abs(vet[0]-S); // define vetor 0 menos s como a menor diferença
                pos = 1; // caso não seja encontrado nenhum numero menor a posição é um.
                
                for(int i = 0; i< QT; i++) {

                	if(Math.abs(vet[i] - S) < menor) {
                		menor = Math.abs(vet[i] - S);
                		pos = i + 1;
                		
                	}
                }
            }

                        
            aux = 0; // garante que o valor da variável seja 0;
            N--;
            
            System.out.println(pos);
        }


        //System.out.printf("%d, %d , \n",N, QT, S);

    	        

 
    }
 
}