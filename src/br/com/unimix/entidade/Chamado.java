package br.com.unimix.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ATILLA
 */
@Entity
@Table(name = "chamado")
public class Chamado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    
    @Column(name = "rg_militar")
    private String rgMilitar;
    
    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @Column(name = "corporacao", nullable = false)
    private Integer corporacao;
    
    @Column(name = "projeto", nullable = false)
    private String projeto;
    
    @Column(name = "chamado", nullable = false)
    private String chamado;
    
    @Column(name = "caso_mantis")
    private String casoMantis;
    
    @Column(name = "descricao", nullable = false)
    private String descricao;
    
    @Column(name = "desenvolvedor")
    private String desenvolvedor;
    
    @Column(name = "problema", nullable = false)
    private String problema;
    
    @Column(name = "solucao")
    private String solucao;
    
    @Column(name = "palavra_chave")
    private String palavraChave;
    
    @Column(name = "data_criacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    
    @Column(name = "data_atribuicao")
    @Temporal(TemporalType.DATE)
    private Date dataAtribuicao;
    
    @Column(name = "data_conclusao")
    @Temporal(TemporalType.DATE)
    private Date dataConclusao;
    
    @Column(name = "data_teste")
    @Temporal(TemporalType.DATE)
    private Date dataTeste;
    
    @Column(name = "data_correcao")
    @Temporal(TemporalType.DATE)
    private Date dataCorrecao;
    
    @Column(name = "data_homologacao_disp")
    @Temporal(TemporalType.DATE)
    private Date dataHomologacaoDisp;
    
    @Column(name = "data_homologacao_cliente")
    @Temporal(TemporalType.DATE)
    private Date dataHomologacaoCliente;
    
    @Column(name = "data_producao")
    @Temporal(TemporalType.DATE)
    private Date dataProducao;
    
    @Column(name = "data_finalizacao")
    @Temporal(TemporalType.DATE)
    private Date dataFinalizacao;

    public Chamado() {
    }

    public Chamado(Integer id) {
        this.id = id;
    }

    public Chamado(Integer id, String rgMilitar, Date data, Integer corporacao, String projeto, String chamado, String casoMantis, String descricao, String desenvolvedor, String problema, String solucao, String palavraChave, Date dataCriacao, Date dataAtribuicao, Date dataConclusao, Date dataTeste, Date dataCorrecao, Date dataHomologacaoDisp, Date dataHomologacaoCliente, Date dataProducao, Date dataFinalizacao) {
        this.id                     = id;
        this.rgMilitar              = rgMilitar;
        this.data                   = data;
        this.corporacao             = corporacao;
        this.projeto                = projeto;
        this.chamado                = chamado;
        this.casoMantis             = casoMantis;
        this.descricao              = descricao;
        this.desenvolvedor          = desenvolvedor;
        this.problema               = problema;
        this.solucao                = solucao;
        this.palavraChave           = palavraChave;
        this.dataCriacao            = dataCriacao;
        this.dataAtribuicao         = dataAtribuicao;
        this.dataConclusao          = dataConclusao;
        this.dataTeste              = dataTeste;
        this.dataCorrecao           = dataCorrecao;
        this.dataHomologacaoDisp    = dataHomologacaoDisp;
        this.dataHomologacaoCliente = dataHomologacaoCliente;
        this.dataProducao           = dataProducao;
        this.dataFinalizacao        = dataFinalizacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRgMilitar() {
        return rgMilitar;
    }

    public void setRgMilitar(String rgMilitar) {
        this.rgMilitar = rgMilitar;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getCorporacao() {
        return corporacao;
    }

    public void setCorporacao(Integer corporacao) {
        this.corporacao = corporacao;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getChamado() {
        return chamado;
    }

    public void setChamado(String chamado) {
        this.chamado = chamado;
    }

    public String getCasoMantis() {
        return casoMantis;
    }

    public void setCasoMantis(String casoMantis) {
        this.casoMantis = casoMantis;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtribuicao() {
        return dataAtribuicao;
    }

    public void setDataAtribuicao(Date dataAtribuicao) {
        this.dataAtribuicao = dataAtribuicao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Date getDataTeste() {
        return dataTeste;
    }

    public void setDataTeste(Date dataTeste) {
        this.dataTeste = dataTeste;
    }

    public Date getDataCorrecao() {
        return dataCorrecao;
    }

    public void setDataCorrecao(Date dataCorrecao) {
        this.dataCorrecao = dataCorrecao;
    }

    public Date getDataHomologacaoDisp() {
        return dataHomologacaoDisp;
    }

    public void setDataHomologacaoDisp(Date dataHomologacaoDisp) {
        this.dataHomologacaoDisp = dataHomologacaoDisp;
    }

    public Date getDataHomologacaoCliente() {
        return dataHomologacaoCliente;
    }

    public void setDataHomologacaoCliente(Date dataHomologacaoCliente) {
        this.dataHomologacaoCliente = dataHomologacaoCliente;
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Date dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamado)) {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.unimix.entidade.Chamado[ id=" + id + " ]";
    }
    
    public boolean isTransient(){
        return (id == null || id == 0);
    }
}
