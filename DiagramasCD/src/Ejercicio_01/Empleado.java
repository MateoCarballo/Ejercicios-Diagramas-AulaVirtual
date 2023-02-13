package Ejercicio_01;

public class Empleado {
    private String nombre;
    private int edad;
    private float salarioBruto;
    
    static Empleado crearEmpleado(String nombre, int edad, float salarioBruto) {
        Empleado emp = null;
        if ((salarioBruto > 0) & (nombre.length() > 0) & (edad > 0)) {
            emp = new Empleado(nombre, edad, salarioBruto);
        }
        return emp;
    }

    private Empleado(String nombre, int edad, float salarioBruto) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBruto = salarioBruto;
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

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
