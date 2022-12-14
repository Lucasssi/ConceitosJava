
package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Iterator;

public class ImprimirObjetos{

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

       System.out.println("Usando o foreach...");
       for(String nome: aprovados){
        System.out.println(nome);
       }

       System.out.println("\nUsando iterador");
       Iterator<String> it = aprovados.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
      
       System.out.println("\nUsando Stream...");
       Stream<String> stream = aprovados.stream();
       stream.forEach(System.out::println);
    
    }
}
