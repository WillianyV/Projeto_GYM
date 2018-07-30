/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Exercicio;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class ExercicioDao {
    private PreparedStatement statment;
    
    public void cadastrar(Exercicio e){
        try {
            statment = SQLUtil.prepareStatement(SQLUtil.INSERIR_EXERCICIO);
            
            statment.setString(1, e.getTipo());
            statment.setString(2, e.getNome());
            
            statment.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Exercício!");
        }
        
    }
    public void editar(Exercicio e){
        try {
            statment = SQLUtil.prepareStatement(SQLUtil.UPDATE_EXERCICIO);
            
            statment.setString(1, e.getTipo());
            statment.setString(2, e.getNome());
            statment.setInt(3, e.getId());
            
            statment.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar Exercício!"+ex.getMessage());
        }
    }
    public void excluir(Exercicio e){
        try {
            statment = SQLUtil.prepareStatement(SQLUtil.DELETE_EXERCICIO);
            statment.setInt(1, e.getId());
            statment.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Exercicio getById(int id){
        ResultSet result;
        
        try {
            statment = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_EXERCICIO_ID);
            statment.setInt(1, id);
            result = statment.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(ExercicioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Exercicio> getAllTipo(String tipo){return null;}
    public ArrayList<Exercicio> getAll(){
        ResultSet result;
        ArrayList<Exercicio> exercicios = new ArrayList<>();
        try {
            statment = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_EXERCICIOS);
            result = statment.executeQuery();
            
            while (result.next()) {                
                exercicios.add(get(result));
            }
            return exercicios;
        } catch (Exception ex) {
            Logger.getLogger(ExercicioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    private Exercicio get(ResultSet result){
        Exercicio e = new Exercicio();
        try {
            e.setId(result.getInt(1));
            e.setTipo(result.getString(2));
            e.setNome(result.getString(3));
        } catch (SQLException ex) {
            Logger.getLogger(ExercicioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return e;
    }
}
