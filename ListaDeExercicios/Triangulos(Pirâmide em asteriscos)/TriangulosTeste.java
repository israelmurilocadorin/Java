import java.lang.String;

public class TriangulosTeste {

    public static void main(String[] args){
        Triangulos trigangulo = new Triangulos();
        Character opcao = Character.valueOf('a');
        Integer linhas = Integer.valueOf(args[1]);
        int recebe;

        switch (opcao){
            case 'a':
                System.out.println("Primeira opcao");
                recebe = trigangulo.PrimeiroTriangulo(linhas);
                break;
            case 'b':
                System.out.println("Segunda opcao");
                recebe = trigangulo.SegundoTriangulo(linhas);
                break;
            case 'c':
                System.out.println("Terceira opcao");
                recebe = trigangulo.TerceiroTriangulo(linhas);
                break;
            case 'd':
                System.out.println("Quarta opcao");
                recebe = trigangulo.QuartoTriangulo(linhas);
                System.out.println();
                break;
        }
    }
}
