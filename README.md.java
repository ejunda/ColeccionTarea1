/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontarea1;

/**
 *
 * @author Erick Unda
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection listaComponentesMotor = new ArrayList<String>();
                //
        System.out.println("\t\t\t UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE LATACUNGA");
        System.out.println("\t\t\t\tDEPARTAMENTO DE ENERGÍA Y MECÁNICA");
        System.out.println("\t\t\t\t CARRERA DE INGENIERIA AUTOMOTRIZ");
        System.out.println("MATERIA:PROGRAMACIÓN");
        System.out.println("NRC:7450");
        System.out.println("DOCENTE:ING.LUIS GUERRA");
        System.out.println("NOMBRE:ERICK UNDA");
        //
    listaComponentesMotor.add("Motor de 12 voltios");
    listaComponentesMotor.add("\nTransformador");
    listaComponentesMotor.add("\nProtoboar");
    listaComponentesMotor.add("\nResistencia1 1ohm");
    listaComponentesMotor.add("\nResistencia2 1Kohm");
    listaComponentesMotor.add("\nTransistores");
    listaComponentesMotor.add("\nCapacitores");
    listaComponentesMotor.add("\nCables banana y lagarto");
    listaComponentesMotor.add("\nLed1 rojo");
    listaComponentesMotor.add("\nLed2 verde");
    listaComponentesMotor.add("\nDiodo zenner");
    listaComponentesMotor.add("\nDiodo NPN");
    listaComponentesMotor.add("\nDiodo PNP");
    listaComponentesMotor.add("\nOperacional 741");
    //
    System.out.println("Número de componetes de la simulación del motor antes de ser eliminados: " +listaComponentesMotor.size());
    System.out.println("LOS COMPONENTES SON: ");
    System.out.println(listaComponentesMotor.toString());
    listaComponentesMotor.remove("\nTransistores");
    listaComponentesMotor.remove("\nDiodo PNP");
    listaComponentesMotor.remove("\nCapacitores");
    listaComponentesMotor.remove("\nCables banana y lagarto");
    System.out.println("Número de componentes de la simulación después de ser eliminados Transistor, Diodo PNP, Capacitor y Cables vanana  lagarto: "+listaComponentesMotor.size());
    System.out.println("LOS COMPONENTES UTILIZADOS PARA LA SIMULACIÓN QUE QUEDAN SON: ");
    System.out.println(listaComponentesMotor.toString());
    }

}
