/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Luas extends UnitConverter {
    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Meter Persegi (m²)": return value;
            case "Kilometer Persegi (km²)": return value * 1e6;
            case "Hektare (ha)": return value * 1e4;
            case "Square Inch (in²)": return value * 0.00064516;
            case "Square Foot (ft²)": return value * 0.092903;
            case "Acre": return value * 4046.86;
            case "Square Mile (mi²)": return value * 2.59e6;
            default: throw new IllegalArgumentException("Satuan luas tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Meter Persegi (m²)": return value;
            case "Kilometer Persegi (km²)": return value * 1e-6;
            case "Hektare (ha)": return value * 1e-4;
            case "Square Inch (in²)": return value / 0.00064516;
            case "Square Foot (ft²)": return value / 0.092903;
            case "Acre": return value / 4046.86;
            case "Square Mile (mi²)": return value / 2.59e6;
            default: throw new IllegalArgumentException("Satuan luas tidak valid: " + toUnit);
        }
    }
}
