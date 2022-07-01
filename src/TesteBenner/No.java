/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteBenner;

import java.util.HashSet;

/**
 *
 * @author Erisan
 */
public class No {

    private int numeroNo;
    private HashSet<Integer> conexao = new HashSet<Integer>();

    public int getNumeroNo(){
        return numeroNo;
    }

    public void setNumeroNo(int numeroNo) {
        this.numeroNo = numeroNo;
    }

    public void setConexao(int conexao) {
        this.conexao.add(conexao);
    }

    public HashSet<Integer> getConexao() {
        return conexao;
    }

}
