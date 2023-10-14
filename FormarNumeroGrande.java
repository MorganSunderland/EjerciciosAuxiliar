public class FormarNumeroGrande {
    private int numero;

    public FormarNumeroGrande(int numero) {
        this.numero = numero;
    }

    public int formarNumeroMasGrande() {
        int numeroOrdenado = 0;
        int multiplicador = 1;

        while (numero > 0) {
            int digitoMax = obtenerDigitoMax(numero);
            numeroOrdenado = (numeroOrdenado * 10) + digitoMax;
            numero = quitarDigitoMax(numero, digitoMax);
        }

        return numeroOrdenado;
    }

    private int obtenerDigitoMax(int num) {
        int digitoMax = -1;

        while (num > 0) {
            int digito = num % 10;
            if (digito > digitoMax) {
                digitoMax = digito;
            }
            num /= 10;
        }

        return digitoMax;
    }

    private int quitarDigitoMax(int num, int digito) {
        int nuevoNumero = 0;
        int multiplicador = 1;

        while (num > 0) {
            int digitoActual = num % 10;
            if (digitoActual != digito) {
                nuevoNumero += digitoActual * multiplicador;
                multiplicador *= 10;
            }
            num /= 10;
        }

        return nuevoNumero;
    }
}
