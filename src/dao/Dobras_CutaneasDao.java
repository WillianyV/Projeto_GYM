/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dobras_Cutaneas;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class Dobras_CutaneasDao {
    private PreparedStatement statement;
    
   public void cadastrar(Dobras_Cutaneas c){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_DOBRAS_CUTANEAS);
            
            statement.setFloat(1, c.getPeitoral());
            statement.setFloat(2, c.getAxilar_media());
            statement.setFloat(3, c.getAbdominal());
            statement.setFloat(4, c.getCoxa());
            statement.setFloat(5, c.getBicipita());
            statement.setFloat(6, c.getSupra_iliaca());
            statement.setFloat(7, c.getSubscapular());
            statement.setFloat(8, c.getTricipital());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar dobras cutânea!");
        }
        
        
   } 
   public void editar(Dobras_Cutaneas c){} 
   public void excluir(Dobras_Cutaneas c){} 
   public Dobras_Cutaneas getById(int id){return null;} 
}
