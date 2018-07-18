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
import model.Perimetria;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class PerimetriaDao {
    private PreparedStatement statement;
    
    public void cadastrar(Perimetria p){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_PERIMETRIA);
            
            statement.setFloat(1, p.getAltura());
            statement.setFloat(2, p.getCintura());
            statement.setFloat(3, p.getPeso());
            statement.setFloat(4, p.getCoxa_esquerda());
            statement.setFloat(5, p.getOmbro());
            statement.setFloat(6, p.getBraco_esquerdo());
            statement.setFloat(7, p.getCoxa_direita());
            statement.setFloat(8, p.getAbdomem());
            statement.setFloat(9, p.getTorax());
            statement.setFloat(10, p.getQuadril());
            statement.setFloat(11, p.getPanturrilha_direita());
            statement.setFloat(12, p.getBraco_direito());
            statement.setFloat(13, p.getAnte_braco_direita());
            statement.setFloat(14, p.getAnte_braco_esquerdo());
            
            statement.execute();
            
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao salvar Perimetria!\n"+ex.getMessage());
        }
        
    }
    public void editar(Perimetria p){}
    public void excluir(Perimetria p){}
    public Perimetria getById(int id){return null;}
    public ArrayList<Perimetria> getAll(int id){return null;}
}
