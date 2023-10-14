import java.util.Scanner;
public class NumerosPrimos
{
    private int cantidadDeTerminos;
    private int numeroVerificar;
    public NumerosPrimos(int cantidadDeTerminos, int numeroVerificar)
    {
        this.cantidadDeTerminos = cantidadDeTerminos;
        this.numeroVerificar = numeroVerificar;
    }
    
    public void calcularNTerminos()
    {
        int contador=0;
        int contadorDivisores = 0;
        int numero = 1;
        if(cantidadDeTerminos<=0){
            System.out.println("ingrese una cantidad valida");
        }else{
            System.out.println("Los siguientes numeros primos son");
            while(contador<cantidadDeTerminos){
                for(int i = 1; i <= numero; i++){
                    if(numero % i == 0){
                        contadorDivisores++;
                    }
                }
                if (contadorDivisores == 2){
                    System.out.println(numero);
                    contador++;
                }
                numero++;
                contadorDivisores = 0;
            }    
        }
        
    }
    
    public boolean Esprimo(){
        boolean resultado = false;  
        int contador = 0;
        if(numeroVerificar<=0){
            System.out.println("ingrese una numero entero y positivo");
        }else{
            for(int i = 1; i <= numeroVerificar; i++){
                if (numeroVerificar % i == 0){
                    contador++;
                }
            }
            if (contador == 2){
                resultado = true;
            }
        
        }
        return resultado;
    }
    
}