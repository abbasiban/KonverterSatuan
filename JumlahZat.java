/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class JumlahZat extends UnitConverter {
    @Override
    public double toBaseUnit(double value, String fromUnit) {
        if ("Mol (mol)".equals(fromUnit)) {
            return value;
        } else {
            throw new IllegalArgumentException("Satuan jumlah zat tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        if ("Mol (mol)".equals(toUnit)) {
            return value;
        } else {
            throw new IllegalArgumentException("Satuan jumlah zat tidak valid: " + toUnit);
        }
    }
}
