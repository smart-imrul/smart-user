/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.smartitengineering.user.ui;

import com.smartitengineering.ui.component.BasicIdentityPanel;
import com.smartitengineering.ui.component.DatePanel;
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
        basePanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addUserTabbedPane = new javax.swing.JTabbedPane();
        userInformationTabPanel = new javax.swing.JPanel();
        selfBasicIdentityPanel = new BasicIdentityPanel("Personal Information");
        userInformationPanel = new com.smartitengineering.ui.component.UserInformationPanel();
        additionalInformationTabPanel = new DatePanel("Date of Birth");
        addressPanel1 = new com.smartitengineering.ui.component.AddressPanel();
        fatherBasicIdentityPanel = new BasicIdentityPanel("Father's Information");
        motherBasicIdentityPanel = new com.smartitengineering.ui.component.BasicIdentityPanel("Mother's Information");
        spouseBasicIdentityPanel = new com.smartitengineering.ui.component.BasicIdentityPanel("Spouse's Information");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        secondaryEmailAddressTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        cellPhoneNumberTextField = new javax.swing.JTextField();
        faxNumberTextField = new javax.swing.JTextField();
        datePanel1 = new com.smartitengineering.ui.component.DatePanel();

        baseScrollPane.setFont(baseScrollPane.getFont());

        basePanel.setFont(basePanel.getFont());

        bottomPanel.setFont(bottomPanel.getFont());

        org.openide.awt.Mnemonics.setLocalizedText(saveButton, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.saveButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.cancelButton.text")); // NOI18N

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(598, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(saveButton)
                .addComponent(cancelButton))
        );

        addUserTabbedPane.setFont(addUserTabbedPane.getFont());

        userInformationTabPanel.setFont(userInformationTabPanel.getFont());

        selfBasicIdentityPanel.setFont(selfBasicIdentityPanel.getFont());

        userInformationPanel.setFont(userInformationPanel.getFont());

        javax.swing.GroupLayout userInformationTabPanelLayout = new javax.swing.GroupLayout(userInformationTabPanel);
        userInformationTabPanel.setLayout(userInformationTabPanelLayout);
        userInformationTabPanelLayout.setHorizontalGroup(
            userInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selfBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        userInformationTabPanelLayout.setVerticalGroup(
            userInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userInformationTabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selfBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(userInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        addUserTabbedPane.addTab(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.userInformationTabPanel.TabConstraints.tabTitle"), new javax.swing.ImageIcon(getClass().getResource("/com/smartitengineering/user/ui/user_information_icon.gif")), userInformationTabPanel); // NOI18N

        additionalInformationTabPanel.setFont(additionalInformationTabPanel.getFont());

        addressPanel1.setFont(addressPanel1.getFont());

        fatherBasicIdentityPanel.setFont(fatherBasicIdentityPanel.getFont());

        motherBasicIdentityPanel.setFont(motherBasicIdentityPanel.getFont());

        spouseBasicIdentityPanel.setFont(spouseBasicIdentityPanel.getFont());

        jLabel1.setFont(jLabel1.getFont());
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel1.text")); // NOI18N

        jLabel2.setFont(jLabel2.getFont());
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel2.text")); // NOI18N

        jLabel3.setFont(jLabel3.getFont());
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel3.text")); // NOI18N

        jLabel4.setFont(jLabel4.getFont());
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.jLabel4.text")); // NOI18N

        secondaryEmailAddressTextField.setFont(secondaryEmailAddressTextField.getFont());
        secondaryEmailAddressTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.secondaryEmailAddressTextField.text")); // NOI18N

        phoneNumberTextField.setFont(phoneNumberTextField.getFont());
        phoneNumberTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.phoneNumberTextField.text_1")); // NOI18N

        cellPhoneNumberTextField.setFont(cellPhoneNumberTextField.getFont());
        cellPhoneNumberTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.cellPhoneNumberTextField.text_1")); // NOI18N

        faxNumberTextField.setFont(faxNumberTextField.getFont());
        faxNumberTextField.setText(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.faxNumberTextField.text_1")); // NOI18N

        javax.swing.GroupLayout additionalInformationTabPanelLayout = new javax.swing.GroupLayout(additionalInformationTabPanel);
        additionalInformationTabPanel.setLayout(additionalInformationTabPanelLayout);
        additionalInformationTabPanelLayout.setHorizontalGroup(
            additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionalInformationTabPanelLayout.createSequentialGroup()
                .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, additionalInformationTabPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, additionalInformationTabPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondaryEmailAddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, additionalInformationTabPanelLayout.createSequentialGroup()
                                .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(52, 52, 52)
                                .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(cellPhoneNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(faxNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))))
                    .addComponent(datePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spouseBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatherBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motherBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        additionalInformationTabPanelLayout.setVerticalGroup(
            additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionalInformationTabPanelLayout.createSequentialGroup()
                .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, additionalInformationTabPanelLayout.createSequentialGroup()
                        .addComponent(addressPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(datePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(secondaryEmailAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cellPhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(additionalInformationTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(faxNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, additionalInformationTabPanelLayout.createSequentialGroup()
                        .addComponent(fatherBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motherBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spouseBasicIdentityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        addUserTabbedPane.addTab(org.openide.util.NbBundle.getMessage(AddUserTopComponent.class, "AddUserTopComponent.additionalInformationTabPanel.TabConstraints.tabTitle"), new javax.swing.ImageIcon(getClass().getResource("/com/smartitengineering/user/ui/additional_information_icon.gif")), additionalInformationTabPanel); // NOI18N

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addUserTabbedPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addComponent(addUserTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        baseScrollPane.setViewportView(basePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(baseScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane addUserTabbedPane;
    private javax.swing.JPanel additionalInformationTabPanel;
    private com.smartitengineering.ui.component.AddressPanel addressPanel1;
    private javax.swing.JPanel basePanel;
    private javax.swing.JScrollPane baseScrollPane;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cellPhoneNumberTextField;
    private com.smartitengineering.ui.component.DatePanel datePanel1;
    private com.smartitengineering.ui.component.BasicIdentityPanel fatherBasicIdentityPanel;
    private javax.swing.JTextField faxNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.smartitengineering.ui.component.BasicIdentityPanel motherBasicIdentityPanel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField secondaryEmailAddressTextField;
    private com.smartitengineering.ui.component.BasicIdentityPanel selfBasicIdentityPanel;
    private com.smartitengineering.ui.component.BasicIdentityPanel spouseBasicIdentityPanel;
    private com.smartitengineering.ui.component.UserInformationPanel userInformationPanel;
    private javax.swing.JPanel userInformationTabPanel;
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
