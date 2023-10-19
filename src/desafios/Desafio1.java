package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Desafio 1 - Mostre a lista na ordem numérica:
Crie um programa que utilize a Stream API para ordenar 
a lista de números em ordem crescente e a exiba no console. */
public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdemNatural = numeros.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

    }


}
