package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferencia e quando a fila esta cheia
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> Obter o próximo elementos 
		// Da fila (Sem remover)
		
		//Diferença é o comportamento ocorre
		// quando a fila está fazia
		System.out.println(fila.peek());// se estiver fazio retorna nulo
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Se estiver fazio da erro
		System.out.println(fila.element());
		
		//fila.size(); tamanho da fila 
		//fila.clear(); limpar a fila
		//fila.isEmpty(); verificar se esta vazio
		
	//	System.out.println(fila.remove()); mesma função de fila.poll() porem se tiver favio retorna erro.
		
		System.out.println(fila.poll()); //retona o primeiro elemento da fila e remove,
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
	}

}
