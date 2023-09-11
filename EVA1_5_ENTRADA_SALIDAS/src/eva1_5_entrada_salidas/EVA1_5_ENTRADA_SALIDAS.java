/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_entrada_salidas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_SALIDAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. DECLARAR VARIABLES
        String nombre;
        String apellidos;
        int semestre;
        Scanner escaner = new Scanner(System.in);
        //; fin de instrucción en Java
        //2. CAPTURA DE VARIABLES
        System.out.println("Captura nombre:");
        nombre = escaner.nextLine();
        System.out.println("Captura tus apellidos");
        apellidos = escaner.nextLine(); 
        System.out.println("Captura tu semestre");
        semestre = escaner.nextInt();
        //Java es sensible a máyusculas y minúsculas
        //es decir: es diferente System que system
        //3. MOSTRAR LOS DATOS CAPTURADOS
        System.out.println("nombre");
        System.out.println("apellidos");
        System.out.println("semestre");
    }
    
}
