import java.util.Scanner;

public class Somamais8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x, y, r;
        System.out.println("Informe um número para somar");
        x = ler.nextInt();
        System.out.println("Me informe outro número para somar");
        y = ler.nextInt();

        r = (x + y);
        if (r > 20) {
            r = (r + 8);
            System.out.println("Resultado com soma é " + r);
        } else { 
            System.out.println("Resultado sem soma é " + r);
        }

    }
}
