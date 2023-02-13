package Ejercicio_01;

public class Empleado {
    private String nombre;
    private int edad;
    private float salarioBruto;
    


    private Empleado() {

    }

    public Empleado(String nombre, int edad, float salarioBruto) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBruto = salarioBruto;
    }

    public static Empleado crearEmpleado(String nombre, int edad, float salarioBruto) {
/*
        TODO falta meter las excepciones para evitar
         crear el empleado si algun valor no es correcto
         ahora mismo hace lo mismo que el constructor no evita
         crear un empleado aunque no rellenemos los campos porque los valores
         no están OK
        */

        Empleado emp = new Empleado();
        if ((salarioBruto > 0) && (nombre.length() > 0) && (edad > 0)) {
            emp.setEdad(edad);
            emp.setNombre(nombre);
            emp.setSalarioBruto(salarioBruto);
        }

        return emp;
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
