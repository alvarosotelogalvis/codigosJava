package proyecto;
import java.util.Stack;
import java.util.Scanner;


public class Pila {
    public Stack<Integer> MiPila() {
        Stack<Integer> resultPila=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int numero=0;
        int dimPila=0;
        System.out.print("Ingrese la dimension de la pila");
        dimPila=sc.nextInt();

        for (int i = 0; i < dimPila; i++) {
            numero=(int)(Math.random()*100+1);
            resultPila.push(numero);            
        }

        return resultPila;
    }
    
}
