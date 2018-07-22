/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
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
            System.out.println("dao.AvaliacaoDao.cadastrar()");
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_AVALIACAO);
            statement.setString(1, a.getObjetivo());
            System.out.println("dao.AvaliacaoDao.cadastrar()");
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
    
}
