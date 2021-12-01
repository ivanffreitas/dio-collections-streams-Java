package dio.ivanilson.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com as capitais
        treeCapitais.add("Pernambuco");
        treeCapitais.add("Bahia");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Paraiba");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("São Paulo"));

        //retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("São Paulo"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String capital: treeCapitais){
            System.out.println(capital);
        }


    }

}
