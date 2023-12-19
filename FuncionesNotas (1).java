import java.util.LinkedList;

public class FuncionesNotas {
   String Nombre;
    int NLengua, NMate, NHistoria, NFisica, NPromedio, Suma;
    double SuPromedio;

    public void SetSuPromedio( double supromedio){
        SuPromedio=supromedio ;
    }
    public double GetSuPromedio(){
        return SuPromedio;
    }
    public void SetNombre( String nombre){
        Nombre=nombre ;
    }
    public String GetNombre(){
        return Nombre;
    }

    public void SetNLengua(int lengua){
        NLengua=lengua ;
    }
    public int GetNLengua(){
        return NLengua;
    }

    public void SetNMate(int mate){
        NMate=mate ;
    }
    public int GetNMate(){
        return NMate;
    }

    public void SetNHistoria(int historia){
        NHistoria=historia;
    }
    public int GetNHistoria(){
        return NHistoria;
    }
    
    public void SetNFisica(int fisica){
        NFisica=fisica ;
    }
    public int GetNFisica(){
        return NFisica;
    }
}