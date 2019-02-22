public class Calculadora {

    public int Soma(int number1, int number2){
        int resultado;
        resultado = number1 + number2;
        return resultado;
    }

    public int Produto(int number1, int number2){
        int resultado;
        resultado = number1 * number2;
        return resultado;
    }

    public int Diferenca(int number1, int number2){
        int resultado;
        resultado = number1 - number2;
        return resultado;
    }

    public float Divisao(float number1, float number2){
        float resultado;
        resultado = number1 / number2;
        return resultado;
    }

    public int Maior(int number1, int number2){
        int resultado;
        if(number1 > number2){
            resultado = number1;
        } else {
            resultado = number2;
        }
        return resultado;
    }
}
