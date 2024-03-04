import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PendaftaranForm extends javax.swing.JFrame {

    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNIM;
    private javax.swing.JLabel jLabelProdi;
    private javax.swing.JLabel jLabelInstitusi;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNIM;
    private javax.swing.JTextField jTextFieldProdi;
    private javax.swing.JTextField jTextFieldInstitusi;

    public PendaftaranForm() {
        initComponents();
        setupAdditionalComponents();
    }

    private void initComponents() {
        jLabelNama = new javax.swing.JLabel();
        jLabelNIM = new javax.swing.JLabel();
        jLabelProdi = new javax.swing.JLabel();
        jLabelInstitusi = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldNIM = new javax.swing.JTextField();
        jTextFieldProdi = new javax.swing.JTextField();
        jTextFieldInstitusi = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulir Pendaftaran");

        jLabelNama.setText("Nama");

        jLabelNIM.setText("NIM");

        jLabelProdi.setText("Prodi");

        jLabelInstitusi.setText("Institusi");

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNama)
                                        .addComponent(jLabelNIM)
                                        .addComponent(jLabelProdi)
                                        .addComponent(jLabelInstitusi))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldNama)
                                        .addComponent(jTextFieldNIM)
                                        .addComponent(jTextFieldProdi, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                        .addComponent(jTextFieldInstitusi))
                                .addContainerGap(51, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSubmit)
                                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelNama)
                                                                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabelNIM))
                                                        .addComponent(jTextFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelProdi))
                                        .addComponent(jTextFieldProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelInstitusi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldInstitusi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubmit)
                                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtonSubmitActionPerformed(ActionEvent evt) {
        String nama = jTextFieldNama.getText();
        String nim = jTextFieldNIM.getText();
        String prodi = jTextFieldProdi.getText();
        String institusi = jTextFieldInstitusi.getText();

        // Lakukan sesuatu dengan nilai-nilai tersebut, contohnya tampilkan dalam pesan
        String hasil = "Nama: " + nama + "\nNIM: " + nim + "\nProdi: " + prodi + "\nInstitusi: " + institusi;
        javax.swing.JOptionPane.showMessageDialog(this, hasil);
    }

    private void setupAdditionalComponents() {
        // Jika Anda ingin menambahkan komponen tambahan atau logika lainnya, bisa dilakukan di sini
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranForm().setVisible(true);
            }
        });
    }
}
