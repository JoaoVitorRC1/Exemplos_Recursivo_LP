package Recursivo;

public class ContagemRegressiva {
    public static void contagemRegressiva(int numero) {
        if (numero >= 0) {
            System.out.println(numero);
            if (numero != 0) {
                System.out.println("..\n");
            }
            contagemRegressiva(numero - 1);
        }
    }

    public static void main(String[] args) {
        contagemRegressiva(30);
    }
}