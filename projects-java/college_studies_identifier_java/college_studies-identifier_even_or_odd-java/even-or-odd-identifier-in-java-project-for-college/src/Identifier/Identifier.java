package Identifier;

import java.util.*;

public class Identifier {
	
	public static void main(String[]args) {
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite um numero e descubra se o numero digitado � Inpar ou Par:");
		int numero = valor.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O numero digitado � Par!!!");
		}
		else {
			System.out.println("O numero digitado � Impar!!!");
		}
		
  }
}