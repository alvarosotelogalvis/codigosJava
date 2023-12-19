import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Punto3Temperaturas {
    public static Random random = new Random();
    public static LinkedList<Integer> ListaTemperaturas = null;
    public static Scanner lea = new Scanner(System.in);
    public static String[] DiaSemana=null;

    public static void RellenarTemperaturas(){
        System.out.print("\n     ********************************************************************************");
        System.out.print("\n                                  Rellenar las temperaturas        ");
        System.out.print("\n     ********************************************************************************");
        System.out.print("\n     submenu:");
        System.out.print("\n     1. Rellenar las temperaturas manualmente.");
        System.out.print("\n     2. Rellenar las temperaturas automaticamente.");
        System.out.print("\n     Ingrese una opcion de 1 a 2: ");
        int opcion = lea.nextInt();
        switch(opcion){
            case 1:
                TemperaturasManual();
                break;
            case 2:
                TemperaturasAutomatico();
                break;
        }
        System.out.print("\n  ");
        System.out.print("\n     ********************************************************************************");
        System.out.print("\n  ");
    }

    private static void TemperaturasManual(){
        for(int i=0;i<28;i++){
            System.out.print("\n     Ingrese un valor de temperatura: ");
            ListaTemperaturas.add(lea.nextInt());
        }
    }

    private static void TemperaturasAutomatico(){
        for(int i=0;i<28;i++){
            ListaTemperaturas.add(random.nextInt(90)+10);
        }
    }

    public static void MostrarTemperaturas(){
        if(ListaTemperaturas.size()>0){
            System.out.print("\n     Lista de temperaturas: "+ListaTemperaturas);
            System.out.print("\n  ");
            System.out.print("\n     ********************************************************************************");
            System.out.print("\n  ");
        }else{
            System.out.print("\n             No se tienen registros de temperaturas, porfavor ingreselos antes de consultar.");
        }
    }

    public static void temperaturaMedia(){
        if(ListaTemperaturas.size()>0){
            float promedio=0;
            for(int i=0;i<28;i++){
                promedio=promedio+ListaTemperaturas.get(i);
            }
            promedio=promedio/28;
            System.out.print("\n     La temperatura promedio es: "+promedio);
            System.out.print("\n  ");
            System.out.print("\n     ********************************************************************************");
            System.out.print("\n  ");
        }else{
            System.out.print("\n             No se tienen registros de temperaturas, porfavor ingreselos antes de consultar.");
        }
    }

    public static void DiaODiasMasCalurosos(){
        if(ListaTemperaturas.size()>0){
            int max=ListaTemperaturas.get(0);
            int cantidadDiasCalurosos=0;
            int diames=0;
            int semana=1;
            for(int i=1;i<28;i++){
                if(ListaTemperaturas.get(i)>max){
                    max=ListaTemperaturas.get(i);
                    diames=i;
                }
            }
            diames++;
            for(int i=0;i<28;i++){
                if(ListaTemperaturas.get(i)==max){
                    cantidadDiasCalurosos++;
                }
            }
            if(cantidadDiasCalurosos>1){
                System.out.print("\n     Los dias mas calurosos fueron: ");
                for(int i=0;i<28;i++){
                    if(ListaTemperaturas.get(i)==max){
                        diames=i+1;
                        if(diames>21){semana=4;}
                        else{
                            if(diames>14){semana=3;}
                            else{
                                if(diames>7){semana=2;}
                                else{semana=1;}
                            }
                        }
                        diames=diames%7;
                        System.out.print("\n     El "+DiaSemana[diames-1]+" de la semana "+semana+" con "+max+" grados.");
                    }
                }
            /////////////////////Falta terminar de implementar aqui para varios dias calurosos..............................
            }else{
                if(diames>21){semana=4;}
                else{
                    if(diames>14){semana=3;}
                    else{
                        if(diames>7){semana=2;}
                        else{semana=1;}
                    }
                }
                diames=diames%7;
                System.out.print("\n     El dia mas caluroso fue: ");
                System.out.print("\n     El "+DiaSemana[diames-1]+" de la semana "+semana+" con "+max+" grados.");
            }
            System.out.print("\n  ");
            System.out.print("\n     ********************************************************************************");
            System.out.print("\n  ");
        }else{
            System.out.print("\n             No se tienen registros de temperaturas, porfavor ingreselos antes de consultar.");
        }
    }

    public static void main(String[] args){
        ListaTemperaturas = new LinkedList<Integer>();
        DiaSemana = new String[7];
        //DiaSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        DiaSemana[0]="Lunes";
        DiaSemana[1]="Martes";
        DiaSemana[2]="Miercoles";
        DiaSemana[3]="Jueves";
        DiaSemana[4]="Viernes";
        DiaSemana[5]="Sabado";
        DiaSemana[6]="Domingo";
        System.out.print("\n     ********************************************************************************");
        System.out.print("\n             Temperaturas de un mes de 28 dias: 4 semanas de 7 dias cada una.        ");
        System.out.print("\n     ********************************************************************************");
        boolean salir=false;
        while(!salir){
            System.out.print("\n     Menu:");
            System.out.print("\n     1. Rellenar las temperaturas.");
            System.out.print("\n     2. Mostrar las temperaturas.");
            System.out.print("\n     3. visualizar la temperatura media del mes.");
            System.out.print("\n     4. Dia o dias mas calurosos del mes.");
            System.out.print("\n     5. salir.");
            System.out.print("\n  ");
            System.out.print("\n     Ingrese una opcion de 1 a 5: ");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1:
                    RellenarTemperaturas();
                    break;
                case 2:
                    MostrarTemperaturas();
                    break;
                case 3:
                    temperaturaMedia();
                    break;
                case 4:
                    DiaODiasMasCalurosos();
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.print("\n     INGRESO UNA OPCION ERRONEA.");
                    break;
            }
        }
        
        System.out.print("\n  ");
        System.out.print("\n     ********************************************************************************");
        System.out.print("\n  ");
    }
}
