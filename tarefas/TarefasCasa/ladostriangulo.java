package TarefasCasa;
import java.util.Scanner;

public class ladostriangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int l1, l2, l3, r;
        System.out.println("Me informe um lado do triangulo");
        l1 = ler.nextInt();
        System.out.println("Me informe outro lado do triangulo");
        l2 = ler.nextInt();
        System.out.println("Me informe o ultimo lado do triangulo");
        l3 = ler.nextInt();

        if (l1 == l2 && l1 == l3){
            System.out.println("É um triangulo Equilátero");
        } else if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)){
            System.out.println("É um triangulo Isóceles");                
            } else {
                System.out.println("É um triangulo Escaleno");
            }
            ler.close();
        }  
    }

