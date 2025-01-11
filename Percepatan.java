/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
// Percepatan
public class Percepatan extends UnitConverter {
    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Meter per Detik Kuadrat (m/s²)": return value;
            case "Gal (Gal)": return value * 0.01;
            case "Feet per Second Squared (ft/s²)": return value * 0.3048;
            default: throw new IllegalArgumentException("Satuan percepatan tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Meter per Detik Kuadrat (m/s²)": return value;
            case "Gal (Gal)": return value / 0.01;
            case "Feet per Second Squared (ft/s²)": return value / 0.3048;
            default: throw new IllegalArgumentException("Satuan percepatan tidak valid: " + toUnit);
        }
    }
}

