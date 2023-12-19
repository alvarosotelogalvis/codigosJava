import java.util.LinkedList;

public class FuncionUsuarios {
   String Nombre, Apellido, Direccion, Enfermedades, Sexo;
    int Cedula, Celular, Edad;
    boolean Aceptado;

    public void SetAceptado(boolean aceptado){
        Aceptado=aceptado ;
    }
    public boolean GetAceptado(){
        return Aceptado;
    }
    public void SetEdad(int edad){
        Edad=edad ;
    }
    public int GetEdad(){
        return Edad;
    }
    public void SetCedula(int cedula){
        Cedula=cedula ;
    }
    public int GetCedula(){
        return Cedula;
    }

    public void SetNombre( String nombre){
        Nombre=nombre ;
    }
    public String GetNombre(){
        return Nombre;
    }

    public void SetApellido( String apellido){
        Apellido=apellido ;
    }
    public String GetApellido(){
        return Apellido;
    }

    public void SetDireccion( String direccion){
        Direccion=direccion ;
    }
    public String GetDireccion(){
        return Direccion;

    }
    
    public void SetCelular(int celular){
        Cedula=celular ;
    }
    public int GetCelular(){
        return Celular;
    }

    public void SetEnfermedades( String enfermedades){
        Enfermedades=enfermedades ;
    }
    public String GetEnfermedades(){
        return Enfermedades;
    }
    
    
    public void SetSexo(String sexo){
        Sexo=sexo ;
    }
    public String GetSexo(){
        return Sexo;
    }
}