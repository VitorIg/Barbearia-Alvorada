package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;
    
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAgenda = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        LabelServico = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        JComboboxCliente = new javax.swing.JComboBox<>();
        JComboboxServico = new javax.swing.JComboBox<>();
        TextValor = new javax.swing.JTextField();
        TextFormatedData = new javax.swing.JFormattedTextField();
        TextFormatedHora = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonAgendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        LabelAgendaPainelFundo = new javax.swing.JLabel();
        LabelAgendaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Agendas");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 150, 60));

        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("Id");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        LabelServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelServico.setText("Servico");
        getContentPane().add(LabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor R$");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setText("Hora");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        TextId.setEditable(false);
        TextId.setText("0");
        TextId.setToolTipText("");
        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 280, 40));

        JComboboxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboboxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(JComboboxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 280, 40));

        JComboboxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboboxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(JComboboxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 280, 40));

        TextValor.setText("0");
        TextValor.setToolTipText("");
        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 280, 40));

        TextFormatedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 280, 40));

        TextFormatedHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(TextFormatedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 280, 40));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        jScrollPane2.setViewportView(TextObservacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 610, 280));

        ButtonAgendar.setBackground(new java.awt.Color(60, 233, 106));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 610, 50));

        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Servico", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(TableAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 1120, 330));

        jButtonVoltar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 950, 90, 40));

        LabelAgendaPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 990));

        LabelAgendaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(LabelAgendaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
     
    }//GEN-LAST:event_TextIdActionPerformed

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
      this.controller.agendar();
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
      
    }//GEN-LAST:event_TextValorActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        controller.voltarParaMenu();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void JComboboxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboboxServicoItemStateChanged
      this.controller.atualizaValor();
    }//GEN-LAST:event_JComboboxServicoItemStateChanged

    private void JComboboxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboboxClienteActionPerformed
    
    }//GEN-LAST:event_JComboboxClienteActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JComboBox<String> JComboboxCliente;
    private javax.swing.JComboBox<String> JComboboxServico;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelAgendaFundo;
    private javax.swing.JLabel LabelAgendaPainelFundo;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelServico;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JFormattedTextField TextFormatedData;
    private javax.swing.JFormattedTextField TextFormatedHora;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JTextField TextValor;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliene();
        this.controller.atualizaServico();
        this.controller.atualizaValor();
    }

    public JTable getTableAgendamentos() {
        return TableAgendamentos;
    }

    public void setTableAgendamentos(JTable TableAgendamentos) {
        this.TableAgendamentos = TableAgendamentos;
    }

    public JComboBox<String> getJComboboxCliente() {
        return JComboboxCliente;
    }

    public void setJComboboxCliente(JComboBox<String> JComboboxCliente) {
        this.JComboboxCliente = JComboboxCliente;
    }

    public JComboBox<String> getJComboboxServico() {
        return JComboboxServico;
    }

    public void setJComboboxServico(JComboBox<String> JComboboxServico) {
        this.JComboboxServico = JComboboxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JFormattedTextField getTextFormatedData() {
        return TextFormatedData;
    }

    public void setTextFormatedData(JFormattedTextField TextFormatedData) {
        this.TextFormatedData = TextFormatedData;
    }

    public JFormattedTextField getTextFormatedHora() {
        return TextFormatedHora;
    }

    public void setTextFormatedHora(JFormattedTextField TextFormatedHora) {
        this.TextFormatedHora = TextFormatedHora;
    }

    public JTextField getTextId() {
        return TextId;
    }

    public void setTextId(JTextField TextId) {
        this.TextId = TextId;
    }

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }  
}
