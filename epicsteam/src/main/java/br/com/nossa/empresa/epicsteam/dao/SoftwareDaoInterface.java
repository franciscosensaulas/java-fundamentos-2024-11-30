package br.com.nossa.empresa.epicsteam.dao;

import br.com.nossa.empresa.epicsteam.bean.SoftwareBean;
import java.util.ArrayList;
import java.util.OptionalInt;

public interface SoftwareDaoInterface {
    void cadastrar(SoftwareBean software);
    void apagar(int id);
    void editar(SoftwareBean software);
    ArrayList<SoftwareBean> obterTodos(
        String pesquisa, 
        OptionalInt categoriaId,
        String colunaOrdenacao,
        String colunaOrdem,
        int quantidade,
        int pagina
    );
    SoftwareBean obterPorId(int id);
}