package dio.ivanilson.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //adicionar 4 esporter no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de Mesa");
        esportes.add("Handebol");
        System.out.println(esportes);

        //Alterar o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

        //Remover o esporte da posição 2
        esportes.remove(2);
        System.out.println(esportes);

        //Remover o esporte Handebol do vetor
        esportes.remove("Handebol");
        System.out.println(esportes);

        //Retornar o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navegar nos esportes
        for (String esporte : esportes){
            System.out.println(esporte);
        }

    }
}
