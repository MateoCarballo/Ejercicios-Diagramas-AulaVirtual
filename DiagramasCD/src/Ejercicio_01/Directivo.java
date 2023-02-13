package Ejercicio_01;

public class Directivo extends Empleado {

    private int categoria;
    private String subordinados;

    public Directivo(String nombre, int edad, float salarioBruto, int categoria, String subordinados) {
        super(nombre, edad, salarioBruto);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }
}
