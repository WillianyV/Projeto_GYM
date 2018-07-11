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
        try {
            //        (objetivo,proxima_avaliacao,data,anamnese_id,composicao_corporal_id,metas_ideais_id"
//             + ",perimetria_id,dobras_cutaneas_id)
            a.getAnamnese().setId(SQLUtil.getLastIdTabela("anamnese"));
            a.getComposicao_corporal().setId(SQLUtil.getLastIdTabela(""));

            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_AVALIACAO);
            statement.setString(1, a.getObjetivo());
            statement.setDate(2, a.getData());
            statement.setInt(3, a.getAnamnese().getId());
            statement.setInt(4, a.getComposicao_corporal().getId());
            statement.setInt(5, a.getMetas_ideais().getId());
            statement.setInt(6, a.getPerimetria().getId());
            statement.setInt(7, a.getDobras_Cutaneas().getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Avaliação!");
        }
    }
    public void editar(Avaliacao a){}
    public void excluir(Avaliacao a){}
    public Avaliacao getById(int id){return null;}
    
}
