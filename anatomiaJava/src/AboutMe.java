import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try (/*Programa simples, criando o objeto scanner */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("DIgite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            /*imprimindo os dados */
            System.out.println("Olá, meu nome é "+nome+" "+sobrenome);
            System.out.println("Tenho "+idade+" anos");
            System.out.println("Tenho altura de "+altura+"cm");
        }


    }
}