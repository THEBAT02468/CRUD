package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Validacion {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;

    public Boolean Validar(String usuario, String password) throws SQLException {
        String sql;
        String usuarios;
        String passwords;
        sql = "SELECT `Id`, `documento`, `Nombres`, `telefono` FROM `cliente`";
        while (rs.next()) {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            usuarios = rs.getString("Nombres");
            passwords = rs.getString("documento");

            if (passwords.equals(password) && usuarios.equals(usuario)) {
                return true;
            } else {
                return false;
            }
        }
        return true;

    }

}
