public class Triangulos {

    public int PrimeiroTriangulo(int linhas) {
        char asterisco = '*';

        for(int contador1=0; contador1<linhas; contador1++){
            for(int contador2=0; contador2<contador1; contador2++) {
                System.out.print(asterisco);
            }
            System.out.println(asterisco);
        }
        return 0;
    }

    public int SegundoTriangulo(int linhas) {
        char asterisco = '*';

        for(int contador1=linhas; contador1>0; contador1--) {
            for(int contador2=contador1; contador2>0; contador2--) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public int TerceiroTriangulo(int linhas) {
        char asterisco = '*';
        int espaco = 0;

        for(int contador1=linhas; contador1>0; contador1--) {
            for(int contadorEsp=0; contadorEsp<espaco; contadorEsp++) {
                System.out.print(" ");
            }
            espaco++;
            for(int contador2=contador1; contador2>0; contador2--) {
                System.out.print("*");
            }
            System.out.println();
        }

        return 0;
    }

    public int QuartoTriangulo(int linhas) {
        char asterisco = '*';
        int espaco = 0;

        for(int contador1=1; contador1<=linhas; contador1++) {
            for(int contadorEsp=1; contadorEsp<espaco; contadorEsp++) {
                System.out.print(" ");
            }
            espaco--;
            for(int contador2=0; contador2<contador1; contador2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

}
