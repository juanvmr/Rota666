package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        id = 0;
        tableModel = (new DefaultTableModel(new Object [][] {},
                                            new String [] {
                                                "", "ID", "X", "Y", "R", "A", "V", "D"}
                                            ) {
            Class[] types = new Class [] {
                Boolean.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        initComponents();
        initMyComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        insertY = new javax.swing.JTextField();
        insertAngle = new javax.swing.JTextField();
        insertDirection = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        insertX = new javax.swing.JTextField();
        insertRadius = new javax.swing.JTextField();
        insertSpeed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        transX = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transY = new javax.swing.JTextField();
        transMove = new javax.swing.JButton();
        transScale = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        transAngle = new javax.swing.JTextField();
        transRotate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        trackDistance = new javax.swing.JTextField();
        trackNearAirport = new javax.swing.JButton();
        trackNearPlane = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        collisionTime = new javax.swing.JTextField();
        collisionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        planeTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        insertAngle.setEditable(false);

        insertButton.setText("Inserir");

        jLabel1.setText("Y:");

        jLabel2.setText("�ngulo:");

        jLabel3.setText("Dire��o:");

        insertRadius.setEditable(false);

        jLabel4.setText("X:");

        jLabel5.setText("Raio:");

        jLabel6.setText("Velocidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(insertRadius, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(insertX, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertSpeed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertY, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insertAngle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insertDirection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertButton)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(insertButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("X:");

        jLabel8.setText("Y:");

        transMove.setText("Transladar");

        transScale.setText("Escalonar");

        jLabel9.setText("�ngulo:");

        transRotate.setText("Rotacionar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transRotate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(transMove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transScale))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(transX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(transAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(transRotate))
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Dist�ncia:");

        trackNearAirport.setText("Pr�ximos ao aeroporto");

        trackNearPlane.setText("Pr�ximos a outro avi�o");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trackDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trackNearAirport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trackNearPlane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(trackDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trackNearPlane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trackNearAirport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPane.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Tempo:");

        collisionButton.setText("Rota de colis�o");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(collisionTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(collisionButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(collisionTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(collisionButton)
                .addContainerGap())
        );

        planeTable.setModel(tableModel);
        jScrollPane1.setViewportView(planeTable);

        reportArea.setEditable(false);
        reportArea.setColumns(20);
        reportArea.setRows(5);
        jScrollPane2.setViewportView(reportArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    private void initMyComponents(){
        this.insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(testInsertionFields()){
                    Float x = Float.parseFloat(insertX.getText());
                    Float y = Float.parseFloat(insertY.getText());
                    Float angle = Float.parseFloat(insertAngle.getText());
                    Float speed = Float.parseFloat(insertSpeed.getText());
                    Float direction = Float.parseFloat(insertDirection.getText());
                    Float radius = Float.parseFloat(insertRadius.getText());
                    tableModel.addRow(new Object[]{Boolean.FALSE, id, x, y, radius, angle, speed, direction});
                    id++;
                }
                else{
                    System.out.println("Falta preencher inserts");
                }
            }
        });
        
        this.collisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableModel modelo = planeTable.getModel();
                Object[][] planes = new Object[2][8];
                for(int i=0; i<(modelo.getRowCount()-1); i++){
                    for(int j=i+1; j<modelo.getRowCount(); j++){
                        for(int k=0; k<modelo.getColumnCount(); k++){
                            planes[0][k] = modelo.getValueAt(i, k);
                            planes[1][k] = modelo.getValueAt(j, k);
                            //System.out.println(""+planes[0][k]);
                            //System.out.println(""+planes[1][k]);
                            /*if(planes[0][k] instanceof Double){
                                System.out.println("planeD"+k);
                            }
                            if(planes[0][k] instanceof Float){
                                System.out.println("planeF"+k);
                            }*/
                        }
                        if(testCollision(planes)){
                            reportArea.append("Aviões " + planes[0][1] + " e " + planes[1][1] + " em rota de colisão");
                        }
                    }
                }
            }
        });
                
        this.trackNearPlane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                planeNearPlane(getSelectedPlanes());
            }
        });
        
        this.transMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id;
                for (Object[] plane : getSelectedPlanes()) {
                    if(plane != null){
                        id = Integer.parseInt(plane[1].toString());
                        tableModel.removeRow(id);
                        tableModel.insertRow(id, transladar(plane));
                        planeTable.setModel(tableModel);
                    }
                }
            }
        });
        
        this.transRotate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id;
                for (Object[] plane : getSelectedPlanes()) {
                    id = Integer.parseInt(plane[1].toString());
                    tableModel.removeRow(id);
                    tableModel.insertRow(id, rotacionar(plane));
                    planeTable.setModel(tableModel);
                }
            }
        });
        
        this.transScale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id;
                for (Object[] plane : getSelectedPlanes()) {
                    id = Integer.parseInt(plane[1].toString());
                    tableModel.removeRow(id);
                    tableModel.insertRow(id, escalonar(plane));
                    planeTable.setModel(tableModel);
                }
            }
        });
        
        this.insertX.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setAngleRadiusFields(insertX.getText(), insertY.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setAngleRadiusFields(insertX.getText(), insertY.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setAngleRadiusFields(insertX.getText(), insertY.getText());
            }
        });
        
        this.insertY.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setAngleRadiusFields(insertX.getText(), insertY.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setAngleRadiusFields(insertX.getText(), insertY.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setAngleRadiusFields(insertX.getText(), insertY.getText());
            }
        });
    }
    
    private boolean testInsertionFields(){
        return (!(insertX.getText().isEmpty()) && 
                !(insertY.getText().isEmpty()) && 
                !(insertAngle.getText().isEmpty()) && 
                !(insertDirection.getText().isEmpty()) && 
                !(insertRadius.getText().isEmpty()) && 
                !(insertSpeed.getText().isEmpty()));
    }
    
    private boolean testTransMoveFields(){
        return (!(transX.getText().isEmpty()) &&
                !(transY.getText().isEmpty()));
    }
    
    private boolean testTransRotateFields(){
        return (!transX.getText().isEmpty() &&
                !transY.getText().isEmpty() &&
                !transAngle.getText().isEmpty());
    }
    
    private boolean testTransScaleFields(){
        return (!transX.getText().isEmpty() &&
                !transY.getText().isEmpty());
    }
    
    private boolean testTrackFields(){
        return !trackDistance.getText().isEmpty();
    }
    
    private Object[][] getSelectedPlanes(){
        TableModel modelo = planeTable.getModel();
        Object[][] lista = new Object[modelo.getRowCount()][8];
        for(int i=0; i<modelo.getRowCount(); i++){
            int j = 0;
            if((Boolean)modelo.getValueAt(i, j)){
                for(; j<modelo.getColumnCount(); j++){
                    lista[i][j] = modelo.getValueAt(i, j);
                }
            }
        }
        
        return lista;
    }
    
    private void setAngleRadiusFields(String x, String y){
        if(x.isEmpty() || y.isEmpty()){
            return;
        }
        
        float xF = Float.parseFloat(x);
        float yF = Float.parseFloat(y);
        
        double angle = Math.toDegrees(Math.atan(yF/xF));
        double radius = Math.sqrt(Math.pow(xF, 2) + Math.pow(yF, 2));
                
        this.insertAngle.setText(""+angle);
        this.insertRadius.setText(""+radius);
    }
    
    private boolean testCollision(Object[][] plane){
        double mA;
        double mB;

        double angleA = (Float)plane[0][5];
        double angleB = (Float)plane[1][5];
        
        if(angleA>90 && angleA<270){
            mA = (-1)*Math.tan(Math.toRadians(angleA+180));
        }
        else{
            mA = Math.tan(Math.toRadians(angleA));
        }
        
        if(angleB>90 && angleB<270){
            mB = (-1)*Math.tan(Math.toRadians(angleB+180));
        }
        else{
            mB = Math.tan(Math.toRadians(angleB));
        }
        
        if((mA>0 && mB>0) || (mA<0 && mB<0)){
            return false;
        }
        
        double yA = (double)plane[0][2]*mA;
        double yB = (double)plane[1][2]*mB;
        double xColl = (yA-yB)/(mA+mB);
        double yCollA = yA + xColl;
        double yCollB = yB + xColl;
        
        if(yCollA == yCollB){
            float speedA = (float)plane[0][6];
            float speedB = (float)plane[1][6];
            
            double distA = Math.sqrt(Math.pow((float)plane[0][2], 2) + Math.pow((float)plane[0][3], 2));
            double distB = Math.sqrt(Math.pow((float)plane[1][2], 2) + Math.pow((float)plane[1][3], 2));
            
            double timeA = distA/speedA;
            double timeB = distB/speedB;
            
            if(Math.abs(timeA - timeB) < Integer.parseInt(collisionTime.getText())){
                reportArea.append("Avião " + plane[0][1] + "em rota de colisão com avião " + plane[1][1]);
                return true;
            }
            else{
                reportArea.append("Avião " + plane[0][1] + "com tempo de colisão " + Math.abs(timeA - timeB) + "com avião " + plane[1][1]);
            }
        }
        
        return false;
    }
    
    private Object[] escalonar(Object[] plane){
        if(testTransScaleFields()){
            int x = Integer.parseInt(transX.getText());
            int y = Integer.parseInt(transY.getText());
            
            plane[2] = (Object)((float)plane[2]*x);
            plane[3] = (Object)((float)plane[3]*y);
            
            plane = angleRadiusCalc(plane);
            
            return plane;
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha os campos X e Y");
            return null;
        }
    }
    
    private Object[] transladar(Object[] plane){
        if(testTransMoveFields()){
            int x = Integer.parseInt(transX.getText());
            int y = Integer.parseInt(transY.getText());

            float xPlane = ((Number)plane[2]).floatValue();
            plane[2] = (Object)(xPlane + x);
            float yPlane = ((Number)plane[3]).floatValue();
            plane[3] = (Object)(yPlane + y);
            
            plane = angleRadiusCalc(plane);
            
            return plane;
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha os campos X e Y");
            return null;
        }
    }
    
    private Object[] rotacionar(Object[] plane){
        if(testTransRotateFields()){
            int x = Integer.parseInt(transX.getText());
            int y = Integer.parseInt(transY.getText());
            int angle = Integer.parseInt(transAngle.getText());
            
            float centerX = (float)plane[2] - x;
            float centerY = (float)plane[3] - y;
            
            plane[2] = (Object)(centerX*Math.cos(angle) - centerY*Math.sin(angle));
            plane[3] = (Object)(centerY*Math.cos(angle) + centerX*Math.sin(angle));
            
            plane = angleRadiusCalc(plane);
            
            return plane;
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha os campos X, Y e �ngulo");
            return null;
        }
    }
    
    private void planeNearPlane(Object[][] planes){
        if(testTrackFields()){
            float xDiff = (float)planes[0][2] - (float)planes[1][2];
            float yDiff = (float)planes[0][3] - (float)planes[1][3];
            double dist = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));

            if(dist < Integer.parseInt(trackDistance.getText())){
                reportArea.append("Distância entre " + (int)planes[0][1]+ " e " + (int)planes[1][1] + "EXCEDIDA: " + dist);
            }
            else{
                reportArea.append("Distância entre " + (int)planes[0][1] + " e " + (int)planes[1][1]+ ": " + dist);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha a distância");
        }
    }
    
    private Object[] angleRadiusCalc(Object[] plane){
        double x = Double.valueOf((plane[2].toString()));
        double y = Double.valueOf((plane[3].toString()));
        
        plane[5] = (Object)(Math.toDegrees(Math.atan(y/x)));
        plane[4] = (Object)(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        return plane;
    }
        
    private DefaultTableModel tableModel;
    private Integer id;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton collisionButton;
    private javax.swing.JTextField collisionTime;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JTextField insertAngle;
    private javax.swing.JButton insertButton;
    private javax.swing.JTextField insertDirection;
    private javax.swing.JTextField insertRadius;
    private javax.swing.JTextField insertSpeed;
    private javax.swing.JTextField insertX;
    private javax.swing.JTextField insertY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable planeTable;
    private javax.swing.JTextArea reportArea;
    private javax.swing.JTextField trackDistance;
    private javax.swing.JButton trackNearAirport;
    private javax.swing.JButton trackNearPlane;
    private javax.swing.JTextField transAngle;
    private javax.swing.JButton transMove;
    private javax.swing.JButton transRotate;
    private javax.swing.JButton transScale;
    private javax.swing.JTextField transX;
    private javax.swing.JTextField transY;
    // End of variables declaration//GEN-END:variables
}
