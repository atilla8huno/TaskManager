package br.com.unimix.tablemodel;

import br.com.unimix.entidade.Chamado;
import br.com.unimix.servico.ChamadoServico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/**
 * @author ATILLA
 */
public class ChamadoTableModel extends AbstractTableModel {

    private final int COLUNA_CHAMADO    = 0;
    private final int COLUNA_DESCRICAO  = 1;
    private final int COLUNA_PROBLEMA   = 2;
    private final int COLUNA_SOLUCAO    = 3;
    private final int COLUNA_RG         = 4;
    private final int COLUNA_MANTIS     = 5;
    
    private List<Chamado> chamados;
    private ChamadoServico servico;

    /**
     * Método construtor
     */
    public ChamadoTableModel() {
        super();
        chamados    = new ArrayList<Chamado>();
        servico     = new ChamadoServico();
    }
    
    /**
     * Método construtor com Injeção de Dependência na Lista de Chamados
     */
    public ChamadoTableModel(List<Chamado> chamados) {
        this();
        this.chamados.addAll(chamados);
    }
    
    /**
     * Este método recebe um objeto da entidade Chamado e persiste no BD, 
     * salvando ou alterando, posteriormente limpa a Lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     * @return  Chamado
     */
    public Chamado salvar(Chamado c){
        c = servico.salvar(c);
        
        limpaListaChamados();
        fireTableDataChanged();
        return c;
    }
    
    /**
     * Este método recebe um objeto da entidade Chamado e o exclui no BD,
     * posteriormente limpa a Lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     */
    public void excluir(Chamado c){
        servico.excluir(c);
        
        limpaListaChamados();
        fireTableDataChanged();
    }
    
    /**
     * Este método recebe um vetor com códigos de objetos da entidade Chamado,
     * e o exclui no BD, posteriomente limpa a Lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     */
    public void excluirVarios(int[] selecionados){
        for(int i=0; i<selecionados.length; i++) {
            servico.excluir(getVoluntario(i));
        }
        
        limpaListaChamados();
        fireTableDataChanged();
    }
    
    /**
     * Este método recebe um inteiro com a posição na Lista de Chamados e o 
     * exclui no BD.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   int pos
     */
    public void excluir(int pos){
        Chamado c = getVoluntario(pos);
        excluir(c);
    }
    
    /**
     * Este método recebe um inteiro com a posição na Lista de Chamados como
     * parâmentro e retorna o objeto da entidade Chamado.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     * @return  Chamado
     */
    public Chamado getVoluntario(int pos){
        if(pos < 0 || pos >= chamados.size()){
            return null;
        } else {
            return chamados.get(pos);
        }
    }
    
    /**
     * Este método limpa a Lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     */
    private void limpaListaChamados(){
        chamados.clear();
    }
    
    /**
     * Este método ordena a Lista de Chamados pelo código.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     */
    public void ordenarPorCodigo() {
        Collections.sort(chamados, new Comparator<Chamado>() {
            public int compare(Chamado c1, Chamado c2) {
                return c1.getId() - c2.getId();
            }
        });
        
        fireTableDataChanged();
    }
    
    /**
     * Este método ordena a Lista de Chamados por chamado.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     */
    public void ordenarPorChamado() {
        Collections.sort(chamados, new Comparator<Chamado>() {
            public int compare(Chamado c1, Chamado c2) {
                return c1.getChamado().compareTo(c2.getChamado());
            }
        });
        
        fireTableDataChanged();
    }
    
    /**
     * Este método ordena a Lista de Chamados por caso mantis.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     */
    public void ordenarPorCasoMantis() {
        Collections.sort(chamados, new Comparator<Chamado>() {
            public int compare(Chamado c1, Chamado c2) {
                return c1.getCasoMantis().compareTo(c2.getCasoMantis());
            }
        });
        
        fireTableDataChanged();
    }
    
