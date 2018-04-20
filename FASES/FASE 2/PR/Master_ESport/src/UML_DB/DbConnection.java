/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML_DB;

/**
 *
 * @author 1GDAW03
 */

import java.sql.*;

public class DbConnection {
    
    //Parametros de conexion
    private String login = "eqdam03";
    private String password = "eqdam03";
    private String url = "jdbc:oracle:thin:@SrvOracle:1521:orcl";
    
    private Connection connection;
    
    public DbConnection() throws Exception
    {
         //obtenemos el driver para oracle
         Class.forName("oracle.jdbc.OracleDriver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection==null){
            throw new Exception("Problemas con la conexión");
         }
   }
    
    public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}
