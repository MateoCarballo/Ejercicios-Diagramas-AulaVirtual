package Ejercicio_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Directivo extends Empleado {

    private int categoria;
    private int numeroSubordinados;

    private ArrayList<Empleado> subordinados =new ArrayList();

    //private Empleado nombresSubordinados []=new Empleado [numeroSubordinados];

    public Directivo(String nombre, int edad, float salarioBruto, int categoria) {
        super(nombre, edad, salarioBruto);
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getNumeroSubordinados() {
        return numeroSubordinados;
    }

    public void setNumeroSubordinados(int numeroSubordinados) {
        this.numeroSubordinados = numeroSubordinados;
    }

    public void addSubordinate(Empleado miEmpleado){
        this.subordinados.add(miEmpleado);
    }

    public void removeSubordinate(String miNombre){
        // pasar valor caracteristico para saber que elimino al que quiero y no a otro un ID por ejemplo

        this.subordinados.removeIf(Empleado->Empleado.getNombre().equalsIgnoreCase(miNombre));
    }

    public static void mostrarSubordinados(){

    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                ", numeroSubordinados=" + numeroSubordinados +
                ", nombresSubordinados=" + Arrays.toString(subordinados) +
                '}';
    }
}
