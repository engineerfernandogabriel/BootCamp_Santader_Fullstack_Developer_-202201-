package DesafiosIntermediariosJava;

import java.io.IOException;
import java.util.Scanner;

/*
 Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
 
 O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos.

ENTRADA
 A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo for lido.

SAíDA
 A saída contém um valor correspondente à média de idade dos indivíduos.

 A média deve ser impressa com dois dígitos após o ponto decimal.
 */

public class Idades {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int cont = 0;
		int soma = 0;
		int n = input.nextInt();

		while (n >= 1) {
			if (n >= 0) {
				soma += n;
				cont++;
			}
			n = input.nextInt();
		}
		double media = (double) soma / cont;
		System.out.println(String.format("%.2f", media));
	}
}