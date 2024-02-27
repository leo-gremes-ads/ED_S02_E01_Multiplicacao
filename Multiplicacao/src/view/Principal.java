package view;

import java.util.Scanner;

import controller.Multiplicador;


public class Principal
{
	public static void main(String[] args)
	{
		int a, b, prod;
		Scanner s = new Scanner(System.in);
		Multiplicador m = new Multiplicador();
		
		System.out.print("Digite um número: ");
		a = s.nextInt();
		System.out.print("Digite outro número: ");
		b = s.nextInt();
		s.close();
		prod = m.multiplicador(a,  b);
		System.out.println("O produto é: " + prod);
	}
}