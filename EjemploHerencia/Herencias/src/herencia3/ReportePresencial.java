/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePresencial extends Reporte{
    
    private ArrayList<EstudiantePresencial> lista;
    private double totalMatriculaPresencial;
    private double promedioGeneral;
    
    public ReportePresencial(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudiantePresencial> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasPresencial(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaPresencial = totalMatriculaPresencial + 
                    lista.get(i).obtenerMatriculaPresencial();
        }
    }
    
    public void establecerPromedioGeneral(){
        
        for (int i = 0; i < lista.size(); i++) {
            promedioGeneral = promedioGeneral + 
                    lista.get(i).obtenerPromedio();
        }
        promedioGeneral = promedioGeneral / lista.size();
    }
    
    public ArrayList<EstudiantePresencial> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaPresencial;
    }
    
    public double obtenerPromedioGeneral(){
        return promedioGeneral;
    }
    
    @Override
    public String toString(){
        
        String cadenaEst = "";
        for (int i = 0; i < lista.size(); i++) {
            cadenaEst = String.format("%s%s\n", cadenaEst, lista.get(i));
        }

        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\n"
                + "Lista Estudiantes:\n\n%s\n"
                + "El total de matriculas es: %.2f\n"
                + "Promedio General: %.4f\n",
                nombre,
                carrera,
                ciclo,
                cadenaEst,
                obtenerTotalMatriculasDistancia(),
                obtenerPromedioGeneral());
        return cadena;

    }
    
}
