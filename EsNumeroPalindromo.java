import java.util.Scanner;

public class EsNumeroPalindromo {
    int numero;

    public EsNumeroPalindromo(int numero) {
        this.numero = numero;
    }

    public boolean EsPalindromo() {
        boolean resultado = false;
        int cantidadDigitos = (int) (Math.log10(numero) + 1);
        int numeroOriginal = numero;
        int numeroPalindromo = 0;
        int digito;

        for (int i = cantidadDigitos - 1; i >= 0; i--) {
            digito = numeroOriginal % 10;
            numeroPalindromo = (int) (numeroPalindromo + digito * Math.pow(10, i));
            numeroOriginal = (int) (numeroOriginal / 10);
        }

        if (numeroPalindromo == numero) {
            resultado = true;
        }
        return resultado;
    }
}