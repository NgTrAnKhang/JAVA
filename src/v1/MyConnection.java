/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v1;
import java.sql.*;

/**
 *
 * @author Khang
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dajv","root","root");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
