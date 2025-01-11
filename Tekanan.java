/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Tekanan extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Pascal (Pa)":
                return value;
            case "Kilogram-force per Centimeter Persegi (kgf/cm²)":
                return value * 98066.5;
            case "Bar (bar)":
                return value * 1e5;
            case "Atmosfer Teknis (at)":
                return value * 98066.5;
            case "Pound per Square Inch (psi)":
                return value * 6894.76;
            default:
                throw new IllegalArgumentException("Satuan tekanan tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Pascal (Pa)":
                return value;
            case "Kilogram-force per Centimeter Persegi (kgf/cm²)":
                return value / 98066.5;
            case "Bar (bar)":
                return value / 1e5;
            case "Atmosfer Teknis (at)":
                return value / 98066.5;
            case "Pound per Square Inch (psi)":
                return value / 6894.76;
            default:
                throw new IllegalArgumentException("Satuan tekanan tidak valid: " + toUnit);
        }
    }
}

