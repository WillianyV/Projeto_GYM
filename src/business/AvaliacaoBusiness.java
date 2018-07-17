/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.AvaliacaoDao;
import model.Avaliacao;



/**
 *
 * @author Elvis
 */
public class AvaliacaoBusiness {
    private AvaliacaoDao dao;

    public AvaliacaoBusiness() {
        this.dao = new AvaliacaoDao();
    }
    
    public void cadastrar(Avaliacao a){
        dao.cadastrar(a);
    }
    
    public void editar(Avaliacao a){
        dao.editar(a);
    }
    
    public void excluir(Avaliacao a){
        dao.excluir(a);
    }
    
    public Avaliacao getById(int id){
        return dao.getById(id);
    }
    
    
}
