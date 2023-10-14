
public class ImprimirErroresCaja
{
    // instance variables - replace the example below with your own
    private String cadena;
    
    public ImprimirErroresCaja(String cadena)
    {
        this.cadena = cadena;
    }

    public void calcularErrores()
    {
        int contador = 0;
        String cadenaMinusculas = cadena.toLowerCase();
        for(int i = 0; i<= cadenaMinusculas.length()-1 ; i++){
            char letra = cadenaMinusculas.charAt(i);
            int codigoASCIILetra = (int) letra;
            if((codigoASCIILetra < 97) || (codigoASCIILetra > 109)){
                contador++;
            }
        }
        System.out.println("Cantidad de errores de la cadena "+cadena+" : "+contador +" / "+ cadena.length());
    }
}
