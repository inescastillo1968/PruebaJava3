/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**************************************
 nombre marjorie castillo
 fecha 10-11-17
 clase prueba java 3
 responsabilidad aplicacion de escritorio
 * @author LAB10
 */
public class claseBD 
{
 
    private static Connection conex;//Objeto tipo Connection
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/claseBD";
    
    
    {
        conex = null;//Inicializar la variable 
        
        //Metodo para manejar excepciones
        try
        {
            Class.forName(DRIVER);
            conex = DriverManager.getConnection(URL, USER, PASS);
            if (conex != null) 
            {
             System.out.println("Conexion Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
         System.out.println("Error en la Conexion");
        }
    }
    
    //PASO 13 - DEFINICION METODOS PARA CONECTAR Y DESCONECTAR
    public Connection conectar()
    {
        return conex;//Retorna el objeto conex  
    }
    
    public void desconectar()
    {
      conex=null;
        if (conex==null) 
        {
          System.out.println("Conexion Finalizada");
        }
    }
}
 


