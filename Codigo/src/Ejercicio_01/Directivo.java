package Ejercicio_01;

import java.util.Arrays;

public class Directivo extends Empleado {

    private int categoria;
    private int numeroSubordinados;
    private String nombresSubordinados []=new String [numeroSubordinados];

    public Directivo(){

    }

    public Directivo(String nombre, int edad, float salarioBruto, int categoria, int subordinados, String[] nombresSubordinados) {
        super(nombre, edad, salarioBruto);
        this.categoria = categoria;
        this.numeroSubordinados = subordinados;
        this.nombresSubordinados = nombresSubordinados;
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

    public String[] getNombresSubordinados() {
        return nombresSubordinados;
    }

    public void setNombresSubordinados(String[] nombresSubordinados) {
        this.nombresSubordinados = nombresSubordinados;
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
