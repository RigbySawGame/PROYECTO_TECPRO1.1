package Pack_forms;

import Pack_classes.clsExportarExcel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class frmControl_Panel_Functions extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    void clear_table(){
        
        for (int i = 0; i < tblFunctionsReport.getRowCount(); i++) {
        model.removeRow(i);
        i-=1;
        }
        
    }
    
    void show_functionsdata(String Theater){
        
        clear_table();
    
        try {
            
            File file = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            
            while ((line=br.readLine())!=null){
               
                StringTokenizer st= new StringTokenizer(line,";");
                
                Object[] obj = new Object[8];
                
                obj[0] = st.nextElement().toString().trim();
                obj[1] = st.nextElement().toString().trim();
                obj[2] = st.nextElement().toString().trim();
                obj[3] = st.nextElement().toString().trim();
                obj[4] = st.nextElement().toString().trim();
                obj[5] = st.nextElement().toString().trim();
                obj[6] = st.nextElement().toString().trim();
                obj[7] = st.nextElement().toString().trim();
                
                if(obj[1].equals(Theater)) model.addRow(obj);
            }
            
         br.close();
            
        } catch (IOException ex) {
        }
        
    }
    
    void Find_function(String Code, String Theater){
        
       boolean checker=false;
    
        try {
            
            File file = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            
            while ((line=br.readLine())!=null){
               
                StringTokenizer st= new StringTokenizer(line,";");
                
                Object[] obj = new Object[8];
                
                obj[0] = st.nextElement().toString().trim();
                obj[1] = st.nextElement().toString().trim();
                obj[2] = st.nextElement().toString().trim();
                obj[3] = st.nextElement().toString().trim();
                obj[4] = st.nextElement().toString().trim();
                obj[5] = st.nextElement().toString().trim();
                obj[6] = st.nextElement().toString().trim();
                obj[7] = st.nextElement().toString().trim();
                    
                if(obj[0].equals(Code) && Theater.equals(obj[1].toString())){
                    
                     clear_table();
                    
                    model.addRow(obj);
                    
                    txtFunctionCode.setText(obj[0].toString());
                    cboMovie.setSelectedItem(obj[2].toString());
                    cboDay.setSelectedIndex(Integer.parseInt(obj[3].toString().substring(0, 2))-1);
                    cboMonth.setSelectedIndex(Integer.parseInt(obj[3].toString().substring(3, 5))-1);
                    cboYear.setSelectedIndex(Integer.parseInt(obj[3].toString().substring(6, 10))-2019);
                    cboStartHour.setSelectedIndex(Integer.parseInt(obj[4].toString().substring(0, 2)));
                    cboStartMinute.setSelectedIndex(Integer.parseInt(obj[4].toString().substring(3, 5)));
                    cboEndHour.setSelectedIndex(Integer.parseInt(obj[5].toString().substring(0, 2)));
                    cboEndMinute.setSelectedIndex(Integer.parseInt(obj[5].toString().substring(3, 5)));
                    cboHall.setSelectedIndex(Integer.parseInt(obj[6].toString())-1);
                    cboFunctionType.setSelectedItem(obj[7].toString());
                    
                    checker=true;
                    
                        btnEdit.setEnabled(true);
                        btnDelete.setEnabled(true);
                        btnNew.setEnabled(false);
                        btnCancel.setEnabled(true);
                        txtSearchCode.setEnabled(false);
                }   
            }
            
         br.close();
         
         if(checker==false){
         JOptionPane.showMessageDialog(null,"Error: Codigo ( "+txtSearchCode.getText()+" ) invalido");
         txtSearchCode.setText(null);
         }
         
        } catch (IOException ex) {
        }
    }
     
    void Find_function_partial(String Filter, String Theater){
        
       boolean checker=false;
    
        try {
            
            File file = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            
            while ((line=br.readLine())!=null){
               
                StringTokenizer st= new StringTokenizer(line,";");
                
                Object[] obj = new Object[8];
                
                obj[0] = st.nextElement().toString().trim();
                obj[1] = st.nextElement().toString().trim();
                obj[2] = st.nextElement().toString().trim();
                obj[3] = st.nextElement().toString().trim();
                obj[4] = st.nextElement().toString().trim();
                obj[5] = st.nextElement().toString().trim();
                obj[6] = st.nextElement().toString().trim();
                obj[7] = st.nextElement().toString().trim();
                    
                if(obj[0].toString().substring(0, 5).equals(Filter) && Theater.equals(obj[1].toString())){
                           
                    model.addRow(obj);
                     
    
                    checker=true;
                    
                        btnCancel.setEnabled(true);
                        txtSearchCode.setEnabled(false);
                }   
            }
            
         br.close();
         
         if(checker==false){
         JOptionPane.showMessageDialog(null,"Error: Codigo ( "+Filter+" ) invalido");
         txtSearchCode.setText(null);
         show_functionsdata(cboTheater.getSelectedItem().toString());
         }
         
        } catch (IOException ex) {
        }
    }    
    
    void reset(){
    cboDay.setSelectedIndex(0);
        cboEndHour.setSelectedIndex(0);
        cboEndMinute.setSelectedIndex(0);
        cboFunctionType.setSelectedIndex(0);
        cboHall.setSelectedIndex(0);
        cboMonth.setSelectedIndex(0);
        cboMovie.setSelectedIndex(0);
        cboStartHour.setSelectedIndex(0);
        cboStartMinute.setSelectedIndex(0);
        cboYear.setSelectedIndex(0);
        txtFunctionCode.setText(null);
    }
    
    void add_theaters(){
    cboTheater.addItem("Seleccionar cine...");   
    cboTheater.addItem(("Angamos").toUpperCase());
    cboTheater.addItem(("Bellavista").toUpperCase());
    cboTheater.addItem(("Jokey Plaza").toUpperCase());
    cboTheater.addItem(("MegaPlaza").toUpperCase());
    cboTheater.addItem(("Plaza Lima Sur").toUpperCase());
    cboTheater.addItem(("San Miguel").toUpperCase());
    }
    
    void add_movies(){
        
        cboMovie.addItem("Seleccionar pelicula...");
    
        try {
            
            File file = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Movies.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line;
            
            while ((line=br.readLine())!=null){
            
                StringTokenizer st = new StringTokenizer(line,";");
                cboMovie.addItem(st.nextElement());
                
            }
            
            br.close();
            
        } catch (IOException ex) {
        }
        
    }
    
    void add_halls(){
    
        for(int i=1;i<10;i++)cboHall.addItem("0"+String.valueOf(i));
        for(int i=10;i<16;i++)cboHall.addItem(String.valueOf(i));
        
    }
    
    void add_HallsTypes(){
    
        cboFunctionType.addItem("2D");
        cboFunctionType.addItem("3D");
        cboFunctionType.addItem("2D XD");
        cboFunctionType.addItem("3D XD");
        
    }
    
    void add_columns(){     
        
        model.addColumn("Codigo");
        model.addColumn("Cine");
        model.addColumn("Pelicula");
        model.addColumn("Fecha");
        model.addColumn("Inicio");
        model.addColumn("Termino");
        model.addColumn("Sala");
        model.addColumn("Tipo");
        
        tblFunctionsReport.setModel(model);
        
        TableColumnModel columnModel = tblFunctionsReport.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(140);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(160);
        columnModel.getColumn(3).setPreferredWidth(40);
        columnModel.getColumn(4).setPreferredWidth(10);
        columnModel.getColumn(5).setPreferredWidth(10);
        columnModel.getColumn(6).setPreferredWidth(2);
        columnModel.getColumn(7).setPreferredWidth(2);   
        
    }
    
    private void add_date(){
        
        for (int i=1;i<=9;i++){       
            cboDay.addItem("0"+String.valueOf(i));                 
        }
        for (int i=10;i<=31;i++){       
            cboDay.addItem(String.valueOf(i));                 
        }
        for (int i=1;i<=9;i++){       
            cboMonth.addItem("0"+String.valueOf(i));                 
        }
        for (int i=10;i<=12;i++){       
            cboMonth.addItem(String.valueOf(i));                 
        }
        for (int i=2019;i<=2024;i++){       
            cboYear.addItem(String.valueOf(i));
        }
        for (int i=0;i<=9;i++){       
            cboStartHour.addItem("0"+String.valueOf(i));
            cboEndHour.addItem("0"+String.valueOf(i));
        }
        for (int i=10;i<=23;i++){       
            cboStartHour.addItem(String.valueOf(i));
            cboEndHour.addItem(String.valueOf(i));
        }   
        for (int i=0;i<=9;i++){       
            cboStartMinute.addItem("0"+String.valueOf(i));
            cboEndMinute.addItem("0"+String.valueOf(i));
        }
        for (int i=10;i<=59;i++){       
            cboStartMinute.addItem(String.valueOf(i));
            cboEndMinute.addItem(String.valueOf(i));
        }
        
        
    }
    
    private void start_app(){
    tblFunctionsReport.setEnabled(false);
    cboTheater.setEnabled(true);
    btnChangeTheater.setEnabled(false);
    cboMovie.setEnabled(false);
    cboDay.setEnabled(false);
    cboMonth.setEnabled(false);
    cboYear.setEnabled(false);
    cboHall.setEnabled(false);
    cboStartHour.setEnabled(false);
    cboStartMinute.setEnabled(false);
    cboEndHour.setEnabled(false);
    cboEndMinute.setEnabled(false);
    cboFunctionType.setEnabled(false);
    btnNew.setEnabled(false);
    btnEdit.setEnabled(false);
    btnCancel.setEnabled(false);
    btnDelete.setEnabled(false);
    txtSearchCode.setEnabled(false);
    btnSearch.setEnabled(false);
    btnEnter.setEnabled(false);
    btnExportEx2007.setEnabled(false);
    btnExporEx2010.setEnabled(false);
    }
    
    private void on_buttons(){
    cboTheater.setEnabled(false);
    cboMovie.setEnabled(true);
    cboDay.setEnabled(true);
    cboMonth.setEnabled(true);
    cboYear.setEnabled(true);
    cboHall.setEnabled(true);
    cboStartHour.setEnabled(true);
    cboStartMinute.setEnabled(true);
    cboEndHour.setEnabled(true);
    cboEndMinute.setEnabled(true);
    cboFunctionType.setEnabled(true);
    btnNew.setEnabled(false);
    btnEdit.setEnabled(false);
    btnCancel.setEnabled(true);
    btnDelete.setEnabled(false);
    txtSearchCode.setEnabled(true);
    btnSearch.setEnabled(true);
    btnEnter.setEnabled(true);
    txtFunctionCode.setText("Click to show code");
    }
    
    private void off_buttons(){
    btnChangeTheater.setEnabled(true);
    cboTheater.setEnabled(false);
    cboMovie.setEnabled(false);
    cboDay.setEnabled(false);
    cboMonth.setEnabled(false);
    cboYear.setEnabled(false);
    cboHall.setEnabled(false);
    cboStartHour.setEnabled(false);
    cboStartMinute.setEnabled(false);
    cboEndHour.setEnabled(false);
    cboEndMinute.setEnabled(false);
    cboFunctionType.setEnabled(false);
    btnNew.setEnabled(true);
    btnEdit.setEnabled(false);
    btnCancel.setEnabled(false);
    btnDelete.setEnabled(false);
    txtSearchCode.setEnabled(true);
    btnSearch.setEnabled(true);
    btnEnter.setEnabled(false);
    txtFunctionCode.setText("");
    }
     
    
    public frmControl_Panel_Functions() {
        
        initComponents();
        add_date();
        start_app();
        add_columns();
        add_theaters();
        add_movies();
        add_halls();
        add_HallsTypes();
        setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboTheater = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboStartHour = new javax.swing.JComboBox();
        cboStartMinute = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboEndHour = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cboEndMinute = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cboMovie = new javax.swing.JComboBox();
        cboFunctionType = new javax.swing.JComboBox();
        cboHall = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFunctionsReport = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboDay = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cboMonth = new javax.swing.JComboBox();
        cboYear = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSearchCode = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtFunctionCode = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnChangeTheater = new javax.swing.JButton();
        btnExportEx2007 = new javax.swing.JButton();
        btnExporEx2010 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Control de Funciones");
        setResizable(false);

        panel1.setBackground(new java.awt.Color(160, 0, 0));
        panel1.setForeground(new java.awt.Color(154, 0, 0));
        panel1.setToolTipText("");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione cine:");

        cboTheater.setForeground(new java.awt.Color(255, 255, 255));
        cboTheater.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTheaterItemStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Datos de funcion:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pelicula:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sala:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora de inicio:");

        cboStartHour.setForeground(new java.awt.Color(255, 255, 255));

        cboStartMinute.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora de termino:");

        cboEndHour.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");

        cboEndMinute.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de funcion:");

        cboMovie.setForeground(new java.awt.Color(255, 255, 255));

        cboFunctionType.setForeground(new java.awt.Color(255, 255, 255));

        cboHall.setForeground(new java.awt.Color(255, 255, 255));

        tblFunctionsReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblFunctionsReport);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dia:");

        cboDay.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mes:");

        cboMonth.setForeground(new java.awt.Color(255, 255, 255));

        cboYear.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Año:");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Funciones registradas:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Codigo de funcion:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Codigo de funcion:");

        txtFunctionCode.setEditable(false);
        txtFunctionCode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFunctionCodeCaretUpdate(evt);
            }
        });
        txtFunctionCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFunctionCodeFocusGained(evt);
            }
        });
        txtFunctionCode.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtFunctionCodeInputMethodTextChanged(evt);
            }
        });
        txtFunctionCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFunctionCodeActionPerformed(evt);
            }
        });
        txtFunctionCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFunctionCodeKeyReleased(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnChangeTheater.setText("Change");
        btnChangeTheater.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnChangeTheaterItemStateChanged(evt);
            }
        });
        btnChangeTheater.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnChangeTheaterStateChanged(evt);
            }
        });
        btnChangeTheater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeTheaterActionPerformed(evt);
            }
        });

        btnExportEx2007.setText("Exportar Excel 2007");
        btnExportEx2007.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportEx2007ActionPerformed(evt);
            }
        });

        btnExporEx2010.setText("Exportar Excel 2010");
        btnExporEx2010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExporEx2010ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnChangeTheater)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cboTheater, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cboMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12)
                                                .addComponent(cboDay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5))
                                            .addGap(0, 0, 0)
                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(129, 129, 129)
                                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(cboStartHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(jLabel7))
                                                                .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addComponent(cboEndHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(jLabel9)))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(cboEndMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cboStartMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(cboFunctionType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtFunctionCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(cboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel13))
                                                            .addGap(60, 60, 60)
                                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel14)
                                                                .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(cboHall, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 35, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(394, 394, 394))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(362, 362, 362))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExporEx2010)
                                    .addComponent(btnExportEx2007))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(754, 754, 754))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(53, 53, 53)
                                .addComponent(txtSearchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(253, 253, 253))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(cboTheater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnChangeTheater)))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(3, 3, 3)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboHall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboStartHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboStartMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(cboEndMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboEndHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboFunctionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(28, 28, 28)
                                .addComponent(txtFunctionCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnEnter)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(85, 85, 85)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDelete)
                                .addComponent(btnCancel)
                                .addComponent(btnEdit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExportEx2007)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExporEx2010)))
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeTheaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeTheaterActionPerformed
        cboTheater.setSelectedIndex(0);
        clear_table();
        txtSearchCode.setText(null);
        start_app();
        reset();
    }//GEN-LAST:event_btnChangeTheaterActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int opt=0;

        opt=JOptionPane.showConfirmDialog(rootPane, "Elminar funcion","Mensaje de confirmacion", opt);

        if(opt==0){
            
            try {
                
                File file= new File("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                
                String line;
                
                while((line=br.readLine())!=null){
                
                 StringTokenizer st = new StringTokenizer(line,";");
                 
                 String code = st.nextElement().toString();
                 
                 if(!txtSearchCode.getText().equals(code)){
                 
                     try {
                         
                         FileWriter fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\Temp_Functions_Data.txt",true);
                         PrintWriter pw = new PrintWriter(fw);
                         
                         pw.println(code+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";");
                         
                         pw.close();
                         
                     } catch (Exception e) {
                     }
                     
                 
                 }

                }
                br.close();
                           
            } catch (IOException ex) {
            }
             
           File file = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt");
           file.delete();
           
           File file2 = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Temp_Functions_Data.txt");
           file2.renameTo(file);
           
           
            
            JOptionPane.showMessageDialog(null, "Funcion eliminada");
            off_buttons();
            reset();
            txtSearchCode.setEnabled(true);
            txtSearchCode.setText(null);
            show_functionsdata(cboTheater.getSelectedItem().toString());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        off_buttons();
        reset();
        txtSearchCode.setEnabled(true);
        txtSearchCode.setText(null);
        show_functionsdata(cboTheater.getSelectedItem().toString());
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        on_buttons();
        btnNew.setEnabled(false);
        txtSearchCode.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        on_buttons();
        txtSearchCode.setEnabled(false);
        txtSearchCode.setText(null);
        btnSearch.setEnabled(false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtFunctionCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFunctionCodeActionPerformed
 
    }//GEN-LAST:event_txtFunctionCodeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        if(txtSearchCode.getText().length()==5){
            clear_table();
            Find_function_partial(txtSearchCode.getText().substring(0, 5), cboTheater.getSelectedItem().toString());
            
        }
        else{       
        btnCancel.requestFocus();
        off_buttons();
        if(tblFunctionsReport.getRowCount()>0) Find_function(txtSearchCode.getText(),cboTheater.getSelectedItem().toString());
        else JOptionPane.showMessageDialog(null,"No hay funciones disponibles.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        INICIO_SESION_ADMIN_SUB close = new INICIO_SESION_ADMIN_SUB();
        close.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboTheaterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTheaterItemStateChanged
        if(cboTheater.getSelectedIndex()>0){
  
            off_buttons();
            show_functionsdata(cboTheater.getSelectedItem().toString());
        
        }
    }//GEN-LAST:event_cboTheaterItemStateChanged

    private void txtFunctionCodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFunctionCodeCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFunctionCodeCaretUpdate

    private void txtFunctionCodeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtFunctionCodeInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFunctionCodeInputMethodTextChanged

    private void txtFunctionCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFunctionCodeKeyReleased
      
    }//GEN-LAST:event_txtFunctionCodeKeyReleased

    private void txtFunctionCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFunctionCodeFocusGained
      
       if(cboMovie.getSelectedIndex()>0){
            
            txtFunctionCode.setText(cboTheater.getSelectedItem().toString().replace(" ","").substring(0,3)+
                                    cboHall.getSelectedItem().toString()+
                                    cboMovie.getSelectedItem().toString().replace(" ","").substring(0,3)+
                                    cboDay.getSelectedItem().toString()+
                                    cboMonth.getSelectedItem().toString()+
                                    cboYear.getSelectedItem().toString().substring(2)+
                                    cboStartHour.getSelectedItem().toString()+
                                    cboStartMinute.getSelectedItem().toString()+
                                    cboFunctionType.getSelectedItem().toString().replace(" ",""));
       }
       
       else if (btnCancel.isEnabled()==true){
           
           JOptionPane.showMessageDialog(null,"Por favor, completar todos los campos.");
              txtFunctionCode.setFocusable(false);
              txtFunctionCode.setFocusable(true);
       }
       
    }//GEN-LAST:event_txtFunctionCodeFocusGained

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
     
    if(cboMovie.getSelectedIndex()==0){
    JOptionPane.showMessageDialog(null,"Por favor, completar todos los campos");
    }  
        
        
     if(cboMovie.getSelectedIndex()>0 && (txtSearchCode.getText().length()==0)){    
        try {
            
            FileWriter fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println((cboTheater.getSelectedItem().toString().replace(" ","").substring(0,3)+
                                    cboHall.getSelectedItem().toString()+
                                    cboMovie.getSelectedItem().toString().replace(" ","").substring(0,3)+
                                    cboDay.getSelectedItem().toString()+
                                    cboMonth.getSelectedItem().toString()+
                                    cboYear.getSelectedItem().toString().substring(2)+
                                    cboStartHour.getSelectedItem().toString()+
                                    cboStartMinute.getSelectedItem().toString()+
                                    cboFunctionType.getSelectedItem().toString().replace(" ",""))+";"+
                            cboTheater.getSelectedItem().toString()+";"+
                            cboMovie.getSelectedItem().toString()+";"+
                            cboDay.getSelectedItem()+"/"+cboMonth.getSelectedItem()+"/"+cboYear.getSelectedItem()+";"+
                            cboStartHour.getSelectedItem()+":"+cboStartMinute.getSelectedItem()+";"+
                            cboEndHour.getSelectedItem()+":"+cboEndMinute.getSelectedItem()+";"+
                            cboHall.getSelectedItem()+";"+
                            cboFunctionType.getSelectedItem()+";");
            
            pw.close();
            
         reset();
         off_buttons();
        } catch (Exception e) {
        }
        
        show_functionsdata(cboTheater.getSelectedItem().toString());
    }
        
    if(cboMovie.getSelectedIndex()>0 && (txtSearchCode.getText().length()>0)){ 
         
        try {
                
                File file= new File("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                
                String line;
                
                while((line=br.readLine())!=null){
                
                 StringTokenizer st = new StringTokenizer(line,";");
                 
                 String code = st.nextElement().toString();
                 
                 if(!txtSearchCode.getText().equals(code)){
                 
                     try {
                         
                         FileWriter fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\Temp_Functions_Data.txt",true);
                         PrintWriter pw = new PrintWriter(fw);
                         
                         pw.println(code+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";"+
                                    st.nextElement().toString()+";");
                         
                         pw.close();
                         
                     } catch (Exception e) {
                     }
                                               
                 }
                 else {
                 
                         try {
            
                                FileWriter fw = new FileWriter("D:\\PROYECTO_TECPRO\\src\\Data\\Temp_Functions_Data.txt",true);
                                PrintWriter pw = new PrintWriter(fw);

                                pw.println((cboTheater.getSelectedItem().toString().replace(" ","").substring(0,3)+
                                                        cboHall.getSelectedItem().toString()+
                                                        cboMovie.getSelectedItem().toString().replace(" ","").substring(0,3)+
                                                        cboDay.getSelectedItem().toString()+
                                                        cboMonth.getSelectedItem().toString()+
                                                        cboYear.getSelectedItem().toString().substring(2)+
                                                        cboStartHour.getSelectedItem().toString()+
                                                        cboStartMinute.getSelectedItem().toString()+
                                                        cboFunctionType.getSelectedItem().toString().replace(" ",""))+";"+
                                                cboTheater.getSelectedItem().toString()+";"+
                                                cboMovie.getSelectedItem().toString()+";"+
                                                cboDay.getSelectedItem()+"/"+cboMonth.getSelectedItem()+"/"+cboYear.getSelectedItem()+";"+
                                                cboStartHour.getSelectedItem()+":"+cboStartMinute.getSelectedItem()+";"+
                                                cboEndHour.getSelectedItem()+":"+cboEndMinute.getSelectedItem()+";"+
                                                cboHall.getSelectedItem()+";"+
                                                cboFunctionType.getSelectedItem()+";");

                                pw.close();

                             reset();
                             off_buttons();
                            } catch (Exception e) {
                            }

                            show_functionsdata(cboTheater.getSelectedItem().toString());                                         
                 
                 }

                }
                br.close();
                           
            } catch (IOException ex) {
            }
             
           File file = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Functions_Data.txt");
           file.delete();
           
           File file2 = new File("D:\\PROYECTO_TECPRO\\src\\Data\\Temp_Functions_Data.txt");
           file2.renameTo(file);                    
            
            JOptionPane.showMessageDialog(null, "Funcion actualizada");
            off_buttons();
            reset();
            txtSearchCode.setEnabled(true);
            txtSearchCode.setText(null);
            show_functionsdata(cboTheater.getSelectedItem().toString());

    }
 
    
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnExportEx2007ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportEx2007ActionPerformed
      
        if(tblFunctionsReport.getRowCount()!=0){
        
        try {
            clsExportarExcel obj = new clsExportarExcel();
            obj.exportarExcel(tblFunctionsReport);
        } catch (IOException ex) {
            Logger.getLogger(frmControl_Panel_Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
        
            JOptionPane.showMessageDialog(null,"No hay datos para exportar a Excel actualmente.");
            
        }
        
    }//GEN-LAST:event_btnExportEx2007ActionPerformed

    private void btnExporEx2010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExporEx2010ActionPerformed
        
        if(tblFunctionsReport.getRowCount()!=0){
        
        try {
            clsExportarExcel obj = new clsExportarExcel();
            obj.exportarExcel2010(tblFunctionsReport);
        } catch (IOException ex) {
            Logger.getLogger(frmControl_Panel_Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
            
            JOptionPane.showMessageDialog(null,"No hay datos para exportar a Excel actualmente.");
            
        }
    }//GEN-LAST:event_btnExporEx2010ActionPerformed

    private void btnChangeTheaterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnChangeTheaterItemStateChanged
        
    }//GEN-LAST:event_btnChangeTheaterItemStateChanged

    private void btnChangeTheaterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnChangeTheaterStateChanged
       
        if(btnChangeTheater.isEnabled()){
       
        btnExportEx2007.setEnabled(true);
        btnExporEx2010.setEnabled(true);
        
       }
        
    }//GEN-LAST:event_btnChangeTheaterStateChanged

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
            java.util.logging.Logger.getLogger(frmControl_Panel_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmControl_Panel_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmControl_Panel_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmControl_Panel_Functions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmControl_Panel_Functions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangeTheater;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExporEx2010;
    private javax.swing.JButton btnExportEx2007;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cboDay;
    private javax.swing.JComboBox cboEndHour;
    private javax.swing.JComboBox cboEndMinute;
    private javax.swing.JComboBox cboFunctionType;
    private javax.swing.JComboBox cboHall;
    private javax.swing.JComboBox cboMonth;
    private javax.swing.JComboBox cboMovie;
    private javax.swing.JComboBox cboStartHour;
    private javax.swing.JComboBox cboStartMinute;
    private javax.swing.JComboBox cboTheater;
    private javax.swing.JComboBox cboYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tblFunctionsReport;
    private javax.swing.JTextField txtFunctionCode;
    private javax.swing.JTextField txtSearchCode;
    // End of variables declaration//GEN-END:variables
}
