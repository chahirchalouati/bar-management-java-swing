/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestioneristoranteBar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ristorante extends javax.swing.JFrame {

    PasswordLogin passLogin;
    BigDecimal bd;
    Date dt = new Date();
    Tavolo objtav;
    Menu objmenu;
    Menu objbevande;
    Menu objdolci;
    List list = new List();
    LinkedList<Tavolo> listTavolo = new LinkedList();
    LinkedList<Tavolo> listPagamento = new LinkedList();
    FileClass fc = new FileClass();
    FileBinario objFilebinary;
    private double resto;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccedi;
    private javax.swing.JButton btnAddBevande;
    private javax.swing.JButton btnAddDolce;
    private javax.swing.JButton btnAddPasti;
    private javax.swing.JButton btnAggiorna;
    private javax.swing.JButton btnAggiungi;
    private javax.swing.JButton btnAggiungi1;
    private javax.swing.JButton btnCerca;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExitFrameLogin;
    private javax.swing.JButton btnExitFrameRistorante;
    private javax.swing.JButton btnFineTurni;
    private javax.swing.JButton btnFineTurno;
    private javax.swing.JButton btnIndietro;
    private javax.swing.JButton btnIndietroPrenotazioni;
    private javax.swing.JButton btnIndietroTurni;
    private javax.swing.JButton btnIndietroVediOrdini;
    private javax.swing.JButton btnInditeroPagamento;
    private javax.swing.JButton btnInziaTurni;
    private javax.swing.JButton btnInziaTurno;
    private javax.swing.JButton btnOrdina;
    private javax.swing.JButton btnPaga;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnPrenota;
    private javax.swing.JButton btnRegistrati;
    private javax.swing.JButton btnRimouvi;
    private javax.swing.JButton btnScontrino;
    private javax.swing.JButton btnServiti;
    private javax.swing.JButton btnVediOrdine;
    private javax.swing.JButton btnVisualizzaPrenotazioni;
    private javax.swing.JButton btnfVediOrdini;
    private javax.swing.ButtonGroup btngCheckboxPagamento;
    private javax.swing.JButton btnnumTavolo;
    private javax.swing.JCheckBox cboxBevande;
    private javax.swing.JCheckBox cboxDolci;
    private javax.swing.JCheckBox cboxPasti;
    private javax.swing.JComboBox<String> cbxAnni;
    private javax.swing.JComboBox<String> cbxAnnoPrenota;
    private javax.swing.JComboBox<String> cbxGiorniPrenota;
    private javax.swing.JComboBox<String> cbxMesePrenota;
    private javax.swing.JComboBox<String> cbxMesi;
    private javax.swing.JComboBox<String> cbxPersone;
    private javax.swing.JComboBox<String> cbxTavolo;
    private javax.swing.JCheckBox chbxContanti;
    private javax.swing.JCheckBox chbxCreditCard;
    private javax.swing.JFrame frameModificaMenu;
    private javax.swing.JFrame framePagamento;
    private javax.swing.JFrame framePrenota;
    private javax.swing.JFrame frameRistorante;
    private javax.swing.JFrame frameTurni;
    private javax.swing.JFrame frameVediOrdini;
    private javax.swing.JButton hbtnPrenotazioni;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblCercaOrdine;
    private javax.swing.JLabel lblDataPrenotazione;
    private javax.swing.JLabel lblNumTavolo;
    private javax.swing.JLabel lblPrezzoProdotto;
    private javax.swing.JPanel panelCartaDiCredito;
    private javax.swing.JTable tabBevande;
    private javax.swing.JTable tabDolci;
    private javax.swing.JTable tabPasti;
    private javax.swing.JTextField txtCercaOrdine;
    private javax.swing.JTextField txtCodiceCarta;
    private javax.swing.JTextField txtCognomePrenota;
    private javax.swing.JTextField txtCognomeTurni;
    private javax.swing.JTextField txtCvv;
    private javax.swing.JTextField txtDateTurni;
    private javax.swing.JTextField txtImporto;
    private javax.swing.JTextField txtNomeCognome;
    private javax.swing.JTextField txtNomePrenota;
    private javax.swing.JTextField txtNomeProdotto;
    private javax.swing.JTextField txtNomeTurni;
    private javax.swing.JTextField txtNumTavolo;
    private javax.swing.JPasswordField txtPassPassword;
    private javax.swing.JTextField txtPrezzoProdotto;
    private javax.swing.JTextField txtResto;
    private javax.swing.JTextField txtTotale;
    private javax.swing.JTextField txtTotalePagamento;
    private javax.swing.JTextArea txtaOrdina;
    private javax.swing.JTextArea txtaPagamento;
    private javax.swing.JTextArea txtaPrenotazioni;
    private javax.swing.JTextArea txtaServiti;
    private javax.swing.JTextArea txtaVediOrdini;
    public Ristorante() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtDateTurni.setEditable(false);
        panelCartaDiCredito.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ristorante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ristorante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ristorante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ristorante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ristorante().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameRistorante = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        cbxTavolo = new javax.swing.JComboBox<>();
        cbxPersone = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnInziaTurno = new javax.swing.JButton();
        btnFineTurno = new javax.swing.JButton();
        btnPrenota = new javax.swing.JButton();
        btnPagamento = new javax.swing.JButton();
        btnServiti = new javax.swing.JButton();
        btnOrdina = new javax.swing.JButton();
        btnAggiungi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPasti = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabBevande = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabDolci = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaServiti = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaOrdina = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTotale = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnVediOrdine = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAddBevande = new javax.swing.JButton();
        btnAddPasti = new javax.swing.JButton();
        btnAddDolce = new javax.swing.JButton();
        btnExitFrameRistorante = new javax.swing.JButton();
        framePagamento = new javax.swing.JFrame();
        lblCercaOrdine = new javax.swing.JLabel();
        txtCercaOrdine = new javax.swing.JTextField();
        chbxContanti = new javax.swing.JCheckBox();
        chbxCreditCard = new javax.swing.JCheckBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtaPagamento = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        btnPaga = new javax.swing.JButton();
        btnScontrino = new javax.swing.JButton();
        txtTotalePagamento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtImporto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtResto = new javax.swing.JTextField();
        btnInditeroPagamento = new javax.swing.JButton();
        btnCerca = new javax.swing.JButton();
        panelCartaDiCredito = new javax.swing.JPanel();
        txtCvv = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cbxMesi = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtCodiceCarta = new javax.swing.JTextField();
        cbxAnni = new javax.swing.JComboBox<>();
        btngCheckboxPagamento = new javax.swing.ButtonGroup();
        framePrenota = new javax.swing.JFrame();
        jLabel20 = new javax.swing.JLabel();
        txtNomePrenota = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCognomePrenota = new javax.swing.JTextField();
        hbtnPrenotazioni = new javax.swing.JButton();
        cbxGiorniPrenota = new javax.swing.JComboBox<>();
        cbxMesePrenota = new javax.swing.JComboBox<>();
        cbxAnnoPrenota = new javax.swing.JComboBox<>();
        btnVisualizzaPrenotazioni = new javax.swing.JButton();
        btnIndietroPrenotazioni = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtaPrenotazioni = new javax.swing.JTextArea();
        lblDataPrenotazione = new javax.swing.JLabel();
        frameVediOrdini = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtaVediOrdini = new javax.swing.JTextArea();
        btnfVediOrdini = new javax.swing.JButton();
        btnIndietroVediOrdini = new javax.swing.JButton();
        frameTurni = new javax.swing.JFrame();
        txtNomeTurni = new javax.swing.JTextField();
        txtCognomeTurni = new javax.swing.JTextField();
        btnInziaTurni = new javax.swing.JButton();
        btnFineTurni = new javax.swing.JButton();
        btnIndietroTurni = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtDateTurni = new javax.swing.JTextField();
        frameModificaMenu = new javax.swing.JFrame();
        cboxPasti = new javax.swing.JCheckBox();
        cboxBevande = new javax.swing.JCheckBox();
        cboxDolci = new javax.swing.JCheckBox();
        txtNumTavolo = new javax.swing.JTextField();
        lblNumTavolo = new javax.swing.JLabel();
        txtNomeProdotto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        lblPrezzoProdotto = new javax.swing.JLabel();
        txtPrezzoProdotto = new javax.swing.JTextField();
        btnIndietro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAggiorna = new javax.swing.JButton();
        btnRimouvi = new javax.swing.JButton();
        btnAggiungi1 = new javax.swing.JButton();
        btnnumTavolo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeCognome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassPassword = new javax.swing.JPasswordField();
        btnAccedi = new javax.swing.JButton();
        btnRegistrati = new javax.swing.JButton();
        btnExitFrameLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        frameRistorante.getContentPane().setLayout(new javax.swing.OverlayLayout(frameRistorante.getContentPane()));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel11.setFont(new java.awt.Font("SimSun", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Gestione Ristorante");

        jLabel12.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Chahir Chalouati");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        btnClear.setBackground(new java.awt.Color(0, 153, 153));
        btnClear.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbxTavolo.setBackground(new java.awt.Color(0, 153, 153));
        cbxTavolo.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        cbxTavolo.setForeground(new java.awt.Color(0, 0, 102));
        cbxTavolo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        cbxTavolo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbxPersone.setBackground(new java.awt.Color(0, 153, 153));
        cbxPersone.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        cbxPersone.setForeground(new java.awt.Color(0, 0, 102));
        cbxPersone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        cbxPersone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tavolo");

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Persone");

        btnInziaTurno.setBackground(new java.awt.Color(0, 153, 153));
        btnInziaTurno.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnInziaTurno.setForeground(new java.awt.Color(0, 0, 102));
        btnInziaTurno.setText("inzio Turno");
        btnInziaTurno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInziaTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInziaTurnoActionPerformed(evt);
            }
        });

        btnFineTurno.setBackground(new java.awt.Color(0, 153, 153));
        btnFineTurno.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnFineTurno.setForeground(new java.awt.Color(0, 0, 102));
        btnFineTurno.setText("Fine Turno");
        btnFineTurno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFineTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFineTurnoActionPerformed(evt);
            }
        });

        btnPrenota.setBackground(new java.awt.Color(0, 153, 153));
        btnPrenota.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnPrenota.setForeground(new java.awt.Color(0, 0, 102));
        btnPrenota.setText("Prenota");
        btnPrenota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrenota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrenotaActionPerformed(evt);
            }
        });

        btnPagamento.setBackground(new java.awt.Color(0, 153, 153));
        btnPagamento.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnPagamento.setForeground(new java.awt.Color(0, 0, 102));
        btnPagamento.setText("Pagamento");
        btnPagamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        btnServiti.setBackground(new java.awt.Color(0, 153, 153));
        btnServiti.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnServiti.setForeground(new java.awt.Color(0, 0, 102));
        btnServiti.setText("Serviti");
        btnServiti.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServiti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServitiActionPerformed(evt);
            }
        });

        btnOrdina.setBackground(new java.awt.Color(0, 153, 153));
        btnOrdina.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnOrdina.setForeground(new java.awt.Color(0, 0, 102));
        btnOrdina.setText("Ordina");
        btnOrdina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdinaActionPerformed(evt);
            }
        });

        btnAggiungi.setBackground(new java.awt.Color(0, 153, 153));
        btnAggiungi.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnAggiungi.setForeground(new java.awt.Color(0, 0, 102));
        btnAggiungi.setText("Modifica Menu");
        btnAggiungi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungiActionPerformed(evt);
            }
        });

        tabPasti.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tabPasti.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Couscous", new Double(7.99), null},
                        {"pasta Al Forno", new Double(6.99), null},
                        {"Pizza", new Double(4.99), null},
                        {"Tagliatelle", new Double(3.99), null}
                },
                new String[]{
                        "Pasto", "Prezzo", "Quantita"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabPasti);

        tabBevande.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tabBevande.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Pepsi", 1.99, null},
                        {"Sprite", 1.99, null},
                        {"Fanta", 1.99, null},
                        {"Aqua", 1.99, null}
                },
                new String[]{
                        "Bevande", "Prezzo", "Quabtita"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabBevande);

        tabDolci.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        tabDolci.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {"Biscotti", 3.99, null},
                        {"Torata", 3.99, null},
                        {"Pancake", 4.99, null},
                        {"Cheese-cake", 2.99, null}
                },
                new String[]{
                        "Dolce", "Prezzo", "Quantita"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabDolci);

        txtaServiti.setColumns(20);
        txtaServiti.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtaServiti.setRows(5);
        jScrollPane4.setViewportView(txtaServiti);

        txtaOrdina.setColumns(20);
        txtaOrdina.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtaOrdina.setRows(5);
        jScrollPane5.setViewportView(txtaOrdina);

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ordini");

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Serviti");

        txtTotale.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        txtTotale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotaleActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Totale :");

        btnVediOrdine.setBackground(new java.awt.Color(0, 153, 153));
        btnVediOrdine.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnVediOrdine.setForeground(new java.awt.Color(0, 0, 102));
        btnVediOrdine.setText("VediOrdini");
        btnVediOrdine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVediOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVediOrdineActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        btnAddBevande.setBackground(new java.awt.Color(0, 153, 153));
        btnAddBevande.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnAddBevande.setForeground(new java.awt.Color(0, 0, 102));
        btnAddBevande.setText("AddBevande");
        btnAddBevande.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddBevande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBevandeActionPerformed(evt);
            }
        });

        btnAddPasti.setBackground(new java.awt.Color(0, 153, 153));
        btnAddPasti.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnAddPasti.setForeground(new java.awt.Color(0, 0, 102));
        btnAddPasti.setText("AddPasto");
        btnAddPasti.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPasti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPastiActionPerformed(evt);
            }
        });

        btnAddDolce.setBackground(new java.awt.Color(0, 153, 153));
        btnAddDolce.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnAddDolce.setForeground(new java.awt.Color(0, 0, 102));
        btnAddDolce.setText("AddDolce");
        btnAddDolce.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddDolce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDolceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAddBevande, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddDolce, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAddPasti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAddPasti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddBevande)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddDolce)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExitFrameRistorante.setBackground(new java.awt.Color(0, 153, 153));
        btnExitFrameRistorante.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnExitFrameRistorante.setText("Exit");
        btnExitFrameRistorante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExitFrameRistorante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitFrameRistoranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cbxTavolo, javax.swing.GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(cbxPersone, 0, 105, Short.MAX_VALUE)
                                                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnInziaTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnFineTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnPrenota, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnServiti, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnVediOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(btnAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(91, 91, 91))
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(btnOrdina, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 176, Short.MAX_VALUE))
                                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(btnExitFrameRistorante, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(txtTotale, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(18, 18, 18)))
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(38, 38, 38)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, btnFineTurno, btnInziaTurno, btnPagamento, btnPrenota, btnServiti);

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, jScrollPane1, jScrollPane2, jScrollPane3);

        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbxTavolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxPersone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnInziaTurno)
                                        .addComponent(btnFineTurno)
                                        .addComponent(btnPrenota)
                                        .addComponent(btnPagamento)
                                        .addComponent(btnServiti)
                                        .addComponent(btnVediOrdine))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(btnAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(68, 68, 68))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(btnOrdina, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(47, 47, 47)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtTotale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(63, 63, 63)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnClear)
                                                                .addComponent(btnExitFrameRistorante)))))
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, btnFineTurno, btnInziaTurno, btnPagamento, btnPrenota, btnServiti);

        frameRistorante.getContentPane().add(jPanel4);

        lblCercaOrdine.setText("CercaOrdine");

        btngCheckboxPagamento.add(chbxContanti);
        chbxContanti.setText("Contanti");
        chbxContanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxContantiActionPerformed(evt);
            }
        });

        btngCheckboxPagamento.add(chbxCreditCard);
        chbxCreditCard.setText("Credit Card");
        chbxCreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxCreditCardActionPerformed(evt);
            }
        });

        txtaPagamento.setColumns(20);
        txtaPagamento.setRows(5);
        jScrollPane6.setViewportView(txtaPagamento);

        jLabel15.setText("Ordine");

        btnPaga.setText("Paga");
        btnPaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagaActionPerformed(evt);
            }
        });

        btnScontrino.setText("Scontrino");
        btnScontrino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScontrinoActionPerformed(evt);
            }
        });

        jLabel17.setText("Totale");

        jLabel18.setText("Importo");

        jLabel19.setText("Resto");

        btnInditeroPagamento.setText("Indietro");
        btnInditeroPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInditeroPagamentoActionPerformed(evt);
            }
        });

        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });

        panelCartaDiCredito.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel25.setText("Codice Carta ");

        jLabel23.setText("Mese");

        cbxMesi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "11", "12"}));

        jLabel24.setText("Anni");

        jLabel22.setText("CVV");

        cbxAnni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2010", "2011", "2012", "2013 ", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029"}));
        cbxAnni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAnniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCartaDiCreditoLayout = new javax.swing.GroupLayout(panelCartaDiCredito);
        panelCartaDiCredito.setLayout(panelCartaDiCreditoLayout);
        panelCartaDiCreditoLayout.setHorizontalGroup(
                panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCartaDiCreditoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelCartaDiCreditoLayout.createSequentialGroup()
                                                .addGroup(panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbxMesi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbxAnni, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(146, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCartaDiCreditoLayout.createSequentialGroup()
                                                .addGroup(panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtCodiceCarta)
                                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(panelCartaDiCreditoLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                                                        .addComponent(txtCvv))))
                                                .addGap(17, 17, 17))))
        );
        panelCartaDiCreditoLayout.setVerticalGroup(
                panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCartaDiCreditoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCartaDiCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbxMesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxAnni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodiceCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout framePagamentoLayout = new javax.swing.GroupLayout(framePagamento.getContentPane());
        framePagamento.getContentPane().setLayout(framePagamentoLayout);
        framePagamentoLayout.setHorizontalGroup(
                framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(lblCercaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(framePagamentoLayout.createSequentialGroup()
                                                                        .addComponent(txtCercaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(btnCerca)))))
                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePagamentoLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnInditeroPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32))
                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                                .addGap(45, 107, Short.MAX_VALUE)
                                                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                                                .addComponent(chbxContanti)
                                                                                .addGap(48, 48, 48)
                                                                                .addComponent(chbxCreditCard))
                                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtImporto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtTotalePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtResto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                                                .addComponent(btnPaga, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnScontrino, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(64, 64, 64)))
                                                .addComponent(panelCartaDiCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76))))
        );
        framePagamentoLayout.setVerticalGroup(
                framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(chbxContanti)
                                                        .addComponent(chbxCreditCard)))
                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(lblCercaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCercaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCerca))))
                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTotalePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtImporto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtResto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(58, 58, 58)
                                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnScontrino)
                                                        .addComponent(btnPaga))
                                                .addGap(32, 160, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePagamentoLayout.createSequentialGroup()
                                                .addGroup(framePagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane6))
                                                        .addGroup(framePagamentoLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(panelCartaDiCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnInditeroPagamento)))
                                                .addContainerGap())))
        );

        jLabel20.setText("Nome");

        jLabel21.setText("Cognome");

        hbtnPrenotazioni.setText("Prenota");
        hbtnPrenotazioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbtnPrenotazioniActionPerformed(evt);
            }
        });

        cbxGiorniPrenota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        cbxMesePrenota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));

        cbxAnnoPrenota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2010", "2011", "2012", "2013 ", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029"}));

        btnVisualizzaPrenotazioni.setText("VisualizzaPrenotazioni");
        btnVisualizzaPrenotazioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizzaPrenotazioniActionPerformed(evt);
            }
        });

        btnIndietroPrenotazioni.setText("Indietro");
        btnIndietroPrenotazioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroPrenotazioniActionPerformed(evt);
            }
        });

        txtaPrenotazioni.setColumns(20);
        txtaPrenotazioni.setRows(5);
        jScrollPane9.setViewportView(txtaPrenotazioni);

        javax.swing.GroupLayout framePrenotaLayout = new javax.swing.GroupLayout(framePrenota.getContentPane());
        framePrenota.getContentPane().setLayout(framePrenotaLayout);
        framePrenotaLayout.setHorizontalGroup(
                framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnIndietroPrenotazioni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisualizzaPrenotazioni, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))
                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                .addGroup(framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(hbtnPrenotazioni, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                                                .addComponent(cbxGiorniPrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cbxMesePrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cbxAnnoPrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtNomePrenota, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                                                .addComponent(txtCognomePrenota)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePrenotaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDataPrenotazione, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
        );

        framePrenotaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, jLabel20, jLabel21);

        framePrenotaLayout.setVerticalGroup(
                framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                .addGroup(framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNomePrenota, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtCognomePrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbxGiorniPrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbxMesePrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbxAnnoPrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                                .addComponent(hbtnPrenotazioni, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblDataPrenotazione, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(jScrollPane9)))
                                .addGroup(framePrenotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(framePrenotaLayout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(btnIndietroPrenotazioni)
                                                .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePrenotaLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnVisualizzaPrenotazioni, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26))))
        );

        framePrenotaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, jLabel20, jLabel21, txtCognomePrenota, txtNomePrenota);

        frameVediOrdini.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtaVediOrdini.setColumns(20);
        txtaVediOrdini.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtaVediOrdini.setRows(5);
        jScrollPane8.setViewportView(txtaVediOrdini);

        frameVediOrdini.getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 490, 410));

        btnfVediOrdini.setText("VediOrdini");
        btnfVediOrdini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfVediOrdiniActionPerformed(evt);
            }
        });
        frameVediOrdini.getContentPane().add(btnfVediOrdini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, 40));

        btnIndietroVediOrdini.setText("Indietro");
        btnIndietroVediOrdini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroVediOrdiniActionPerformed(evt);
            }
        });
        frameVediOrdini.getContentPane().add(btnIndietroVediOrdini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txtNomeTurni.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        txtCognomeTurni.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        btnInziaTurni.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnInziaTurni.setText("Inzia");
        btnInziaTurni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInziaTurniActionPerformed(evt);
            }
        });

        btnFineTurni.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnFineTurni.setText("Fine");
        btnFineTurni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFineTurniActionPerformed(evt);
            }
        });

        btnIndietroTurni.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnIndietroTurni.setText("Indietro");
        btnIndietroTurni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroTurniActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel26.setText("Nome");

        jLabel27.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel27.setText("Cognome");

        txtDateTurni.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        javax.swing.GroupLayout frameTurniLayout = new javax.swing.GroupLayout(frameTurni.getContentPane());
        frameTurni.getContentPane().setLayout(frameTurniLayout);
        frameTurniLayout.setHorizontalGroup(
                frameTurniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameTurniLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnIndietroTurni, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(frameTurniLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(frameTurniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCognomeTurni, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                        .addComponent(txtNomeTurni)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                .addGroup(frameTurniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnInziaTurni, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(btnFineTurni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameTurniLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDateTurni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        frameTurniLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, jLabel26, jLabel27);

        frameTurniLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, txtCognomeTurni, txtNomeTurni);

        frameTurniLayout.setVerticalGroup(
                frameTurniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameTurniLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtDateTurni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(frameTurniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(frameTurniLayout.createSequentialGroup()
                                                .addComponent(btnInziaTurni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(btnFineTurni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(frameTurniLayout.createSequentialGroup()
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNomeTurni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCognomeTurni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addComponent(btnIndietroTurni)
                                .addGap(24, 24, 24))
        );

        frameTurniLayout.linkSize(javax.swing.SwingConstants.VERTICAL, jLabel26, jLabel27);

        frameTurniLayout.linkSize(javax.swing.SwingConstants.VERTICAL, txtCognomeTurni, txtNomeTurni);

        cboxPasti.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboxPasti.setText("Pasti");

        cboxBevande.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboxBevande.setText("Bevande");

        cboxDolci.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboxDolci.setText("Dolci");

        txtNumTavolo.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N

        lblNumTavolo.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        lblNumTavolo.setText("NumTavolo");

        txtNomeProdotto.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        jLabel28.setText("Nome Prodotto");

        lblPrezzoProdotto.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        lblPrezzoProdotto.setText("Prezzo");

        txtPrezzoProdotto.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N

        btnIndietro.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        btnIndietro.setText("indietro");
        btnIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        btnAggiorna.setBackground(new java.awt.Color(0, 102, 102));
        btnAggiorna.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        btnAggiorna.setText("Aggiorna");
        btnAggiorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiornaActionPerformed(evt);
            }
        });

        btnRimouvi.setBackground(new java.awt.Color(0, 102, 102));
        btnRimouvi.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        btnRimouvi.setText("Rimouvi");
        btnRimouvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRimouviActionPerformed(evt);
            }
        });

        btnAggiungi1.setBackground(new java.awt.Color(0, 102, 102));
        btnAggiungi1.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        btnAggiungi1.setText("Aggiungi");
        btnAggiungi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggiungi1ActionPerformed(evt);
            }
        });

        btnnumTavolo.setBackground(new java.awt.Color(0, 102, 102));
        btnnumTavolo.setFont(new java.awt.Font("Lucida Bright", 3, 11)); // NOI18N
        btnnumTavolo.setText("numTavolo");
        btnnumTavolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnumTavoloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnRimouvi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAggiorna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnnumTavolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnAggiungi1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAggiungi1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRimouvi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnumTavolo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout frameModificaMenuLayout = new javax.swing.GroupLayout(frameModificaMenu.getContentPane());
        frameModificaMenu.getContentPane().setLayout(frameModificaMenuLayout);
        frameModificaMenuLayout.setHorizontalGroup(
                frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                                .addComponent(cboxPasti, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboxBevande)
                                                .addGap(29, 29, 29)
                                                .addComponent(cboxDolci, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                                .addComponent(lblPrezzoProdotto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtPrezzoProdotto, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNomeProdotto, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                                .addComponent(lblNumTavolo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNumTavolo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
        );
        frameModificaMenuLayout.setVerticalGroup(
                frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                .addGroup(frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cboxPasti)
                                                        .addComponent(cboxBevande)
                                                        .addComponent(cboxDolci))
                                                .addGap(70, 70, 70)
                                                .addGroup(frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtNomeProdotto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtPrezzoProdotto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblPrezzoProdotto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(frameModificaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblNumTavolo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNumTavolo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(frameModificaMenuLayout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(btnIndietro)
                                .addGap(29, 29, 29))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Ristorante");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 210, 82));

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Chahir chalouati");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 69, 119, 25));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Nome/Cognome");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 20));

        txtNomeCognome.setBackground(new java.awt.Color(0, 153, 204));
        txtNomeCognome.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        txtNomeCognome.setForeground(new java.awt.Color(0, 0, 102));
        txtNomeCognome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 153)));
        txtNomeCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCognomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNomeCognome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 20));

        txtPassPassword.setBackground(new java.awt.Color(0, 153, 204));
        txtPassPassword.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        txtPassPassword.setForeground(new java.awt.Color(0, 0, 102));
        txtPassPassword.setText("jPasswordField1");
        txtPassPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 153)));
        txtPassPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(txtPassPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 219, 250, 20));

        btnAccedi.setBackground(new java.awt.Color(0, 153, 204));
        btnAccedi.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnAccedi.setForeground(new java.awt.Color(0, 0, 153));
        btnAccedi.setText("Accedi");
        btnAccedi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccediActionPerformed(evt);
            }
        });
        jPanel2.add(btnAccedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, 30));

        btnRegistrati.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrati.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnRegistrati.setForeground(new java.awt.Color(0, 0, 153));
        btnRegistrati.setText("Registrati");
        btnRegistrati.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistratiActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrati, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 120, 30));

        btnExitFrameLogin.setBackground(new java.awt.Color(0, 153, 204));
        btnExitFrameLogin.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnExitFrameLogin.setForeground(new java.awt.Color(0, 0, 153));
        btnExitFrameLogin.setText("Exit");
        btnExitFrameLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(btnExitFrameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 60, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 0, 420, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestioneristoranteBar/Image/barberousse.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 450, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassPasswordMouseClicked
        txtPassPassword.setText(null);
    }//GEN-LAST:event_txtPassPasswordMouseClicked

    private void btnAccediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccediActionPerformed

        // usare lo stesso file binario per  avere l accesso al programma non finito leggi il primo commento  nella classe file binario
        String Username = txtNomeCognome.getText();
        String Password = txtPassPassword.getText();
        try {
            if (fc.filereader("Username.txt", Username) && fc.filereader("Password.txt", Password)) {
                frameRistorante.setSize(1100, 700);
                frameRistorante.setLocationRelativeTo(null);

                frameRistorante.setVisible(true);
            } else if (!fc.filereader("Username.txt", Username) || !fc.filereader("Password.txt", Password)) {
                JOptionPane.showMessageDialog(null, "password O Username sbagliati");
            }

        } catch (FileNotFoundException ex) {

        }


    }//GEN-LAST:event_btnAccediActionPerformed

    private void btnRegistratiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistratiActionPerformed
        String Username = txtNomeCognome.getText();
        String Password = txtPassPassword.getText();
        passLogin = new PasswordLogin(Password);

        if (passLogin.PasswordValido()) {

            try {
                fc.ScrivereCon_PrintWriter("Username.txt", Username);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, " User Name aggiunto al File ");
            }

            try {
                fc.ScrivereCon_PrintWriter("Password.txt", Password);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, " Password aggiunto al File ");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Password deve contenere almeno 8 caratteri ");
        }


    }//GEN-LAST:event_btnRegistratiActionPerformed

    private void btnAddPastiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPastiActionPerformed
        try {

            int i = tabPasti.getSelectedRow();
            if (i <= -1) {
                JOptionPane.showMessageDialog(null, "Non hai selzionato un ordine ");
            } else {
                objmenu = new Menu((String) tabPasti.getValueAt(i, 0), (Double) tabPasti.getValueAt(i, 1), (Integer) tabPasti.getValueAt(i, 2));
                list.aggiungi(objmenu);
                txtaOrdina.setText(objmenu.Pasto() + "\n" + objmenu.totale() + "\n");
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnAddPastiActionPerformed

    private void btnAddDolceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDolceActionPerformed
        try {

            int i = tabDolci.getSelectedRow();
            if (i <= -1) {
                JOptionPane.showMessageDialog(null, "Non hai selzionato un ordine ");
            } else {
                objdolci = new Menu((String) tabDolci.getValueAt(i, 0), (Double) tabDolci.getValueAt(i, 1), (Integer) tabDolci.getValueAt(i, 2));
                list.aggiungi(objdolci);
                txtaOrdina.setText(objdolci.Pasto() + "\n" + objdolci.totale() + "\n");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnAddDolceActionPerformed

    private void btnAddBevandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBevandeActionPerformed
        try {

            int i = tabBevande.getSelectedRow();
            if (i <= -1) {
                JOptionPane.showMessageDialog(null, "Non hai selzionato un ordine ");
            } else {
                objbevande = new Menu((String) tabBevande.getValueAt(i, 0), (Double) tabBevande.getValueAt(i, 1), (Integer) tabBevande.getValueAt(i, 2));
                list.aggiungi(objbevande);
                txtaOrdina.setText(objbevande.Pasto() + "\n" + objbevande.totale() + "\n");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAddBevandeActionPerformed

    private void btnOrdinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdinaActionPerformed
        try {

            objtav = new Tavolo(cbxTavolo.getSelectedIndex(), cbxPersone.getSelectedIndex());
            if (objtav.getNumeroPersone() >= 1 && objtav.getNumeroTavolo() >= 1) {
                if (!list.getListMenu().isEmpty()) {
                    objtav.setList(list);
                    listTavolo.addFirst(objtav);
                    listPagamento.addFirst(objtav);
                    txtaOrdina.setText("Ordine numero :" + "\t" + listTavolo.size() + "\n" + objtav.VisualizzaTavolo() + "\n");

                    int decimalPlaces = 2;
                    bd = BigDecimal.valueOf(objtav.getList().TotaleLista());
                    bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP);
                    double r = bd.doubleValue();


                    txtTotale.setText(String.valueOf(r));

                } else {

                    JOptionPane.showMessageDialog(null, "Non hai fatto un ordine ");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleziona un tavolo e numero di persone ");
            }

        } catch (Exception e) {

        }
        tabPasti.clearSelection();
        tabBevande.clearSelection();
        tabDolci.clearSelection();
        cbxPersone.setSelectedIndex(0);
        cbxTavolo.setSelectedIndex(0);
        list.Cancella();

    }//GEN-LAST:event_btnOrdinaActionPerformed

    private void btnVediOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVediOrdineActionPerformed
        frameVediOrdini.setSize(950, 500);
        frameVediOrdini.setVisible(true);


    }//GEN-LAST:event_btnVediOrdineActionPerformed

    private void btnServitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServitiActionPerformed
        if (listTavolo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Non ci sono Ordini ");
            txtaServiti.setText(null);
            txtTotale.setText("");
        } else {
            txtaOrdina.setText(null);

            txtaServiti.setText("Ordine numero :" + "\t" + listTavolo.size() + "\n" + objtav.VisualizzaTavolo() + "\n");
            listTavolo.removeLast();

        }


    }//GEN-LAST:event_btnServitiActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        framePagamento.setSize(1003, 500);
        framePagamento.setLocationRelativeTo(null);
        framePagamento.setVisible(true);
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void btnPrenotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrenotaActionPerformed

        lblDataPrenotazione.setText(dt.toLocaleString());
        framePrenota.setSize(800, 500);

        framePrenota.setVisible(true);


    }//GEN-LAST:event_btnPrenotaActionPerformed

    private void hbtnPrenotazioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbtnPrenotazioniActionPerformed
        try {
            lblDataPrenotazione.setText(dt.toLocaleString());
            String Prenota = dt.toLocaleString()
                    + "\n" + txtNomePrenota.getText()
                    + "\n" + txtCognomePrenota.getText()
                    + "\n" + cbxGiorniPrenota.getSelectedItem()
                    + "\n" + cbxMesePrenota.getSelectedItem()
                    + "\n" + cbxAnnoPrenota.getSelectedItem();
            fc.ScrivereCon_PrintWriter("Prenotazioni.txt", Prenota);
            JOptionPane.showMessageDialog(null, "Prenotazione Aggiunta");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "file Prenotazioni non e stato creato ");

        }

    }//GEN-LAST:event_hbtnPrenotazioniActionPerformed

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        try {

            int i = Integer.parseInt(txtCercaOrdine.getText());
            if (listPagamento.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Non ci sono Ordini");
            } else if (i >= 1) {
                txtaPagamento.setText(listPagamento.get(i - 1).VisualizzaTavolo());
                int decimalPlaces = 2;
                bd = BigDecimal.valueOf(listPagamento.get(i - 1).list.TotaleLista());
                bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP);
                double r = bd.doubleValue();
                txtTotalePagamento.setText(String.valueOf(r));
            } else {
                JOptionPane.showMessageDialog(null, "Hai inserito un numero non Valido");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "inserisci solo numeri ");

        }
    }//GEN-LAST:event_btnCercaActionPerformed

    private void btnPagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagaActionPerformed
        try {

            if (chbxContanti.isSelected()) {

                if (Double.parseDouble(txtImporto.getText()) >= Double.parseDouble(txtTotalePagamento.getText())) {
                    resto = Double.parseDouble(txtImporto.getText()) - Double.parseDouble(txtTotalePagamento.getText());
                    txtResto.setText(String.valueOf(resto));

                } else {

                    JOptionPane.showMessageDialog(null, "saldo insuffiscente");
                    txtImporto.setText(null);

                }

            } else if (chbxCreditCard.isSelected()) {

                try {
                    String codeCarta = txtCodiceCarta.getText();
                    String cvv = txtCvv.getText();
                    if (codeCarta.length() == 12 && cvv.length() == 3) {

                        String DatiCarta = "Mese  :" + cbxMesi.getSelectedItem() + "\n" + "Anno  :" + cbxAnni.getSelectedItem() + "\n" + "Il  codice della carta e :" + txtCodiceCarta.getText() + "\n" + txtCvv.getText() + "\n";
                        txtaPagamento.append(DatiCarta);

                    } else if (codeCarta.length() != 12 && cvv.length() != 3) {
                        JOptionPane.showMessageDialog(null, "inserisci i valori giusti della sua carta Grazie");

                    }
                } catch (HeadlessException | NumberFormatException e) {

                    JOptionPane.showMessageDialog(null, "inserisci Solo numeri  Grazie");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Seleziona una metodo di pagamento");
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "inserisci un importo valido");

        }


    }//GEN-LAST:event_btnPagaActionPerformed

    private void btnScontrinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScontrinoActionPerformed

        String testo = null;

        if (chbxContanti.isSelected()) {
            testo = dt.toLocaleString() + "\n" + txtaPagamento.getText() + "\n" + "Totale  :" + txtTotale.getText() + "\n" + "Importo  :" + txtImporto.getText() + "\n" + "Resto  :" + txtResto.getText();
        } else if (chbxCreditCard.isSelected()) {
            testo = dt.toLocaleString() + "\n" + txtaPagamento.getText() + "\n";
        }
        try {
            fc.ScrivereCon_PrintWriter("Scontrino.txt", testo);

            JOptionPane.showMessageDialog(null, " Scontrino creato");
        } catch (IOException ignored) {

        }


    }//GEN-LAST:event_btnScontrinoActionPerformed

    private void btnInditeroPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInditeroPagamentoActionPerformed
        framePagamento.dispose();
        txtCercaOrdine.setText(null);
        txtResto.setText(null);
        txtCodiceCarta.setText(null);
        txtImporto.setText(null);
        txtTotalePagamento.setText(null);
        txtaPagamento.setText(null);
        chbxContanti.setSelected(false);
        chbxCreditCard.setSelected(false);
    }//GEN-LAST:event_btnInditeroPagamentoActionPerformed

    private void cbxAnniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAnniActionPerformed

    }//GEN-LAST:event_cbxAnniActionPerformed

    private void chbxCreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxCreditCardActionPerformed
        panelCartaDiCredito.setVisible(true);
    }//GEN-LAST:event_chbxCreditCardActionPerformed

    private void chbxContantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxContantiActionPerformed
        panelCartaDiCredito.setVisible(false);
    }//GEN-LAST:event_chbxContantiActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCercaOrdine.setText(null);
        txtCodiceCarta.setText(null);
        txtCognomePrenota.setText(null);
        txtCvv.setText(null);
        lblDataPrenotazione.setText(null);
        txtImporto.setText(null);
        txtNomeCognome.setText(null);
        txtNomePrenota.setText(null);
        txtPassPassword.setText(null);
        txtResto.setText(null);
        txtTotale.setText(null);
        txtTotalePagamento.setText(null);
        txtaOrdina.setText(null);
        txtaPagamento.setText(null);
        txtaServiti.setText(null);
        txtaVediOrdini.setText(null);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnfVediOrdiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfVediOrdiniActionPerformed

        try {
            txtaVediOrdini.setText(fc.LeggiFile("Scontrino.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ristorante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnfVediOrdiniActionPerformed

    private void btnIndietroVediOrdiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroVediOrdiniActionPerformed
        frameVediOrdini.dispose();
        txtaVediOrdini.setText(null);
    }//GEN-LAST:event_btnIndietroVediOrdiniActionPerformed

    private void btnInziaTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInziaTurnoActionPerformed
        frameTurni.setSize(700, 400);
        frameTurni.setVisible(true);

        btnFineTurni.setVisible(false);
        btnInziaTurni.setVisible(true);
        txtDateTurni.setText(dt.toLocaleString());
    }//GEN-LAST:event_btnInziaTurnoActionPerformed

    private void btnIndietroTurniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroTurniActionPerformed
        frameTurni.dispose();
        txtDateTurni.setText(null);
        txtNomeTurni.setText(null);
        txtCognomeTurni.setText(null);
    }//GEN-LAST:event_btnIndietroTurniActionPerformed

    private void btnFineTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFineTurnoActionPerformed
        frameTurni.setSize(700, 400);
        frameTurni.setVisible(true);

        btnInziaTurni.setVisible(false);
        btnFineTurni.setVisible(true);
        txtDateTurni.setText(dt.toLocaleString());


    }//GEN-LAST:event_btnFineTurnoActionPerformed

    private void txtNomeCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCognomeActionPerformed

    private void btnInziaTurniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInziaTurniActionPerformed

        try {

            txtDateTurni.setText(dt.toLocaleString());
            String nome = txtNomeTurni.getText();
            String cognome = txtCognomeTurni.getText();

            if (!"".equals(nome) && !"".equals(cognome)) {
                String turni = txtDateTurni.getText() + "\n" + txtNomeTurni.getText() + "\n" + txtCognomeTurni.getText();
                fc.ScrivereCon_PrintWriter("turni.txt", turni);
                JOptionPane.showMessageDialog(null, "Buon Lavoloro  : " + txtNomeTurni.getText());

            } else if ("".equals(nome) && "".equals(cognome)) {
                JOptionPane.showMessageDialog(null, "inserisci nome e cognome");

            }

        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "file non e stato creato");
        }


    }//GEN-LAST:event_btnInziaTurniActionPerformed

    private void btnFineTurniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFineTurniActionPerformed
        try {

            txtDateTurni.setText(dt.toLocaleString());
            String nome = txtNomeTurni.getText();
            String cognome = txtCognomeTurni.getText();

            if (!"".equals(nome) && !"".equals(cognome)) {
                String turni = txtDateTurni.getText() + "\n" + txtNomeTurni.getText() + "\n" + txtCognomeTurni.getText();
                fc.ScrivereCon_PrintWriter("turni.txt", turni);
                JOptionPane.showMessageDialog(null, "Arrivederci : " + txtNomeTurni.getText());

            } else if ("".equals(nome) && "".equals(cognome)) {
                JOptionPane.showMessageDialog(null, "inserisci nome e cognome");

            }

        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "file non e stato creato");
        }

    }//GEN-LAST:event_btnFineTurniActionPerformed

    private void btnIndietroPrenotazioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroPrenotazioniActionPerformed
        framePrenota.dispose();
        txtNomePrenota.setText(null);
        txtCognomePrenota.setText(null);
        txtaPrenotazioni.setText(null);
        cbxGiorniPrenota.setSelectedIndex(0);
        cbxMesePrenota.setSelectedIndex(0);
        cbxAnnoPrenota.setSelectedIndex(0);

    }//GEN-LAST:event_btnIndietroPrenotazioniActionPerformed

    private void btnVisualizzaPrenotazioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizzaPrenotazioniActionPerformed
        try {
            txtaPrenotazioni.setText(fc.LeggiFile("Prenotazioni.txt"));
        } catch (FileNotFoundException e) {
        }
    }//GEN-LAST:event_btnVisualizzaPrenotazioniActionPerformed

    private void btnAggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungiActionPerformed
        frameModificaMenu.setSize(805, 483);
        frameModificaMenu.setVisible(true);

    }//GEN-LAST:event_btnAggiungiActionPerformed

    private void btnIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroActionPerformed
        frameModificaMenu.dispose();
        txtNomeProdotto.setText(null);
        txtPrezzoProdotto.setText(null);
        txtNumTavolo.setText(null);
    }//GEN-LAST:event_btnIndietroActionPerformed

    private void btnAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiornaActionPerformed
        try {

            if (cboxPasti.isSelected()) {

                DefaultTableModel model = (DefaultTableModel) tabPasti.getModel();
                int row = tabPasti.getSelectedRow();
                int colum = tabPasti.getSelectedColumn();
                if (row >= 0) {
                    model.setValueAt(txtNomeProdotto.getText(), row, colum);
                    model.setValueAt(Double.valueOf(txtPrezzoProdotto.getText()), row, 1);
                } else {
                    JOptionPane.showMessageDialog(null, "seleziona un row o un column grazie ;) ");
                }

            } else if (cboxBevande.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabBevande.getModel();
                int row = tabBevande.getSelectedRow();
                int colum = tabBevande.getSelectedColumn();
                if (row >= 0) {
                    model.setValueAt(txtNomeProdotto.getText(), row, colum);
                    model.setValueAt(Double.valueOf(txtPrezzoProdotto.getText()), row, 1);
                } else {
                    JOptionPane.showMessageDialog(null, "seleziona un row o un column grazie ;) ");
                }
            } else if (cboxDolci.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabDolci.getModel();
                int row = tabDolci.getSelectedRow();
                int colum = tabDolci.getSelectedColumn();
                if (row >= 0) {
                    model.setValueAt(txtNomeProdotto.getText(), row, colum);
                    model.setValueAt(Double.valueOf(txtPrezzoProdotto.getText()), row, 1);
                } else {
                    JOptionPane.showMessageDialog(null, "seleziona un row o un column grazie ;) ");
                }
            } else if (cboxPasti.isSelected() == false || cboxBevande.isSelected() == false || cboxDolci.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "seleziona un tipo di menu da modificare ;) ");
            }
        } catch (HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "seleziona un row o un column grazie ;) ");

        }
    }//GEN-LAST:event_btnAggiornaActionPerformed

    private void btnRimouviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRimouviActionPerformed
        try {
            if (cboxPasti.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabPasti.getModel();
                int row = tabPasti.getSelectedRow();
                if (row >= 0) {
                    model.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleziona un Pasto da togliere");

                }

            } else if (cboxBevande.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabBevande.getModel();

                int row = tabBevande.getSelectedRow();
                if (row >= 0) {
                    model.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleziona una bevanda da togliere");

                }
            } else if (cboxDolci.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabDolci.getModel();

                int row = tabDolci.getSelectedRow();
                if (row >= 0) {
                    model.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(null, "Seleziona un dolce da togliere");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleziona un elemento da togliere");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nn ci sono Pasti da Togliere ????");
        }

    }//GEN-LAST:event_btnRimouviActionPerformed

    private void btnAggiungi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggiungi1ActionPerformed
        try {
            if (cboxPasti.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabPasti.getModel();
                Object[] obj = {txtNomeProdotto.getText(), Double.valueOf(txtPrezzoProdotto.getText())};
                model.addRow(obj);
            } else if (cboxBevande.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabBevande.getModel();
                Object[] obj = {txtNomeProdotto.getText(), Double.valueOf(txtPrezzoProdotto.getText())};
                model.addRow(obj);
            } else if (cboxDolci.isSelected()) {
                DefaultTableModel model = (DefaultTableModel) tabDolci.getModel();
                Object[] obj = {txtNomeProdotto.getText(), Double.valueOf(txtPrezzoProdotto.getText())};
                model.addRow(obj);
            } else {
                JOptionPane.showMessageDialog(null, "seleziona un tipo di prodotto");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "seleziona un tipo di prodotto o inserisci un prezzo valido");
        }

    }//GEN-LAST:event_btnAggiungi1ActionPerformed

    private void btnnumTavoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnumTavoloActionPerformed
        DefaultComboBoxModel modelcbx = (DefaultComboBoxModel) cbxTavolo.getModel();
        modelcbx.addElement(txtNumTavolo.getText());
        cbxTavolo.setModel(modelcbx);

    }//GEN-LAST:event_btnnumTavoloActionPerformed

    private void btnExitFrameRistoranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitFrameRistoranteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitFrameRistoranteActionPerformed

    private void txtTotaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotaleActionPerformed
    // End of variables declaration//GEN-END:variables
}
