public class ImprimirFigura {
    public static void main(String[] args) {
        int altura = 3;  // Ajusta la altura de la figura según tus necesidades

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();  // Salto de línea al final de cada fila
        }
    }
}
    

