/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Anamnese;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class AnamneseDao {
    private PreparedStatement statement;
    
    public void cadastrar(Anamnese a){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_ANAMNESE);
            

            statement.setBoolean(1, a.isTabagismo());
            statement.setBoolean(2, a.isRestricaoArticular());
            statement.setBoolean(3, a.isCardiopatias());
            statement.setBoolean(4, a.isMedicamentos());
            statement.setBoolean(5, a.isHipertensao());
            statement.setBoolean(6, a.isOutros());
            statement.setBoolean(7, a.isDiabetes());
            statement.setBoolean(8, a.isProbPulmonares());
            statement.setBoolean(9, a.isAtivFisica());
            statement.setString(10, a.getNivel());
            statement.setString(11, a.getTabagismoObs());
            statement.setString(12, a.getRestricaoArticularObs());
            statement.setString(13, a.getCardiopatiasObs());
            statement.setString(14, a.getMedicamentosObs());
            statement.setString(15, a.getHipertensaoObs());
            statement.setString(16, a.getOutrosObs());
            statement.setString(17, a.getDiabetesObs());
            statement.setString(18, a.getProbPulmonaresObs());
            statement.setString(19, a.getAtivFisicaObs());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao salvar Anamnese!\n"+ex.getMessage());
        }
    }
    public void editar(Anamnese a){}
    public void excluir(Anamnese a){}
    public Anamnese getById(int id){return null;}
    
}
