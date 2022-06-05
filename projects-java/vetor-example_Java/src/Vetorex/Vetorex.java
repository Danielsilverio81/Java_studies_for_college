package Vetorex;

public class Vetorex {

	public static void main(String[] args) {
		int vet[] = new int[5];
		
		vet[0]=1;
		vet[1]=2;
		vet[2]=3;
		vet[3]=4;
		vet[4]=5;
		for(int i=0; i < vet.length; i++) {
			
			System.out.println("O valor da posição: ["+ i +"] é iqual á: \t" + vet[i]);
		}
	}
}
