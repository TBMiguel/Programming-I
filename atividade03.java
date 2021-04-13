import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		int candidato1 = 0, candidato2 =0, candidato3=0, candidato4=0;
		int branco=0, nulo=0;
		
		int voto;
		int TotVote = 0;
		
		do {
			message(); //pergunta voto
			Scanner scan = new Scanner(System.in);
			voto = scan.nextInt();
			switch (voto) {
			case 0:
				System.out.println("Votação Finalizada.");
				break;
			case 1:
				candidato1++;
				break;
			case 2:
				candidato2++;
				break;
			case 3:
				candidato3++;
				break;
			case 4:
				candidato4++;
				break;
			case 5:
				nulo++;
				break;
			case 6:
				branco++;
				break;
			}
		} while(voto != 0);
		TotVote = candidato1 + candidato2 + candidato3 + candidato4 + nulo + branco;
		float nuloPercent = ((float) nulo/TotVote) * 100.0f;
		float brancoPercent = ((float) branco/TotVote) * 100.0f;
		messageResult(candidato1,candidato2,candidato3,candidato4,nulo,branco,nuloPercent,  brancoPercent, TotVote);
		
	}

	public static void message() {
		System.out.println("==================");
		System.out.println("       Eleições");
		System.out.println(" 1 - Jose");
		System.out.println(" 2 - Manoel");
		System.out.println(" 3 - Maria");
		System.out.println(" 4 - Jessiline");
		System.out.println(" 5 - Nulo");
		System.out.println(" 6 - Branco");
		System.out.println("==================");
		System.out.println("Digite seu voto: ");
	}
	
	public static void messageResult(int candidato1, int candidato2, int candidato3, int candidato4, int nulo, int branco, float nuloPercent, float brancoPercent, int TotVote) {
		System.out.println("==========================");
		System.out.println("       Resutados eleições");
		System.out.println("Jose: " + candidato1);
		System.out.println("Manoel: " + candidato2);
		System.out.println("Maria: "+ candidato3);
		System.out.println("Jessiline: " + candidato4);
		System.out.println("Nulo: " + nulo);
		System.out.println("Nulo %: " + nuloPercent + "%");
		System.out.println("Branco: " + branco);
		System.out.println("Branco %: " + brancoPercent + "%");
		System.out.println("Total de votos: " + TotVote);
		System.out.println("==========================");
	}
}
