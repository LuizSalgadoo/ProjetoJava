package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {
    public Connection recuperarConexao() throws SQLException {

        return DriverManager
        .getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "19082000aBc@");
    }
        
    }

