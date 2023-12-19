package proyecto;
/* Cree un algoritmo que reciba una pila y una cola con diferentes numeros 
aleatoriamente y que devuelva una cola con los numeros ordenados
*/  
import java.util.Stack;

public class EjercicioColas{    

    public static void main(String[] args) {
        Stack<Integer>GeneratePila=new Stack<Integer>();
        Pila pila=new Pila();

        GeneratePila= pila.MiPila(); 
    
    }

}