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
 * Clase para crear un dialog con el cual podremos generar recepciones de placas
 * @author Rosa Rodriguez y Jose Trista
 */
public class RecepcionDialog extends javax.swing.JDialog {

    /**
     * Metodo constructor del dialog que recibe como parametros el padre
     * desde el cual es llamado y un modal
     * @param parent JFrame
     * @param modal boolean
     */
    public RecepcionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarBoton();
        this.setTitle("Recepciones");
        this.setVisible(true);
    }
    /**
     * Metodo para agregar oyentes a los botones del Dialog
     */
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
        informacionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tramite recepcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        informacionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Codigo de la placa");
        informacionPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        txtCodigo.setBorder(null);
        txtCodigo.setSelectedTextColor(new java.awt.Color(102, 102, 255));
        informacionPanel.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 350, 30));

        lblPersona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPersona.setText("Persona:");
        informacionPanel.add(lblPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lblAuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAuto.setText("numero serie auto:");
        informacionPanel.add(lblAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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
    /**
     * Metodo para buscar la placa en la base de datos con el codigo del
     * txtCodigo
     * @param evt 
     */
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
    /**
     * Este metodo genera la recepcion de la placa que se paso como parametro
     * dentro del lblCodigo, en caso de que se genere la recepcion muestra
     * un cuadro de dialogo con la confirmacion, en caso de que haya pasado 
     * algun error muestra que no se pudo generar la recepcion
     * @param evt 
     */
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
            JOptionPane.showMessageDialog(this, "NO SE"
                    + " SE PUDO GENERAR\n LA RECEPCION DE LA PLACA");
            return;
        }
        JOptionPane.showMessageDialog(this, "SE GENERO LA RECEPCION \n"
                + "DE LA PLACA");

    }//GEN-LAST:event_btnGenerarActionPerformed
    /**
     * Cierra el dialog y nos regresa a la pantalla principal
     * @param evt 
     */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    /**
     * Este metodo se usa para llenar los campos lblPersona y lblAuto donde
     * va la informacion de la persona que solicito el tramite y del auto
     * al que pertencen las placas
     * @param p Placa
     */
    private void llenarCampos(Placa p) {
        Encriptacion encripta = new Encriptacion();

        lblPersona.setText("Persona: " + encripta.desencriptar(p.getPersona().getNombre()));
        lblAuto.setText("codigo auto: " + p.getAuto().getNserie());
    }
    /**
     * Metodo para verificar si el campo de la txtCodigo esta vacio,
     * en caso de estarlo regresa true, caso contrario false
     * @return boolean
     */
    private boolean camposVacios() {
        if (txtCodigo.getText().isBlank()) {
            return true;
        }
        return false;
    }

    /**
     * Variables declaration - do not modify  
     */
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
