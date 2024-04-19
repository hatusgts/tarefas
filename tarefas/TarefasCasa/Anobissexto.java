package TarefasCasa;
import java.util.Scanner;
import java.util.Calendar;
import java.lang.Math;

public class Anobissexto {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        int ano, r, atno = c.get(Calendar.YEAR);

        System.out.println("Informe o Ano:");
        ano = ler.nextInt();
        r = (ano - atno);
        if (r % 4 == 0){
        System.out.println("É um ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }
            ler.close();
    }
}
