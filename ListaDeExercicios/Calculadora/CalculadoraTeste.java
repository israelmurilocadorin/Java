public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        float resultadoFinal;

        Integer number1 = Integer.valueOf(args[0]);
        Integer number2 = Integer.valueOf(args[1]);

        resultadoFinal = calc.Soma(number1, number2);
        System.out.println("Soma: " + resultadoFinal);

        resultadoFinal = calc.Produto(number1, number2);
        System.out.println("Produto: " + resultadoFinal);

        resultadoFinal = calc.Diferenca(number1, number2);
        System.out.println("Diferenca: " + resultadoFinal);

        resultadoFinal = calc.Maior(number1, number2);
        System.out.println(resultadoFinal + " é maior");
    }

}
