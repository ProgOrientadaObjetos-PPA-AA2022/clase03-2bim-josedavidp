/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String codigo) {
        super(codigo);
    }

    public void establecerPromedioMatriculas(){
        for(int i = 0; i < lista.size(); i++){
            promedioMatriculas += lista.get(i).getMatricula();
        }
        promedioMatriculas = promedioMatriculas / lista.size();
    }

    public void establecerLista(ArrayList<Estudiante> listado){
        lista = listado;
    }

    public double obtenerPromedioMatriculas(){
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> obtenerLista(){
        return lista;
    }

    @Override
    public String toString() {
        String cadenaEst = "";
        for (int i = 0; i < lista.size(); i++) {
            cadenaEst = String.format("%s%s\n", cadenaEst, lista.get(i));
        }
        String cadena = String.format("%s\nLista de Estudiantes:\n%sPromedio de Sueldos: %.2f\n",
                super.toString(), cadenaEst, promedioMatriculas);
        return cadena;

    }
}
