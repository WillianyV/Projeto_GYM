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
//            valor,descricao,data,dataVenc,formaPag,aluno_id,funcionario_id
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_PAGAMENTO);
            
            statement.setFloat(1, p.getValor());
            statement.setString(2, p.getDescricao());
            statement.setDate(3, p.getData());
            statement.setDate(4, p.getDataVenc());
            statement.setString(5, p.getFormaPag());
            statement.setInt(6, p.getAluno().getId());
            statement.setInt(7, p.getFuncionario().getId());
            
            statement.execute();
        } catch (Exception ex) {
            
        }
        
    }
    public void editar(Pagamento p){}
    public void excluir(Pagamento p){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_PAGAMENTO);
            statement.setInt(1, p.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Pagamento getById(int id){return null;}
    public ArrayList<Pagamento> getAll(){return null;}
}
