import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Me informe um número");
            n = ler.nextInt();
        if (n % 2 == 0) {
            System.out.println("Seu número é par");
        } else {
            System.out.println("Seu número é Ímpar");
        }
        if (n>0) {
            System.out.println("E também é positivo");
        } else {
            System.out.println("E também é negativo");
        }
        

    }
}
