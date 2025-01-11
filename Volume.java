/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Volume extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Meter Kubik (m³)":
                return value;
            case "Cubic Foot (ft³)":
                return value * 0.0283168;
            case "Pint (pt)":
                return value * 0.000473176;
            case "Liter (L)":
                return value * 1e-3;
            case "Milliliter (mL)":
                return value * 1e-6;
            case "Gallon (gal)":
                return value * 3.78541e-3;
            case "Cubic Inch (in³)":
                return value * 1.63871e-5;
            default:
                throw new IllegalArgumentException("Satuan volume tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Meter Kubik (m³)":
                return value;
            case "Cubic Foot (ft³)":
                return value / 0.0283168;
            case "Pint (pt)":
                return value / 0.000473176;
            case "Liter (L)":
                return value * 1e3;
            case "Milliliter (mL)":
                return value * 1e6;
            case "Gallon (gal)":
                return value / 3.78541e-3;
            case "Cubic Inch (in³)":
                return value / 1.63871e-5;
            default:
                throw new IllegalArgumentException("Satuan volume tidak valid: " + toUnit);
        }
    }
}