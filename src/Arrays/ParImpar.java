package Arrays;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numero;
		int quantNumeros = 0;
		int quantImpares= 0;
		int quantPares=0;

		System.out.print("Quantidade de números:");
		
		
		quantNumeros = scan.nextInt();
		
		int count = 0;
		do{
			System.out.print("Número:");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++; 
			else quantImpares++;
			
			count ++;
		}while(count < quantNumeros);
		
		System.out.println("");
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Ímpar: " + quantImpares);
		
		
		
	}

}
