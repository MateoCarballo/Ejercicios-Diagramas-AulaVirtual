package Ejercicio_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Directivo extends Empleado {

    private int categoria;

    private ArrayList<Empleado> subordinados =new ArrayList();

    public Directivo(int idEmpleado, String nombre, int edad, float salarioBruto, int categoria) {
        super(idEmpleado,nombre, edad, salarioBruto);
        this.categoria = categoria;
    }

    public static void addManagerial(ArrayList<Empleado> employes, int id,String nombre,int edad, float salarioBruto,int categoria){
        employes.add(new Directivo(id,nombre,edad, salarioBruto,categoria));
    }
    //Metodo al que llamamos desde el Directivo que quiere añadir un subordinado a su ArrayList
    public void addSubordinate(Empleado empleadoSubordinado){
        this.subordinados.add(empleadoSubordinado);
    }
    //TODO intentar borrar buscando por ID y si no lo consigo llamar a una excepcion

    //Indicador nos dice que posicion tiene que borrar que la buscamos ya fuera de la clase
    public void deleteSubordinate(ArrayList<Empleado> subordinate, int posicion){
        this.subordinados.remove(posicion);
    }

        //TODO encadenar los dos to String que el de la clase Directivo llame primero al de la clase Empleado.
    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                ", nombresSubordinados=" + subordinados +
                '}';
    }
}
