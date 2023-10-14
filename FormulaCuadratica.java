
import java.util.Scanner;
public class FormulaCuadratica
{
    private int numeroA;
    private int numeroB;
    private int numeroC;

    public FormulaCuadratica(int numeroA, int numeroB, int numeroC)
    {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.numeroC = numeroC;
    }

    public void calcular()
    {
        double resultado1;
        double resultado2;
        double discriminante = (Math.pow(numeroB,2))-(4*numeroA*numeroC);
        
        if(discriminante>0){
            resultado1 = (-numeroB+(Math.sqrt(discriminante)))/(2*numeroA);
            resultado2 = (-numeroB-(Math.sqrt(discriminante)))/(2*numeroA);
            System.out.println("Primera Solucion:");
            System.out.println(resultado1);
            System.out.println("Segunda Solucion:");
            System.out.println(resultado2);
        }else{
            if(discriminante==0){
                resultado1 = (-numeroB)/2*numeroA;
                System.out.println("Unica Solucion:");
                System.out.println(resultado1);
            }else{
                System.out.println("El resultado es imaginario");
            }
        }
    }
}
