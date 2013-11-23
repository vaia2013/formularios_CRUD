package formularios;
import java.sql.*;
import javax.swing.*;
public class conexion {
    Connection miconexion;
    Statement atSentencias;
    ResultSet rsDatos;
    PreparedStatement psPrepararSentencias;
    public conexion() throws ClassNotFoundException,SQLException
    {        
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:Mysql://localhost/joomla";
        miconexion=DriverManager.getConnection(url,"root","");
        atSentencias=miconexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }
    catch(ClassCastException ex){throw ex;}
    catch(SQLException ex1){throw ex1;}
    }
    public ResultSet consulta(String sql)throws SQLException
    {
        try
        {
            rsDatos=atSentencias.executeQuery(sql);
        }
        catch(SQLException ex){throw ex;}
        return rsDatos;
    }

    ResultSet BUSCAR(String cons) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}