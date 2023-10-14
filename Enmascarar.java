//Normalmente, cuando compras algo, te preguntan tu número de tarjeta de crédito, tu número de teléfono 
//o la respuesta a tu pregunta más secreta. Sin embargo, dado que alguien podría mirar adelante, no querrás
//que eso se muestre en su pantalla. En cambio, lo enmascaramos.Su tarea es escribir una función que cambie
// todos los caracteres excepto los últimos cuatro a '#'.
public class Enmascarar {
    private String contraseña;

    public Enmascarar(String contraseña) {
        this.contraseña = contraseña;
    }

    public String enmascararContraseña() {
        String contraseñaEnmascarada = "";

        int longitud = contraseña.length();
        int caracteresAMantener = 4;

        for (int i = 0; i < longitud - caracteresAMantener; i++) {
            String letraEnmascarada = "*";
            contraseñaEnmascarada = contraseñaEnmascarada.concat(letraEnmascarada);
        }

        for (int i = longitud - caracteresAMantener; i < longitud; i++) {
            char letra = contraseña.charAt(i);
            contraseñaEnmascarada = contraseñaEnmascarada.concat(String.valueOf(letra));
        }

        return contraseñaEnmascarada;
    }
}
