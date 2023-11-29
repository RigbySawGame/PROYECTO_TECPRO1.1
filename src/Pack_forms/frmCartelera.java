package Pack_forms;

import java.awt.Color;
import javax.swing.DefaultListModel;
import Pack_classes.Movie;


public class frmCartelera extends javax.swing.JFrame {
    
    
    public void AddMovies(){
        DefaultListModel Mlist=new DefaultListModel();
        Mlist.addElement("GUASON");
        Mlist.addElement("FROZEN II");
        Mlist.addElement("PROYECTO GEMINIS");
        Mlist.addElement("TERMINATOR DESTINO OCULTO");
        Mlist.addElement("MALEFICA 2 DUENA DEL MAL");
        lstMovies.setModel(Mlist);
    }   
    public frmCartelera() {
        
        initComponents();
       
        AddMovies();
//        Quantity();
//        AddHalls();
        this.getContentPane().setBackground(new Color(166, 49, 49));
        setLocationRelativeTo(null);
//        agragerHorarios();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMovies = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformation = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnMovieData = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartelera");
        setBackground(new java.awt.Color(255, 255, 51));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cartelera:");

        jScrollPane1.setViewportView(lstMovies);

        txtInformation.setColumns(20);
        txtInformation.setLineWrap(true);
        txtInformation.setRows(5);
        txtInformation.setWrapStyleWord(true);
        txtInformation.setDoubleBuffered(true);
        jScrollPane2.setViewportView(txtInformation);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnMovieData.setText("Informacion");
        btnMovieData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovieDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMovieData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnMovieData)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnSiguiente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMovieDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovieDataActionPerformed
        
        txtInformation.setText(null);
        
        if (lstMovies.getSelectedIndex()>=0){
        switch(lstMovies.getSelectedValue().toString().toLowerCase()){
                    
            case "guason":      Movie Guason = new Movie();
                                Guason.setName("Guason");
                                Guason.setDuration("120 min.");
                                Guason.setHall("Sala 5");
                                Guason.setDay(13);
                                Guason.setMonth(10);
                                Guason.setYear(2019);
                                Guason.setGenre("Slice of Life");
                                Guason.setSynopsis("Arthur Fleck (Phoenix) es un hombre ignorado por la sociedad, cuya motivacion en la vida es hacer reir. Pero una serie de tragicos acontecimientos le llevaran a ver el mundo de otra forma. Pelicula basada en el popular personaje de DC Comics Joker, conocido como archivillano de Batman, pero que en este film tomara un cariz mas realista y oscuro.");
                                txtInformation.setText(Guason.ShowDetails());
                                break;
                                
            case "frozen ii":   Movie Frozen_2 = new Movie();
                                Frozen_2.setName("Frozen II");
                                Frozen_2.setDuration("120 min.");
                                Frozen_2.setHall("Sala 6");
                                Frozen_2.setDay(13);
                                Frozen_2.setMonth(10);
                                Frozen_2.setYear(2019);
                                Frozen_2.setGenre("Animation");
                                Frozen_2.setSynopsis("Secuela de \"Frozen. El reino del hielo\" (2013), el film de animación más taquillero de la historia del cine, ganador del Oscar a la mejor película animada. Reunirá al mismo equipo artístico y técnico de la original.");
                                txtInformation.setText(Frozen_2.ShowDetails()); 
                                break;
                                
            case "proyecto geminis":    Movie Geminis = new Movie();
                                        Geminis.setName("Proyecto Geminis");
                                        Geminis.setDuration("117 min.");
                                        Geminis.setHall("Sala 7");
                                        Geminis.setDay(13);
                                        Geminis.setMonth(10);
                                        Geminis.setYear(2019);
                                        Geminis.setGenre("Sci-Fi");
                                        Geminis.setSynopsis("Gemini Man es un innovador thriller de acción protagonizado por Will Smith como Henry Brogan, un asesino de élite, que de repente es atacado y perseguido por un misterioso joven operario que aparentemente puede predecir cada uno de sus movimientos.");
                                        txtInformation.setText(Geminis.ShowDetails()); 
                                        break;
                                        
            case "terminator destino oculto":    Movie Terminator = new Movie();
                                        Terminator.setName("terminator destino oculto");
                                        Terminator.setDuration("128 min.");
                                        Terminator.setHall("Sala 9");
                                        Terminator.setDay(13);
                                        Terminator.setMonth(11);
                                        Terminator.setYear(2019);
                                        Terminator.setGenre("Sci-Fi");
                                        Terminator.setSynopsis("Sarah Connor ha regresado, y estara formando un equipo que luchará con T-1000. Sexta entrega de la saga Terminator.");
                                        txtInformation.setText(Terminator.ShowDetails()); 
                                        break;  
                                        
             case "malefica 2 duena del mal":    Movie Malefica = new Movie();
                                        Malefica.setName("malefica 2 duena del mal");
                                        Malefica.setDuration("120 min.");
                                        Malefica.setHall("Sala 2");
                                        Malefica.setDay(13);
                                        Malefica.setMonth(12);
                                        Malefica.setYear(2019);
                                        Malefica.setGenre("Sci-Fi");
                                        Malefica.setSynopsis("MALÉFICA:DUEÑA DEL MAL, de Disney, es una aventura de fantasía que retma la historia de MALÉFICA varios años más tarde en la que se dieron a conocer los hechos que endurecieron el corazón de la villana más emblemática de Disney y la llevaron a arrojar una maldición sobre la princesa recién nacida, Aurora. La película continúa explorando la compleja relación entre el hada de enormes cuernos y la futura reina, mientras forjan nuevas alianzas y se enfrentan a nuevos adversarios en su lucha por proteger el páramo y las criaturas mágicas que lo habitan.");
                                        txtInformation.setText(Malefica.ShowDetails()); 
                                        break;                           
                                        
                                        
                                        
        }
        }
        else  txtInformation.setText("Escoja una pelicula...");
        txtInformation.requestFocus();
        txtInformation.setEditable(false);
    
    }//GEN-LAST:event_btnMovieDataActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        frmUbicacion ubicacion = new frmUbicacion();
        ubicacion.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        frmRegistroDePelicula RegPe = new frmRegistroDePelicula();
        RegPe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCartelera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCartelera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMovieData;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lstMovies;
    private javax.swing.JTextArea txtInformation;
    // End of variables declaration//GEN-END:variables
}
