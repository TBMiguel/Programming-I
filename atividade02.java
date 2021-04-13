import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		String name;
		float s1,s2,s3,s4,s5;
		float media = 10.0f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Atleta: ");
		name = scan.nextLine(); 
		scan.nextLine();
		if (name.isBlank()) {
			System.out.println("Programa Finalizado.");
		} else {
			System.out.println("Continua.");
			System.out.println("Informe o salto 1: ");
			s1 = scan.nextFloat();
			System.out.println("Informe o salto 2: ");
			s2 = scan.nextFloat();
			System.out.println("Informe o salto 3: ");
			s3 = scan.nextFloat();
			System.out.println("Informe o salto 4: ");
			s4 = scan.nextFloat();
			System.out.println("Informe o salto 5: ");
			s5 = scan.nextFloat();
			
			media = (s1+s2+s3+s4+s5)/5;
			
			System.out.println("Alleta: " + name);
			System.out.println("Saltos: " + s1 + " - " + s2 + " - " + s3 + " - " + s4 + " - " + s5);
			System.out.println("Media: " + media + "m");
		}
		scan.close();
	}

}
