/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FichaDeTreino;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class FichaDeTreinoDao {
    private PreparedStatement statement;
    
    public void cadastrar(FichaDeTreino f){
        try {
            //        ficha_de_treino (instrutor_id,aluno_id)
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_FICHA_DE_TREINO);
            statement.setInt(1, f.getInstrutor().getId());
            statement.setInt(2, f.getAluno().getId());
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Ficha de Treino");
        }
        
       
    
    }
    public void editar(FichaDeTreino f){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_FICHA_DE_TREINO);
            statement.setInt(1, f.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void excluir(FichaDeTreino f){}
    public FichaDeTreino getById(int id){return null;}
}
