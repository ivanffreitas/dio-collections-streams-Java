package dio.ivanilson.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        //Adiciona 6 estudantes para a coleçãp
        estudantes.add("Pedro");
        estudantes.add("João");
        estudantes.add("Maria");
        estudantes.add("Carlos");
        estudantes.add("José");
        estudantes.add("Lea");

        //Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna os elementos que tem a letra R nome
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova  coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //exibe cada elemento no console , e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        // retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Todos os elementos tem a letra W no nome? " + estudantes.stream().allMatch((elemento) ->
                elemento.contains("w")));

        //retorna true se nenhum elemento possue a letra a minúscula no nome
        System.out.println("Tem algum elemento com a letra minúscula no nome? " + estudantes.stream().noneMatch((elemento) ->
                elemento.contains("a")));

        //retorna o primeir elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //exemplo de operação encadeada
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
                //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));//agurpar pelo proximo caracter depois do "-"

    }
}
