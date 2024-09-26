import java.util.stream.Stream;

public class ConstrucaoStream {

    public static void main(String[] args) {
        Stream<Number> notas = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        notas.forEach(System.out::println);


        System.out.println("*******************");

        Number[] maisNotas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7.2, 6.5};
        Stream.of(maisNotas).forEach(System.out::println);

        Stream.of(maisNotas).parallel().forEach(System.out::println);


    }

}
