/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Usaha extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Calorie (cal)":
                return value * 4.184;
            case "Joule (J)":
                return value;
            case "Kilojoule (kJ)":
                return value * 1e3;
            case "Foot-Pound (ft·lb)":
                return value * 1.35582;
            case "British Thermal Unit (BTU)":
                return value * 1055.06;
            default:
                throw new IllegalArgumentException("Satuan usaha tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Calorie (cal)":
                return value / 4.184;
            case "Joule (J)":
                return value;
            case "Kilojoule (kJ)":
                return value / 1e3;
            case "Foot-Pound (ft·lb)":
                return value / 1.35582;
            case "British Thermal Unit (BTU)":
                return value / 1055.06;
            default:
                throw new IllegalArgumentException("Satuan usaha tidak valid: " + toUnit);
        }
    }
}

