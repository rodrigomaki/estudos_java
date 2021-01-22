package secao10_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); //não aceita tipos primitivos
		
		list.add("Maria");
		list.add("Bob");
		list.add("Anna");
		list.add("Alex");
		
		System.out.println(list.get(2));
		System.out.println("--------------");
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("A lista está com tamanho: " + list.size());
		
		list.add(2, "Marco");
		
		System.out.println("--------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("A lista está com tamanho: " + list.size());
		
		list.remove("Alex"); // removendo por comparação - se tem alguma String com a sequencia Alex na lista
		list.remove(1);
		
		System.out.println("--------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("A lista está com tamanho: " + list.size());

		//Para remover com um predicado, como por exemplo, se começa com M
		list.removeIf(a -> a.charAt(0) == 'M');
		
		System.out.println("--------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("A lista está com tamanho: " + list.size());
		
		list.add("Peter");
		list.add("Sarah");
		list.add("Bruno");
		list.add("Joana");
		list.add("Jorge");
		
		System.out.println("--------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("A lista está com tamanho: " + list.size());
		
		System.out.println("--------------");
		System.out.println("Index of Bruno: " + list.indexOf("Bruno"));
		System.out.println("Index of Sandro: " + list.indexOf("Sandro")); // se não tem na lista retorna -1
		
		System.out.println("--------------");
		// Pra deixar na lista somente quem estiver em algum parametro
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		// Cria uma nova lista = converte pra stream (aceita lambda) . filtra os resultados . converter novamente pra lista
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("A lista está com tamanho: " + result.size());
		
		System.out.println("--------------");		
		//voltando pra lista antiga (list), encontrar o primeiro elemento que comece com a letra J
		
		String name = list.stream().filter(a -> a.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		name = list.stream().filter(a -> a.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
