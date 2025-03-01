package br.com.nossa.empresa.epicsteam.dao;

import br.com.nossa.empresa.epicsteam.bean.CategoriaBean;
import br.com.nossa.empresa.epicsteam.database.Conexao;
import br.com.nossa.empresa.epicsteam.exceptions.ErroAberturaConexaoBancoDadosException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategoriaDao {

    // DAO => Data Access Object (responsável por comunicar com o banco de dados, 
    // para consutlar dados, cadastrar, editar e apagar
    public void cadastrar(String nome) {
        // Statement é utilizado quando não é necessário substituir ?
        // PreparedStatement é utilizado quando é necessário substituir ? para evitar SQLInjection

        Connection conexao = null;
        PreparedStatement preparadorQuery = null;
        try {
            conexao = new Conexao().abrirConexao();
            var query = "INSERT INTO categorias (nome) VALUES (?)";
            // Cria o preparador de comandos SQL, que nos permitirá substuir a ?
            preparadorQuery = conexao.prepareStatement(query);
            // Substituir a interrogação por o valor
            preparadorQuery.setString(1, nome);
            // Executar o insert com ? substituído pelo valor
            preparadorQuery.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar a categoria");
            e.printStackTrace();
        } catch (ErroAberturaConexaoBancoDadosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                // Finally é um trecho de código que será executado caso executar com suceso ou erro
                // Verificando que o statement está instanciado
                if (preparadorQuery != null) // Fechar o statement
                {
                    preparadorQuery.close();
                }
                // Verificando que a conexão está instanciada
                if (conexao != null) {
                    conexao.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Não foi possível fechar a conexão do banco de dados");

            }
        }

    }

    public void apagar(int id) {
        try {
            var conexao = new Conexao().abrirConexao();
            var query = "DELETE FROM categorias WHERE id = ?";
            var preparadorQuery = conexao.prepareStatement(query);
            preparadorQuery.setInt(1, id);
            preparadorQuery.execute();
        } catch (ErroAberturaConexaoBancoDadosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível apagar a categoria");
            e.printStackTrace();
        }
    }

    public void editar(int id, String nome) {
        try {
            var conexao = new Conexao().abrirConexao();
            var query = "UPDATE categorias SET nome = ? WHERE id = ?";
            var preparadorQuery = conexao.prepareStatement(query);
            preparadorQuery.setString(1, nome);
            preparadorQuery.setInt(2, id);
            preparadorQuery.execute();
        } catch (ErroAberturaConexaoBancoDadosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar a categoria");
            e.printStackTrace();
        }
    }

    public ArrayList<CategoriaBean> obterTodas() {
        // Método responsável por consultar no banco de dados as categorias criadas
        var categorias = new ArrayList<CategoriaBean>();

        try {
            // Abre a conexão com banco de dados
            var connection = new Conexao().abrirConexao();
            // Statement permite executar query no banco de dados
            var statement = connection.createStatement();
            // query pode ser SELECT, INSERT, UPDATE, DELETE, CREATE
            var query = "SELECT id, nome FROM categorias";
            // Executa a consulta na tabela de categorias
            statement.execute(query);
            // Obter a lista dos registros das categorias
            var resultSet = statement.getResultSet();
            // Percorre cada um dos registros das categorias
            while (resultSet.next()) {
                // Obtém o valor da coluna que foi passado no SELECT
                var id = Integer.parseInt(resultSet.getString("id"));
                var nome = resultSet.getString("nome");
                
                var categoriaBean = new CategoriaBean();
                categoriaBean.setId(id);
                categoriaBean.setNome(nome);
                
                categorias.add(categoriaBean);
            }
        } catch (ErroAberturaConexaoBancoDadosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar no banco de dados");
            e.printStackTrace();
        }

        return categorias;
    }
}
