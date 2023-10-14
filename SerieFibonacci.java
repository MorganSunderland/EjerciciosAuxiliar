import java.util.Scanner;
public class SerieFibonacci
{
    private int cantidadDeTerminos;
    private int numero;
    public SerieFibonacci(int cantidadDeTerminos, int numero)
    {
        this.cantidadDeTerminos = cantidadDeTerminos;
        this.numero = numero;
    }
    
    public void calcularNTerminos()
    {
        int termino1 = 0;
        int termino2 = 1;
        int nuevoTermino;
        if(cantidadDeTerminos <= 0){
            System.out.println("Digite un numero de terminos validos");
        }else{
            if(cantidadDeTerminos == 1){
                System.out.println("Serie de Fibonacci de "+cantidadDeTerminos+" terminos:");
                System.out.println(termino1);
            }else{
                if(cantidadDeTerminos==2){
                   System.out.println("Serie de Fibonacci de "+cantidadDeTerminos+" terminos:"); 
                   System.out.println(termino1);
                   System.out.println(termino2);
                }else{
                    System.out.println("Serie de Fibonacci de "+cantidadDeTerminos+" terminos:");
                    System.out.println(termino1);
                    System.out.println(termino2);
                    for(int i = 3; i <= cantidadDeTerminos; i++){
                        nuevoTermino = termino1 + termino2;
                        System.out.println(nuevoTermino);
                        termino1 = termino2;
                        termino2 = nuevoTermino;
                    }
                }
            }
        }        
    }
    
    public boolean determinarSiPerteneceFibonacci()
    {
        boolean resultado = false;
        int termino = 0;
        int termino1 = 0;
        int termino2 = 1;
        while(termino <= numero){
            termino = termino1 + termino2;
            if(termino == numero){
                resultado = true;   
            }
            termino1 = termino2;
            termino2 = termino;
        }
        return resultado;
    }    
}
