
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    private UnitConverter unitConverter ;
    
    public UI() {
        initComponents();
        unitConverter = new UnitConverter() {
            @Override
            public double toBaseUnit(double value, String fromUnit) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public double fromBaseUnit(double value, String toUnit) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();
        cbSatuan = new javax.swing.JComboBox<>();
        cbBesaran = new javax.swing.JComboBox<>();
        cbKategori = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        taInput = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cbKategori1 = new javax.swing.JComboBox<>();
        cbBesaran1 = new javax.swing.JComboBox<>();
        cbJenis1 = new javax.swing.JComboBox<>();
        cbSatuan1 = new javax.swing.JComboBox<>();
        taOutput = new javax.swing.JTextArea();
        btKonversi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(640, 360));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Program Konverter Satuan");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis" }));
        cbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenisActionPerformed(evt);
            }
        });

        cbSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Satuan" }));
        cbSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSatuanActionPerformed(evt);
            }
        });

        cbBesaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Besaran" }));
        cbBesaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBesaranActionPerformed(evt);
            }
        });

        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "Besaran Biasa", "Besaran Turunan" }));
        cbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKategoriActionPerformed(evt);
            }
        });

        jLabel2.setText("Satuan Asal");

        taInput.setColumns(20);
        taInput.setRows(5);

        jLabel3.setText("Satuan Tujuan");

        cbKategori1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "Besaran Biasa", "Besaran Turunan" }));
        cbKategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKategori1ActionPerformed(evt);
            }
        });

        cbBesaran1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Besaran" }));
        cbBesaran1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBesaran1ActionPerformed(evt);
            }
        });

        cbJenis1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis" }));
        cbJenis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJenis1ActionPerformed(evt);
            }
        });

        cbSatuan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Satuan" }));
        cbSatuan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSatuan1ActionPerformed(evt);
            }
        });

        taOutput.setColumns(20);
        taOutput.setRows(5);

        btKonversi.setText("Konversi");
        btKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKonversiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(taInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btKonversi))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbKategori, 0, 185, Short.MAX_VALUE)
                                .addComponent(cbBesaran, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSatuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSatuan1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbJenis1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBesaran1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBesaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBesaran1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJenis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSatuan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btKonversi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taInput, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konversiSatuan() {
    try {
        // Ambil nilai input
        double nilaiInput = Double.parseDouble(taInput.getText());

        // Ambil satuan asal dan tujuan
        String satuanAsal = (String) cbSatuan.getSelectedItem();
        String satuanTujuan = (String) cbSatuan1.getSelectedItem();

        // Ambil besaran yang dipilih (panjang, massa, suhu, dll)
        String besaran = (String) cbBesaran.getSelectedItem();

        // Dapatkan konverter berdasarkan besaran yang dipilih
        unitConverter = UnitConverterFactory.getConverter(besaran);

        double hasilKonversi = unitConverter.convert(nilaiInput, satuanAsal, satuanTujuan);

      
        taOutput.setText(String.valueOf(hasilKonversi));

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Input tidak valid. Harap masukkan angka.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    
    private void logic_cbKategori() {
        cbBesaran.removeAllItems();
        String kategori = (String) cbKategori.getSelectedItem();

        if ("Besaran Biasa".equals(kategori)) {
            tambahItemComboBox(cbBesaran, List.of("Panjang", "Massa", "Waktu", "Suhu", "Kuat Arus", "Intensitas Cahaya", "Jumlah Zat"));
        } else if ("Besaran Turunan".equals(kategori)) {
            tambahItemComboBox(cbBesaran, List.of("Luas", "Volume", "Massa Jenis", "Kecepatan", "Percepatan", "Gaya", "Usaha", "Daya", "Tekanan", "Momentum"));
        }

        cbBesaran.insertItemAt("Pilih Besaran", 0);
        cbBesaran.setSelectedIndex(0);
    }

    private void logic_cbJenis() {
        cbSatuan.removeAllItems();
        cbSatuan.addItem("Pilih Satuan");

        String besaran = (String) cbBesaran.getSelectedItem();
        String jenis = (String) cbJenis.getSelectedItem();
        String kategori = (String) cbKategori.getSelectedItem();

        if ("Metric".equals(jenis)) {
            isiSatuanMetric(kategori, besaran);
        } else if ("Imperial".equals(jenis)) {
            isiSatuanImperial(kategori, besaran);
        }
    }

    private void logic_cbBesaran() {
        cbJenis.removeAllItems();
        tambahItemComboBox(cbJenis, List.of("Pilih Jenis", "Metric", "Imperial"));
    }

    private void isiSatuanMetric(String kategori, String besaran) {
        if ("Besaran Biasa".equals(kategori)) {
            switch (besaran) {
                case "Panjang" ->
                    tambahItemComboBox(cbSatuan, List.of("Nanometer (nm)", "Micrometer (µm)", "Millimeter (mm)", "Centimeter (cm)", "Meter (m)", "Kilometer (km)"));
                case "Massa" ->
                    tambahItemComboBox(cbSatuan, List.of("Milligram (mg)", "Gram (g)", "Kilogram (kg)", "Quintal (q)", "Ton (t)"));
                case "Waktu" ->
                    tambahItemComboBox(cbSatuan, List.of("Nanodetik (ns)", "Millidetik (ms)", "Detik (s)", "Menit (min)", "Jam (h)", "Hari (d)"));
                case "Suhu" ->
                    tambahItemComboBox(cbSatuan, List.of("Celsius (°C)", "Kelvin (K)", "Reaumur (°Re)"));
                case "Kuat Arus" ->
                    tambahItemComboBox(cbSatuan, List.of("Ampere (A)"));
                case "Intensitas Cahaya" ->
                    tambahItemComboBox(cbSatuan, List.of("Candela (cd)"));
                case "Jumlah Zat" ->
                    tambahItemComboBox(cbSatuan, List.of("Mol (mol)"));
            }
        } else if ("Besaran Turunan".equals(kategori)) {
            switch (besaran) {
                case "Luas" ->
                    tambahItemComboBox(cbSatuan, List.of("Meter Persegi (m²)", "Kilometer Persegi (km²)", "Hektare (ha)"));
                case "Volume" ->
                    tambahItemComboBox(cbSatuan, List.of("Milliliter (mL)", "Liter (L)", "Meter Kubik (m³)"));
                case "Massa Jenis" ->
                    tambahItemComboBox(cbSatuan, List.of("Gram per Centimeter Kubik (g/cm³)", "Kilogram per Meter Kubik (kg/m³)"));
                case "Kecepatan" ->
                    tambahItemComboBox(cbSatuan, List.of("Centimeter per Detik (cm/s)", "Meter per Detik (m/s)", "Kilometer per Jam (km/h)"));
                case "Percepatan" ->
                    tambahItemComboBox(cbSatuan, List.of("Meter per Detik Kuadrat (m/s²)", "Gal (Gal)"));
                case "Gaya" ->
                    tambahItemComboBox(cbSatuan, List.of("Dyne (dyn)", "Newton (N)", "Kilogram-force (kgf)"));
                case "Usaha" ->
                    tambahItemComboBox(cbSatuan, List.of("Calorie (cal)", "Joule (J)", "Kilojoule (kJ)"));
                case "Daya" ->
                    tambahItemComboBox(cbSatuan, List.of("Watt (W)", "Kilowatt (kW)", "Megawatt (MW)"));
                case "Tekanan" ->
                    tambahItemComboBox(cbSatuan, List.of("Pascal (Pa)", "Kilogram-force per Centimeter Persegi (kgf/cm²)", "Bar (bar)", "Atmosfer Teknis (at)"));
                case "Momentum" ->
                    tambahItemComboBox(cbSatuan, List.of("Kilogram Meter per Detik (kg·m/s)", "Newton Second (N·s)"));
            }
        }
    }
    
    private void isiSatuanImperial(String kategori, String besaran) {
        if ("Besaran Biasa".equals(kategori)) {
            switch (besaran) {
                case "Panjang" ->
                    tambahItemComboBox(cbSatuan, List.of("Inch (in)", "Foot (ft)", "Yard (yd)", "Furlong", "Mile (mi)"));
                case "Massa" ->
                    tambahItemComboBox(cbSatuan, List.of("Ounce (oz)", "Pound (lb)", "Stone (st)", "Slug"));
                case "Waktu" ->
                    tambahItemComboBox(cbSatuan, List.of("Second (s)", "Minute (min)", "Hour (h)", "Day (d)"));
                case "Suhu" ->
                    tambahItemComboBox(cbSatuan, List.of("Fahrenheit (°F)", "Rankine (°R)"));
                case "Kuat Arus" ->
                    tambahItemComboBox(cbSatuan, List.of("Ampere (A)"));
                case "Intensitas Cahaya" ->
                    tambahItemComboBox(cbSatuan, List.of("Candela (cd)"));
                case "Jumlah Zat" ->
                    tambahItemComboBox(cbSatuan, List.of("Mol (mol)"));
            }
        } else if ("Besaran Turunan".equals(kategori)) {
            switch (besaran) {
                case "Luas" ->
                    tambahItemComboBox(cbSatuan, List.of("Square Inch (in²)", "Square Foot (ft²)", "Acre", "Square Mile (mi²)"));
                case "Volume" ->
                    tambahItemComboBox(cbSatuan, List.of("Cubic Inch (in³)", "Cubic Foot (ft³)", "Pint", "Gallon (gal)"));
                case "Massa Jenis" ->
                    tambahItemComboBox(cbSatuan, List.of("Pound per Cubic Foot (lb/ft³)", "Slug per Cubic Foot (slug/ft³)"));
                case "Kecepatan" ->
                    tambahItemComboBox(cbSatuan, List.of("Feet per Second (ft/s)", "Miles per Hour (mph)"));
                case "Percepatan" ->
                    tambahItemComboBox(cbSatuan, List.of("Feet per Second Squared (ft/s²)"));
                case "Gaya" ->
                    tambahItemComboBox(cbSatuan, List.of("Ounce-force (ozf)", "Pound-force (lbf)"));
                case "Usaha" ->
                    tambahItemComboBox(cbSatuan, List.of("Foot-Pound (ft·lb)", "British Thermal Unit (BTU)"));
                case "Daya" ->
                    tambahItemComboBox(cbSatuan, List.of("BTU per Hour (BTU/h)", "Horsepower (hp)"));
                case "Tekanan" ->
                    tambahItemComboBox(cbSatuan, List.of("Pound per Square Inch (psi)", "Atmosphere (atm)"));
                case "Momentum" ->
                    tambahItemComboBox(cbSatuan, List.of("Pound-feet per Second (lb·ft/s)"));
            }
        }
    }

    private void logic_cbKategoriTujuan() {
        cbBesaran1.removeAllItems();
        String kategori = (String) cbKategori1.getSelectedItem();

        if ("Besaran Biasa".equals(kategori)) {
            tambahItemComboBox(cbBesaran1, List.of("Panjang", "Massa", "Waktu", "Suhu", "Kuat Arus", "Intensitas Cahaya", "Jumlah Zat"));
        } else if ("Besaran Turunan".equals(kategori)) {
            tambahItemComboBox(cbBesaran1, List.of("Luas", "Volume", "Massa Jenis", "Kecepatan", "Percepatan", "Gaya", "Usaha", "Daya", "Tekanan", "Momentum"));
        }

        cbBesaran1.insertItemAt("Pilih Besaran", 0);
        cbBesaran1.setSelectedIndex(0);
    }

    private void logic_cbJenisTujuan() {
        cbSatuan1.removeAllItems();
        cbSatuan1.addItem("Pilih Satuan");

        String besaran = (String) cbBesaran1.getSelectedItem();
        String jenis = (String) cbJenis1.getSelectedItem();
        String kategori = (String) cbKategori1.getSelectedItem();

        if ("Metric".equals(jenis)) {
            isiSatuanMetricTujuan(kategori, besaran);
        } else if ("Imperial".equals(jenis)) {
            isiSatuanImperialTujuan(kategori, besaran);
        }
    }
    
    private void logic_cbBesaranTujuan() {
        cbJenis1.removeAllItems();
        tambahItemComboBox(cbJenis1, List.of("Pilih Jenis", "Metric", "Imperial"));
    }
    
    private void isiSatuanMetricTujuan(String kategori, String besaran) {
        if ("Besaran Biasa".equals(kategori)) {
            switch (besaran) {
                case "Panjang" ->
                    tambahItemComboBox(cbSatuan1, List.of("Nanometer (nm)", "Micrometer (µm)", "Millimeter (mm)", "Centimeter (cm)", "Meter (m)", "Kilometer (km)"));
                case "Massa" ->
                    tambahItemComboBox(cbSatuan1, List.of("Milligram (mg)", "Gram (g)", "Kilogram (kg)", "Quintal (q)", "Ton (t)"));
                case "Waktu" ->
                    tambahItemComboBox(cbSatuan1, List.of("Nanodetik (ns)", "Millidetik (ms)", "Detik (s)", "Menit (min)", "Jam (h)", "Hari (d)"));
                case "Suhu" ->
                    tambahItemComboBox(cbSatuan1, List.of("Celsius (°C)", "Kelvin (K)", "Reaumur (°Re)"));
                case "Kuat Arus" ->
                    tambahItemComboBox(cbSatuan1, List.of("Ampere (A)"));
                case "Intensitas Cahaya" ->
                    tambahItemComboBox(cbSatuan1, List.of("Candela (cd)"));
                case "Jumlah Zat" ->
                    tambahItemComboBox(cbSatuan1, List.of("Mol (mol)"));
            }
        } else if ("Besaran Turunan".equals(kategori)) {
            switch (besaran) {
                case "Luas" ->
                    tambahItemComboBox(cbSatuan1, List.of("Meter Persegi (m²)", "Kilometer Persegi (km²)", "Hektare (ha)"));
                case "Volume" ->
                    tambahItemComboBox(cbSatuan1, List.of("Milliliter (mL)", "Liter (L)", "Meter Kubik (m³)"));
                case "Massa Jenis" ->
                    tambahItemComboBox(cbSatuan1, List.of("Gram per Centimeter Kubik (g/cm³)", "Kilogram per Meter Kubik (kg/m³)"));
                case "Kecepatan" ->
                    tambahItemComboBox(cbSatuan1, List.of("Centimeter per Detik (cm/s)", "Meter per Detik (m/s)", "Kilometer per Jam (km/h)"));
                case "Percepatan" ->
                    tambahItemComboBox(cbSatuan1, List.of("Meter per Detik Kuadrat (m/s²)", "Gal (Gal)"));
                case "Gaya" ->
                    tambahItemComboBox(cbSatuan1, List.of("Dyne (dyn)", "Newton (N)", "Kilogram-force (kgf)"));
                case "Usaha" ->
                    tambahItemComboBox(cbSatuan1, List.of("Calorie (cal)", "Joule (J)", "Kilojoule (kJ)"));
                case "Daya" ->
                    tambahItemComboBox(cbSatuan1, List.of("Watt (W)", "Kilowatt (kW)", "Megawatt (MW)"));
                case "Tekanan" ->
                    tambahItemComboBox(cbSatuan1, List.of("Pascal (Pa)", "Kilogram-force per Centimeter Persegi (kgf/cm²)", "Bar (bar)", "Atmosfer Teknis (at)"));
                case "Momentum" ->
                    tambahItemComboBox(cbSatuan1, List.of("Kilogram Meter per Detik (kg·m/s)", "Newton Second (N·s)"));
            }
        }
    }
    
    private void isiSatuanImperialTujuan(String kategori, String besaran) {
        if ("Besaran Biasa".equals(kategori)) {
            switch (besaran) {
                case "Panjang" ->
                    tambahItemComboBox(cbSatuan1, List.of("Inch (in)", "Foot (ft)", "Yard (yd)", "Furlong", "Mile (mi)"));
                case "Massa" ->
                    tambahItemComboBox(cbSatuan1, List.of("Ounce (oz)", "Pound (lb)", "Stone (st)", "Slug"));
                case "Waktu" ->
                    tambahItemComboBox(cbSatuan1, List.of("Second (s)", "Minute (min)", "Hour (h)", "Day (d)"));
                case "Suhu" ->
                    tambahItemComboBox(cbSatuan1, List.of("Fahrenheit (°F)", "Rankine (°R)"));
                case "Kuat Arus" ->
                    tambahItemComboBox(cbSatuan1, List.of("Ampere (A)"));
                case "Intensitas Cahaya" ->
                    tambahItemComboBox(cbSatuan1, List.of("Candela (cd)"));
                case "Jumlah Zat" ->
                    tambahItemComboBox(cbSatuan1, List.of("Mol (mol)"));
            }
        } else if ("Besaran Turunan".equals(kategori)) {
            switch (besaran) {
                case "Luas" ->
                    tambahItemComboBox(cbSatuan1, List.of("Square Inch (in²)", "Square Foot (ft²)", "Acre", "Square Mile (mi²)"));
                case "Volume" ->
                    tambahItemComboBox(cbSatuan1, List.of("Cubic Inch (in³)", "Cubic Foot (ft³)", "Pint", "Gallon (gal)"));
                case "Massa Jenis" ->
                    tambahItemComboBox(cbSatuan1, List.of("Pound per Cubic Foot (lb/ft³)", "Slug per Cubic Foot (slug/ft³)"));
                case "Kecepatan" ->
                    tambahItemComboBox(cbSatuan1, List.of("Feet per Second (ft/s)", "Miles per Hour (mph)"));
                case "Percepatan" ->
                    tambahItemComboBox(cbSatuan1, List.of("Feet per Second Squared (ft/s²)"));
                case "Gaya" ->
                    tambahItemComboBox(cbSatuan1, List.of("Ounce-force (ozf)", "Pound-force (lbf)"));
                case "Usaha" ->
                    tambahItemComboBox(cbSatuan1, List.of("Foot-Pound (ft·lb)", "British Thermal Unit (BTU)"));
                case "Daya" ->
                    tambahItemComboBox(cbSatuan1, List.of("BTU per Hour (BTU/h)", "Horsepower (hp)"));
                case "Tekanan" ->
                    tambahItemComboBox(cbSatuan1, List.of("Pound per Square Inch (psi)", "Atmosphere (atm)"));
                case "Momentum" ->
                    tambahItemComboBox(cbSatuan1, List.of("Pound-feet per Second (lb·ft/s)"));
            }
        }
    }
    
    private void tambahItemComboBox(javax.swing.JComboBox<String> comboBox, List<String> items) {
        for (String item : items) {
            comboBox.addItem(item);
        }
    }

    
    private void cbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenisActionPerformed
        // TODO add your handling code here:
        logic_cbJenis() ;
    }//GEN-LAST:event_cbJenisActionPerformed

    private void cbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriActionPerformed
        // TODO add your handling code here:
        logic_cbKategori () ;
    }//GEN-LAST:event_cbKategoriActionPerformed

    private void cbBesaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBesaranActionPerformed
        // TODO add your handling code here:
        logic_cbBesaran() ;
    }//GEN-LAST:event_cbBesaranActionPerformed

    private void cbKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategori1ActionPerformed
        // TODO add your handling code here:
        logic_cbKategoriTujuan() ;
    }//GEN-LAST:event_cbKategori1ActionPerformed

    private void cbBesaran1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBesaran1ActionPerformed
        // TODO add your handling code here:
        logic_cbBesaranTujuan() ;
    }//GEN-LAST:event_cbBesaran1ActionPerformed

    private void cbJenis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJenis1ActionPerformed
        // TODO add your handling code here:
         logic_cbJenisTujuan() ;
    }//GEN-LAST:event_cbJenis1ActionPerformed

    private void cbSatuan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSatuan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSatuan1ActionPerformed

    private void cbSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSatuanActionPerformed

    private void btKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKonversiActionPerformed
        // TODO add your handling code here:
        konversiSatuan() ;
    }//GEN-LAST:event_btKonversiActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKonversi;
    private javax.swing.JComboBox<String> cbBesaran;
    private javax.swing.JComboBox<String> cbBesaran1;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbJenis1;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JComboBox<String> cbKategori1;
    private javax.swing.JComboBox<String> cbSatuan;
    private javax.swing.JComboBox<String> cbSatuan1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea taInput;
    private javax.swing.JTextArea taOutput;
    // End of variables declaration//GEN-END:variables
}
