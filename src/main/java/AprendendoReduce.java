import java.util.stream.Stream;

public class AprendendoReduce {

    public static void main(String[] args) {

        Double[] notas = {5.5, 5.5, 7.3};

        var aprovado_aprovado = Stream.of(notas).reduce((acumulador, nota) -> acumulador + nota)
                .map(somaDasNotas -> somaDasNotas / notas.length)
                .filter(nota -> nota > 7)
                .isPresent();

        System.out.println("Você foi aprovado: " + (aprovado_aprovado ? "Aprovado" : "Reprovado"));

    }

}
