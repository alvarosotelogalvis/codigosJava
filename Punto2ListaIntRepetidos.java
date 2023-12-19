import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Punto2ListaIntRepetidos {
    public static Scanner lea = new Scanner(System.in);
    public static Random random = new Random();

    public static LinkedList<Integer> LlenarLista(LinkedList<Integer> Lista){
        System.out.print("\nIngrese la cantidad de valores para llenar la lista: ");
        //lea = new Scanner(System.in);
        int cantidadEnt = lea.nextInt();
        for(int i=0;i<cantidadEnt;i++){
            Lista.add(random.nextInt(4)+1);
        }
        //Collections.sort(MiLista);
        return Lista;
    }
    public static LinkedList<Integer> ModificarLista(LinkedList<Integer> Lista){
        //este metodo modifica los elemnetos o nodos de la lista si encuentra numeros repetidos los cambia por cero.
        if(Lista.size()>1){
            int dato=0;
            for(int i=0; i<Lista.size();i++){
                dato = Lista.get(i);
                for(int j=i+1; j<Lista.size();j++){
                    if(Lista.get(j)==dato){
                        Lista.set(i,0);
                        Lista.set(j,0);
                    }
                }
            }
        }
        
        return Lista;
    }
    
    public static void main(String[] args){
        LinkedList<Integer> ListaEnteros = new LinkedList<Integer>();
        System.out.print("\n********************************************************************************");
        System.out.print("\n        Llenar una lista y modificar los valores repetidos por ceros...         ");
        System.out.print("\n********************************************************************************");
        //System.out.print("\nTamaño Lista: "+ListaEnteros.size());
        //ListaEnteros=ModificarLista(ListaEnteros);
        ListaEnteros=LlenarLista(ListaEnteros);
        if(ListaEnteros.size()>0){
            System.out.print("\nListaEnteros original:   "+ListaEnteros);
            ListaEnteros=ModificarLista(ListaEnteros);
            System.out.print("\nListaEnteros modificada: "+ListaEnteros);
        }else{
            System.out.print("\nLa lista esta vacia debe llenarla...");
        }
        System.out.print("\n  ");
        System.out.print("\n********************************************************************************");
        System.out.print("\n  ");
    }
}
