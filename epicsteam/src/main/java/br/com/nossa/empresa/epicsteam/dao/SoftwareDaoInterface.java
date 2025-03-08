package br.com.nossa.empresa.epicsteam.dao;

import br.com.nossa.empresa.epicsteam.bean.SoftwareBean;
import java.util.ArrayList;

interface SoftwareDaoInterface {
    void cadastrar(SoftwareBean software);
    void apagar(int id);
    void editar(SoftwareBean software);
    ArrayList<SoftwareBean> obterTodos(String pesquisa);
    SoftwareBean obterPorId(int id);
}