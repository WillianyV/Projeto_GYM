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
import model.ControleFinanceiro;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class ControleFinanceiroDao {
    private PreparedStatement statement;
    
    public void cadastrar(ControleFinanceiro c){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_CONTROLE_FINANCEIRO);
            
//        insert into controle_financeiro (data,descricao,valor,contas_id)
            statement.setDate(1, c.getData());
            statement.setString(2, c.getDescricao());
            statement.setFloat(3, c.getValor());
            statement.setInt(4, c.getConta().getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Controle Financeiro!"+ex.getMessage());
        }
        
        
    }
    public void editar(ControleFinanceiro c){}
    public void excluir(ControleFinanceiro c){}
    public ControleFinanceiro getById(int id){return null;}
    public ArrayList<ControleFinanceiro> getAll(){return null;}
}
