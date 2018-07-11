/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conta;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class ContaDao {
    private PreparedStatement statement;
    
    public void cadastrar(Conta c){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_CONTAS);
            
            statement.setString(1, c.getDescricao());
            statement.setString(2, c.getTipo());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar conta!");
        }
       
    }
    public void editar(Conta c){}
    public void excluir(Conta c){}
    public Conta getById(int id){return null;}
    public Conta getByData(Calendar c){return null;}
}
