package AULAS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        List<String> lists = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        lists.add("Lucas");
        lists.add("Gabriel");
        lists.add("Mendes");
        lists.add("Bob");
        lists.add("Anna");
        lists.add("Agata");
        lists.add("Alex");

        System.out.println("Tamanho da lista: "+ lista.size());
        System.out.println("-------------");
        System.out.println("INDEX LIST: "+lista.indexOf(2));
        System.out.println("-------------");
        for (Integer x: lista) {
            System.out.println(x);
        }

        List<String > result = lists.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("-------------");
        for (String x: result) {
            System.out.println("result: "+x);
        }
        System.out.println("---------------");
        System.out.println("Lists IndexOf "+lists.indexOf("Anna"));
        System.out.println(lista);
    }

}
