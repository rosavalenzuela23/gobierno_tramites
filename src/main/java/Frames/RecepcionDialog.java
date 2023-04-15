package Frames;

import DAO.IPlacaDAO;
import DAO.PlacaDAO;
import Entidades.Placa;
import Utilidades.Encriptacion;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Rodriguez
 */
public class RecepcionDialog extends javax.swing.JDialog {

    /**
     * Creates new form RecepcionDialog
     */
    public RecepcionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarBoton();
        this.setTitle("Recepciones");
        this.setVisible(true);
    }

    private void inicializarBoton() {
        this.btnGenerar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent evt) {
                if(!btnGenerar.isEnabled()) {
                    return;
                }
                btnGenerar.setBackground(new Color(188,149,92));
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                if(!btnGenerar.isEnabled()) {
                    return;
                }
                btnGenerar.setBackground(new Color(255,255,255));
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

        background = new javax.swing.JPanel();
        informacionPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblPersona = new javax.swing.JLabel();
        lblAuto = new javax.swing.JLabel();
        btnRegresar = new swing_propio.GobiernoButton();
        btnBuscar = new swing_propio.GobiernoButton();
        btnGenerar = new swing_propio.IButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacionPanel.setBackground(new java.awt.Color(255, 255, 255));
        informacionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tramite recepcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        informacionPanel.setForeground(new java.awt.Color(0, 0, 0));
        informacionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo de la placa");
        informacionPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBorder(null);
        txtCodigo.setSelectedTextColor(new java.awt.Color(102, 102, 255));
        informacionPanel.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 350, 30));

        lblPersona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPersona.setForeground(new java.awt.Color(0, 0, 0));
        lblPersona.setText("Persona:");
        informacionPanel.add(lblPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lblAuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAuto.setForeground(new java.awt.Color(0, 0, 0));
        lblAuto.setText("numero serie auto:");
        informacionPanel.add(lblAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(157, 36, 73), 2, true));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        informacionPanel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 80, 30));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar placa");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(157, 36, 73), 2, true));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        informacionPanel.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, 30));

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("Generar recepcion");
        btnGenerar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(188, 149, 92), 3, true));
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.setEnabled(false);
        btnGenerar.setFocusPainted(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        informacionPanel.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        informacionPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 20));

        background.add(informacionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 280));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (camposVacios()) {
            JOptionPane.showMessageDialog(this, "NO DEBE DE HABER CAMPOS VACIOS", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        IPlacaDAO daoplaca = new PlacaDAO();
        Placa placa = new Placa();
        placa.setCodigo(txtCodigo.getText().trim().toUpperCase());

        Placa nplaca = daoplaca.obtenerPlaca(placa);

        if (nplaca != null) {
            btnGenerar.setEnabled(true);
            llenarCampos(nplaca);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (camposVacios()) {
            return;
        }

        PlacaDAO daoplaca = new PlacaDAO();
        Placa placa = new Placa();
        placa.setCodigo(txtCodigo.getText().trim().toUpperCase());

        Placa nplaca = daoplaca.obtenerPlaca(placa);

        if (nplaca == null) {
            return;
        }

        nplaca.setFechaRecepcion(new GregorianCalendar());
        placa = null;
        placa = daoplaca.actualizar(nplaca);

        if (placa == null) {
            JOptionPane.showMessageDialog(this, "SALIO MAL");
            return;
        }
        JOptionPane.showMessageDialog(this, "SALIO BIEN");

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void llenarCampos(Placa p) {
        Encriptacion encripta = new Encriptacion();

        lblPersona.setText("Persona: " + encripta.desencriptar(p.getPersona().getNombre()));
        lblAuto.setText("codigo auto: " + p.getAuto().getNserie());
    }

    private boolean camposVacios() {
        if (txtCodigo.getText().isBlank()) {
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel informacionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAuto;
    private javax.swing.JLabel lblPersona;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
