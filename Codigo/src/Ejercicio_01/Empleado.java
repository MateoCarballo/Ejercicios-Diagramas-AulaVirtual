package Ejercicio_01;

import java.util.ArrayList;

public class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected int edad;
    protected float salarioBruto;

    public Empleado(){

    }
    public Empleado(int idEmpleado, String nombre, int edad, float salarioBruto) {
        this.idEmpleado= idEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBruto = salarioBruto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public static void addEmployee(ArrayList<Empleado> employes,int idEmpleado,String nombre, int edad,float salarioBruto){
        employes.add(new Empleado( idEmpleado,nombre, edad, salarioBruto));
    }

    public void deleteEmployee(ArrayList<Empleado> employes,int indice){
        //elimina de la 'ArrayList' de empleados el índice que pasamos como parámetro
        employes.remove(indice);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBruto=" + salarioBruto +
                '}';
    }
}
