import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		float n1 = 10.0f;
		float n2 = 10.0f;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("====*CALCULADORA*====");
		System.out.println("1 - Soma");
		System.out.println("2 - Substra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.println("0 - Sair");
		System.out.println("Digite um n�mero inteiro: ");
		n1 = scan.nextFloat();
		System.out.println("Digite outro n�mero inteiro: ");
		n2 = scan.nextFloat();
		System.out.print("Digite a opera��o:");
		Integer op = scan.nextInt();
		
		scan.close();

		switch(op) {
		case 1:
			System.out.println();
			System.out.println("A soma dos n�meros " + n1 + " e " + n2 + " �: " + soma(n1,n2));
			break;
		case 2:
			System.out.println();
			System.out.println("A subtra��o dos n�meros " + n1 + " e " + n2 + " �: " + sub(n1,n2));
			break;
		case 3:
			System.out.println();
			System.out.println("A multiplica��o " + n1 + " * " + n2 + " �: " + mult(n1,n2));
			break;
		case 4:
			System.out.println();
			System.out.println("A divis�o de " + n1 + " / " + n2 + " �: " + div(n1,n2));
			break;
		case 0: 
			System.out.println();
			System.out.println("Saindo..");
			System.out.println();
			break;
		default:
			System.out.println();
			System.out.println("Opera��o n�o encontrada.");
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