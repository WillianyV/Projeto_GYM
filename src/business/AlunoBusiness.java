/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.AlunoDao;
import java.util.ArrayList;
import model.Aluno;



/**
 *
 * @author Elvis
 */
public class AlunoBusiness {
    private AlunoDao dao;
    
    public AlunoBusiness(){
        this.dao=new AlunoDao();
    }
    
    public Aluno cadastrar(Aluno aluno){
        return dao.cadastrar(aluno);
    }
    
    public void editar(Aluno aluno){
        dao.editar(aluno);
    }
    
    public void excluir(Aluno aluno){
        dao.excluir(aluno);
    }
    
    public Aluno getById(int id){
        return dao.getAlunoById(id);
    }
    
    public Aluno getByNome(String nome){
        return dao.getAlunoByNome(nome);
    }
    
    public ArrayList<Aluno> getall(){
        return dao.getAll();
    }
    
}
