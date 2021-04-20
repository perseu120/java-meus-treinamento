package advinhaObi;

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
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
				menor = Math.abs(vet[i]-S);
				if(vet[i]== S) {
					pos= i+1;
					aux = 1;
					break;
				}
			}
			
			if(aux == 0) {
				menor = Math.abs(vet[0]-S);
				pos=1;
				for(int i = 0; i<QT; i++) {
					
					if(Math.abs(vet[i]-S) == 1) {
								
						pos= i+1;
						break;
								
					}
					else if(Math.abs(vet[i]-S)<menor) {
								
						menor = Math.abs(vet[i]-S);
						pos= i+1;
						
								
					}
						
					
				}
			}
			
			menor=0;
			aux=0;
			System.out.printf("%d\n",pos);
			N--;
		}
		
 
    }
 
}