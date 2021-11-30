package dio.ivanilson.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Freitas");
        filaBanco.add("Ivanilson");
        filaBanco.add("Amanda");
        filaBanco.add("Arthur");
        filaBanco.add("Igor");

        System.out.println("FILA DO BANCO: " + filaBanco + "\n");

        String clienteASerAtendido = filaBanco.poll(); //POLL exibir o primeiro da fila e remove
        System.out.println("CLIENTE A SER ATENDIDO: " + clienteASerAtendido + "\n");

        System.out.println("FILA DO BANCO: " + filaBanco + "\n");

        //filaBanco.clear(); //limpar lista

        String primeiroCliente = filaBanco.peek(); //PEEK exibir o primeiro da fila, se a lista vazia retorna NULL
        System.out.println("PRIMEIRO CLIENTE DA FILA: " + primeiroCliente + "\n");

        System.out.println("FILA DO BANCO: " + filaBanco + "\n");

        //filaBanco.clear(); //limpar lista

        String primeiroClienteOuErro = filaBanco.element(); //ELEMENT exibir o primeiro da fila se a lista vazia retorna erro
        System.out.println("PRIMEIRO CLIENTE DA FILA: " + primeiroClienteOuErro + "\n");

        System.out.println("FILA DO BANCO: " + filaBanco + "\n");

        //navegar na lista usando for
        System.out.println("NAVEGANDO NA LISTA");
        for (String client: filaBanco){
            System.out.println(client);
        }
        System.out.println();

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("--->" + iteratorFilaBanco.next());
        }
        System.out.println();

        //retornar tamanho da lista
        System.out.println(filaBanco.size() + "\n");

        //retornar se a lista está vazia, true ou false
        System.out.println(filaBanco.isEmpty() + "\n");

        //adicionar um elemento na lista
        filaBanco.add("Coelho");
        System.out.println("FILA DO BANCO: " + filaBanco + "\n");


    }
}
