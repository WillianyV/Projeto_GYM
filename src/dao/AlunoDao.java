/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class AlunoDao {
    private PreparedStatement statement;
    
    
    public Aluno cadastrar(Aluno aluno){
        //Precisa cadastrar primeiro o endereço
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_ALUNO);
            
//            insert into aluno (nome,cpf,data_nascimento,sexo,vencimento_mens,endereco_id)email,celular
            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getCpf());
            statement.setDate(3, aluno.getData_nascimento());
            statement.setString(4, aluno.getSexo());
            statement.setDate(5, aluno.getVencimento_mens());
            statement.setInt(6, SQLUtil.getLastIdTabela("endereco"));
            statement.setString(7, aluno.getRg());
            statement.setString(8, aluno.getEmail());
            statement.setString(9, aluno.getCelular());
            statement.execute();
            aluno.setId(SQLUtil.getLastIdTabela("aluno"));
            
            return aluno;
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar aluno!\n"+ex.getMessage());
        }
        return null;
    }
    public void editar(Aluno aluno){}
    public void excluir(Aluno aluno){}
    public Aluno getAlunoById(int id){return null;}
    public Aluno getAlunoByNome(String nome){return null;}
    public ArrayList<Aluno> getAll(){return null;}
}
