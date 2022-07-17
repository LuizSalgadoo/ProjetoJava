package main;
import java.sql.Connection;
import java.sql.SQLException;

public class TexteConexao {
    /**
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        CriaConexao criaConexao = new CriaConexao();
        Connection conexao = criaConexao.recuperarConexao();

        System.out.println("Conexão estabelecida com sucesso!");
        conexao.close();
    }
}
