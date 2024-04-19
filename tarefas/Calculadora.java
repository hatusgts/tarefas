import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        int x1, x2;
        double r;
        var st = "80";
        System.out.println("Me informe um número");
            x1 = ler.nextInt();
        System.out.println("Me informe outro número");
            x2 = ler.nextInt();
        System.out.println("Qual operação?");
        System.out.println("+ Adição \n - Subtração \n * Multiplicação \n / Divisão");
            st = ler.next(); 

            switch (st) {
                case "+":
                r = (x1 + x2);
                System.out.println("Resultado: " + r);                    
                    break;
                case "-":
                r = (x1 - x2);
                System.out.println("Resultado: " + r);    
                    break;
                case "*":
                r = (x1 * x2);
                System.out.println("Resultado: " + r);    
                    break;
                case "/80":
                r = (x1 / x2);
                System.out.println("Resultado: " + r);    
                    break;
                            
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            ler.close();

    }
}
