package Arrays;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma=0;
		
		System.out.print("Numero: ");
		numero = scan.nextInt();
		
		
		int count = 0;
				
		do {
			
			System.out.print("Numero: ");
			numero = scan.nextInt();
			
			if (numero > maior) maior = numero;
			
			
			count = count +1;
		
			soma = soma + numero;
        
		}while(count < 5);
		
		
		
		System.out.println("Maior número: " + maior);
		System.out.println("Média: " + (soma/count));
		
		
		
		

	}

}
