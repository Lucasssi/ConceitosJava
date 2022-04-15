package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjutoBaguncado {
	public static void main(String[] args) {
		
		// N�o ceitoa tipos premitivos, porem se adicionado ser� convertido para tipos objtos tipo
		//double, Integer, string entre outros.
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Ser� convertido para Double.
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � "+ conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho � "+ conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � "+ conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // Uni�o entre dois conjuntos
		
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		
		System.out.println(conjunto);
		
		
	}

}
