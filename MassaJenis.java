/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class MassaJenis extends UnitConverter {
     @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Gram per Centimeter Kubik (g/cm³)": return value * 1000;
            case "Kilogram per Meter Kubik (kg/m³)": return value;
            case "Pound per Cubic Foot (lb/ft³)": return value * 16.0185;
            case "Slug per Cubic Foot (slug/ft³)": return value * 515.379;
            default: throw new IllegalArgumentException("Satuan massa jenis tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Gram per Centimeter Kubik (g/cm³)": return value / 1000;
            case "Kilogram per Meter Kubik (kg/m³)": return value;
            case "Pound per Cubic Foot (lb/ft³)": return value / 16.0185;
            case "Slug per Cubic Foot (slug/ft³)": return value / 515.379;
            default: throw new IllegalArgumentException("Satuan massa jenis tidak valid: " + toUnit);
        }
    }
}
