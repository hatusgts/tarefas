import java.util.Scanner;

public class DiaSemana
{
	public static void main(String[] args) {
	
	int x, y;

	Scanner ler = new Scanner(System.in);
	
		System.out.println("Me informe um número de 1 a 7");
			x = ler.nextInt();
		if (x > 0 && x < 8) {
			switch (x) {
				case 1:
					System.out.println("Seu dia é Domingo");
					break;
				case 2: 
				System.out.println("Seu dia é Segunda");
					break;
				case 3: 
				System.out.println("Seu dia é Terça");
					break;
				case 4:
				System.out.println("Seu dia é Quarta");
					break;
				case 5:
				System.out.println("Seu dia é Quinta");
					break;
				case 6:
				System.out.println("Seu dia é Sexta");
				case 7:
				System.out.println("Seu dia é Sabádo");
					break;
			default:
			System.out.println("Número Inválido");
			} 
			ler.close();
		}
	} 
}
