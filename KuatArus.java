/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class KuatArus extends UnitConverter {
    @Override
    public double toBaseUnit(double value, String fromUnit) {
        if ("Ampere (A)".equals(fromUnit)) {
            return value;
        } else {
            throw new IllegalArgumentException("Satuan kuat arus tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        if ("Ampere (A)".equals(toUnit)) {
            return value;
        } else {
            throw new IllegalArgumentException("Satuan kuat arus tidak valid: " + toUnit);
        }
    }
}
