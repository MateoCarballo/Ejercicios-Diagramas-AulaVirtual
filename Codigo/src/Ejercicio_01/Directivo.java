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

    public void mostrarDirectivos(Directivo[] mostrarDirectivos){
        for (int i = 0; i < mostrarDirectivos.length; i++) {
            System.out.println(mostrarDirectivos[i]);
        }
    }

    public void rellenarCampos(Directivo [] rellenarDirectivos){
        for (int i = 0; i < rellenarDirectivos.length; i++) {
            rellenarDirectivos[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarDirectivos[i].setEdad(Utilidades.numAleatorio(18,65));
            rellenarDirectivos[i].setSalarioBruto(Utilidades.numAleatorio((float) 35000.00,(float)50000.00));
            rellenarDirectivos[i].setCategoria(Utilidades.numAleatorio(1,10));
            rellenarDirectivos[i].setNumeroSubordinados(Utilidades.numAleatorio(1,10));
        }
        rellenarSubordinados(rellenarDirectivos);
    }

    private void rellenarSubordinados(Directivo[] rellenarSubordinados){
        for (int i = 0; i < rellenarSubordinados.length; i++) {
            for (int j = 0; j < rellenarSubordinados[i].numeroSubordinados; j++) {
                //TODO rellenar estos campos de nombres con nombres de empleados sin repetirlos.Pasar el vector de Empleados para poder sacar nombres de los Empleados que estén subordinados
                rellenarSubordinados[i].nombresSubordinados[i]=;
            }
        }
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
