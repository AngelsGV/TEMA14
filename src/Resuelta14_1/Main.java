package Resuelta14_1;

import java.sql.*;

public class Main {
    public static void main(String[]args){
        Connection con;
        Statement sentencia;
        String sql;
        String url ="jdbc:mysql://localhost/Instituto";
        try {
            con = DriverManager.getConnection(url,"Pepe","12345");
            sentencia = con.createStatement();
            sql= "UPDATE Alumnos SET media=media+1 " +
                    "WHERE curso = '1B'";
            sentencia.executeUpdate(sql);
            con.close();
            System.out.println("Se ha modificado la nota media.");
        }catch (SQLException ex){
            System.out.println("Ha ocurrido algún error."+ex);

        }
    }
}
