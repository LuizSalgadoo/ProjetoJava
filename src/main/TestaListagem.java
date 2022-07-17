package main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {
        CriaConexao criaConexao = new CriaConexao();
        Connection conexao = criaConexao.recuperarConexao();


        Statement stm = conexao.createStatement();
        stm.execute("SELECT * FROM produto");

        ResultSet rst = stm.getResultSet();

        while (rst.next()) {
            System.out.println(rst.getInt("id"));
            System.out.println(rst.getString("nome"));
            System.out.println(rst.getString("descricao"));
        }

        conexao.close();
    }
}
