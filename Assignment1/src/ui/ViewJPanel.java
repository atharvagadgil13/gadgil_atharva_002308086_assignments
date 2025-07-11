/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Profile;

/**
 *
 * @author Atharva
 */
public class ViewJPanel extends javax.swing.JPanel {
    
    Profile profile;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(Profile p) {
        initComponents();
        profile = p;
        
        displayProfile(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDriverLicenseState = new javax.swing.JTextField();
        txtOriginCountry = new javax.swing.JTextField();
        lbDriverLinceseState = new javax.swing.JLabel();
        lbOriginCountry = new javax.swing.JLabel();
        txtSocialSecurityNumber = new javax.swing.JTextField();
        txtEthnicity = new javax.swing.JTextField();
        lbSocialSecurityNumber = new javax.swing.JLabel();
        lbEthnicity = new javax.swing.JLabel();
        txtAddressLine1 = new javax.swing.JTextField();
        txtPassportNumber = new javax.swing.JTextField();
        lbAddressLine1 = new javax.swing.JLabel();
        lbPassportNumber = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        lbAddressLine2 = new javax.swing.JLabel();
        txtLanguagePreference = new javax.swing.JTextField();
        lbLanguagePreference = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lbCity = new javax.swing.JLabel();
        lbCreateProfile = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lbFirstname = new javax.swing.JLabel();
        lbState = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtZIP = new javax.swing.JTextField();
        lbZIP = new javax.swing.JLabel();
        lbLastname = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        txtLastame1 = new javax.swing.JTextField();
        lbTelephone = new javax.swing.JLabel();
        txtFaxNumber = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        lbFaxNumber = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lbphone = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lbGender = new javax.swing.JLabel();
        txtDriverLicenseNumber = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        lbDriverLicenseNumber = new javax.swing.JLabel();
        lbDOB = new javax.swing.JLabel();

        lbDriverLinceseState.setText("DriverLicenseState");

        lbOriginCountry.setText("OriginCountry");

        lbSocialSecurityNumber.setText("SocialSecurityNumber");

        lbEthnicity.setText("Ethnicity");

        lbAddressLine1.setText("AddressLine1");

        lbPassportNumber.setText("PassportNumber");

        lbAddressLine2.setText("AddressLine2");

        lbLanguagePreference.setText("LanguagePreference");

        lbCity.setText("City");

        lbCreateProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreateProfile.setText("View Profile");

        lbFirstname.setText("FirstName");

        lbState.setText("State");

        lbZIP.setText("ZIP");

        lbLastname.setText("LastName");

        lbTelephone.setText("Telephone ");

        lbEmail.setText("Email");

        lbFaxNumber.setText("FaxNumber");

        lbphone.setText("Phone");

        lbGender.setText("Gender");

        lbDriverLicenseNumber.setText("DriverLicenseNumber");

        lbDOB.setText("DOB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDriverLicenseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDriverLinceseState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbSocialSecurityNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAddressLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbZIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTelephone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbFaxNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbOriginCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbEthnicity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbPassportNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbLanguagePreference, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLanguagePreference)
                                .addComponent(txtPassportNumber)
                                .addComponent(txtEthnicity)
                                .addComponent(txtOriginCountry)
                                .addComponent(txtDOB)
                                .addComponent(txtGender)
                                .addComponent(txtFaxNumber)
                                .addComponent(txtTelephone)
                                .addComponent(txtZIP)
                                .addComponent(txtState)
                                .addComponent(txtCity)
                                .addComponent(txtAddressLine2)
                                .addComponent(txtAddressLine1)
                                .addComponent(txtSocialSecurityNumber)
                                .addComponent(txtDriverLicenseState)
                                .addComponent(txtDriverLicenseNumber)
                                .addComponent(txtPhone)
                                .addComponent(txtEmail)
                                .addComponent(txtFirstName)
                                .addComponent(txtLastame1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addGap(70, 70, 70))
                        .addComponent(lbCreateProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFirstName)
                        .addComponent(lbFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(9, 9, 9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbLastname)
                        .addComponent(txtLastame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEmail))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbphone))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDriverLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDriverLicenseNumber))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDriverLicenseState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(lbDriverLinceseState, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSocialSecurityNumber))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbAddressLine1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbAddressLine2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCity))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbState))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbZIP))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTelephone))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbFaxNumber))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbGender))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDOB))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOriginCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbOriginCountry))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEthnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEthnicity))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassportNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPassportNumber))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLanguagePreference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbLanguagePreference))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAddressLine1;
    private javax.swing.JLabel lbAddressLine2;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbCreateProfile;
    private javax.swing.JLabel lbDOB;
    private javax.swing.JLabel lbDriverLicenseNumber;
    private javax.swing.JLabel lbDriverLinceseState;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEthnicity;
    private javax.swing.JLabel lbFaxNumber;
    private javax.swing.JLabel lbFirstname;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbLanguagePreference;
    private javax.swing.JLabel lbLastname;
    private javax.swing.JLabel lbOriginCountry;
    private javax.swing.JLabel lbPassportNumber;
    private javax.swing.JLabel lbSocialSecurityNumber;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbTelephone;
    private javax.swing.JLabel lbZIP;
    private javax.swing.JLabel lbphone;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDriverLicenseNumber;
    private javax.swing.JTextField txtDriverLicenseState;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEthnicity;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLanguagePreference;
    private javax.swing.JTextField txtLastame1;
    private javax.swing.JTextField txtOriginCountry;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSocialSecurityNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtZIP;
    // End of variables declaration//GEN-END:variables

    private void dislayProfile(){
        txtFirstName.setText(profile.getFirstName());
        txtLastame1.setText(profile.getLastName());
        txtEmail.setText(profile.getEmail());
        txtPhone.setText(profile.getPhone());
        txtDriverLicenseNumber.setText(profile.getDriversLicenseNumber());
        txtDriverLicenseState.setText(profile.getDriversLicenseState());
        txtSocialSecurityNumber.setText(profile.getSocialSecurityNumber());
        txtAddressLine1.setText(profile.getAddressLine1());
        txtAddressLine2.setText(profile.getAddressLine2());
        txtCity.setText(profile.getCity());
        txtState.setText(profile.getState());
        txtZIP.setText(profile.getZIP());
        txtTelephone.setText(profile.getTelephone());
        txtFaxNumber.setText(profile.getFaxNumber());
        txtGender.setText(profile.getGender());
        txtDOB.setText(profile.getDOB());
        txtOriginCountry.setText(profile.getOriginCountry());
        txtEthnicity.setText(profile.getEthnicity());
        txtPassportNumber.setText(profile.getPassportNumber());
        txtLanguagePreference.setText(profile.getLanguage());
        
    }

    private void displayProfile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }







}
