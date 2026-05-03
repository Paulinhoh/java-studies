import pacotes_exemplo.Carro2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //  =-=-=-=-=--=-= estruturas de dados =-=-=-=-=--=-=
        // map -> chave: valor
        // set -> lista que não permite elementos duplicados
        // list -> lista
        // queue -> filas (primeiro que chega é o primeiro a sair)
        // stack -> pilha (ultimo a chegar primeiro a sair)
        // linked list -> lista duplamente encadeada

        // list
        List<String> list1 = List.of("apple", "banana", "cherry");
        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("apple");

        System.out.println(list1);
        System.out.println(list2.getFirst());
        System.out.println();

        // set
        Set<String> set1 = Set.of("apple", "banana", "cherry");
        Set<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("apple"); // duplicado: não foi adicionado no ‘set’
        System.out.println(set1);
        System.out.println(set2);
        System.out.println();

        // map
        Map<Integer, String> map1 = Map.of(1, "banana", 2, "apple");
        Map<String, String> map2 = new HashMap<>();
        map2.put("nome", "Paulo H");
        map2.put("sobrenome", "Reis");
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.containsKey(2)); // verifica se contem a chave
        System.out.println(map2.containsValue("Reis")); // verifica se contem o valor
        System.out.println();

        // queue
        Queue<String> queue1 = new LinkedList<>();
        queue1.add("apple");
        queue1.add("banana");
        queue1.add("apple");
        queue1.add("cherry");
        System.out.println(queue1.peek()); // mostra qual o primeiro elemento da fila
        System.out.println(queue1.poll()); // pega o primeiro elemento e o remove também
        System.out.println(queue1);
        System.out.println();

        // stack
        Stack<String> stack1 = new Stack<>();
        stack1.push("apple"); // adiciona um elemento a pilha
        stack1.push("banana");
        stack1.push("cherry");
        stack1.push("grape");
        System.out.println(stack1.peek()); // pega que foi o último elemento a ser adicionado
        System.out.println(stack1);
        stack1.pop(); // pega e remove o último elemento adicionado
        System.out.println(stack1.peek());
        System.out.println(stack1);
        System.out.println();

        // linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");
        linkedList.add("grape");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList);
        System.out.println();


        //  =-=-=-=-=--=-= records =-=-=-=-=--=-=
        Carro2 carroRecord = new Carro2("i13", "Preto", 2023, "ABC-123");
        System.out.println(carroRecord.modelo());
        // records são classes imultaveis, ou seja, depois que eu criar esse objeto os atributos não podem ser alterados
        // record são bastantes usados para:
        // DTOs → data transfer objects
        System.out.println();


        //  =-=-=-=-=--=-= stream api =-=-=-=-=--=-=
        // realizar operações funcionais nas collections (estruturas de dados)
        // filter, map, reduce, agregações
        List<String> novalista = list2
                .stream()
                .filter(nome -> nome.equals("apple"))
                .map(nome -> nome.toUpperCase())
        //      .map(String::toUpperCase) (outra forma de fazer o mesmo que na linha de cima)
                .toList();
        System.out.println(novalista);
    }
}