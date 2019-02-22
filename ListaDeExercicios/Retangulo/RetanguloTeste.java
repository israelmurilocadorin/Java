public class RetanguloTeste {

    public static void main(String[] args){
        Retangulo retangulo = new Retangulo();

        Double comprimento = Double.valueOf(args[0]);
        Double largura = Double.valueOf(args[1]);

        double resultado = retangulo.Calcular(comprimento, largura);

        System.out.println("Resultado: " + resultado);
    }
}
