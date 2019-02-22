public class FaturaTeste {

    public static void main(String[] args){
        Fatura fatura = new Fatura();
        String codigo = String.valueOf(args[0]);
        String descricao = String.valueOf(args[1]);
        Integer quantidade = Integer.valueOf(args[2]);
        Double preco = Double.valueOf(args[3]);
        double totalFaturado = fatura.Calcular(preco, quantidade);

        System.out.println("Descrição: " + descricao);
        System.out.println("Total: R$" + totalFaturado);
    }
}
