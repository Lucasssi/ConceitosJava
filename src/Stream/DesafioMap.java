package Stream;

import java.util.List;
import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.function.Function;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Byte> bytes;

        // ====== Conversão para Binario ====================

        // nums.stream()
        // .map(Integer::toBinaryString)
        // .forEach(System.out::println);

        // ====== Conversão para Binario Para String ====================

        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }

}