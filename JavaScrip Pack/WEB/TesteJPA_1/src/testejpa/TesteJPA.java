/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testejpa;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TesteJPA {
    
  static EntityManagerFactory emf =
          Persistence.createEntityManagerFactory("TesteJPAPU");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Produto p= new Produto(emf);
       p.criarNovoProduto();
       String listaOpcoes = "1 - Cadastrar Novo Produto\n";
       listaOpcoes += "2 - Listar Todos os Produtos\n";
       listaOpcoes += "9 - Encerrar\n";
       Produto p = new Produto(emf);
       
       
       while (1==1){
           opcao = Integer.parseInt(JOptionPane.showInputDialog(listaOpcoes));
           switch (opcao){
               case 1:
                   p.criarNovoProduto();
                   break;
                   
               case 2:
                   p.listaTudo();
                   break;  
                   
               case 9:
                   p.criarNovoProduto();
                   return;    
                   
                   
                   
           }
       }
    }
}
