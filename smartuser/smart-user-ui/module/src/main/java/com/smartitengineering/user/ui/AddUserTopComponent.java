/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smartitengineering.user.ui;

import java.io.Serializable;
import java.util.logging.Logger;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;
import org.openide.util.Utilities;

/**
 * Top component which displays something.
 */
final class AddUserTopComponent extends TopComponent {

    private static AddUserTopComponent instance;
    /** path to the icon used by the component and its open action */
    static final String ICON_PATH = "com/smartitengineering/user/ui/add_user.gif";

    private static final String PREFERRED_ID = "AddUserTopComponent";

    private AddUserTopComponent() {
        initComponents();
        setName(NbBundle.getMessage(AddUserTopComponent.class, "CTL_AddUserTopComponent"));
        setToolTipText(NbBundle.getMessage(AddUserTopComponent.class, "HINT_AddUserTopComponent"));
        setIcon(Utilities.loadImage(ICON_PATH, true));
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseScrollPane = new javax.swing.JScrollPane();
        baseTabbedPane = new javax.swing.JTabbedPane();
        userInformationTab = new javax.swing.JPanel();
        personalInformationPanel = new javax.swing.JPanel();
        PersonalInformationLabel = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        firstNameTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        middleInitialLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        middleInitialTextField = new javax.swing.JTextField();
        emailAddressLabel = new javax.swing.JLabel();
        emailAddressTextField = new javax.swing.JTextField();
        nationalIDLabel = new javax.swing.JLabel();
        nationalIDTextField = new javax.swing.JTextField();
        userInformationPanel = new javax.swing.JPanel();
        userInformationLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        rePasswordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        rePasswordField = new javax.swing.JPasswordField();
        cancelButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        additionalInformationButton = new javax.swing.JButton();
        additionalInformationTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();

        baseTabbedPane.setPreferredSize(new java.awt.Dimension(500, 540));

        PersonalInformationLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        org.openide.awt.Mnemonics.setLocalizedText(PersonalInformationLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.PersonalInformationLabel.text")); // NOI18N

        firstNameTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.firstNameTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(firstNameLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.firstNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(middleInitialLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.middleInitialLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(lastNameLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.lastNameLabel.text")); // NOI18N

        lastNameTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.lastNameTextField.text")); // NOI18N

        middleInitialTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.middleInitialTextField.text")); // NOI18N

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLabel)
                    .addComponent(middleInitialLabel)
                    .addComponent(lastNameLabel))
                .addGap(51, 51, 51)
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastNameTextField)
                    .addComponent(middleInitialTextField)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middleInitialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleInitialLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.openide.awt.Mnemonics.setLocalizedText(emailAddressLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.emailAddressLabel.text")); // NOI18N

        emailAddressTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.emailAddressTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(nationalIDLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.nationalIDLabel.text")); // NOI18N

        nationalIDTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.nationalIDTextField.text")); // NOI18N

        javax.swing.GroupLayout personalInformationPanelLayout = new javax.swing.GroupLayout(personalInformationPanel);
        personalInformationPanel.setLayout(personalInformationPanelLayout);
        personalInformationPanelLayout.setHorizontalGroup(
            personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personalInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PersonalInformationLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, personalInformationPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAddressLabel)
                            .addComponent(nationalIDLabel))
                        .addGap(39, 39, 39)
                        .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(nationalIDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))))
        );
        personalInformationPanelLayout.setVerticalGroup(
            personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalInformationPanelLayout.createSequentialGroup()
                .addComponent(PersonalInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddressLabel)
                    .addComponent(emailAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationalIDLabel))
                .addContainerGap())
        );

        userInformationLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        org.openide.awt.Mnemonics.setLocalizedText(userInformationLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.userInformationLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(usernameLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.usernameLabel.text")); // NOI18N

        usernameTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.usernameTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(passwordLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.passwordLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(rePasswordLabel, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.rePasswordLabel.text")); // NOI18N

        passwordField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.passwordField.text")); // NOI18N

        rePasswordField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.rePasswordField.text")); // NOI18N

        javax.swing.GroupLayout userInformationPanelLayout = new javax.swing.GroupLayout(userInformationPanel);
        userInformationPanel.setLayout(userInformationPanelLayout);
        userInformationPanelLayout.setHorizontalGroup(
            userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userInformationLabel)
                    .addGroup(userInformationPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(rePasswordLabel))
                        .addGap(24, 24, 24)
                        .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rePasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordField)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))))
        );
        userInformationPanelLayout.setVerticalGroup(
            userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationPanelLayout.createSequentialGroup()
                .addComponent(userInformationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rePasswordLabel)
                    .addComponent(rePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.cancelButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addUserButton, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.addUserButton.text")); // NOI18N
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(additionalInformationButton, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.additionalInformationButton.text")); // NOI18N
        additionalInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalInformationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userInformationTabLayout = new javax.swing.GroupLayout(userInformationTab);
        userInformationTab.setLayout(userInformationTabLayout);
        userInformationTabLayout.setHorizontalGroup(
            userInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(userInformationTabLayout.createSequentialGroup()
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(userInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userInformationTabLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(additionalInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        userInformationTabLayout.setVerticalGroup(
            userInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userInformationTabLayout.createSequentialGroup()
                        .addComponent(additionalInformationButton)
                        .addGap(59, 59, 59)
                        .addComponent(addUserButton))
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        baseTabbedPane.addTab(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.userInformationTab.TabConstraints.tabTitle"), userInformationTab); // NOI18N

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel6.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jTextField1.text")); // NOI18N

        jTextField5.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jTextField5.text")); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 168, Short.MAX_VALUE)
                            .addComponent(jTextField5)
                            .addComponent(jTextField1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout additionalInformationTabLayout = new javax.swing.GroupLayout(additionalInformationTab);
        additionalInformationTab.setLayout(additionalInformationTabLayout);
        additionalInformationTabLayout.setHorizontalGroup(
            additionalInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionalInformationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        additionalInformationTabLayout.setVerticalGroup(
            additionalInformationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionalInformationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        baseTabbedPane.addTab(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.additionalInformationTab.TabConstraints.tabTitle"), additionalInformationTab); // NOI18N

        baseScrollPane.setViewportView(baseTabbedPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baseScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baseScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_addUserButtonActionPerformed

    private void additionalInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalInformationButtonActionPerformed
        // TODO add your handling code here:
        baseTabbedPane.setSelectedComponent(additionalInformationTab);
    }//GEN-LAST:event_additionalInformationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PersonalInformationLabel;
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton additionalInformationButton;
    private javax.swing.JPanel additionalInformationTab;
    private javax.swing.JScrollPane baseScrollPane;
    private javax.swing.JTabbedPane baseTabbedPane;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JTextField emailAddressTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel middleInitialLabel;
    private javax.swing.JTextField middleInitialTextField;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel nationalIDLabel;
    private javax.swing.JTextField nationalIDTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel personalInformationPanel;
    private javax.swing.JPasswordField rePasswordField;
    private javax.swing.JLabel rePasswordLabel;
    private javax.swing.JLabel userInformationLabel;
    private javax.swing.JPanel userInformationPanel;
    private javax.swing.JPanel userInformationTab;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link #findInstance}.
     */
    public static synchronized AddUserTopComponent getDefault() {
        if (instance == null) {
            instance = new AddUserTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the AddUserTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized AddUserTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(AddUserTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof AddUserTopComponent) {
            return (AddUserTopComponent) win;
        }
        Logger.getLogger(AddUserTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID +
                "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    /** replaces this in object stream */
    @Override
    public Object writeReplace() {
        return new ResolvableHelper();
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }

    final static class ResolvableHelper implements Serializable {

        private static final long serialVersionUID = 1L;

        public Object readResolve() {
            return AddUserTopComponent.getDefault();
        }
    }
}
