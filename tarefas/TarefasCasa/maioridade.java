package TarefasCasa;
import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Qual a idade do indivíduo?");
        x = ler.nextInt();
        if (x >= 18){
            System.out.println("É maior de didade");
        } else {
            System.out.println("É menor de idade");
        }
        ler.close();

    }
}
