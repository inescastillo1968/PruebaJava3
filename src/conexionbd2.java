/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd2;
import javax.swing.*;
import java.awt.*;//paso 14-importar la clase conexion
import bd2.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;
/**********************************
 * nombre marjorie castillo
 fecha 10-11-17
 clase prueba java 3
 responsabilidad aplicacion de escritorio
 * @author LAB10
 */
public class conexionbd2 
{
 JPanel panel;
 JLabel label;
 JTextField text;
 JTextField text2;
 JButton boton;
  JButton boton2;
  public conexionbd2()
  ConexionBD con;
 
 {
  panel = new JPanel();
label = new JLabel();
text = new JTextField(20);
text = new JTextField();
boton = new JButton();
boton2 = new JButton();

this.add(panel);
panel.add(label);
panel.add(text);
panel.add(text2);
panel.add(boton);
panel.add(boton2);



label.setText("Base de Datos");
label.setText("Tercera Evaluacion Sumativa");
boton.setText("Conectar");
boton2.setText("Desconectar");
panel.setBackground(Color.CYAN);
//paso-16-agregamos escuchadores al boton
boton.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent evt)
 {
  con = new ConexionBD();
  Connection reg = con.conectar();
 }  
});
boton2.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent evt)
 {
  con.desconectar(); 
  
 }  
});


 }
}

    
}  
}


