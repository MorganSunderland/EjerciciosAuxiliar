import java.util.Scanner;
public class Factorial{
    private int numero;
    public Factorial(int numero)
    {
        this.numero = numero;
    }
    
    public int calcularFactorial()
    {
        int resultado = 1;
        if(numero>=0){
            for(int i = 1; i <= numero; i++){
                resultado = resultado*i;
            }
        }else{
            resultado = (-1);
        }
        return (resultado);
    }
}