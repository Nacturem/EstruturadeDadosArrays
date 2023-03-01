package Arrays;

public class OrdemInversa {

	public static void main(String[] args) {
		
		
		int[] vetor = {0, -5, 15, 50, 8, 4};
		
		/*System.out.println(vetor.length);*/
		
		System.out.println("Vetor: ");
		int count = 0;
	    while(count < (vetor.length)){
		     System.out.print(vetor[count] + " ");
		     count++;
		     
			}
	    System.out.println("");
		System.out.println("\nVetor Inverso: ");
	    for(int i = (vetor.length - 1); i >= 0; i --) {
	    	   System.out.print(vetor[i] + " ");
	    }
		
	    
	    
	    
	    
	}
	
	
}
