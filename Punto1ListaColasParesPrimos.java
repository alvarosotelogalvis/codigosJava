import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Punto1ListaColasParesPrimos {

    public static LinkedList<Integer> MiLista = null;
    static LinkedList<Integer> MiColaPares = null;
    static LinkedList<Integer> MiColaImpares = null;
    static LinkedList<Integer> MiColaPrimos = null;
    public static Scanner lea = new Scanner(System.in);

    public static void LlenarLista(){
        MiLista = new LinkedList<Integer>();
        System.out.print("\n     Ingrese la cantidad de valores para llenar la lista: ");
        //lea = new Scanner(System.in);
        int cantidadInt = lea.nextInt();
        for(int i=0;i<cantidadInt;i++){
            System.out.print("\n     Ingrese un valor: ");
            MiLista.add(lea.nextInt());
        }
        //Collections.sort(MiLista);
    }
    public static void SepararParesEImpares(){
        MiColaPares = new LinkedList<Integer>();
        MiColaImpares = new LinkedList<Integer>();
        for(int i=0;i<MiLista.size();i++){
            if(MiLista.get(i)%2==0){
                MiColaPares.offer(MiLista.get(i));
            }else{
                MiColaImpares.offer(MiLista.get(i));
            }
        }
    }
    public static void SepararPrimos(){
        MiColaPrimos = new LinkedList<Integer>();
        for(int i=0;i<MiLista.size();i++){
            if(MiLista.get(i)>=2){
                if(MiLista.get(i)==2){
                    MiColaPrimos.offer(MiLista.get(i));
                }
                else{
                    if(MiLista.get(i)%2!=0){
                        int raiz = (int)Math.sqrt((int)MiLista.get(i));
                        boolean primo = true;
                        int j = 3;
                        while (j <= raiz) {
                            if (j != (int)MiLista.get(i)) {
                                if ((int)MiLista.get(i) % j == 0) {
                                    primo = false;
                                }
                            }
                            j = j + 2;
                        }
                        if (primo == true) {
                            MiColaPrimos.offer(MiLista.get(i));
                        } 
                        //MiColaPrimos.offer(MiLista.get(i));
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.print("\n     ********************************************************************************");
        System.out.print("\n        Ordenar enteros de una Lista en una cola pares impares y primos         ");
        System.out.print("\n     ********************************************************************************");
        LlenarLista();
        SepararParesEImpares();
        SepararPrimos();
        System.out.print("\n     MiLista: "+MiLista);
        System.out.print("\n     MiColaPares: "+MiColaPares);
        System.out.print("\n     MiColaImpares: "+MiColaImpares);
        System.out.print("\n     MiColaPrimos: "+MiColaPrimos);
        System.out.print("\n  ");
        System.out.print("\n     ********************************************************************************");
        System.out.print("\n  ");
    }
}
