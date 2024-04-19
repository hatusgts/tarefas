import java.util.Scanner;

public class seiguais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x,y;

        System.out.println("Me informe 1 número");
        x=ler.nextInt();
        System.out.println("Me informe outro número");
        y=ler.nextInt();
        if(x == y){
            System.out.println("São números iguais");
        } else {
            System.out.println("Não são iguais");
        }
    }
}
