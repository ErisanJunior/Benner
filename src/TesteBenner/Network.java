/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteBenner;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Erisan
 */
public class Network {

    private No[] nos;
    private int quntidadeNos;

    public Network(int qntNos) throws Exception {
        if (inteiroPositivo(qntNos, 0)) {
            this.nos = new No[qntNos];
            this.quntidadeNos = qntNos;
            for (int i = 0; i < quntidadeNos; i++) {
                this.nos[i] = new No();
            }

        }
    }

    //Metodo para criar conexao dos Nós
    public void connect(int noConexao1, int noConexao2) throws Exception {
        if (inteiroPositivo(noConexao1, noConexao2)) {
            if (noConexao1 <= quntidadeNos && noConexao2 <= quntidadeNos) {
                this.nos[noConexao1].setConexao(noConexao2);
                this.nos[noConexao2].setConexao(noConexao1);
            } else {
                System.out.println("Voce selecionou um nó invalido na lista de Nós");
            }

        }
    }
    
    //metodo de busca de conexão, com validacaoes;
    public boolean query(int noQuery1, int noQuery2) throws Exception {
        inteiroPositivo(noQuery1, noQuery2);
        if (nos[noQuery1].getConexao().isEmpty()) {
            throw new Exception("O nó de origem não tem conexão");
        }
        if (nos[noQuery1].getConexao().equals(noQuery2)) {
            //Conexao Direta 
            return true;
        }
        HashSet<Integer> visitados = new HashSet<Integer>();
        visitados.add(noQuery1);
        return buscaIndireta(noQuery1, noQuery2, visitados);

    }

    //Metodo recursivo para buscar conexao indiretas, com validacao baseada em HashSet, para evitar loop-infinto.
    private boolean buscaIndireta(int noQuery1, int noQuery2, HashSet<Integer> visitados) {
        for (int no : nos[noQuery1].getConexao()) {
            if (visitados.contains(no)) {
                continue;
            } else {
                visitados.add(no);
                if (no == noQuery2) {
                    return true;
                } else {
                    return buscaIndireta(no, noQuery2, visitados);

                }
            }
        }
        return false;
    }

    //metodo de validação de Inteiro Positivo
    private boolean inteiroPositivo(int numero1, int numero2) throws Exception {
        if (numero1 < 0 || numero2 < 0) {
            throw new Exception("Numero invalido");
        }
        return true;
    }

}
