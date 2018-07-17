/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ControleFinanceiroDao;
import java.util.ArrayList;
import model.ControleFinanceiro;

/**
 *
 * @author Elvis
 */
public class ControleFinaceiroBusiness {
    ControleFinanceiroDao dao = new ControleFinanceiroDao();
    
    public void cadastrar(ControleFinanceiro c){
        dao.cadastrar(c);
    }
    
    public void editar(ControleFinanceiro c){
        dao.cadastrar(c);
    }
        
     public void excluir(ControleFinanceiro c){
        dao.cadastrar(c);
    }
     
    public ControleFinanceiro getById(int id){
        return dao.getById(id);
    }
    
    public ArrayList<ControleFinanceiro> getAll(){
        return dao.getAll();
    }
}
