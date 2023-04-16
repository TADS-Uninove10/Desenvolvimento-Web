package testejpa;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import testejpa.persistencia.ProdutoJpaController;

public class Produto {
 
    private ProdutoJpaController prodJC = null;
    private testejpa.persistencia.Produto p = null;
    
    
public Produto(EntityManagerFactory emf) {
    prodJC = new ProdutoJpaController(emf);
}
    
public void  criarNovoProduto(){
    
   p= new testejpa.persistencia.Produto();
   
   String nome = JOptionPane.showInputDialog(null,"mensagem");
           
   p.setNome(nome);
   
   try{
       prodJC.create(p);
       JOptionPane.showMessageDialog(null, p.getNome() + " foi gravado");
   
   }
   catch(Exception e){
       
       JOptionPane.showMessageDialog(null,e.getMessage());
   }
       
   }

    
    
    
public String listaTudo(){ 
    String listaParaMensagem = null;
    
    List<testejpa.persistencia.Produto> listaP =prodJC.findProdutoEntities();
    
    if(listaP==null)
        JOptionPane.showMessageDialog(null, "Não há prudutos no banco");
    
    else{
        
        listaParaMensagem = "Dados lidos do banco:\n\n";
        
        Iterator i = listaP.iterator();
        
        while(i.hasNext()){
            
            p= new testejpa.persistencia.Produto();
            p=(testejpa.persistencia.Produto)i.next();
            
            listaParaMensagem+= p.getId() +" - "+ p.getNome() + "\n";
        }
         JOptionPane.showMessageDialog(null,listaParaMensagem);
         
         return listaParaMensagem;
    }
    }

}