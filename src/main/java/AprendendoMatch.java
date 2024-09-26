import java.util.stream.Stream;

public class AprendendoMatch {


    public static void main(String[] args) {


        Double[] notas = {5.5, 5.5, 7.3};

        // não tem nenhuma nota menor que 7
        //var aprovado_aprovada = Stream.of(notas).noneMatch(nota -> nota < 7);

        // Tem alguma nota maior que 7 ou igual
        //var aprovado_aprovada = Stream.of(notas).anyMatch(nota -> nota >= 7);

        // Todas as notas sao maior ou igual a 7
        var aprovado_aprovada = Stream.of(notas).allMatch(nota -> nota >= 7);


        System.out.println(aprovado_aprovada ? "Aprovado" : "Reprovado");


    }

}
