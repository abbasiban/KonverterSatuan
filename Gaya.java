/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Gaya extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Dyne (dyn)":
                return value * 1e-5;
            case "Newton (N)":
                return value;
            case "Kilogram-force (kgf)":
                return value * 9.80665;
            case "Ounce-force (ozf)":
                return value * 0.2780139;
            case "Pound-force (lbf)":
                return value * 4.44822;
            default:
                throw new IllegalArgumentException("Satuan gaya tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Dyne (dyn)":
                return value * 1e5;
            case "Newton (N)":
                return value;
            case "Kilogram-force (kgf)":
                return value / 9.80665;
            case "Ounce-force (ozf)":
                return value / 0.2780139;
            case "Pound-force (lbf)":
                return value / 4.44822;
            default:
                throw new IllegalArgumentException("Satuan gaya tidak valid: " + toUnit);
        }
    }
}

