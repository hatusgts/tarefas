package TarefasCasa;
import java.util.Scanner;

public class vogaloucons {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String Vogal = "a e i o u";
        boolean imputvalido = false;
        while (!imputvalido) {

        System.out.println("Me informe uma letra");
        String user = ler.next(); 

        if (user.length() == 1 && Character.isLetter(user.charAt(0))){

            if (Vogal.contains(user)){
                System.out.println("Seu caractere é uma Vogal");
            } else {
                System.out.println("Seu caractere é uma Consoante");
            }
            imputvalido = true;

        } else {
            System.out.println("Digite somente letras, e apenas uma letra.");
            }
        }
    }
}