import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int m;

        System.out.println("Me infome o número do Mês");
        m = ler.nextInt();
        switch (m) {
            case 1:
                System.out.println("O mês é Janeiro");
                break;
            case 2:
                System.out.println("O mês é Fevereiro");
                break;
            case 3:
                System.out.println("O mês é Março");
                break;
            case 4:
                System.out.println("O mês é Abril");
                break;
            case 5:
                System.out.println("O mês é Maio");
                break;
            case 6:
            System.out.println("O mês é Junho");
                break;
            case 7:
            System.out.println("O mês é Julho");
                break;
            case 8:
            System.out.println("O mês é Agosto");
                break;
            case 9:
            System.out.println("O mês é Setembro");
                break;
            case 10:
            System.out.println("O mês é Outubro");
                break;
            case 11:
            System.out.println("O mês é Novembro");
                break;
            case 12:
                System.out.println("O mês é Dezembro");
                break;            
            default:            
                System.out.println("Opção inválida");
                break;
        }

    }
}
