/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fachada.Fachada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import model.Avaliacao;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class AvaliacaoDao{
    private PreparedStatement statement;
            
    public void cadastrar(Avaliacao a){
        System.out.println("dao.AvaliacaoDao.cadastrar()");
        System.out.println(a.getObjetivo());
        try {
            //        (objetivo,proxima_avaliacao,data,anamnese_id,composicao_corporal_id,metas_ideais_id"
//             + ",perimetria_id,dobras_cutaneas_id)
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_AVALIACAO);
            statement.setString(1, a.getObjetivo());
            statement.setDate(2, a.getProxima_avaliacao());
            statement.setDate(3, a.getData());
            statement.setInt(4, SQLUtil.getLastIdTabela("anamnese"));
            statement.setInt(5, SQLUtil.getLastIdTabela("composicao_corporal"));
            statement.setInt(6, SQLUtil.getLastIdTabela("metas_ideais"));
            statement.setInt(7, SQLUtil.getLastIdTabela("perimetria"));
            statement.setInt(8, SQLUtil.getLastIdTabela("dobras_cutaneas"));
            statement.setInt(9, a.getAluno().getId());
            statement.setInt(10, a.getInstrutor().getId());
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Avaliação!\n"+ex.getMessage());
        }
    }
    public void editar(Avaliacao a){}
    public void excluir(Avaliacao a){}
    public Avaliacao getById(int id){return null;}
    public ArrayList<Avaliacao> getAll(){
        ResultSet result;
        ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_AVALIACAO);
            result = statement.executeQuery();
            
            while(result.next()){
                avaliacoes.add(get(result));
            }
            return avaliacoes;
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    private Avaliacao get(ResultSet result){
        Avaliacao a = new Avaliacao();
        try {
            a.setId(1);
            a.setObjetivo(result.getString(2));
            a.setProxima_avaliacao(result.getDate(3));
            a.setData(result.getDate(4));
            a.setAnamnese(Fachada.getInstance().getByIdAnamnese(result.getInt(5)));
            a.setComposicao_corporal(Fachada.getInstance().getByIdComposicao_corporal(result.getInt(6)));
            a.setMetas_ideais(Fachada.getInstance().getByIdMetas_ideais(result.getInt(7)));
            a.setPerimetria(Fachada.getInstance().getByIdPerimetria(result.getInt(8)));
            a.setDobras_Cutaneas(Fachada.getInstance().getByIdDobras_Cutaneas(9));
            a.setAluno(Fachada.getInstance().getByIdAluno(result.getInt(10)));
            a.setInstrutor(Fachada.getInstance().getByIdInstrutor(result.getInt(11)));
            
        } catch (SQLException ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    } 
}
