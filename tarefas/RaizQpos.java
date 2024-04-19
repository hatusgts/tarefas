import java.util.Scanner;
import java.lang.Math;

public class RaizQpos {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Me informe um número");
        x = ler.nextInt();
        
        if (x >0){
            System.out.println(Math.sqrt(x));
        } else {
            System.out.println("cri cri cri");
 
        } ler.close();
        
    }

}