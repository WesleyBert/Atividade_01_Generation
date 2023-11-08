package Variáveis_E_Operadores;

import java.util.Scanner;

public class atividade_01 {

	public static void main(String args[]) {
		
		float salario, abono, novoSalario;
		String salarioFormatd, abonoFormatd, novoSalarioFormatd;
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println("Digite o valor do salario: ");
		salario = leitor.nextFloat();
		salarioFormatd = String.format("%.2f", salario);
		System.out.println("Seu salario atual e de:" + salarioFormatd);
		
		System.out.println("Digite o Abono: ");
		abono = leitor.nextFloat();
		abonoFormatd  = String.format("%.2f", abono);
		System.out.println("Seu abono é de: " + abonoFormatd);
		
		novoSalario = salario + abono;
		novoSalarioFormatd = String.format("%.2f", novoSalario);
		
		System.out.println("Seu novo salario e de:" + novoSalarioFormatd);
	
	}
}
