package Variáveis_E_Operadores;

import java.util.Scanner;

public class atividade_04 {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		float n1,n2,n3,n4, calculo;
		
	System.out.println("Digite o primeiro numero: ");
	n1 = leitor.nextFloat();
	System.out.println("Digite o segundo numero: ");
	n2 = leitor.nextFloat();
	System.out.println("Digite o terceiro numero: ");
	n3 = leitor.nextFloat();
	System.out.println("Digite o quarto numero: ");
	n4 = leitor.nextFloat();
	
	calculo = (n1 * n2) - (n3 * n4);
	
	System.out.println("A diferença dos valores e de " + calculo);
	
	}
}
