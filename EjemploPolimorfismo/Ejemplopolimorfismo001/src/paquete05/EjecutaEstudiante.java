package paquete05;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        do {
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");

            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            if (tipoEstudiante != 1 && tipoEstudiante != 2) {
                System.out.println("Ingrese un número válido");
                break;
            }
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            
            if (tipoEstudiante == 1) {

                EstudiantePresencial estP = new EstudiantePresencial();

                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();

                estP.establecerNombresEstudiante(nombresEst);
                estP.establecerApellidoEstudiante(apellidosEst);
                estP.establecerIdentificacionEstudiante(identificacionEst);
                estP.establecerEdadEstudiante(edadEst);
                estP.establecerNumeroCreditos(numeroCreds);
                estP.establecerCostoCredito(costoCred);


                estudiantes.add(estP);

            } else {

                EstudianteDistancia estD = new EstudianteDistancia();

                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();

                estD.establecerNombresEstudiante(nombresEst);
                estD.establecerApellidoEstudiante(apellidosEst);
                estD.establecerIdentificacionEstudiante(identificacionEst);
                estD.establecerEdadEstudiante(edadEst);
                estD.establecerNumeroAsginaturas(numeroAsigs);
                estD.establecerCostoAsignatura(costoAsig);

                estudiantes.add(estD);

            }

            entrada.nextLine();
            System.out.println("Si desea ingresar más estudiantes, tipee la "
                    + "letra S para continuar el proceso o tipee la letra N "
                    + "para salir del proceso");

            continuar = entrada.nextLine();
        } while (continuar.equals("S"));

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
