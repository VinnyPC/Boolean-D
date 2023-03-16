package programBool;

import java.util.Scanner;

public class VinniProjeto {

	public static void main(String[] args){
		
		int operacao=0;
		float num1, num2, resultado=0;
		String confirm="n",operacaoNome="+";
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Olá! Bem vindx! \nMeu nome é Boolean e estou aqui para te ajudar! :D\n");
		System.out.println("Primeiro, preciso que use seu teclado para selecionar um numero correspondente \n"
				+ "as opções abaixo:");
		
		while(confirm.equalsIgnoreCase("n")) {
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		operacao = read.nextInt();
		
		read.nextLine();
		
		System.out.println("Você escolheu "+operacao+".");
		
		System.out.println("\nDigite S para confirmar e N para voltar e escolher outra operação.");
		confirm = read.nextLine();
		
		}
		
		System.out.println("\nCerto, como ainda sou novo, só consigo calcular apenas dois números \npor vez :("
				+ "em breve serei atualizado e vou ter mais funções :D\n)");
		System.out.println("\nEntão preciso que escolha o primeiro número");
		num1 = read.nextFloat();
		
		System.out.println("\nAgora, preciso que escolha mais um número ^^");
		num2 = read.nextFloat();
		
		if(operacao == 1) {
			operacaoNome = "+";
			resultado = num1 + num2;
		}
		else if(operacao == 2) {
			operacaoNome = "-";
			resultado = num1 - num2;
		}
		else if(operacao == 3) {
			operacaoNome = "*";
			resultado = num1 * num2;
		}
		else if(operacao == 4) {
			operacaoNome = "/";
			resultado = num1 / num2;
		} else {
			System.out.println("Aghhh ocorreu um erro aqui, isso não deveria acontecer X(");
		}
		
		System.out.println("O resultado de "+num1+" "+operacaoNome+" "+num2+" é "+resultado);
	}
}
