import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		float n1 = 10.0f;
		float n2 = 10.0f;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("====*CALCULADORA*====");
		System.out.println("1 - Soma");
		System.out.println("2 - Substração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("0 - Sair");
		System.out.println("Digite um número inteiro: ");
		n1 = scan.nextFloat();
		System.out.println("Digite outro número inteiro: ");
		n2 = scan.nextFloat();
		System.out.print("Digite a operação:");
		Integer op = scan.nextInt();
		
		scan.close();

		switch(op) {
		case 1:
			System.out.println();
			System.out.println("A soma dos números " + n1 + " e " + n2 + " é: " + soma(n1,n2));
			break;
		case 2:
			System.out.println();
			System.out.println("A subtração dos números " + n1 + " e " + n2 + " é: " + sub(n1,n2));
			break;
		case 3:
			System.out.println();
			System.out.println("A multiplicação " + n1 + " * " + n2 + " é: " + mult(n1,n2));
			break;
		case 4:
			System.out.println();
			System.out.println("A divisão de " + n1 + " / " + n2 + " é: " + div(n1,n2));
			break;
		case 0: 
			System.out.println();
			System.out.println("Saindo..");
			System.out.println();
			break;
		default:
			System.out.println();
			System.out.println("Operação não encontrada.");
			System.out.println();
		}
	}
		
	public static float soma(float n1, float n2) {
		return n1+n2;
	}
	
	public static float sub(float n1, float n2) {
		return n1-n2;
	}
	
	public static float mult(float n1, float n2) {
		return n1*n2;
	}
	
	public static float div(float n1, float n2) {
		return n1/n2;
	}

}