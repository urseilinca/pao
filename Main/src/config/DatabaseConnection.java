/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Ilinca
 */
public class DatabaseConnection {
     private static Connection connection;

    private DatabaseConnection () {

    }
    

    public static Connection getInstance() throws SQLException {
        if(connection == null) {
                String url = "jdbc:mysql://localhost:3306/cabinetmedical";
                String username = "root";
                String password = "";
                connection = DriverManager.getConnection(url, username, password);
                //Statement st=connection.createStatement();
                //ResultSet rs=st.executeQuery("select * from clients");
                
                //while (rs.next())
                //{
                //    System.out.println(rs.getString("id")+","+rs.getString("nume"));
                //}
        }
        return connection;
    }
}
