package Ejercicio_01;

public class Main {
    public static void main(String[] args) {

        int entrada=3
                ;

        Cliente[] misClientes =new Cliente[10];
        Empleado[] misEmpleados=new Empleado[10];
        Directivo[] misDirectivos =new Directivo[5];

        for (int i = 0; i < misClientes.length; i++) {
            misClientes[i]= new Cliente();
        }
        for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i]=new Empleado();
        }
        for (int i = 0; i < misDirectivos.length; i++) {
            misDirectivos[i] = new Directivo();
        }

        Empleado.rellenarCampos(misEmpleados);
        misDirectivos[0].rellenarCampos(misDirectivos);
        Cliente.rellenarCampos(misClientes);

        System.out.println("""
                Ejercicio 01 Contornos:
            
                Opciones:
                1.Mostrar Clientes.
                2.Mostrar Empleados.
                3.Mostrar Directivos """);

        switch (entrada){
            case 1 -> {
                Cliente.mostrarClientes(misClientes);
            }
            case 2->{
                /**
                 * TODO como puedo hacer para asegurarme de no llamar a mostrar o rellenar sin haber instanciado ya
                 * los objetos de cada una de las clases. Servirira con usar cualquiera de ellos ¿? Entiendo que no
                 */
                Empleado.mostrarEmpleados(misEmpleados);
            }
            case 3->{
                misDirectivos[0].mostrarDirectivos(misDirectivos);
            }
        }
    }
}