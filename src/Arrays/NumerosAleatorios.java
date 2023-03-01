package Arrays;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {

	public static void main(String[] args) {
	
	Random random = new Random();	
	Scanner sc = new Scanner(System.in);
	
	int[] numerosAleatorios = new int[20];
	
	for(int i=0; i<numerosAleatorios.length; i++) {
		int numero = random.nextInt(100);
		numerosAleatorios[i] = numero;
	}
	
	System.out.print("Números Aleátorios: ");
	for (int numero : numerosAleatorios) {
		System.out.println(numero + " ");
		
	}
	
	System.out.print("Sucessores dos Números Aleátorios: ");
	for (int numero : numerosAleatorios) {
		System.out.println((numero+1));
		
	}
	
	
		
	}

}
