package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.Fisica;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("Dados do " + i + "º contribuinte:");
			System.out.print("(F)isica ou (J)uridica? ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual? ");
			double rendaAnual = sc.nextDouble();
			if(resp == 'f' || resp == 'F') {
				System.out.print("Gastos com Saúde? - R$ ");
				double gastosSaude = sc.nextDouble();
				list.add(new Fisica(nome, rendaAnual, gastosSaude));
			}
			if(resp == 'j' || resp == 'J') {
				System.out.print("Quantidade de Funcionários? ");
				int nFunc = sc.nextInt();
				list.add(new Juridica(nome, rendaAnual, nFunc));
			}
		}
		System.out.println();
		System.out.println("IMPOSTOS:");
		
		for(Contribuintes c: list) {
			System.out.println(c.getNome() + ": R$ " + String.format("%.2f", c.imposto()));
		}
		
		sc.close();
	}

}
