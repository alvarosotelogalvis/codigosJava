import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Actividad4{
    public static List<FuncionesNotas> Estudiantes = null;
    public static Scanner lea = null;
    
    public static void LlenarNotas(){
        String[] Nombres =new String[6];
        Nombres[0]="Pepe";
        Nombres[1]="Juan";
        Nombres[2]="Ana";
        Nombres[3]="Marta";
        Nombres[4]="Pedro";
        Nombres[5]="Maria";

        System.out.print("\nVamos  llenar las notas de los estudiantes: ");
        for(int i=0;i<6;i++){
            int NotaLengua;
            int NotaMate;
            int NotaHistoria;
            int NotaFisica;
            double Promedio;
            //double n=0.0;
            FuncionesNotas p = new FuncionesNotas();

            System.out.print("\nEstudiante: "+Nombres[i]);
            p.SetNombre(Nombres[i]);
            System.out.print("\nIngrese la nota de Lengua: ");//Ingresar Nota Lengua
            NotaLengua = lea.nextInt();
            p.SetNLengua(NotaLengua);
            System.out.print("\nIngrese la nota de Matematicas: ");//Ingresar Nota Matematicas
            NotaMate = lea.nextInt();
            p.SetNMate(NotaMate);
            System.out.print("\nIngrese la nota de Historia: ");//Ingresar Nota Historia
            NotaHistoria = lea.nextInt();
            p.SetNHistoria(NotaHistoria);
            System.out.print("\nIngrese la nota de Fisica: ");//Ingresar Nota Fisica
            NotaFisica = lea.nextInt();
            p.SetNFisica(NotaFisica);
            Promedio=(NotaLengua+NotaMate+NotaHistoria+NotaFisica)/6;
            p.SetSuPromedio(Promedio);

            Estudiantes.add(p);
        }
    }
    public static void MostrarNotas(){
        System.out.println("\n\n   Resultado de notas");
        for(FuncionesNotas estudiante : Estudiantes){
            
            System.out.println("\nEl Nombre del estudiante es : "+ estudiante.GetNombre());//Imprimir Nombre estudiante
            System.out.println("La Nota de la asignatura Lengua es : "+ estudiante.GetNLengua());//Imprimir nota lengua
            System.out.println("La Nota de la asignatura Matematicas es : "+ estudiante.GetNMate());//Imprimir nota Matematicas
            System.out.println("La Nota de la asignatura Historia es : "+ estudiante.GetNHistoria());//Imprimir nota Historia
            System.out.println("La Nota de la asignatura Fisica es : "+ estudiante.GetNFisica());//Imprimir nota Fisica
        }
    }
    public static void AlumnoMejorPromedio(){
        int indice=0;
        double promedio=Estudiantes.get(0).GetSuPromedio();
        for(int i=1;i<Estudiantes.size();i++){
            if(Estudiantes.get(i).GetSuPromedio()>promedio){
                indice=i;
            }
        }
        System.out.println("\nEl estudiante con mejor promedio es : "+ Estudiantes.get(indice).GetNombre());
    }
    public static void AlumnoPromedioMasBajo(){
        int indice=0;
        double promedio=Estudiantes.get(0).GetSuPromedio();
        for(int i=1;i<Estudiantes.size();i++){
            if(Estudiantes.get(i).GetSuPromedio()<promedio){
                indice=i;
            }
        }
        System.out.println("\nEl estudiante con mas bajo promedio es : "+ Estudiantes.get(indice).GetNombre());
    }
    public static void AsignaturaMejorPromedio(){
        double[] Promedios =new double[4];
        Promedios[0]=0;
        Promedios[1]=0;
        Promedios[2]=0;
        Promedios[3]=0;
        for(FuncionesNotas estudiante : Estudiantes){
            Promedios[0]=Promedios[0]+estudiante.GetNLengua();
            Promedios[1]=Promedios[1]+estudiante.GetNMate();
            Promedios[2]=Promedios[2]+estudiante.GetNHistoria();
            Promedios[3]=Promedios[3]+estudiante.GetNFisica();
        }
        Promedios[0]=Promedios[0]/6;
        Promedios[1]=Promedios[1]/6;
        Promedios[2]=Promedios[2]/6;
        Promedios[3]=Promedios[3]/6;
        
        double promedio=Promedios[0];
        int indice=0;
        for(int j=1;j<4;j++){
            if(Promedios[j]>promedio){
                indice=j;
            }
        }
        switch(indice){
            case 0:
                System.out.print("\nla asignatura con mejor promedio es Lengua.");
                break;
            case 1:
                System.out.print("\nla asignatura con mejor promedio es Matematicas.");
                break;
            case 2:
                System.out.print("\nla asignatura con mejor promedio es historia.");
                break;
            case 3:
                System.out.print("\nla asignatura con mejor promedio es fisica.");
                break;
        }
    }
    public static void main(String[] args) {
        Estudiantes = new ArrayList<FuncionesNotas>();
        lea = new Scanner(System.in);
        int Opcion;
        System.out.print("\n********************************************************************************");
        System.out.print("\n                 Sistema de notas para los estudiantes.       ");
        System.out.print("\n********************************************************************************");

        boolean salir=false;
        while(!salir){
            System.out.print("\n                 Menu");
            System.out.print("\n1. Llenar notas");
            System.out.print("\n2. Mostrar notas");
            System.out.print("\n3. Ver alumno con mejor promedio");
            System.out.print("\n4. Ver alumno con promedio mas bajo");
            System.out.print("\n5. Ver asignatura con mejor promedio");
            System.out.print("\n6. SALIR");
            System.out.print("\ningrese una opcion valida entre 1 y 6: ");
            Opcion = lea.nextInt();
            System.out.print("\n...");
            switch(Opcion){
                case 1:
                    LlenarNotas();
                    break;
                case 2:
                    MostrarNotas();
                    break;
                case 3:
                    AlumnoMejorPromedio();
                    break;
                case 4:
                    AlumnoPromedioMasBajo();
                    break;
                case 5:
                    AsignaturaMejorPromedio();
                    break;
                default:
                    salir=true;
                    break;
            }
        }
        System.out.print("\n  ");
        System.out.print("\n********************************************************************************");
        System.out.print("\n  ");
        lea.close();
    }
}
