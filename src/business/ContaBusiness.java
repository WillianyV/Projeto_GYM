/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ContaDao;
import java.util.ArrayList;
import java.util.Calendar;
import model.Conta;

/**
 *
 * @author Elvis
 */
public class ContaBusiness {
    ContaDao dao;

    public ContaBusiness() {
        dao = new ContaDao();
    }
    
    public void cadastrar(Conta c){
        dao.cadastrar(c);
    }
    
    public void editar(Conta c){
        dao.cadastrar(c);
    }
    
    public void excluir(Conta c){
        dao.cadastrar(c);
    }
    
    public Conta getById(int id){
        return dao.getById(id);
    }
    
    public Conta getByNome(String nome){
        return dao.getByNome(nome);
    }
    
    public Conta getByData(Calendar c){
        return dao.getByData(c);
    }
    
    public ArrayList<String> getAllNomeContas(){      
        return dao.getAllNomeContas();
    }
}
