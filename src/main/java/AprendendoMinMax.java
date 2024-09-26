import java.util.stream.Stream;

public class AprendendoMinMax {

    public static void main(String[] args) {
        Double[] notas = {5.5, 5.5, 5.5, 9.7};

        var max = Stream.of(notas).max(Double::compareTo).get();

        System.out.println("Max: " + max);

        var min = Stream.of(notas).min(Double::compareTo).get();
        System.out.println("Min: " + min);

    }

}
