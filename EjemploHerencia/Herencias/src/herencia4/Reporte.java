/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {
   protected String codigo;

      public Reporte(String c) {
        codigo = c;
   }

      public void establecerCodigo(String c){
          codigo = c;
      }

      public String obtenerCodigo(){
          return codigo;
      }

      public String toString(){
          return "Codigo: " + codigo;
      }
}
