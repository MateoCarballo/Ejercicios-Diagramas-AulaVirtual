package Ejercicio_01;

import java.util.Arrays;

public class Directivo extends Empleado {

    private int categoria;
    private int numeroSubordinados;
    private Empleado nombresSubordinados []=new Empleado [numeroSubordinados];

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

    public void addsubordinado(Empleado[] miEmpleado){
        for (int i = 0; i < miEmpleado.length ; i++) {
            if(miEmpleado[i]==null){

            }
        }
    }

    public static void mostrarSubordinados(){

    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                ", numeroSubordinados=" + numeroSubordinados +
                ", nombresSubordinados=" + Arrays.toString(nombresSubordinados) +
                '}';
    }
}
