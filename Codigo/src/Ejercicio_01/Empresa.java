package Ejercicio_01;

public class Empresa {
    public static void main(String[] args) {

        int entrada=2;

        Cliente[] misClientes =new Cliente[10];
        Empleado[] misEmpleados=new Empleado[10];


        for (int i = 0; i < misClientes.length; i++) {
            misClientes[i]= new Cliente();
        }
        for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i]=new Empleado();
        }

        Empleado.rellenarCampos(misEmpleados);
        rellenarCampos(misDirectivos);
        rellenarCampos(misClientes);

        System.out.println("""
                Ejercicio 01 Contornos:
            
                Opciones:
                1.Mostrar Clientes.
                2.Mostrar Empleados.
                3.Mostrar Directivos """);

        switch (entrada){
            case 1 -> {
                mostrarClientes(misClientes);
            }
            case 2->{
                /**
                 * TODO como puedo hacer para asegurarme de no llamar a mostrar o rellenar sin haber instanciado ya
                 * los objetos de cada una de las clases. Servirá con usar cualquiera de ellos ¿? Entiendo que no
                 */
                mostrarEmpleados(misEmpleados);
            }
            case 3->{
                mostrarDirectivos(misDirectivos);
            }
        }
    }

    public static void mostrarClientes(Cliente[] mostrarClientes){
        for (int i = 0; i < mostrarClientes.length-1 ; i++) {
            System.out.println(mostrarClientes[i]);
        }
    }
    public static void mostrarEmpleados(Empleado[] mostrarEmpleados){
        for (int i = 0; i < mostrarEmpleados.length-1; i++) {
            System.out.println(mostrarEmpleados[i]);
        }
    }
    public static void mostrarDirectivos(Directivo[] mostrarDirectivos){
        for (int i = 0; i < mostrarDirectivos.length; i++) {
            System.out.println(mostrarDirectivos[i]);
        }
    }
    public static void rellenarCampos(Cliente[] rellenarClientes){
        for (int i = 0; i < rellenarClientes.length; i++) {
            rellenarClientes[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarClientes[i].setEdad(Utilidades.numAleatorio(16,60));
            rellenarClientes[i].setTfnoContacto1(Utilidades.numAleatorio(986000000,986999999));
        }
    }
    public static void rellenarCampos(Directivo [] rellenarDirectivos){
        for (int i = 0; i < rellenarDirectivos.length; i++) {
            rellenarDirectivos[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarDirectivos[i].setEdad(Utilidades.numAleatorio(18,65));
            rellenarDirectivos[i].setSalarioBruto(Utilidades.numAleatorio((float) 35000.00,(float)50000.00));
            rellenarDirectivos[i].setCategoria(Utilidades.numAleatorio(1,10));
            rellenarDirectivos[i].setNumeroSubordinados(Utilidades.numAleatorio(1,10));
        }
        rellenarSubordinados(rellenarDirectivos);
    }
    public static void rellenarSubordinados(Directivo[] directivoss){
        String[] auxiliar= new String []
        for (int i = 0; i < directivoss.length; i++) {
            for (int j = 0; j < directivoss[i].getNumeroSubordinados(); j++) {

                //TODO rellenar estos campos de nombres con nombres de empleados sin repetirlos.
                // Pasar el vector de Empleados para poder sacar nombres de los Empleados que estén subordinados

                directivoss[i].nombresSubordinados[i];
            }
        }
    }
}