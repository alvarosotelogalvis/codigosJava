package tallerListasPilasColas;
import java.util.Scanner;
//import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
//import java.util.Arrays;

public class ListaEnterostallerP1{
    static Scanner lea = null;

    public static List<EnteroListaP1> LlenarLista(List<EnteroListaP1> milista){        
        Scanner lea = new Scanner(System.in);
        int cantNumeros;
        System.out.println("\nIngrese la cantidad de numeros para llenar la lista: ");
        cantNumeros = lea.nextInt();
        for(int i=0;i<cantNumeros;i++){
            EnteroListaP1 item = new EnteroListaP1();
            System.out.println("Ingrese el valor para agregar a la lista: ");
            item.SetNum(lea.nextInt());
            milista.add(item);
        }
        lea.close();
        return milista;
    }
    public static void main(String[] args){
        System.out.print("\n********************************************");
        System.out.print("\n       Taller listas, pilas y colas         ");
        System.out.print("\n********************************************");

        List<EnteroListaP1> enteros = new ArrayList<EnteroListaP1>();
        //Scanner lea = new Scanner(System.in);
        
        enteros=LlenarLista(enteros);
        for(EnteroListaP1 item : enteros){
            System.out.println("item: "+item.GetNum());
        }
        //System.out.println("\n\nLista: "+enteros+"\n\n");
        //llenarPila();
        /*llenarCola();
        System.out.println("\n\nPila: "+ MiPilaA);
        System.out.println("\n\nCola: "+ MiColaA);
        LlenarLista();
        System.out.println("\n\nLista: "+ MiLista);
        MostrarRepetidos();*/
        //lea.close();
    }
}