/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ParcelasDao;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Parcelas;

/**
 *
 * @author Elvis
 */
public class ParcelasBusiness {
    private ParcelasDao dao;
    
    public ParcelasBusiness(){
        dao = new ParcelasDao();
    }

    
    public void cadastrar(Parcelas p){
        if(dao.verificarParcela(p)){
            dao.cadastrar(p);
        }
    }
    public void editar(Parcelas p){
        dao.editar(p);
    }
    public Parcelas getById(int id){
        return dao.getById(id);
    }
    public ArrayList<Parcelas> getAll(){
        return dao.getAll();
    }
    
}
