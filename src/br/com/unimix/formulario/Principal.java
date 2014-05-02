package br.com.unimix.formulario;

import br.com.unimix.entidade.Chamado;
import br.com.unimix.servico.ChamadoServico;
import br.com.unimix.tablemodel.ChamadoTableModel;
import br.com.unimix.util.JFrameUtil;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 * @author ATILLA
 */
public class Principal extends javax.swing.JFrame {

    private Date dataAtual                  = new Date();
    private ChamadoTableModel modeloTabela;
    private List<Chamado> chamados          = new ArrayList<Chamado>();
    private ChamadoServico servico          = new ChamadoServico();
    private Chamado chamado                 = new Chamado();
    
    public Principal() {
        initComponents();
        limparCamposDoFormulario(jPanelFormulario);
        jTextFieldCodigo.setText("0");
        jFormattedTextFieldData.setText(JFrameUtil.date2String(dataAtual));
        jFormattedTextFieldDataCriacao.setText(JFrameUtil.date2String(dataAtual));
        modeloTabela = new ChamadoTableModel(chamados);
        jTableChamados.setModel(modeloTabela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelFormulario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRGMilitar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldData = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCorporacao = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxProjeto = new javax.swing.JComboBox();
        jLabelChamado = new javax.swing.JLabel();
        jTextFieldChamado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCasoMantis = new javax.swing.JTextField();
        jLabelPalavraChave = new javax.swing.JLabel();
        jTextFieldPalavraChave = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDesenvolvedor = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaProblema = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaSolucao = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableChamados = new javax.swing.JTable();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldRGMilitarConsulta = new javax.swing.JTextField();
        jLabelPalavraChave1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldChamadoConsulta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextFieldDataConsulta = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataConsulta = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPalavraChaveConsulta = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldCasoMantisConsulta = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimparForm = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonLimparPesquisa = new javax.swing.JButton();
        jButtonOrdenarPorChamado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonOrdenarPorRG = new javax.swing.JButton();
        jButtonOrdenarPorMantis = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelDatas = new javax.swing.JPanel();
        jPanelControleDatas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldDataCriacao = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataCriacao = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel18 = new javax.swing.JLabel();
        jFormattedTextFieldDataAtribuicao = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataAtribuicao = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextFieldDataConclusao = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataConclusao = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel20 = new javax.swing.JLabel();
        jFormattedTextFieldDataTeste = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataTeste = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel21 = new javax.swing.JLabel();
        jFormattedTextFieldDataCorrecao = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataCorrecao = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel22 = new javax.swing.JLabel();
        jFormattedTextFieldDataHomologacaoDisp = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataHomologacaoDisp = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel23 = new javax.swing.JLabel();
        jFormattedTextFieldDataHomologacaoCliente = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataHomologacaoCliente = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel24 = new javax.swing.JLabel();
        jFormattedTextFieldDataProducao = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataProducao = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jLabel25 = new javax.swing.JLabel();
        jFormattedTextFieldDataFinalizacao = new javax.swing.JFormattedTextField();
        try {
            javax.swing.text.MaskFormatter dataMask = new
            javax.swing.text.MaskFormatter("##/##/####");
            jFormattedTextFieldDataFinalizacao = new javax.swing.JFormattedTextField(dataMask);
        } catch (Exception e){
            e.printStackTrace();
        }
        jButtonLimparDatas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuEditar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Manager - Unimix Gyn");

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setLayout(null);

        jPanelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de Chamados"));
        jPanelFormulario.setLayout(null);

        jLabel2.setText("RG Militar:");
        jPanelFormulario.add(jLabel2);
        jLabel2.setBounds(20, 30, 80, 20);

        jTextFieldRGMilitar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldRGMilitarFocusLost(evt);
            }
        });
        jTextFieldRGMilitar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRGMilitarKeyPressed(evt);
            }
        });
        jPanelFormulario.add(jTextFieldRGMilitar);
        jTextFieldRGMilitar.setBounds(80, 30, 60, 20);

        jLabel3.setText("Data: *");
        jPanelFormulario.add(jLabel3);
        jLabel3.setBounds(160, 30, 60, 20);
        jPanelFormulario.add(jFormattedTextFieldData);
        jFormattedTextFieldData.setBounds(200, 30, 70, 20);

        jLabel4.setText("Corporação: *");
        jPanelFormulario.add(jLabel4);
        jLabel4.setBounds(290, 30, 120, 20);

        jComboBoxCorporacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "61", "62", "63" }));
        jPanelFormulario.add(jComboBoxCorporacao);
        jComboBoxCorporacao.setBounds(370, 30, 40, 20);

        jLabel5.setText("Projeto: *");
        jPanelFormulario.add(jLabel5);
        jLabel5.setBounds(430, 30, 110, 20);

        jComboBoxProjeto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SICAD", "SIAE", "Reports" }));
        jPanelFormulario.add(jComboBoxProjeto);
        jComboBoxProjeto.setBounds(490, 30, 90, 20);

        jLabelChamado.setText("Chamado: *");
        jPanelFormulario.add(jLabelChamado);
        jLabelChamado.setBounds(20, 60, 100, 20);

        jTextFieldChamado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldChamadoFocusLost(evt);
            }
        });
        jTextFieldChamado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldChamadoKeyPressed(evt);
            }
        });
        jPanelFormulario.add(jTextFieldChamado);
        jTextFieldChamado.setBounds(80, 60, 60, 20);

        jLabel7.setText("Mantis: ");
        jPanelFormulario.add(jLabel7);
        jLabel7.setBounds(160, 60, 90, 20);

        jTextFieldCasoMantis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCasoMantisFocusLost(evt);
            }
        });
        jTextFieldCasoMantis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCasoMantisKeyPressed(evt);
            }
        });
        jPanelFormulario.add(jTextFieldCasoMantis);
        jTextFieldCasoMantis.setBounds(200, 60, 70, 20);

        jLabelPalavraChave.setText("Palavra-Chave:");
        jPanelFormulario.add(jLabelPalavraChave);
        jLabelPalavraChave.setBounds(290, 60, 290, 20);
        jPanelFormulario.add(jTextFieldPalavraChave);
        jTextFieldPalavraChave.setBounds(370, 60, 210, 20);

        jLabel8.setText("Desenvolvedor:");
        jPanelFormulario.add(jLabel8);
        jLabel8.setBounds(600, 30, 250, 20);

        jComboBoxDesenvolvedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Átilla Barros", "Daniel Bueno", "Daniel Souza", "Manoel Neto", "Martins Jr.", "Eric Silva", "Robson Silva", "Augusto Rabelo", "Alexandre Cotrin" }));
        jPanelFormulario.add(jComboBoxDesenvolvedor);
        jComboBoxDesenvolvedor.setBounds(690, 30, 160, 20);

        jLabel9.setText("Descrição: *");
        jPanelFormulario.add(jLabel9);
        jLabel9.setBounds(20, 90, 90, 20);

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescricao);

        jPanelFormulario.add(jScrollPane2);
        jScrollPane2.setBounds(20, 110, 410, 100);

        jLabel10.setText("Problema: *");
        jPanelFormulario.add(jLabel10);
        jLabel10.setBounds(440, 90, 90, 20);

        jTextAreaProblema.setColumns(20);
        jTextAreaProblema.setRows(5);
        jScrollPane3.setViewportView(jTextAreaProblema);

        jPanelFormulario.add(jScrollPane3);
        jScrollPane3.setBounds(440, 110, 410, 100);

        jLabel11.setText("Solução: ");
        jPanelFormulario.add(jLabel11);
        jLabel11.setBounds(20, 220, 100, 20);

        jTextAreaSolucao.setColumns(20);
        jTextAreaSolucao.setRows(5);
        jScrollPane4.setViewportView(jTextAreaSolucao);

        jPanelFormulario.add(jScrollPane4);
        jScrollPane4.setBounds(20, 240, 410, 100);

        jLabel12.setText("* Campos Obrigatórios");
        jPanelFormulario.add(jLabel12);
        jLabel12.setBounds(750, 320, 130, 20);

        jLabel17.setText("Código: *");
        jPanelFormulario.add(jLabel17);
        jLabel17.setBounds(600, 60, 160, 20);

        jTextFieldCodigo.setEditable(false);
        jPanelFormulario.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(690, 60, 70, 20);

        jPanelPrincipal.add(jPanelFormulario);
        jPanelFormulario.setBounds(10, 10, 870, 350);

        jTableChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableChamadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableChamados);

        jPanelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(10, 460, 870, 230);

        jPanelPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));
        jPanelPesquisa.setLayout(null);

        jLabel13.setText("RG Militar:");
        jPanelPesquisa.add(jLabel13);
        jLabel13.setBounds(20, 20, 70, 20);

        jTextFieldRGMilitarConsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldRGMilitarConsultaFocusLost(evt);
            }
        });
        jTextFieldRGMilitarConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldRGMilitarConsultaKeyPressed(evt);
            }
        });
        jPanelPesquisa.add(jTextFieldRGMilitarConsulta);
        jTextFieldRGMilitarConsulta.setBounds(80, 20, 60, 20);

        jLabelPalavraChave1.setText("Palavra-Chave:");
        jPanelPesquisa.add(jLabelPalavraChave1);
        jLabelPalavraChave1.setBounds(160, 20, 100, 20);

        jLabel14.setText("Chamado: ");
        jPanelPesquisa.add(jLabel14);
        jLabel14.setBounds(470, 20, 80, 20);

        jTextFieldChamadoConsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldChamadoConsultaFocusLost(evt);
            }
        });
        jTextFieldChamadoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldChamadoConsultaKeyPressed(evt);
            }
        });
        jPanelPesquisa.add(jTextFieldChamadoConsulta);
        jTextFieldChamadoConsulta.setBounds(530, 20, 60, 20);

        jLabel15.setText("Data: ");
        jPanelPesquisa.add(jLabel15);
        jLabel15.setBounds(610, 20, 60, 20);
        jPanelPesquisa.add(jFormattedTextFieldDataConsulta);
        jFormattedTextFieldDataConsulta.setBounds(650, 20, 70, 20);

        jLabel16.setText("A pesquisa será efetuada após um campo ser preenchido e perdido o foco ou após o preenchimento de um ou mais campos e o clique no botão 'Pesquisar'.");
        jPanelPesquisa.add(jLabel16);
        jLabel16.setBounds(120, 50, 780, 20);
        jPanelPesquisa.add(jTextFieldPalavraChaveConsulta);
        jTextFieldPalavraChaveConsulta.setBounds(240, 20, 210, 20);

        jLabel26.setText("Mantis: ");
        jPanelPesquisa.add(jLabel26);
        jLabel26.setBounds(740, 20, 70, 20);

        jTextFieldCasoMantisConsulta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCasoMantisConsultaFocusLost(evt);
            }
        });
        jTextFieldCasoMantisConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCasoMantisConsultaKeyPressed(evt);
            }
        });
        jPanelPesquisa.add(jTextFieldCasoMantisConsulta);
        jTextFieldCasoMantisConsulta.setBounds(790, 20, 70, 20);

        jPanelPrincipal.add(jPanelPesquisa);
        jPanelPesquisa.setBounds(10, 370, 870, 80);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonSalvar);
        jButtonSalvar.setBounds(890, 10, 120, 30);

        jButtonLimparForm.setText("Limpar / Novo");
        jButtonLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparFormActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonLimparForm);
        jButtonLimparForm.setBounds(890, 90, 120, 30);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonPesquisar);
        jButtonPesquisar.setBounds(890, 370, 120, 30);

        jButtonLimparPesquisa.setText("Limpar");
        jButtonLimparPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparPesquisaActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonLimparPesquisa);
        jButtonLimparPesquisa.setBounds(890, 410, 120, 30);

        jButtonOrdenarPorChamado.setText("Por Chamado");
        jButtonOrdenarPorChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorChamadoActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonOrdenarPorChamado);
        jButtonOrdenarPorChamado.setBounds(890, 520, 120, 30);

        jLabel1.setText("Ordenação:");
        jPanelPrincipal.add(jLabel1);
        jLabel1.setBounds(890, 500, 120, 20);

        jButtonOrdenarPorRG.setText("Por RG Militar");
        jButtonOrdenarPorRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorRGActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonOrdenarPorRG);
        jButtonOrdenarPorRG.setBounds(890, 560, 120, 30);

        jButtonOrdenarPorMantis.setText("Por Caso Mantis");
        jButtonOrdenarPorMantis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarPorMantisActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonOrdenarPorMantis);
        jButtonOrdenarPorMantis.setBounds(890, 600, 120, 30);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonExcluir);
        jButtonExcluir.setBounds(890, 50, 120, 30);

        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonSelecionar);
        jButtonSelecionar.setBounds(890, 460, 120, 30);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonSair);
        jButtonSair.setBounds(890, 660, 120, 30);

        jTabbedPanePrincipal.addTab("Chamados", jPanelPrincipal);

        jPanelDatas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatas.setLayout(null);

        jPanelControleDatas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelControleDatas.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de Datas"));
        jPanelControleDatas.setLayout(null);

        jLabel6.setText("Data da Criação:  *");
        jPanelControleDatas.add(jLabel6);
        jLabel6.setBounds(20, 30, 120, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataCriacao);
        jFormattedTextFieldDataCriacao.setBounds(20, 50, 70, 20);

        jLabel18.setText("Data de Atribuição: ");
        jPanelControleDatas.add(jLabel18);
        jLabel18.setBounds(140, 30, 130, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataAtribuicao);
        jFormattedTextFieldDataAtribuicao.setBounds(140, 50, 70, 20);

        jLabel19.setText("Data de Conclusão:");
        jPanelControleDatas.add(jLabel19);
        jLabel19.setBounds(260, 30, 120, 20);

        jFormattedTextFieldDataConclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataConclusaoActionPerformed(evt);
            }
        });
        jPanelControleDatas.add(jFormattedTextFieldDataConclusao);
        jFormattedTextFieldDataConclusao.setBounds(260, 50, 70, 20);

        jLabel20.setText("Data do Teste:");
        jPanelControleDatas.add(jLabel20);
        jLabel20.setBounds(380, 30, 100, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataTeste);
        jFormattedTextFieldDataTeste.setBounds(380, 50, 70, 20);

        jLabel21.setText("Data da Correção:");
        jPanelControleDatas.add(jLabel21);
        jLabel21.setBounds(480, 30, 110, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataCorrecao);
        jFormattedTextFieldDataCorrecao.setBounds(480, 50, 70, 20);

        jLabel22.setText("Data da Homologação (Cliente):");
        jPanelControleDatas.add(jLabel22);
        jLabel22.setBounds(260, 90, 170, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataHomologacaoDisp);
        jFormattedTextFieldDataHomologacaoDisp.setBounds(20, 110, 70, 20);

        jLabel23.setText("Data da Homologação (Disponibilização):");
        jPanelControleDatas.add(jLabel23);
        jLabel23.setBounds(20, 90, 210, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataHomologacaoCliente);
        jFormattedTextFieldDataHomologacaoCliente.setBounds(260, 110, 70, 20);

        jLabel24.setText("Data da Disponibilização (Produção):");
        jPanelControleDatas.add(jLabel24);
        jLabel24.setBounds(480, 90, 210, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataProducao);
        jFormattedTextFieldDataProducao.setBounds(480, 110, 70, 20);

        jLabel25.setText("Data da Finalização:");
        jPanelControleDatas.add(jLabel25);
        jLabel25.setBounds(600, 30, 130, 20);
        jPanelControleDatas.add(jFormattedTextFieldDataFinalizacao);
        jFormattedTextFieldDataFinalizacao.setBounds(600, 50, 70, 20);

        jPanelDatas.add(jPanelControleDatas);
        jPanelControleDatas.setBounds(10, 10, 720, 150);

        jButtonLimparDatas.setText("Limpar");
        jButtonLimparDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparDatasActionPerformed(evt);
            }
        });
        jPanelDatas.add(jButtonLimparDatas);
        jButtonLimparDatas.setBounds(740, 10, 120, 30);

        jTabbedPanePrincipal.addTab("Datas", jPanelDatas);

        jMenuArquivo.setText("Arquivo");
        jMenuBar1.add(jMenuArquivo);

        jMenuEditar.setText("Editar");
        jMenuBar1.add(jMenuEditar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1036)/2, (screenSize.height-781)/2, 1036, 781);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparPesquisaActionPerformed
        limparCamposDoFormulario(jPanelPesquisa);
        modeloTabela.getChamados().clear();
        modeloTabela.fireTableDataChanged();
    }//GEN-LAST:event_jButtonLimparPesquisaActionPerformed

    private void jButtonLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparFormActionPerformed
        limparCamposDoFormulario(jPanelFormulario);
        limparCamposDoFormulario(jPanelDatas);
        jTextFieldCodigo.setText("0");
        jFormattedTextFieldData.setText(JFrameUtil.date2String(dataAtual));
        jFormattedTextFieldDataCriacao.setText(JFrameUtil.date2String(dataAtual));
    }//GEN-LAST:event_jButtonLimparFormActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(isCamposObrigatoriosPreenchidos()){
            preencherChamado();
            modeloTabela.salvar(chamado);
            limparCamposDoFormulario(jPanelFormulario);
            limparCamposDoFormulario(jPanelDatas);
            jTextFieldCodigo.setText("0");
            jFormattedTextFieldData.setText(JFrameUtil.date2String(dataAtual));
            jFormattedTextFieldDataCriacao.setText(JFrameUtil.date2String(dataAtual));
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldChamadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldChamadoKeyPressed
        jTextFieldChamado.setText(jTextFieldChamado.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldChamadoKeyPressed

    private void jTextFieldChamadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldChamadoFocusLost
        jTextFieldChamado.setText(jTextFieldChamado.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldChamadoFocusLost

    private void jTextFieldRGMilitarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRGMilitarKeyPressed
        jTextFieldRGMilitar.setText(jTextFieldRGMilitar.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldRGMilitarKeyPressed

    private void jTextFieldRGMilitarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRGMilitarFocusLost
        jTextFieldRGMilitar.setText(jTextFieldRGMilitar.getText().replaceAll("[^0-9]", ""));
        if(!jTextFieldRGMilitar.getText().equals("")){
            String rgMilitar = jTextFieldRGMilitar.getText();
        
            chamados.clear();
            chamados = modeloTabela.pesquisarRGMilitar(rgMilitar);
        }
    }//GEN-LAST:event_jTextFieldRGMilitarFocusLost

    private void jTextFieldCasoMantisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCasoMantisKeyPressed
        jTextFieldCasoMantis.setText(jTextFieldCasoMantis.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldCasoMantisKeyPressed

    private void jTextFieldCasoMantisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCasoMantisFocusLost
        jTextFieldCasoMantis.setText(jTextFieldCasoMantis.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldCasoMantisFocusLost

    private void jTextFieldRGMilitarConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRGMilitarConsultaKeyPressed
        jTextFieldRGMilitarConsulta.setText(jTextFieldRGMilitarConsulta.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldRGMilitarConsultaKeyPressed

    private void jTextFieldRGMilitarConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldRGMilitarConsultaFocusLost
        jTextFieldRGMilitarConsulta.setText(jTextFieldRGMilitarConsulta.getText().replaceAll("[^0-9]", ""));
        if(!jTextFieldRGMilitarConsulta.getText().equals("")){
            String rgMilitar = jTextFieldRGMilitarConsulta.getText();
        
            chamados.clear();
            chamados = modeloTabela.pesquisarRGMilitar(rgMilitar);
        }
    }//GEN-LAST:event_jTextFieldRGMilitarConsultaFocusLost

    private void jTextFieldChamadoConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldChamadoConsultaKeyPressed
        jTextFieldChamadoConsulta.setText(jTextFieldChamadoConsulta.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldChamadoConsultaKeyPressed

    private void jTextFieldChamadoConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldChamadoConsultaFocusLost
        jTextFieldChamadoConsulta.setText(jTextFieldChamadoConsulta.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldChamadoConsultaFocusLost

    private void jTableChamadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableChamadosMousePressed
        selecionarChamadoDaTabela();
    }//GEN-LAST:event_jTableChamadosMousePressed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?", 
                    "Confirmação", JOptionPane.YES_NO_OPTION);
            
        if(confirmacao == JOptionPane.YES_OPTION){
            excluirChamado();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonOrdenarPorChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorChamadoActionPerformed
        modeloTabela.ordenarPorChamado();
    }//GEN-LAST:event_jButtonOrdenarPorChamadoActionPerformed

    private void jButtonOrdenarPorMantisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorMantisActionPerformed
        modeloTabela.ordenarPorCasoMantis();
    }//GEN-LAST:event_jButtonOrdenarPorMantisActionPerformed

    private void jButtonOrdenarPorRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarPorRGActionPerformed
        modeloTabela.ordenarPorRGMilitar();
    }//GEN-LAST:event_jButtonOrdenarPorRGActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        selecionarChamadoDaTabela();
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        Set<Chamado> chamadosTemp = new HashSet<Chamado>();
        
        String palavraChave, rgMilitar, chamado, casoMantis;
        Date data;
        
        if(!jTextFieldRGMilitarConsulta.getText().equals("")){
            rgMilitar = jTextFieldRGMilitarConsulta.getText();
            chamadosTemp.addAll(servico.getChamadosPorRG(rgMilitar));
        }
        if(!jTextFieldPalavraChaveConsulta.getText().equals("")){
            palavraChave = jTextFieldPalavraChaveConsulta.getText().toUpperCase();
            palavraChave = palavraChave.replaceAll(" ", "|");
            chamadosTemp.addAll(servico.getChamadosPorPalavraChave(palavraChave));
        }
        if(!jTextFieldChamadoConsulta.getText().equals("")){
            chamado = jTextFieldChamadoConsulta.getText();
            chamadosTemp.addAll(servico.getChamadosPorChamado(chamado));
        }
        if(!jTextFieldCasoMantisConsulta.getText().equals("")){
            casoMantis = jTextFieldCasoMantisConsulta.getText();
            chamadosTemp.addAll(servico.getChamadosPorChamado(casoMantis));
        }
        if(!jFormattedTextFieldDataConsulta.getText().equals("  /  /    ")){
            data = JFrameUtil.string2Date(jFormattedTextFieldDataConsulta.getText());
            chamadosTemp.addAll(servico.getChamadosPorData(data));
        }
        if(jTextFieldRGMilitarConsulta.getText().equals("") &&
                jTextFieldPalavraChaveConsulta.getText().equals("") &&
                jTextFieldChamadoConsulta.getText().equals("") &&
                jTextFieldCasoMantisConsulta.getText().equals("") &&
                jFormattedTextFieldDataConsulta.getText().equals("  /  /    ")){
            showMensagemDeAlerta("Ops!", "É necessário informar pelo menos um campo para pesquisar.");
            chamados.clear();
        }
        
        chamados.clear();
        chamados.addAll(chamadosTemp);
        modeloTabela.setChamados(chamadosTemp);
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonLimparDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparDatasActionPerformed
        limparCamposDoFormulario(jPanelControleDatas);
        jFormattedTextFieldDataCriacao.setText(JFrameUtil.date2String(dataAtual));
    }//GEN-LAST:event_jButtonLimparDatasActionPerformed

    private void jFormattedTextFieldDataConclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataConclusaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataConclusaoActionPerformed

    private void jTextFieldCasoMantisConsultaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCasoMantisConsultaFocusLost
        jTextFieldCasoMantisConsulta.setText(jTextFieldCasoMantisConsulta.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldCasoMantisConsultaFocusLost

    private void jTextFieldCasoMantisConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCasoMantisConsultaKeyPressed
        jTextFieldCasoMantisConsulta.setText(jTextFieldCasoMantisConsulta.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_jTextFieldCasoMantisConsultaKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimparDatas;
    private javax.swing.JButton jButtonLimparForm;
    private javax.swing.JButton jButtonLimparPesquisa;
    private javax.swing.JButton jButtonOrdenarPorChamado;
    private javax.swing.JButton jButtonOrdenarPorMantis;
    private javax.swing.JButton jButtonOrdenarPorRG;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JComboBox jComboBoxCorporacao;
    private javax.swing.JComboBox jComboBoxDesenvolvedor;
    private javax.swing.JComboBox jComboBoxProjeto;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataAtribuicao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataConclusao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataConsulta;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCorrecao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCriacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataFinalizacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataHomologacaoCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataHomologacaoDisp;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataProducao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataTeste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelChamado;
    private javax.swing.JLabel jLabelPalavraChave;
    private javax.swing.JLabel jLabelPalavraChave1;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JPanel jPanelControleDatas;
    private javax.swing.JPanel jPanelDatas;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTable jTableChamados;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextArea jTextAreaProblema;
    private javax.swing.JTextArea jTextAreaSolucao;
    private javax.swing.JTextField jTextFieldCasoMantis;
    private javax.swing.JTextField jTextFieldCasoMantisConsulta;
    private javax.swing.JTextField jTextFieldChamado;
    private javax.swing.JTextField jTextFieldChamadoConsulta;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldPalavraChave;
    private javax.swing.JTextField jTextFieldPalavraChaveConsulta;
    private javax.swing.JTextField jTextFieldRGMilitar;
    private javax.swing.JTextField jTextFieldRGMilitarConsulta;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método verifica se todos os campos obrigatóriso do formulário foram 
     * devidamente preenchidos e retorna verdadeiro ou falso, de acordo com a 
     * regra de negócio.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @return  boolean
     */
    private boolean isCamposObrigatoriosPreenchidos(){
        if(        jTextFieldCodigo         .getText().equals("") 
                || jFormattedTextFieldData  .getText().equals("  /  /    ")
                || jTextFieldChamado        .getText().equals("") 
                || jTextAreaDescricao       .getText().equals("")
                || jTextAreaProblema        .getText().equals("")
                || jFormattedTextFieldDataCriacao.getText().equals("  /  /    ")){
            
            showMensagemDeAlerta("Ops!", "É necessário preencher todos os campos obrigatórios!");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Este método valida se os campos do formulário foram preenchidos corretamente, 
     * posteriormente obtem os dados do formulário e armazena no objeto Chamado.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     */
    private void preencherChamado(){
        if(isCamposObrigatoriosPreenchidos()){
            try {
                Integer codigo, corporacao;
                Date data = null, dataCriacao = null, dataAtribuicao = null, dataConclusao = null, 
                        dataTeste = null, dataCorrecao = null, dataHomologacaoDisp = null, 
                        dataHomologacaoCliente = null, dataProducao = null, dataFinalizacao = null;
                String projeto, descricao, desenvolvedor, problema, solucao, palavraChave, 
                        rgMilitar = null, codChamado, casoMantis = null;

                data = JFrameUtil.string2Date(jFormattedTextFieldData.getText());
                dataCriacao = JFrameUtil.string2Date(jFormattedTextFieldDataCriacao.getText());

                if(jComboBoxDesenvolvedor.getSelectedIndex() > 0)
                    desenvolvedor   = jComboBoxDesenvolvedor.getSelectedItem().toString();
                else
                    desenvolvedor   = "";

                codigo      = Integer.parseInt(jTextFieldCodigo.getText());
                corporacao  = Integer.parseInt(jComboBoxCorporacao.getSelectedItem().toString());
                codChamado  = jTextFieldChamado.getText();
                rgMilitar   = jTextFieldRGMilitar.getText();
                casoMantis  = jTextFieldCasoMantis.getText();
                projeto     = jComboBoxProjeto.getSelectedItem().toString();
                palavraChave= jTextFieldPalavraChave.getText().toUpperCase();
                descricao   = jTextAreaDescricao.getText();
                solucao     = jTextAreaSolucao.getText();
                problema    = jTextAreaProblema.getText();

                dataAtribuicao  = jFormattedTextFieldDataAtribuicao.getText().equals("  /  /    ")  ? null : JFrameUtil.string2Date(jFormattedTextFieldDataAtribuicao.getText());
                dataConclusao   = jFormattedTextFieldDataConclusao.getText().equals("  /  /    ")   ? null : JFrameUtil.string2Date(jFormattedTextFieldDataConclusao.getText());
                dataTeste       = jFormattedTextFieldDataTeste.getText().equals("  /  /    ")       ? null : JFrameUtil.string2Date(jFormattedTextFieldDataTeste.getText());
                dataCorrecao    = jFormattedTextFieldDataCorrecao.getText().equals("  /  /    ")    ? null : JFrameUtil.string2Date(jFormattedTextFieldDataCorrecao.getText());
                dataHomologacaoDisp     = jFormattedTextFieldDataHomologacaoDisp.getText().equals("  /  /    ")     ? null : JFrameUtil.string2Date(jFormattedTextFieldDataHomologacaoDisp.getText());
                dataHomologacaoCliente  = jFormattedTextFieldDataHomologacaoCliente.getText().equals("  /  /    ")  ? null : JFrameUtil.string2Date(jFormattedTextFieldDataHomologacaoCliente.getText());
                dataProducao    = jFormattedTextFieldDataProducao.getText().equals("  /  /    ")    ? null : JFrameUtil.string2Date(jFormattedTextFieldDataProducao.getText());
                dataFinalizacao = jFormattedTextFieldDataFinalizacao.getText().equals("  /  /    ") ? null : JFrameUtil.string2Date(jFormattedTextFieldDataFinalizacao.getText());

                chamado = new Chamado(codigo, rgMilitar, data, corporacao, projeto, codChamado, casoMantis, descricao, desenvolvedor, problema, solucao, palavraChave, 
                        dataCriacao, dataAtribuicao, dataConclusao, dataTeste, dataCorrecao, dataHomologacaoDisp, dataHomologacaoCliente, dataProducao, dataFinalizacao);
            } catch (Exception e){
                e.printStackTrace();
                showMensagemDeErro("Ops!", "Houve um erro interno! Consulte o desenvolvedor.\n\nErro: "+e.getMessage());
            }
        }
    }
    
    /**
     * Este método recebe um Chamado e preenche os formulários com os dados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     */
    private void preencherFormulario(Chamado chamado){
        if(chamado != null){
            jTextFieldCodigo.setText(""+chamado.getId());
            jTextFieldRGMilitar.setText(chamado.getRgMilitar() != null ? ""+chamado.getRgMilitar() : "");
            jTextFieldChamado.setText(""+chamado.getChamado());
            jTextFieldCasoMantis.setText(chamado.getCasoMantis() != null ? ""+chamado.getCasoMantis() : "");
            
            jTextFieldPalavraChave.setText(chamado.getPalavraChave());
            jFormattedTextFieldData.setText(JFrameUtil.date2String(chamado.getData()));
            
            jComboBoxCorporacao.setSelectedItem(chamado.getCorporacao().toString());
            jComboBoxProjeto.setSelectedItem(chamado.getProjeto());
            jComboBoxDesenvolvedor.setSelectedItem(chamado.getDesenvolvedor());
            
            jTextAreaDescricao.setText(chamado.getDescricao());
            jTextAreaSolucao.setText(chamado.getSolucao());
            jTextAreaProblema.setText(chamado.getProblema());
            
            preencherFormularioDeDatas(chamado);
        } else {
            showMensagemDeAlerta("Ops!", "Objeto do Chamado ainda está nulo.");
        }
    }
    
    /**
     * Este método recebe um Chamado e preenche o formulário de data com os dados.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Chamado chamado
     */
    private void preencherFormularioDeDatas(Chamado chamado){
        if(chamado != null){
            jFormattedTextFieldDataAtribuicao.setText(chamado.getDataAtribuicao()   != null ? JFrameUtil.date2String(chamado.getDataAtribuicao()) : "");
            jFormattedTextFieldDataConclusao.setText(chamado.getDataConclusao()     != null ? JFrameUtil.date2String(chamado.getDataConclusao()) : "");
            jFormattedTextFieldDataCorrecao.setText(chamado.getDataCorrecao()       != null ? JFrameUtil.date2String(chamado.getDataCorrecao()) : "");
            jFormattedTextFieldDataCriacao.setText(chamado.getDataCriacao()         != null ? JFrameUtil.date2String(chamado.getDataCriacao()) : "");
            jFormattedTextFieldDataFinalizacao.setText(chamado.getDataFinalizacao() != null ? JFrameUtil.date2String(chamado.getDataFinalizacao()) : "");
            jFormattedTextFieldDataHomologacaoCliente.setText(chamado.getDataHomologacaoCliente()   != null ? JFrameUtil.date2String(chamado.getDataHomologacaoCliente()) : "");
            jFormattedTextFieldDataHomologacaoDisp.setText(chamado.getDataHomologacaoDisp()         != null ? JFrameUtil.date2String(chamado.getDataHomologacaoDisp()) : "");
            jFormattedTextFieldDataProducao.setText(chamado.getDataProducao()       != null ? JFrameUtil.date2String(chamado.getDataProducao()) : "");
            jFormattedTextFieldDataTeste.setText(chamado.getDataTeste()             != null ? JFrameUtil.date2String(chamado.getDataTeste()) : "");
        } else {
            showMensagemDeAlerta("Ops!", "Objeto do Chamado ainda está nulo.");
        }
    }
    
    /**
     * Este método seleciona um chamado da tabela e preenche o formulário com os dados.
     * 
     * @author  Átilla Barros
     * @date    07/02/2013
     */
    private void selecionarChamadoDaTabela() {
        if(jTableChamados.getSelectedRow() >= 0){
            int row = jTableChamados.getSelectedRow();
        
            chamado = chamados.get(row);
            preencherFormulario(chamado);
        } else {
            showMensagemDeAlerta("Ops!", "Selecione alguém, néh...");
        }
    }
    
    /**
     * Este método limpa todos os campos do formulário
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   Container formulario
     */
    private void limparCamposDoFormulario(Container formulario){
        JFrameUtil.limparCamposDoContainer(formulario);
    }
    
    /**
     * Este método recebe um título e uma mensagem como parâmentro e exibe uma
     * mensagem de erro.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   String titulo
     * @param   String msg
     */
    private void showMensagemDeErro(String titulo, String msg){
        JFrameUtil.showMensagemDeErro(titulo, msg);
    }
    
    /**
     * Este método recebe um título e uma mensagem como parâmentro e exibe uma
     * mensagem de informação.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   String titulo
     * @param   String msg
     */
    private void showMensagemDeInformacao(String titulo, String msg){
        JFrameUtil.showMensagemDeInformacao(titulo, msg);
    }
    
    /**
     * Este método recebe um título e uma mensagem como parâmentro e exibe uma
     * mensagem de alerta.
     * 
     * @author  Átilla Barros
     * @date    28/01/2013
     * @param   String titulo
     * @param   String msg
     */
    private void showMensagemDeAlerta(String titulo, String msg){
        JFrameUtil.showMensagemDeAlerta(titulo, msg);
    }

    private void excluirChamado() {
        preencherChamado();
        modeloTabela.excluir(chamado);
        limparCamposDoFormulario(jPanelFormulario);
        limparCamposDoFormulario(jPanelDatas);
        jTextFieldCodigo.setText("0");
        jFormattedTextFieldData.setText(JFrameUtil.date2String(dataAtual));
        jFormattedTextFieldDataCriacao.setText(JFrameUtil.date2String(dataAtual));
    }
}
