package dio.ivanilson.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploMashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.4);
        notasAlunos.add(8.2);
        notasAlunos.add(4.2);

        System.out.println(notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(5.4);
        System.out.println(notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        //Navega em toso os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        //Navega em toso os itens
        for (Double nota: notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();

        //Retorna se o set está vazio ou não
        System.out.println(notasAlunos.isEmpty());


    }
}
