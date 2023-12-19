import java.util.LinkedList;

public class FuncionesNotas {
   String Nombre;
    int NLengua, NMate, NHistoria, NFisica, NPromedio, Suma;

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

   /*  public void SetNPromedio(int promedio){
        NPromedio=promedio ;
        for (int i = 0; i < array.length; i++) {
            Suma=NLengua+NMate+NHistoria+NFisica;
            //Suma=SetNLengua(i)+SetNMate(i)+SetNHistoria(i)+SetNFisica(i);
            
        }
    }
    public int GetNPromedio(){
        return NPromedio;
    }
     public LinkedList NPromedio(LinkedList FuncionesNotas) {// Promedio
       int cant = FuncionesNotas.size();
       LinkedList<Integer> Promedioo = new LinkedList<>();
        for (int i = 0; i < cant; i++) {
             Suma=NLengua+NMate+NHistoria+NFisica;
                Promedioo.add((int)FuncionesNotas.get(i));
                // System.out.println(MiLista.get(i));
            }
        }
        return listapares;
    }*/

    

}