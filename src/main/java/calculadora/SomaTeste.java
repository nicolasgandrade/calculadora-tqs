package calculadora;

public class SomaTeste {
    public static void main(String[] args) {
        Soma soma = new Soma();

        //Teste 1: Soma de 2 valores;
        int resultado = soma.somar(3, 7);
        System.out.println(resultado);

        //Teste 2: Soma de 2 valores sendo um zero;
        resultado = soma.somar(3, 0);
        System.out.println(resultado);

        //Teste 3: Soma de 2 valores sendo ambos zero;
        resultado = soma.somar(0, 0);
        System.out.println(resultado);

        //Teste 4: Soma de 2 valores sendo um negativo;
        resultado = soma.somar(3, -13);
        System.out.println(resultado);

        //Teste 5: Soma de 2 valores negativos;
        resultado = soma.somar(-3, -7);
        System.out.println(resultado);

        //Teste 6: Soma de dois números máximos suportados pelo tipo de dado int;
        resultado = soma.somar(2147483647, 2147483647);
        System.out.println(resultado);
        // Report: A IDE acusa um numeric overflow e o resultado dá errado.

        //Teste 7: Soma de dois números mínimos suportados pelo tipo de dado int;
        resultado = soma.somar(-2147483647, -2147483647);
        System.out.println(resultado);
        // Report: A IDE acusa um numeric overflow e o resultado dá errado.
    }
}
