import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int idade=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual sua idade: ");
		idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		scan.close();
	}

}
