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

        rellenarCampos(misEmpleados);
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
                mostrarEmpleados(misEmpleados);
            }
            case 3->{
                mostrarDirectivos(misDirectivos);
            }
        }
    }

    private static void rellenarCampos(Empleado [] rellenarEmpleados){
        for (int i = 0; i < rellenarEmpleados.length; i++) {
            rellenarEmpleados[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarEmpleados[i].setEdad(Utilidades.numAleatorio(18,65));
            rellenarEmpleados[i].setSalarioBruto(Utilidades.numAleatorio((float) 10000.00,(float)35000.00));
        }
    }
    private static void rellenarCampos(Cliente[] rellenarClientes){
        for (int i = 0; i < rellenarClientes.length; i++) {
            rellenarClientes[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarClientes[i].setEdad(Utilidades.numAleatorio(16,60));
            rellenarClientes[i].setTfnoContacto1(Utilidades.numAleatorio(986000000,986999999));
        }
    }
    private static void rellenarCampos(Directivo [] rellenarDirectivos){
        for (int i = 0; i < rellenarDirectivos.length; i++) {
            rellenarDirectivos[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarDirectivos[i].setEdad(Utilidades.numAleatorio(18,65));
            rellenarDirectivos[i].setSalarioBruto(Utilidades.numAleatorio((float) 35000.00,(float)50000.00));
            rellenarDirectivos[i].setCategoria(Utilidades.numAleatorio(1,10));
            rellenarDirectivos[i].setNumeroSubordinados(Utilidades.numAleatorio(1,10));

        }
    }

    private static void mostrarClientes(Cliente [] mostrarClientes){
        for (int i = 0; i < mostrarClientes.length-1 ; i++) {
            System.out.println(mostrarClientes[i]);
        }
    }

    private static void mostrarEmpleados(Empleado[] mostrarEmpleados){
        for (int i = 0; i < mostrarEmpleados.length-1; i++) {
            System.out.println(mostrarEmpleados[i]);
        }
    }

    private static void mostrarDirectivos(Directivo[] mostrarDirectivos){
        for (int i = 0; i < mostrarDirectivos.length; i++) {
            System.out.println(mostrarDirectivos[i]);
        }
    }
}