package br.com.unimix.persistencia;

import br.com.unimix.entidade.Chamado;
import br.com.unimix.util.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author ATILLA
 */
public class ChamadoDAO {

    private EntityManager em;

    public ChamadoDAO(EntityManager em) {
        this.em = em;
    }
    
    /**
     * Este método recebe um objeto da entidade Chamado e persiste no BD, 
     * salvando ou alterando.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     * @return  Chamado
     */
    public Chamado salvar(Chamado chamado){
        try {
            chamado = em.merge(chamado);
        } catch (Exception e){
            e.printStackTrace();
        }
        return chamado;
    }
    
    /**
     * Este método recebe um objeto da entidade Chamado e o exclui no BD.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     * @return  boolean
     */
    public boolean excluir(Chamado chamado){
        try {
            chamado = getChamadoById(chamado.getId());
            em.remove(chamado);
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * Este método recebe um código como parâmetro e pesquisa no BD, retornando
     * o objeto preenchido caso encontre resultados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Integer id
     * @return  Chamado
     */
    public Chamado getChamadoById(Integer id){
        Chamado c = new Chamado();
        try {
            c = em.find(Chamado.class, id);
        } catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }
    
    /**
     * Este método recebe um RG Militar como parâmetro e pesquisa no BD, 
     * retornando uma Lista de Chamados com os resultados encontrados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Integer rgMilitar
     * @return  List<Chamado>
     */
    public List<Chamado> getChamadosPorRG(String rgMilitar){
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            Query query = em.createQuery("SELECT c FROM Chamado c WHERE c.rgMilitar = :rgMilitar");
            query.setParameter("rgMilitar", rgMilitar);
            chamados = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return chamados;
    }
    
    /**
     * Este método recebe uma Palavra-Chave como parâmetro e pesquisa no BD, 
     * retornando uma Lista de Chamados com os resultados encontrados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   String palavraChaveParametro
     * @return  List<Chamado>
     */
    public List<Chamado> getChamadosPorPalavraChave(String palavraChaveParametro) throws Exception{
        List<Chamado> chamados  = new ArrayList<Chamado>();
        Connection con          = null;
        PreparedStatement ps    = null;
        ResultSet rs            = null;
        try {
            con = JDBCUtil.getConnection();
            String SQL = "SELECT id, rg_militar, data, corporacao, projeto, chamado, caso_mantis, "
                .concat("        descricao, desenvolvedor, problema, solucao, palavra_chave, data_criacao, ")
                .concat("        data_atribuicao, data_conclusao, data_teste, data_correcao, data_homologacao_disp, ")
                .concat("        data_homologacao_cliente, data_producao, data_finalizacao")
                .concat("   FROM chamado WHERE UPPER(palavra_chave) SIMILAR TO ?");
            ps = con.prepareStatement(SQL);
            ps.setString(1, "%("+palavraChaveParametro.toUpperCase()+")%");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Integer id = rs.getInt(1);
                String rgMilitar = rs.getString(2);
                Date data = rs.getDate(3);
                Integer corporacao = rs.getInt(4);
                String projeto = rs.getString(5);
                String chamado = rs.getString(6);
                String casoMantis = rs.getString(7);
                String descricao = rs.getString(8);
                String desenvolvedor = rs.getString(9);
                String problema = rs.getString(10);
                String solucao = rs.getString(11);
                String palavraChave = rs.getString(12);
                Date dataCriacao = rs.getDate(13);
                Date dataAtribuicao = rs.getDate(14);
                Date dataConclusao = rs.getDate(15);
                Date dataTeste = rs.getDate(16);
                Date dataCorrecao = rs.getDate(17);
                Date dataHomologacaoDisp = rs.getDate(18);
                Date dataHomologacaoCliente = rs.getDate(19);
                Date dataProducao = rs.getDate(20);
                Date dataFinalizacao = rs.getDate(21);
                
                chamados.add(new Chamado(id, rgMilitar, data, corporacao, projeto, chamado, casoMantis, descricao, desenvolvedor, 
                        problema, solucao, palavraChave, dataCriacao, dataAtribuicao, dataConclusao, dataTeste, dataCorrecao, 
                        dataHomologacaoDisp, dataHomologacaoCliente, dataProducao, dataFinalizacao));
            }
        } catch (SQLException sqle){
            throw new Exception(sqle);
        } catch (Exception e){
            throw new Exception(e);
        } finally {
            JDBCUtil.getCloseConnection(con, ps, rs);
        }
        return chamados;
    }
    
    /**
     * Este método recebe um chamado como parâmetro e pesquisa no BD, 
     * retornando uma Lista de Chamados com os resultados encontrados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Integer chamado
     * @return  List<Chamado>
     */
    public List<Chamado> getChamadosPorChamado(String chamado){
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            Query query = em.createQuery("SELECT c FROM Chamado c WHERE c.chamado = :chamado");
            query.setParameter("chamado", chamado);
            chamados = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return chamados;
    }
    
    /**
     * Este método recebe um chamado como parâmetro e pesquisa no BD, 
     * retornando uma Lista de Chamados com os resultados encontrados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Integer chamado
     * @return  List<Chamado>
     */
    public List<Chamado> getChamadosPorCasoMantis(String casoMantis){
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            Query query = em.createQuery("SELECT c FROM Chamado c WHERE c.casoMantis = :casoMantis");
            query.setParameter("casoMantis", casoMantis);
            chamados = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return chamados;
    }
    
    /**
     * Este método recebe uma Data como parâmetro e pesquisa no BD, 
     * retornando uma Lista de Chamados com os resultados encontrados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Date data
     * @return  List<Chamado>
     */
    public List<Chamado> getChamadosPorData(Date data){
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            Query query = em.createQuery("SELECT c FROM Chamado c WHERE c.data = :data");
            query.setParameter("data", data);
            chamados = query.getResultList();
        } catch (Exception e){
            e.printStackTrace();
        }
        return chamados;
    }
}
