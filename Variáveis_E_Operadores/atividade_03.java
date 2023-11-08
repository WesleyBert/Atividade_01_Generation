package Variáveis_E_Operadores;

import java.util.Scanner;

public class atividade_03 {

	public static void main(String[] args) {
		float salarioBruto,adicionalNoturno, horsExtras, descontos,salarioLiquido;
		String salarioLiquidoFormat;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do Salário Bruto: ");
		salarioBruto = leitor.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno: ");
		adicionalNoturno = leitor.nextFloat();
		
		System.out.println("Digite suas Horas Extras: ");
		horsExtras = leitor.nextFloat();
		
		System.out.println("Digite o valor do seus Descontos: ");
		descontos = leitor.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horsExtras * 5) - descontos;
		salarioLiquidoFormat = String.format("%.2f", salarioLiquido);
		
		System.out.println("O seu sálario liquido e de " + salarioLiquidoFormat);
}

}
