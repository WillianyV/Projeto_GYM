/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.FichaDeTreinoDao;
import model.FichaDeTreino;

/**
 *
 * @author Elvis
 */
public class FichaDeTreinoBusiness {
    FichaDeTreinoDao dao;

    public FichaDeTreinoBusiness() {
        dao=new FichaDeTreinoDao();
    }
    
    public void Cadastrar(FichaDeTreino f){
        dao.cadastrar(f);
    }
    
    public void editar(FichaDeTreino f){
        dao.editar(f);
    }
    
    public void excluir(FichaDeTreino f){
        dao.excluir(f);
    }
    
    public FichaDeTreino getById(int i){
        return dao.getById(0);
    }
}
