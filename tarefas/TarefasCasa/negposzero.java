package TarefasCasa;
import java.util.Scanner;

public class negposzero {
    public static void main(String[] args) {
        int x;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número");
        x = ler.nextInt();
        if (x>0){
            System.out.println("Número positivo");
        } else if (x<0){
            System.out.println("Número negativo");
        } else {
            System.out.println("Número é 0");
        }
        ler.close();
    }
}
