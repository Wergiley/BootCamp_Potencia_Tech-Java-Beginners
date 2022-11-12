import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    // criando um List
    //  List notas = new ArrayList();
    public static void main(String[] args) {

    List<Double> notas = new ArrayList<Double>();

    notas.add(7.5);
    notas.add(5.0);
    notas.add(8.5);
    notas.add(9.5);
    notas.add(0.5);
    notas.add(3.5);
    notas.add(4.5);

    System.out.println(notas.toString());

    // Exibe a posisão dos vetores.
    System.out.println("Exiba a posisão da nota 5: "+ notas.indexOf(5d));

    // Adiciona e substitui o valor na posisão no vetor
    System.out.println("Adicione na lista a nota 8.0 na posisão 4: ");
    notas.add(4, 8d);
    System.out.println(notas);

    // Substitua a nota 5 pela nota 6:
    System.out.println("Substitua na lista a nota 6.0 pela nota 5: ");
    notas.set(notas.indexOf(5d), 6.0);
    System.out.println(notas);

    // Confira se a nota 5 esta na lista: 
    System.out.println("Confira se a nota 5 esta na lista: "+ notas.contains(5d));

    // Exibe as notas na ordem informado:
    System.out.println("Exibe as notas na ordem informado:");
    for(Double nota : notas) System.out.println(nota);

    // Exibe a terceira nota adicionada:
    System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));
    System.out.println(notas.toString());

    // Exibe a menor nota: 
    System.out.println("Exiba a menor nota: "+ Collections.min(notas));

    // Exibe a maior nota: 
    System.out.println("Exiba a maior nota: "+ Collections.max(notas));

    // Exibe a soma dos valores do vetor:
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while(iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
    }

    System.out.println("Exiba a soma dos valores: "+soma);
    // continua...
    }
}
