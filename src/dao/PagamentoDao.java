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
import model.Pagamento;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class PagamentoDao {
    private PreparedStatement statement;
    
    public void cadastrar(Pagamento p){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_PAGAMENTO);
            
            statement.setFloat(1, p.getValor());
            statement.setInt(2, p.getAluno().getId());
            statement.setInt(3, p.getFuncionario().getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Pagamento!");
        }
        
    }
    public void editar(Pagamento p){}
    public void excluir(Pagamento p){}
    public Pagamento getById(int id){return null;}
    public ArrayList<Pagamento> getAll(){return null;}
}
