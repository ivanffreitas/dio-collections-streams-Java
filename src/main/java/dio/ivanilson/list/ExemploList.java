package dio.ivanilson.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Ivanilson");
        nomes.add("Amanda");
        nomes.add("Arthur");
        nomes.add("Igor");
        nomes.add("Freitas");
        nomes.add("Outros");
        System.out.println(nomes);

        //Alterar nomes
        nomes.set(4, "Coelho");
        System.out.println(nomes);

        //Ordem Alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);

        //Removendo elementos da lista passando o indice
        nomes.remove(2);
        System.out.println(nomes);

        //Removendo elementos da lista passando o elemento
        nomes.remove("Outros");
        System.out.println(nomes);

        //Retonar um elemnto para uma variavel
        String nome =  nomes.get(1);
        System.out.println(nome);

        //retornar a posição do elemento
        int posicao = nomes.indexOf("Igor"); //quando não encontrado retorna o valor -1
        System.out.println(posicao);

        //Retonar o tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        //retornar true ou false
        boolean temAmanda = nomes.contains("Amanda");
        System.out.println(temAmanda);

        //retornar se alista está vazia (true ou false)
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        //retornar os nomes das lista utilizando for
        for(String nomeDoItem : nomes){
            System.out.println("--> " + nomeDoItem);
        }

        //retornar os nomes das lista utilizando Iterator
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("-----> " + iterator.next());
        }

        //limpar a lista
        //nomes.clear();
        //System.out.println(nomes);

    }
}
