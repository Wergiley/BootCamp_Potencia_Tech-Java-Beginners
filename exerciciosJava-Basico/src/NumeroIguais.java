import java.util.Scanner;
public class NumeroIguais {
    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(); 
        int b = scan.nextInt();

        if(a==b) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}
