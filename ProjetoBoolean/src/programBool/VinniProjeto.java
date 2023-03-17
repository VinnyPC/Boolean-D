package programBool;

import java.util.Scanner;

public class VinniProjeto {

	public static void main(String[] args) {

		int opcao = 0,i;
		float num1, num2, resultado = 0;
		String confirm="n", operacao = "+", nomeUsuario;

		Scanner read = new Scanner(System.in);

		System.out.println("Olá! Bem vindx! \nMeu nome é Boolean e estou aqui para te ajudar! :D\n");
		System.out.println("\nComo posso te chamar?");
		nomeUsuario = read.nextLine();

		System.out.println("\nOlá " + nomeUsuario
				+ ", em que posso te ajudar hoje? Escolha um um numero correspondente \n" + "nas opções abaixo:");

		while (confirm.equalsIgnoreCase("n")) {
			System.out.println("1 - Calculadora");
			System.out.println("2 - Gerador de Tabuada");
			opcao = read.nextInt();
			
			read.nextLine();

			System.out.println("Você escolheu " + opcao + ".");
			System.out.println("\nDigite S para confirmar e N para voltar e escolher outra operação.");
			confirm = read.nextLine();
		}

		if (opcao == 1) {
			System.out.println("Primeiro, preciso que use seu teclado para selecionar um numero correspondente \n"
					+ "as opções abaixo:");
			confirm = "n";
			opcao = 0;

			while (confirm.equalsIgnoreCase("n")) {
				System.out.println("1 - Adição");
				System.out.println("2 - Subtração");
				System.out.println("3 - Multiplicação");
				System.out.println("4 - Divisão");
				opcao = read.nextInt();

				read.nextLine();

				System.out.println("Você escolheu " + opcao + ".");

				System.out.println("\nDigite S para confirmar e N para voltar e escolher outra operação.");
				confirm = read.nextLine();
			}

			System.out.println("\nCerto, como ainda sou novo, só consigo calcular apenas dois números \npor vez :("
					+ "em breve serei atualizado e vou ter mais funções :D\n)");
			System.out.println("\nEntão preciso que escolha o primeiro número");
			num1 = read.nextFloat();

			System.out.println("\nAgora, preciso que escolha mais um número ^^");
			num2 = read.nextFloat();

			if (opcao == 1) {
				operacao = "+";
				resultado = num1 + num2;
			} else if (opcao == 2) {
				operacao = "-";
				resultado = num1 - num2;
			} else if (opcao == 3) {
				operacao = "*";
				resultado = num1 * num2;
			} else if (opcao == 4) {
				operacao = "/";
				resultado = num1 / num2;
			} else {
				System.out.println("Aghhh ocorreu um erro aqui, isso não deveria acontecer X(");
			}

			System.out.println("O resultado de " + num1 + " " + operacao + " " + num2 + " é " + resultado);
			
		}else if (opcao == 2) {
			System.out.println("\nBem vindo ao gerador de tabuadas!\nDigite o número:");
			num1 = read.nextFloat();
			
			for(i=1;i<=10;i++) {
				resultado = num1 * i;
				System.out.println(num1+ " * "+i+""+" = "+resultado);
			}
			
		}
	}
}
