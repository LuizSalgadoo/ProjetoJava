package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {
        CriaConexao criaConexao = new CriaConexao();
        Connection conexao = criaConexao.recuperarConexao();

        PreparedStatement stm = conexao.prepareStatement("INSERT INTO produto (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);

        adicionarVariavel("Smartv", "45 polegadas", stm); 
        adicionarVariavel("Radio", "FM", stm); 
        }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();

        ResultSet rst = stm.getGeneratedKeys();
        while(rst.next()) {
            Integer id = rst.getInt(1);
            System.out.println("o id criado foi " + id);
        }
        rst.close();
    }
}
