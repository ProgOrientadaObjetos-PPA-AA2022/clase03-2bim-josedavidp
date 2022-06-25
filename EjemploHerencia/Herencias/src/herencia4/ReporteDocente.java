/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String codigo) {
        super(codigo);
    }

    public void establecerPromedioSueldos(){
        for(int i = 0; i < lista.size(); i++){
            promedioSueldos += lista.get(i).getSueldo();
        }
        promedioSueldos = promedioSueldos / lista.size();
    }

    public void establecerLista(ArrayList<Docente> listado){
        lista = listado;
    }

    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }

    public ArrayList<Docente> obtenerLista(){
        return lista;
    }

    @Override
    public String toString() {
        String cadenaDoc = "";
        for (int i = 0; i < lista.size(); i++) {
            cadenaDoc = String.format("%s%s\n", cadenaDoc, lista.get(i));
        }
        String cadena = String.format("%s\nLista de Docentes:\n%sPromedio de Sueldos: %.2f\n",
                super.toString(), cadenaDoc, promedioSueldos);
        return cadena;

    }
}
