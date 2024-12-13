/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.herencia;

import ec.edu.espoch.herencia.Clase.Coordinador;
import ec.edu.espoch.herencia.Clase.Estudiante;
import ec.edu.espoch.herencia.Clase.Profesor;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Herencia {
    
    public static void main(String[] args) {
        Estudiante objEstudiante =new  Estudiante("5648 ", "Marjorie", "Chimbo", "2250160229", "Femenino", 20 );
        System.out.println(objEstudiante.toString());
  
  

    
    Profesor objProfesor =new Profesor("001", "IND: Sordware", "Pedro", "Aguilar", "2257941635", "Masculino", 30 );
              System.out.println(objProfesor.toString());
        
        
      Coordinador objCoordinador =new Coordinador ("005", "IND: Sordware", "Coordinador" ,"Pedro", "Aguilar", "2257941635", "Masculino", 31 );
               System.out.println(objCoordinador.toString());
      
    }
}