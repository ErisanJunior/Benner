/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteBenner;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erisan
 */
public class TesteBenner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Network netWork;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de elementos da Lista de Nó");
        int quantidade = sc.nextInt();
        netWork = new Network(quantidade);
        boolean continuar = true;
        do {
            System.out.println("Informe o primeiro Nó que voce deseja conectar");
            int noSelecionado = sc.nextInt() - 1;
            System.out.println("Informe o segundo Nó que voce deseja conectar");
            int noSelecionado2 = sc.nextInt() - 1;
            netWork.connect(noSelecionado, noSelecionado2);
            System.out.println("Voce Deseja sair? Se sim, digite S se não N");
            String escolha = sc.next();
            if (escolha.equals(escolha)) {
                continuar = false;
            }
        } while (continuar);
        continuar = true;
        do {
            System.out.println("Informe o primeiro Nó que voce deseja conectar");
            int noConexao = sc.nextInt() - 1;
            System.out.println("Informe o segundo Nó que voce deseja conectar");
            int noConexao2 = sc.nextInt() - 1;
            netWork.connect(noConexao, noConexao2);
            try {
                System.out.println(netWork.query(noConexao, noConexao2) ? "Os nós selecionados tem vinculado" : "Não há vinculo entre os Nós");
            } catch (Exception ex) {
                Logger.getLogger(TesteBenner.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (continuar);
    }

}
