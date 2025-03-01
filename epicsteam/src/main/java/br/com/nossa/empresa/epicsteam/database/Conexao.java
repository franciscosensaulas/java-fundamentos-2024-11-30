package br.com.nossa.empresa.epicsteam.database;

import br.com.nossa.empresa.epicsteam.exceptions.ErroAberturaConexaoBancoDadosException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection abrirConexao() throws ErroAberturaConexaoBancoDadosException {
        try {
            var url = "jdbc:mysql://localhost:3306/steamdb";
            var usuario = "root";
            var senha = "admin";
            var conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (SQLException e) {
            // lançar uma exceção, ou seja, o código que estiver abaixo não será executado.
            // Essa exceção foi criada para sabermos que ocorreu um erro de abertura
            // de conexão com o banco de dados
            throw new ErroAberturaConexaoBancoDadosException();
        }
    }
}
