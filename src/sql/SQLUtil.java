/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Elvis
 */
public class SQLUtil {
    static Connection conexao;
    
    
    public static String INSERIR_ENDERECO ="insert into endereco (bairro,uf,cidade,cep,logradouro,num) values (?,?,?,?,?,?)";
    public static String INSERIR_ALUNO = "insert into aluno (nome,cpf,data_nascimento,sexo,vencimento_mens,endereco_id,rg,"
            + "email,celular,status) values (?,?,?,?,?,?,?,?,?,'Ativo')";
    public static String INSERIR_FUNCIONARIO = "insert into funcionario (nome,cpf,salario,telefone,login,senha,rg,data_nascimento,"
            + "sexo,status,email,data_admissao,data_demissao,funcao,cadAlunoAcessar,cadAlunoCadastrar,cadAlunoEditar,cadAlunoExcluir,"
            + "cadAlunoRecebPag,cadFuncAcessar,cadFuncCadastrar,cadFuncEditar,"
            + "cadFuncExcluir,cadFuncRecebPag,avFisicaAcessar,fichaTreinoAcessar,relatorioAcessar,"
            + "relatorioCadastrar,relatorioEditar,relatorioExcluir,relatorioRecebPag,lancarPagAcessar,lancarPagCadastrar,"
            + "lancarPagEditar,lancarPagExcluir,lancarPagRecebPag,controleCaixaAcessar,controleCaixaCadastrar,controleCaixaEditar,"
            + "controleCaixaExcluir,controleCaixaRecebPag,endereco_id) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	
    public static String INSERIR_COMPOSICAO_CORPORAL = "insert into composicao_corporal (peso_gorda,peso_magra,imc,rcq,porcentual_gordura,"
            + "pressao_arterial) values (?,?,?,?,?,?)";
    public static String INSERIR_METAS_IDEAIS = "insert into metas_ideais (peso,imc,nivel,porcentual_gordura) values (?,?,?,?)";
    public static String INSERIR_PERIMETRIA = "insert into perimetria (altura,cintura,peso,coxa_esquerda,ombro,braco_esquerdo,"
            + "coxa_direita,abdomem,torax,quadril,panturrilha_direita,braco_direito, ante_braco_direito,ante_braco_esquerdo) values (?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public static String INSERIR_DOBRAS_CUTANEAS ="insert into dobras_cutaneas (peitoral,axilar_media,abdominal,coxa,bicipita,supra_iliaca,"
            + "subscapular,tricipital) values (?,?,?,?,?,?,?,?)";
    public static String INSERIR_EXERCICIO = "insert into exercicio (tipo,nome) values (?,?)";
    public static String INSERIR_INSTRUTOR = "insert into instrutor (cref,funcionario_id) values (?,?)";
    public static String INSERIR_FICHA_DE_TREINO = "insert into ficha_de_treino (instrutor_id,aluno_id) values (?,?)";
    public static String INSERIR_FICHA_EXERCICIO = "insert into ficha_exercicio (repeticoes,ordem,dia,exercicio_id,ficha_treino_id) values (?,?,?,?,?)";
    public static String INSERIR_ANAMNESE = "insert into anamnese (tabagismo,restricaoArticular,cardiopatias,medicamentos,"
            + "hipertensao,outros,diabetes,probPulmonares,ativFisica,nivel,tabagismoObs,restricaoArticularObs,cardiopatiasObs,"
            + "medicamentosObs,hipertensaoObs,outrosObs,diabetesObs,probPulmonaresObs,ativFisicaObs) values (?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?)";
    public static String INSERIR_AVALIACAO = "insert into avaliacao (objetivo,proxima_avaliacao,data,anamnese_id,composicao_corporal_id,metas_ideais_id"
             + ",perimetria_id,dobras_cutaneas_id,aluno_id,instrutor_id) values (?,?,?,?,?,?,?,?,?,?)";
    public static String INSERIR_PAGAMENTO = "insert into pagamento (valor,descricao,data,dataVenc,formaPag,aluno_id,funcionario_id) values (?,?,?,?,?,?,?)";
    public static String INSERIR_CONTAS = "insert into historico (nome,tipo) values (?,?)";
    public static String INSERIR_CONTROLE_FINANCEIRO = "insert into controle_financeiro (data,descricao,valor,historico_id) values (?,?,?,?)";
    public static String INSERIR_ACADEMIA = "insert into cadastro_academia (nome,nome_fantasia,nome_proprietario,cnpj,cpf,"
            + "logo,email,telefone,celular,endereco_id) values (?,?,?,?,?,?,?,?,?,?)";
    
    public static String SELECT_INSTRUTOR_BY_ID_FUNCIONARIO = "select * from instrutor where funcionario_id=?";
    public static String SELECT_CONTA_BY_NOME = "select * from historico where nome=?";
    public static String SELECT_CONTA_ALL_NOMES = "select nome from historico";
    public static String SELECT_ALL_ALUNO = "select * from aluno";
    public static String SELECT_BY_ID_ALUNO = "select * from aluno where id=?";
    public static String SELECT_BY_ID_ENDERECO = "select * from endereco where id=?";
    public static String SELECT_ALL_FUNCIONARIO = "select * from funcionario";
    public static String SELECT_ALL_EXERCICIOS = "select * from exercicio";
    
    public static String UPDATE_ALUNO = "update aluno set nome=?,cpf=?,data_nascimento=?,sexo=?,"
            + "vencimento_mens=?,endereco_id=?,rg=?,email=?,celular=?,status=? where id=?";
    
    public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/gym";
    public static String USUARIO_POSTGRES = "postgres";
    public static String SENHA_POSTGRES = "postgres";

    

    private SQLUtil() {

    }
    
    public static PreparedStatement prepareStatement(String SQL) throws Exception {
        conexao =  SQLConnection.getConexao(SQLConnection.BD__POSTGRESS);
        return conexao.prepareStatement(SQL);
    }
    
    public static int getLastIdTabela(String nomeTabela){
        int id = 0;
        try {
            conexao = SQLConnection.getConexao(SQLConnection.BD__POSTGRESS);
            PreparedStatement statement = conexao.prepareStatement("select * from " + nomeTabela + " order by id desc limit 1");
            ResultSet result = statement.executeQuery();
            result.next();
            id = result.getInt(1);
            
        } catch (SQLException e) {
           
        }
        return id;
    }
}
