import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Actividad6{
    
    
    public static void main(String[] args) {

        
        List<FuncionUsuarios> usuarios = new ArrayList<FuncionUsuarios>();
        Scanner lea = new Scanner(System.in);
        int Cedula;
        String Nombre;
        String Apellido;
        String Direccion;
        int Celular;
        String Enfermedades;          
        String Sexo;      

        for(int i=0;i<1;i++){
            FuncionUsuarios p = new FuncionUsuarios();
            System.out.println("\n\n     ¡Por favor ingrese los datos del usuario!   ");//Imprimir titulo

            System.out.print("\n\nIngrese el numero de cedula del Usuario: ");//Ingresar Nota Lengua
            Cedula = lea.nextInt();
            p.SetCedula(Cedula);
            
            System.out.print("Ingrese el nombre del Usuario: ");//Ingresar nombre 
            Nombre = lea.next();
            p.SetNombre(Nombre);
         
            System.out.print("Ingrese el apellido del Usuario: ");//Ingresar Apellido
            Apellido = lea.next();
            p.SetApellido(Apellido);

            System.out.print("Ingrese la dirección del Usuario: ");//Ingresar Direccion
            Direccion = lea.next();
            p.SetDireccion(Direccion);

            System.out.print("Ingrese el numero de celular del Usuario: ");//Ingresar  numero de celular
            Celular = lea.nextInt();
            p.SetCelular(Celular);

            System.out.print("Ingrese las enfermedades del Usuario(EN CASO DE NO TENER ENFERMEDADES, ESCRIBA NINGUNA): ");//Ingresar Direccion
            Enfermedades = lea.next();
            p.SetEnfermedades(Enfermedades);

            System.out.print("Ingrese el sexo del Usuario: ");//Ingresar Sexo
            Sexo = lea.next();
            p.SetSexo(Sexo);

            usuarios.add(p);
        }
        System.out.println("\n\n   Resultado de notas  ");
        for(FuncionUsuarios item : usuarios){

            System.out.println("\n       Los datos del usuario son   ");//Imprimir titulo    
            System.out.println("\nEl N° de Cedula es : "+ item.GetCedula());//Imprimir Cedula                  
            System.out.println("El Nombre del Usuario es : "+ item.GetNombre());//Imprimir Nombre 
            System.out.println("El Apellido del Usuario es : "+ item.GetApellido());//Imprimir Apellido
            System.out.println("La Dirección del Usuario es : "+ item.GetDireccion());//Imprimir Direccion
            System.out.println("El N° de Celular del Usuario es : "+ item.GetCelular());//Imprimir Celular
            System.out.println("Las enfermedades del Usuario son : "+ item.GetEnfermedades());//Imprimir Enfermedades
            System.out.println("El Sexo del Usuario es : "+ item.GetSexo());//Imprimir Sexo

        }
        lea.close();
    }
}
