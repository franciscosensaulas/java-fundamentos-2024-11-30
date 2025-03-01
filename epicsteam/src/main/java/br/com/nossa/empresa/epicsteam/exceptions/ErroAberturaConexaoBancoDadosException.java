/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.nossa.empresa.epicsteam.exceptions;

/**
 *
 * @author francisco.sens
 */
public class ErroAberturaConexaoBancoDadosException extends Exception {
    public ErroAberturaConexaoBancoDadosException(){
        super("Ocorreu um erro ao tentar abrir a conexão com o banco de dados");
    }
}
