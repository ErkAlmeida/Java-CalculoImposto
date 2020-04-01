package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.PFisica;
import entidades.PJuridica;
import entidades.Pessoa;

public class Programa
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		List<Pessoa> pessoa = new ArrayList<>();
		
		System.out.print("Digite numero de Pessoas para calcular o Imposto: ");
		int nPessoas = sc.nextInt();
		
		for(int i =0; i< nPessoas; i++ )
		{
			System.out.print("Pessoa Fisica ou Juridica (F / J)");
			
			char opcao = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
						
			if(opcao == 'f') 
			{
				System.out.print("Gastos com Saude: ");
				double gastoSaude = sc.nextDouble();
				
				pessoa.add(new PFisica(nome, rendaAnual, gastoSaude));				
			}
			if(opcao == 'j') 
			{
				System.out.print("Quantidade de Funcionarios: ");
				int qFuncionario = sc.nextInt();
				
				pessoa.add(new PJuridica(nome, rendaAnual, qFuncionario));
			}
		}
		double soma =0.0;
		
		System.out.println();

		System.out.println("Impostos # ");
		for(Pessoa listPessoa : pessoa)
		{
			double calcImp = listPessoa.calcImp();
			
			System.out.println(listPessoa);
			soma += calcImp;
			
		}
		System.out.println();

		System.out.println("Total de Imposto: "+ soma);
		
		
		
		
		

		sc.close();
	}
}
