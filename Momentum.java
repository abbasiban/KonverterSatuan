/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Momentum extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Kilogram Meter per Detik (kg·m/s)":
                return value;
            case "Newton Second (N·s)":
                return value;
            case "Pound-feet per Second (lb·ft/s)":
                return value * 0.138255;
            default:
                throw new IllegalArgumentException("Satuan momentum tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Kilogram Meter per Detik (kg·m/s)":
                return value;
            case "Newton Second (N·s)":
                return value;
            case "Pound-feet per Second (lb·ft/s)":
                return value / 0.138255;
            default:
                throw new IllegalArgumentException("Satuan momentum tidak valid: " + toUnit);
        }
    }
}

