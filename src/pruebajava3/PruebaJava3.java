/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import pruebajava3.PruebaJava3;
import javax.swing.JFrame;



/********************************
 *nombre marjorie castillo
 fecha 10-11-17
 clase prueba java 3
 responsabilidad aplicacion de escritorio
 * @author LAB10
 */
public class PruebaJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        pruebajava3 ventana= new pruebajava3();
         ventana.setVisible(true);
         
        ventana .setBounds(0, 0, 400, 400);
        
        //la siguiente inst. le pone el titulo a la ventana
          ventana.setTitle("Tercera Evaluacion Sumativa");
          ventana .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
              
    
                
                    
                } 
}
