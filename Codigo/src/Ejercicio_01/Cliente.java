package Ejercicio_01;

public class Cliente {
    private String nombre;
    private int edad;
    private long tfnoContacto1;
    public Cliente(){

    }

    public Cliente(String nombre, int edad, long tfnoContacto1) {
        this.nombre = nombre;
        this.edad = edad;
        this.tfnoContacto1 = tfnoContacto1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTfnoContacto1() {
        return tfnoContacto1;
    }

    public void setTfnoContacto1(long tfnoContacto1) {
        this.tfnoContacto1 = tfnoContacto1;
    }





    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tfnoContacto1=" + tfnoContacto1 +
                '}';
    }
}