    /**
     * Este método ordena a Lista de Chamados por RG Militar.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     */
    public void ordenarPorRGMilitar() {
        Collections.sort(chamados, new Comparator<Chamado>() {
            public int compare(Chamado c1, Chamado c2) {
                return c1.getRgMilitar().compareTo(c2.getRgMilitar());
            }
        });
        
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return chamados.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Chamado c = chamados.get(rowIndex);
        
        if(columnIndex == COLUNA_CHAMADO){
            return c.getChamado();
        } else if (columnIndex == COLUNA_DESCRICAO){
            return c.getDescricao();
        } else if (columnIndex == COLUNA_PROBLEMA){
            return c.getProblema();
        } else if (columnIndex == COLUNA_SOLUCAO){
            return c.getSolucao();
        } else if (columnIndex == COLUNA_RG){
            return c.getRgMilitar();
        } else if (columnIndex == COLUNA_MANTIS){
            return c.getCasoMantis();
        }
        
        return c;
    }

    @Override
    public String getColumnName(int column) {
        if(column == COLUNA_CHAMADO){
            return "Chamado";
        } else if (column == COLUNA_DESCRICAO){
            return "Descricao";
        } else if (column == COLUNA_PROBLEMA){
            return "Problema";
        } else if (column == COLUNA_SOLUCAO){
            return "Solucao";
        } else if (column == COLUNA_RG){
            return "RG Militar";
        } else if (column == COLUNA_MANTIS){
            return "Caso Mantis";
        }
        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Chamado c = chamados.get(rowIndex);
        
        if(columnIndex == COLUNA_CHAMADO){
            c.setChamado(aValue.toString());
        } else if (columnIndex == COLUNA_DESCRICAO){
            c.setDescricao(aValue.toString());
        } else if (columnIndex == COLUNA_PROBLEMA){
            c.setProblema(aValue.toString());
        } else if (columnIndex == COLUNA_SOLUCAO){
            c.setSolucao(aValue.toString());
        } else if (columnIndex == COLUNA_RG){
            c.setRgMilitar(aValue.toString());
        } else if (columnIndex == COLUNA_MANTIS){
            c.setCasoMantis(aValue.toString());
        }
        
        fireTableDataChanged();
    }

    /**
     * @return List<Chamado>
     */
    public List<Chamado> getChamados() {
        return chamados;
    }
    
    /**
     * Este método recebe um RG Militar como parâmentro, pesquisa no BD e retorna 
     * uma lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    05/02/2013
     * @param   String rgMilitar
     * @return  List<Chamado>
     */
    public List<Chamado> pesquisarRGMilitar(String rgMilitar){
        chamados.clear();
        chamados = servico.getChamadosPorRG(rgMilitar);
        
        fireTableDataChanged();
        return chamados;
    }
    
    /**
     * Este método recebe uma Palavra-Chave como parâmentro, pesquisa no BD e 
     * retorna uma lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    05/02/2013
     * @param   String palavraChave
     * @return  List<Chamado>
     */
    public List<Chamado> pesquisarPalavraChave(String palavraChave){
        chamados.clear();
        chamados = servico.getChamadosPorPalavraChave(palavraChave);
        
        fireTableDataChanged();
        return chamados;
    }
    
    /**
     * Este método recebe um Chamado como parâmentro, pesquisa no BD e retorna 
     * uma lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    05/02/2013
     * @param   String chamado
     * @return  List<Chamado>
     */
    public List<Chamado> pesquisarChamado(String chamado){
        chamados.clear();
        chamados = servico.getChamadosPorChamado(chamado);
        
        fireTableDataChanged();
        return chamados;
    }
    
    /**
     * Este método recebe uma Data como parâmentro, pesquisa no BD e retorna 
     * uma lista de Chamados.
     * 
     * @author  Átilla Barros
     * @date    05/02/2013
     * @param   Date data
     * @return  List<Chamado>
     */
    public List<Chamado> pesquisarData(Date data){
        chamados.clear();
        chamados = servico.getChamadosPorData(data);
        
        fireTableDataChanged();
        return chamados;
    }
    
    /**
     * @param List<Chamado>
     */
    public void setChamados(List<Chamado> chamados) {
        this.chamados.clear();
        this.chamados.addAll(chamados);
        fireTableDataChanged();
    }
    
    /**
     * @param Set<Chamado>
     */
    public void setChamados(Set<Chamado> chamados) {
        this.chamados.clear();
        this.chamados.addAll(chamados);
        fireTableDataChanged();
    }
}
