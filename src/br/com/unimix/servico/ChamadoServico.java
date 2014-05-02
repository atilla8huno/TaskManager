package br.com.unimix.servico;

import br.com.unimix.entidade.Chamado;
import br.com.unimix.persistencia.ChamadoDAO;
import br.com.unimix.util.JFrameUtil;
import br.com.unimix.util.JPAUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.RollbackException;

/**
 * @author ATILLA
 */
public class ChamadoServico {

    EntityManager em;
    private ChamadoDAO dao;

    /**
     * Método construtor com Injeção de Dependência na classe DAO.
     */
    public ChamadoServico() {
        em = JPAUtil.getEntityManager();
        dao = new ChamadoDAO(em);
    }

    /**
     * Este método recebe um objeto da entidade Chamado e persiste no BD,
     * salvando ou alterando.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param Chamado chamado
     * @return Chamado
     */
    public Chamado salvar(Chamado chamado) {
        try {
            beginTransaction();
            chamado = dao.salvar(chamado);
            em.getTransaction().commit();

            if (!chamado.isTransient()) {
                JFrameUtil.showMensagemDeInformacao("Sucesso!", "Registro salvo!");
            }
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar salvar!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
            try {
                em.getTransaction().rollback();
            } catch (RollbackException roll) {
                roll.printStackTrace();
            }
        } finally {
            em.clear();
        }
        return chamado;
    }

    /**
     * Este método recebe um objeto da entidade Chamado e o exclui no BD.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param Chamado chamado
     */
    public void excluir(Chamado chamado) {
        boolean result = false;
        try {
            beginTransaction();
            result = dao.excluir(chamado);
            em.getTransaction().commit();

            if (result) {
                JFrameUtil.showMensagemDeInformacao("Sucesso!", "Registro excluído!");
            }
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar excluir!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
            try {
                em.getTransaction().rollback();
            } catch (RollbackException roll) {
                roll.printStackTrace();
            }
        } finally {
            em.clear();
        }
    }

    /**
     * Este método recebe um código como parâmetro e pesquisa no BD, retornando
     * o objeto preenchido caso encontre resultados.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param Integer id
     * @return Chamado
     */
    public Chamado getChamadoById(Integer id) {
        Chamado c = new Chamado();
        try {
            beginTransaction();
            c = dao.getChamadoById(id);
            em.getTransaction().commit();
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar obter o chamado!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
            try {
                em.getTransaction().rollback();
            } catch (RollbackException roll) {
                roll.printStackTrace();
            }
        } finally {
            em.clear();
        }
        return c;
    }

    /**
     * Este método recebe um RG Militar como parâmetro e pesquisa no BD,
     * retornando uma Lista de Chamados com os resultados encontrados.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param String rgMilitar
     * @return List<Chamado>
     */
    public List<Chamado> getChamadosPorRG(String rgMilitar) {
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            beginTransaction();
            chamados = dao.getChamadosPorRG(rgMilitar);
            em.getTransaction().commit();
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar listar!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
            try {
                em.getTransaction().rollback();
            } catch (RollbackException roll) {
                roll.printStackTrace();
            }
        } finally {
            em.clear();
        }
        return chamados;
    }

    /**
     * Este método recebe uma Palavra-Chave como parâmetro e pesquisa no BD,
     * retornando uma Lista de Chamados com os resultados encontrados.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param String palavraChave
     * @return List<Chamado>
     */
    public List<Chamado> getChamadosPorPalavraChave(String palavraChave) {
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            chamados = dao.getChamadosPorPalavraChave(palavraChave);
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar listar!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
        }
        return chamados;
    }

    /**
     * Este método recebe um chamado como parâmetro e pesquisa no BD, retornando
     * uma Lista de Chamados com os resultados encontrados.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param String chamado
     * @return List<Chamado>
     */
    public List<Chamado> getChamadosPorChamado(String chamado) {
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            beginTransaction();
            chamados = dao.getChamadosPorChamado(chamado);
            em.getTransaction().commit();
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar listar!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
            try {
                em.getTransaction().rollback();
            } catch (RollbackException roll) {
                roll.printStackTrace();
            }
        } finally {
            em.clear();
        }
        return chamados;
    }

    /**
     * Este método recebe um caso Mantis como parâmetro e pesquisa no BD,
     * retornando uma Lista de Chamados com os resultados encontrados.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param String casoMantis
     * @return List<Chamado>
     */
    public List<Chamado> getChamadosPorCasoMantis(String casoMantis) {
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            beginTransaction();
            chamados = dao.getChamadosPorCasoMantis(casoMantis);
            em.getTransaction().commit();
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar listar!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
            try {
                em.getTransaction().rollback();
            } catch (RollbackException roll) {
                roll.printStackTrace();
            }
        } finally {
            em.clear();
        }
        return chamados;
    }

    /**
     * Este método recebe uma Data como parâmetro e pesquisa no BD, retornando
     * uma Lista de Chamados com os resultados encontrados.
     *
     * @author Átilla Barros
     * @date 28/01/2013
     * @param Date data
     * @return List<Chamado>
     */
    public List<Chamado> getChamadosPorData(Date data) {
        List<Chamado> chamados = new ArrayList<Chamado>();
        try {
            beginTransaction();
            chamados = dao.getChamadosPorData(data);
            em.getTransaction().commit();
        } catch (Exception e) {
            JFrameUtil.showMensagemDeErro("Erro", "Um erro ocorreu ao tentar listar!\n"
                    + "Consulte o desenvolvedor e informe o erro:\n\n"
                    + e.getMessage());
            try {
                em.getTransaction().rollback();
            } catch (RollbackException roll) {
                roll.printStackTrace();
            }
        } finally {
            em.clear();
        }
        return chamados;
    }

    /**
     * Este método inicia uma nova transação, verificando se o EntityManager
     * está aberto ou se precisa receber uma nova "conexão".
     *
     * @author Átilla Barros
     * @date 28/01/2013
     */
    private void beginTransaction() {
        if (em.isOpen()) {
            em.getTransaction().begin();
        } else {
            em = JPAUtil.getEntityManager();
            em.getTransaction().begin();
        }
    }
}
