/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Endereco;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class EnderecoDao {
   private PreparedStatement statement;
    
   public void cadastrar(Endereco e){
       try {
           statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_ENDERECO);

            statement.setString(1, e.getBairro());
            statement.setString(2, e.getUf());
            statement.setString(3, e.getCidade());
            statement.setString(4, e.getCep());
            statement.setString(5, e.getLogradouro());
            statement.setInt(6, e.getNum());
            
            statement.execute();
       } catch (Exception ex) {
           Mensagem.exibirMensagem("Erro ao cadastrar endereço!\n"+ex.getMessage());
       }
   }  
   public void editar(Endereco c){}
   public void excluir(Endereco c){}
   public Endereco getById(int id){return null;}
}
