/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Metas_ideais;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class Metas_ideaisDao {
    private PreparedStatement statement;
    
    public void cadastrar(Metas_ideais m){
        try {
            //        (peso,imc,nivel,porcentual_gordura)
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_METAS_IDEAIS);
            statement.setFloat(1, m.getPeso());
            statement.setFloat(2, m.getImc());
            statement.setString(3, m.getNivel());
            statement.setFloat(4, m.getPorcentual_gordura());
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar metas ideais!\n"+ex.getMessage());
        }
        
    }
    public void editar(Metas_ideais m){}
    public void excluir(Metas_ideais m){}
    public Metas_ideais getById(int id){return null;}
}
