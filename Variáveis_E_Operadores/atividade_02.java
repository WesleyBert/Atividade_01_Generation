package Variáveis_E_Operadores;

import java.util.Scanner;

public class atividade_02 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, mediaFinal;
		String mediaFinalFormatd;
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leitor.nextFloat();
		
		System.out.println("Digite a Segunda nota:");
		nota2 = leitor.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		nota3 = leitor.nextFloat();
		
		System.out.println("Digite a Quarta nota:");
		nota4 = leitor.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/ 4;
		mediaFinalFormatd = String.format("%.1f", mediaFinal);
		System.out.println("A media final e de: " + mediaFinalFormatd);
	}

}
