/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class UnitConverterFactory {

    /**
     *
     * @param besaran
     * @return
     */
    public static UnitConverter getConverter(String besaran) {
        switch (besaran) {
            case "Panjang": return new Panjang();
            case "Massa": return new Massa();
            case "Waktu": return new Waktu ();
            case "Suhu": return new Suhu();
            case "Kuat Arus": return new KuatArus();
            case "Intensitas Cahaya": return new IntensitasCahaya();
            case "Jumlah Zat": return new JumlahZat();
            
            case "Luas": return new Luas();
            case "Volume": return new Volume();
            case "Massa Jenis": return new MassaJenis();
            case "Kecepatan": return new Kecepatan();
            case "Percepatan": return new Percepatan();
            case "Gaya": return new Gaya();
            case "Usaha": return new Usaha();
            case "Daya": return new Daya();
            case "Tekanan": return new Tekanan();
            case "Momentum": return new Momentum();
            default: throw new IllegalArgumentException("Besaran tidak valid: " + besaran);
        }
    }
}
