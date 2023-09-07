package calculadora;

public class SubtracaoTeste {
    public static void main(String[] args) {
        Subtracao subtracao = new Subtracao();

        //Teste 1: Subtração entre um número maior e um menor;
        int resultado = subtracao.subtrair(10, 5);
        System.out.println(resultado);

        //Teste 2: Subtração entre um número menor e um maior;
        resultado = subtracao.subtrair(5, 10);
        System.out.println(resultado);

        //Teste 3: Subtração entre números iguais
        resultado = subtracao.subtrair(10, 10);
        System.out.println(resultado);

        //Teste 4: Subtração entre um número e zero;
        resultado = subtracao.subtrair(10, 0);
        System.out.println(resultado);

        //Teste 5: Subtração entre um zero e um número positivo;
        resultado = subtracao.subtrair(0, 10);
        System.out.println(resultado);

        //Teste 6: Subtração entre zeros;
        resultado = subtracao.subtrair(0, 0);
        System.out.println(resultado);

        //Teste 7: Subtração entre dois números negativos;
        resultado = subtracao.subtrair(-10, -5);
        System.out.println(resultado);

        //Teste 8: Subtração entre um número positivo e um negativo;
        resultado = subtracao.subtrair(10, -5);
        System.out.println(resultado);

        //Teste 9: Subtração entre o maior e menor número suportado por int;
        resultado = subtracao.subtrair(2147483647, -2147483647);
        System.out.println(resultado);
        // Report: Se acusa um numeric overflow na IDE e o resultado dá errado

        //Teste 10: Subtração entre o menor e maior número suportado por int;
        resultado = subtracao.subtrair(-2147483647, 2147483647);
        System.out.println(resultado);
        // Report: Se acusa um numeric overflow na IDE e o resultado dá errado

        //Teste 11: Subtração entre os menores números suportado por int;
        resultado = subtracao.subtrair(-2147483647, -2147483647);
        System.out.println(resultado);

        //Teste 12: Subtração entre os maiores números suportado por int;
        resultado = subtracao.subtrair(2147483647, 2147483647);
        System.out.println(resultado);
    }
}
