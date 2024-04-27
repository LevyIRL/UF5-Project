/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controler.MainController;
import model.Region;
import model.Champion;
import model.Role;

/**
 *
 * @author levy
 */
public class ModifyView extends javax.swing.JDialog {

    private MainController mainCtl;
    int code;

    /**
     * Creates new form AddView
     */
    public ModifyView(java.awt.Frame parent, boolean modal, MainController ctl, int code) {
        super(parent, modal);
        this.mainCtl = ctl;
        this.code = code;
        initComponents();
        initView(code);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roleButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modifyChampButton = new javax.swing.JButton();
        CodeTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        topButton = new javax.swing.JRadioButton();
        jngButton = new javax.swing.JRadioButton();
        midButton = new javax.swing.JRadioButton();
        botButton = new javax.swing.JRadioButton();
        supButton = new javax.swing.JRadioButton();
        winrateTextField = new javax.swing.JTextField();
        pickrateTextField = new javax.swing.JTextField();
        banrateTextField = new javax.swing.JTextField();
        isRangedCheckBox = new javax.swing.JCheckBox();
        regionComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Code:");

        jLabel2.setText("Name:");

        jLabel3.setText("Role:");

        jLabel4.setText("WinRate:");

        jLabel5.setText("PickRate:");

        jLabel6.setText("BanRate:");

        jLabel7.setText("Is Ranged:");

        jLabel8.setText("Region:");

        modifyChampButton.setText("MODIFY CHAMPION");
        modifyChampButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyChampButtonActionPerformed(evt);
            }
        });

        CodeTextField.setText("CODE");

        NameTextField.setText("NAME");

        roleButtonGroup.add(topButton);
        topButton.setText("Top");
        topButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topButtonActionPerformed(evt);
            }
        });

        roleButtonGroup.add(jngButton);
        jngButton.setText("Jng");

        roleButtonGroup.add(midButton);
        midButton.setText("Mid");

        roleButtonGroup.add(botButton);
        botButton.setText("Bot");

        roleButtonGroup.add(supButton);
        supButton.setText("Sup");

        winrateTextField.setText("WINRATE");

        pickrateTextField.setText("PICKRATE");

        banrateTextField.setText("BANRATE");

        regionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Runeterra", "Zaun", "Piltover", "Ionia", "Freljord", "Demacia", "Noxus", "Bilgewater", "Shadow isle", "Bandle City", "Shurima", "The Void", "Targon", "Ixtal", "Unknown", " " }));
        regionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(winrateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(topButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jngButton)
                        .addGap(18, 18, 18)
                        .addComponent(midButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(83, 83, 83)
                        .addComponent(isRangedCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(banrateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(pickrateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(regionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifyChampButton)
                .addGap(201, 201, 201))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CodeTextField, NameTextField, banrateTextField, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, modifyChampButton, pickrateTextField, regionComboBox, winrateTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botButton, jngButton, midButton, supButton, topButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(topButton)
                    .addComponent(midButton)
                    .addComponent(jngButton)
                    .addComponent(supButton)
                    .addComponent(botButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(winrateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pickrateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(banrateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isRangedCheckBox)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(regionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(modifyChampButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CodeTextField, NameTextField, banrateTextField, botButton, isRangedCheckBox, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jngButton, midButton, modifyChampButton, pickrateTextField, regionComboBox, supButton, topButton, winrateTextField});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topButtonActionPerformed

    private void regionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionComboBoxActionPerformed

    private void initView(int code){
        Champion champ = mainCtl.getChampList().searchChamp(code);
        CodeTextField.setText(String.valueOf(champ.getCode()));
        CodeTextField.setEditable(false);
        NameTextField.setText(champ.getName());
        if(champ.getRole().getName().equals("Top")){
            topButton.setSelected(true);
        }else if(champ.getRole().getName().equals("Jng")){
            jngButton.setSelected(true);
        }else if(champ.getRole().getName().equals("Mid")){
            midButton.setSelected(true);
        }else if(champ.getRole().getName().equals("Bot")){
            botButton.setSelected(true);
        }else if(champ.getRole().getName().equals("Sup")){
            supButton.setSelected(true);
        }
        winrateTextField.setText(String.valueOf(champ.getWinrate()));
        pickrateTextField.setText(String.valueOf(champ.getPickrate()));
        banrateTextField.setText(String.valueOf(champ.getBanrate()));
        isRangedCheckBox.setSelected(champ.isIsRanged());
        regionComboBox.setSelectedItem(champ.getRegion().getName());
    }
    
    private void modifyChampButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyChampButtonActionPerformed
        Champion modifyChamp = mainCtl.getChampList().searchChamp(code);
        System.out.println(code);
        modifyChamp.toString();
        
        String name = (String) (NameTextField.getText());
        Role role = null;
        if(topButton.isSelected()){
            role = mainCtl.getChampList().getRoleList().get(0);
        }else if(jngButton.isSelected()){
            role = mainCtl.getChampList().getRoleList().get(1);
        }else if(midButton.isSelected()){
            role = mainCtl.getChampList().getRoleList().get(2);
        }else if(botButton.isSelected()){
            role = mainCtl.getChampList().getRoleList().get(3);
        }else if(supButton.isSelected()){
            role = mainCtl.getChampList().getRoleList().get(4);
        }
        
        int winrate = (int) (Double.parseDouble(winrateTextField.getText()));
        double pickrate = (double) (Double.parseDouble(pickrateTextField.getText()));
        double banrate = (double) (Double.parseDouble(banrateTextField.getText()));
        boolean isRanged = isRangedCheckBox.isEnabled();
        String regionName = (String) (regionComboBox.getSelectedItem());
        Region region = null;
        if(mainCtl.getChampList().searchRegion(regionName) == -1){
            region = new Region(regionName);
            mainCtl.getChampList().addRegion(region);
        }else{
            region = mainCtl.getChampList().getRegionList().get(mainCtl.getChampList().searchRegion(regionName));
        }
        
        modifyChamp.setName(name);
        modifyChamp.setRole(role);
        modifyChamp.setWinrate(winrate);
        modifyChamp.setPickrate(pickrate);
        modifyChamp.setBanrate(banrate);
        modifyChamp.setIsRanged(isRanged);
        modifyChamp.setRegion(region);
        
        mainCtl.showChamps();
        
        this.dispose();
    }//GEN-LAST:event_modifyChampButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifyView dialog = new ModifyView(new javax.swing.JFrame(), true, null, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField banrateTextField;
    private javax.swing.JRadioButton botButton;
    private javax.swing.JCheckBox isRangedCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jngButton;
    private javax.swing.JRadioButton midButton;
    private javax.swing.JButton modifyChampButton;
    private javax.swing.JTextField pickrateTextField;
    private javax.swing.JComboBox<String> regionComboBox;
    private javax.swing.ButtonGroup roleButtonGroup;
    private javax.swing.JRadioButton supButton;
    private javax.swing.JRadioButton topButton;
    private javax.swing.JTextField winrateTextField;
    // End of variables declaration//GEN-END:variables
}
