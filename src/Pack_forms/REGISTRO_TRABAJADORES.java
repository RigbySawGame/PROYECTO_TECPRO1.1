/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_forms;

import Pack_classes.TRABAJADORES;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.apache.poi.hslf.model.textproperties.TextPropCollection.TextPropType.character;

/**
 *
 * @author UPN
 */
public class REGISTRO_TRABAJADORES extends javax.swing.JFrame {
    
    TRABAJADORES obj = new TRABAJADORES();
    String codigo;
    DefaultTableModel modelo = new DefaultTableModel();
    private void agregar_Columnas(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Edad");
        modelo.addColumn("Estado Civil");
        modelo.addColumn("Genero");
        modelo.addColumn("Cant.Hijos");
        modelo.addColumn("Cargo");
        
        tblTrabajadores.setModel(modelo);
    }
    
    private void ListarCargo(){
        cboCargo.addItem("SELECCIONE");
        cboCargo.addItem("Administrativa");
        cboCargo.addItem("Boleteria");
        cboCargo.addItem("Confiteria");
    }
    
    private void ListarGenero(){
        cboGenero.addItem("SELECCIONE");
        cboGenero.addItem("MASCULINO");
        cboGenero.addItem("FEMENINO");
    }
    
    private void ListarEstadoCivil(){
        cboEstadoCivil.addItem("SELECCIONE");
        cboEstadoCivil.addItem("SOLTERO");
        cboEstadoCivil.addItem("CASADO");
        cboEstadoCivil.addItem("VIUDO");
        cboEstadoCivil.addItem("DIVORSIADO");
    }
    
    
    private void EnviarFichero(){
        /*atrapar posibles errores*/
        try{
            FileWriter fw;
            PrintWriter pw;
            
            //crear el archivo
            fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\RegistroTrabajadores.txt", true);
            //escribir el archivo
            pw = new PrintWriter(fw);
            //enviar datos al archivo
           // TRABAJADORES obj = new TRABAJADORES();            
            obj.setTrabNombre(txtNombre.getText());
            obj.setTrabApellido(txtApellido.getText());
            obj.setTrabEdad(Integer.parseInt(txtEdad.getText()));
            obj.setTrabEstadoCivil(cboEstadoCivil.getSelectedIndex());
            obj.setTrabGenero(cboGenero.getSelectedIndex());
            obj.setTrabCantidadHijos(Integer.parseInt(txtCantHijos.getText()));
            obj.setCargNombre(cboCargo.getSelectedIndex());
            codigo=obj.GeneracionCodigo();
            obj.setCodigo(codigo);
            
            pw.println(obj.getCodigo() + ";" + 
                    obj.getTrabNombre() + ";" + 
                    obj.getTrabApellido() + ";" +
                    obj.getTrabEdad() + ";" +
                    obj.EstadoCivil() + ";" +
                    obj.generos() + ";" +
                    obj.getTrabCantidadHijos() + ";" + 
                    obj.cargo()
            );                            
            //liberar buffer
            pw.close();
            //envia mensaje de exito
            //JOptionPane.showMessageDialog(null, "Trabajador Registrado");             
            mostrar_Registro_De_Cajas_Texto_En_Tabla();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error Fichero:\n" +
                    ex.getMessage() );
        }
        
        
    }
   private void mostrar_Registro_De_Cajas_Texto_En_Tabla(){

        obj.setTrabNombre(txtNombre.getText());
        obj.setTrabApellido(txtApellido.getText());
        obj.setTrabEdad(Integer.parseInt(txtEdad.getText()));      
        obj.setTrabEstadoCivil(cboEstadoCivil.getSelectedIndex());
        obj.setTrabGenero(cboGenero.getSelectedIndex());
        obj.setTrabCantidadHijos(Integer.parseInt(txtCantHijos.getText()));
        obj.setCargNombre(cboCargo.getSelectedIndex());
        
        Object [] fila = new Object[8];
        fila[0] = obj.getCodigo();
        fila[1] = obj.getTrabNombre();
        fila[2] = obj.getTrabApellido();
        fila[3] = obj.getTrabEdad();
        fila[4] = obj.EstadoCivil();
        fila[5] = obj.generos();
        fila[6] = obj.getTrabCantidadHijos();
        fila[7] = obj.cargo();
        
        modelo.addRow(fila);
        
    }
    private void mostrar_Registro_De_Fichero_En_Tabla(){
        
        try{
            File archivo = new File("D:\\PROYECTO_TECPRO\\src\\Data\\RegistroTrabajadores.txt");
            
            if(archivo.exists()){
                
                FileReader reader = new FileReader(archivo);
                BufferedReader br = new BufferedReader(reader);
                
                String linea;
                
                while((linea = br.readLine()) != null){
                
                StringTokenizer token = new StringTokenizer(linea, ";");
               
                String id = token.nextToken().trim();
                String nombre = token.nextToken().trim();
                String apellidos = token.nextToken().trim();
                int edad = Integer.parseInt(token.nextToken().trim());
                String estadoCivil = token.nextToken().trim();
                String genero = token.nextToken().trim();
                int cantHijos = Integer.parseInt(token.nextToken().trim());   
                String cargo = token.nextToken().trim();
                
                Object[] obj = new Object[]{
                    
                    id, nombre, apellidos, edad, estadoCivil, genero, cantHijos, cargo
                };
                        
                modelo.addRow(obj);

            }
                
            br.close();
            }
            else
                JOptionPane.showMessageDialog(null, "No se encuentra el archivo: " + archivo.getName());
        }
        catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }
    private void mostrar_Registros_De_Tabla_En_Fichero(){
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try{
         
            fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\RegistroTrabajadores.txt", true);
            pw = new PrintWriter(fw);
        
            for(int i=0; i<tblTrabajadores.getRowCount(); i++){
            
            pw.println(String.valueOf(tblTrabajadores.getValueAt(i, 0)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 1)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 2)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 3)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 4)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 5)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 6)) + ";" +
                    String.valueOf(tblTrabajadores.getValueAt(i, 7)));        
            
            }
        
            pw.close();
        
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());    
        }
        
    }
    private void eliminar_Fichero(){
        
        File archivo = new File("D:\\PROYECTO_TECPRO\\src\\Data\\RegistroTrabajadores.txt");        
        archivo.delete();
    }
    
    private void crear_Fichero(){
        
        FileWriter fw=null;
        PrintWriter pw=null;
        
        try{
         
            fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\RegistroTrabajadores.txt", true);
            pw = new PrintWriter(fw);
        
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, ex.getMessage());    
        }
    }
    private void eliminar_Fila_Tabla(){
        
        int seleccion = tblTrabajadores.getSelectedRow();     
        modelo.removeRow(seleccion);  
    }
    
    
    public REGISTRO_TRABAJADORES() {
        initComponents();
        setLocationRelativeTo(null);
        
        ListarEstadoCivil();
        ListarGenero();
        ListarCargo();
        agregar_Columnas();
        mostrar_Registro_De_Fichero_En_Tabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboGenero = new javax.swing.JComboBox<>();
        cboEstadoCivil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCantHijos = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboCargo = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE TRABAJADORES");

        jLabel5.setText("Edad:");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel3.setText("Estado Civil:");

        jLabel4.setText("Genero:");

        jLabel6.setText("Cant Hijos:");

        txtCantHijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantHijosKeyTyped(evt);
            }
        });

        btnSiguiente.setText("Guardar");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cancelar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Cargo:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTrabajadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEstadoCivil, 0, 188, Short.MAX_VALUE)
                            .addComponent(cboGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCantHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnCerrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        EnviarFichero();
        
        TRABAJADORES trab = new TRABAJADORES();
        
        if(cboCargo.getSelectedItem().toString().equalsIgnoreCase("Boleteria")){
            REGISTRO_TRABAJADORES_BOLETERIA bol = new REGISTRO_TRABAJADORES_BOLETERIA();
            bol.setVisible(true);
            dispose();
        }
        
        if(cboCargo.getSelectedItem().toString().equalsIgnoreCase("Confiteria")){
            REGISTRO_TRABAJADORES_CONFITERIA conf = new REGISTRO_TRABAJADORES_CONFITERIA();
            conf.setVisible(true);
            dispose();
        }
        
        if(cboCargo.getSelectedItem().toString().equalsIgnoreCase("Administrativa")){
            REGISTRO_TRABAJADORES_ADMINISTRATIVA admin = new REGISTRO_TRABAJADORES_ADMINISTRATIVA();
            admin.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        INICIO_SESION_ADMIN_SUB admin = new INICIO_SESION_ADMIN_SUB();
        admin.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtNombre.setText(null);
        txtApellido.setText(null);
        txtEdad.setText(null);
        cboEstadoCivil.setSelectedItem("SELECCIONE");
        cboCargo.setSelectedItem("SELECCIONE");
        txtCantHijos.setText(null);
        cboGenero.setSelectedItem("SELECCIONE");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminar_Fichero();

        crear_Fichero();

        eliminar_Fila_Tabla();

        mostrar_Registros_De_Tabla_En_Fichero();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
//        char validar=evt.getKeyChar();
//        
//        if(Character.isDigit(validar)){
//            getToolkit().beep();
//            evt.consume();
//            
//            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Letras");
//        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Letras");
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCantHijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantHijosKeyTyped
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
        }
    }//GEN-LAST:event_txtCantHijosKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_TRABAJADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_TRABAJADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_TRABAJADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_TRABAJADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO_TRABAJADORES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JComboBox<String> cboEstadoCivil;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTrabajadores;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantHijos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
