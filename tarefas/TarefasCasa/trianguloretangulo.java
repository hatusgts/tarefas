package TarefasCasa;
import java.util.Scanner;
import java.util.Arrays;

public class trianguloretangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int l1, l2, l3;

        System.out.println("Informe um lado do triangulo:");
        l1 = ler.nextInt();
        System.out.println("Informe outro lado do triangulo:");
        l2 = ler.nextInt();
        System.out.println("Informe o ultimo lado do triangulo:");
        l3 = ler.nextInt();

        int Lados[] = {l1,l2,l3};
        Arrays.sort(Lados);

        if ((Lados[0]*Lados[0]) + (Lados[1] * Lados[1]) == (Lados[2] * Lados[2]) ){
            System.out.println("É um Triangulo Retângulo!");
        } else {
            System.out.println("Não é um Triangulo Retângulo");
        }
    }
}
