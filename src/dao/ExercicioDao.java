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
    public void editar(Exercicio e){}
    public void excluir(Exercicio e){}
    public Exercicio getById(int id){return null;}
    public ArrayList<Exercicio> getAllTipo(String tipo){return null;}
}
