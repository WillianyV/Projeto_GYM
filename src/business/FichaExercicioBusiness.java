/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.FichaExercicioDao;
import model.FichaDeTreino;
import model.FichaExercicio;

/**
 *
 * @author Elvis
 */
public class FichaExercicioBusiness {
    FichaExercicioDao dao;

    public FichaExercicioBusiness() {
        dao = new FichaExercicioDao();
    }
    
    public void cadastrar(FichaExercicio f){
        dao.cadastrar(f);
    }
    
    public void editar(FichaExercicio f){
        dao.editar(f);
    }
    
    public void excluir(FichaExercicio f){
        dao.excluir(f);
    }
    
    public FichaExercicio excluir(int id){
        return dao.getById(id);
    }
    
    
}
