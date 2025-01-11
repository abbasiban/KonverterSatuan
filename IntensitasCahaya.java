/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class IntensitasCahaya extends UnitConverter {
    @Override
    public double toBaseUnit(double value, String fromUnit) {
        if ("Candela (cd)".equals(fromUnit)) {
            return value;
        } else {
            throw new IllegalArgumentException("Satuan intensitas cahaya tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        if ("Candela (cd)".equals(toUnit)) {
            return value;
        } else {
            throw new IllegalArgumentException("Satuan intensitas cahaya tidak valid: " + toUnit);
        }
    }
}
