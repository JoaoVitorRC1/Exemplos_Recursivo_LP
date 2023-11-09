

package ReverterPalavra;

public class Reverter {
    public static String inverterPalavra(String palavra) {
        if (palavra.isEmpty()) {
            return palavra;
        } else {
            return inverterPalavra(palavra.substring(1)) + palavra.charAt(0);
        }
    }

    public static void main(String[] args) {
        String palavra = "João";
        String palavraInvertida = inverterPalavra(palavra);
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}


