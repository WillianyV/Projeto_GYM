/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Composicao_corporal;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class Composicao_corporalDao {
    private PreparedStatement statement;
    
    public void cadastrar(Composicao_corporal c){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_COMPOSICAO_CORPORAL);
            
            statement.setFloat(1, c.getPeso_gorda());
            statement.setFloat(2, c.getPeso_magra());
            statement.setFloat(3, c.getImc());
            statement.setFloat(4, c.getRcq());
            statement.setFloat(5, c.getPorcentual_gordura());
            statement.setFloat(6, c.getPressao_arterial());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Composição Corporal\n"+ex.getMessage());
        }
    }
    public void editar(Composicao_corporal c){}
    public void excluir(Composicao_corporal c){}
    public Composicao_corporal getById(int id){return null;}
}
