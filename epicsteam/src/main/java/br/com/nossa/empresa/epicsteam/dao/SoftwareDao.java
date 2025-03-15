package br.com.nossa.empresa.epicsteam.dao;

import br.com.nossa.empresa.epicsteam.bean.CategoriaBean;
import br.com.nossa.empresa.epicsteam.bean.JogoBean;
import br.com.nossa.empresa.epicsteam.bean.SoftwareBean;
import br.com.nossa.empresa.epicsteam.database.Conexao;
import br.com.nossa.empresa.epicsteam.exceptions.ErroAberturaConexaoBancoDadosException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.OptionalInt;
import javax.swing.JOptionPane;

public class SoftwareDao implements SoftwareDaoInterface {

    private Conexao conexao;

    // Construtor tem como objetivo definir, construir tudo que 
    // for necessário para o correto funcionamento da classe
    public SoftwareDao() {
        conexao = new Conexao();
    }

    @Override
    public void cadastrar(SoftwareBean software) {
        try (var connection = conexao.abrirConexao()) {
            var comando = """
            INSERT INTO softwares (nome, url, id_categoria) VALUES (?, ?, ?)
                          """;
            try (var preparadorStatement = connection.prepareStatement(comando)) {
                preparadorStatement.setString(1, software.getNome());
                preparadorStatement.setString(2, software.getUrl());
                preparadorStatement.setInt(3, software.getCategoria().getId());
                preparadorStatement.execute();
            }
        } catch (ErroAberturaConexaoBancoDadosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro");
            e.printStackTrace();
        }
    }

    @Override
    public void apagar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editar(SoftwareBean software) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SoftwareBean> obterTodos(
            String pesquisa,
            OptionalInt categoriaId,
            String colunaOrdenacao,
            String colunaOrdem,
            int quantidade,
            int pagina) {
        var softwares = new ArrayList<SoftwareBean>();
        try (var connection = conexao.abrirConexao()) {
            var comando = """
                          SELECT 
                              s.id,
                              s.nome,
                              s.url,
                              s.id_categoria,
                              categorias.nome AS 'categoria'
                              FROM softwares AS s
                              INNER JOIN categorias ON (s.id_categoria = categorias.id)
                              WHERE s.nome LIKE ?
                          """;
            if (categoriaId.isEmpty() == false) {
                comando += " AND s.id_categoria = ?";
            }

            String ordenacao;
            if (colunaOrdenacao.equalsIgnoreCase("nome")) {
                ordenacao = "s.nome";
            } else if (colunaOrdenacao.equalsIgnoreCase("categoria")) {
                ordenacao = "categorias.nome";
            } else {
                ordenacao = "s.id";
            }

            String ordem;
            if (colunaOrdem.equalsIgnoreCase("ascendente")) {
                ordem = "ASC";
            } else {
                ordem = "DESC";
            }

            comando += "\nORDER BY " + ordenacao + " " + ordem + "\nLIMIT ?, ?";

            try (var preparadorStatement = connection.prepareStatement(comando)) {
                var indiceInterrogacao = 1;
                preparadorStatement.setString(indiceInterrogacao++, "%" + pesquisa + "%");

                if (categoriaId.isEmpty() == false) {
                    preparadorStatement.setInt(indiceInterrogacao++, categoriaId.getAsInt());
                }

                preparadorStatement.setInt(indiceInterrogacao++, pagina * quantidade);
                preparadorStatement.setInt(indiceInterrogacao++, quantidade);

                preparadorStatement.execute();
                var resultSet = preparadorStatement.getResultSet();
                while (resultSet.next()) {
                    var software = new SoftwareBean();
                    software.setId(resultSet.getInt("id"));
                    software.setNome(resultSet.getString("nome"));
                    software.setUrl(resultSet.getString("url"));

                    var categoria = new CategoriaBean();
                    categoria.setId(resultSet.getInt("id_categoria"));
                    categoria.setNome(resultSet.getString("categoria"));
                    software.setCategoria(categoria);
                    softwares.add(software);
                }
            }
        } catch (ErroAberturaConexaoBancoDadosException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro");
            e.printStackTrace();
        }
        return softwares;
    }

    @Override
    public SoftwareBean obterPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // fazer a comunicação com o bd fazendo o CRUD
    // CRUD -> Create, Read, Update, Delete
}
