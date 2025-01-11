/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Waktu extends UnitConverter {
     @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            // Metrik dan Imperial (sama)
            case "Nanodetik (ns)":
                return value * 1e-9;
            case "Millidetik (ms)":
                return value * 1e-3;
            case "Detik (s)":
                return value;
            case "Menit (min)":
                return value * 60;
            case "Jam (h)":
                return value * 3600;
            case "Hari (d)":
                return value * 86400;
            default:
                throw new IllegalArgumentException("Satuan waktu tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            // Metrik dan Imperial (sama)
            case "Nanodetik (ns)":
                return value * 1e9;
            case "Millidetik (ms)":
                return value * 1e3;
            case "Detik (s)":
                return value;
            case "Menit (min)":
                return value / 60;
            case "Jam (h)":
                return value / 3600;
            case "Hari (d)":
                return value / 86400;
            default:
                throw new IllegalArgumentException("Satuan waktu tidak valid: " + toUnit);
        }
    }
}
