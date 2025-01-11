/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Panjang extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Nanometer (nm)":
                return value * 1e-9;
            case "Micrometer (µm)":
                return value * 1e-6;
            case "Millimeter (mm)":
                return value * 1e-3;
            case "Centimeter (cm)":
                return value * 1e-2;
            case "Meter (m)":
                return value;
            case "Kilometer (km)":
                return value * 1e3;
            case "Inch (in)":
                return value * 0.0254;
            case "Foot (ft)":
                return value * 0.3048;
            case "Yard (yd)":
                return value * 0.9144;
            case "Furlong":
                return value * 201.168;
            case "Mile (mi)":
                return value * 1609.34;
            default:
                throw new IllegalArgumentException("Satuan panjang tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Nanometer (nm)":
                return value * 1e9;
            case "Micrometer (µm)":
                return value * 1e6;
            case "Millimeter (mm)":
                return value * 1e3;
            case "Centimeter (cm)":
                return value * 1e2;
            case "Meter (m)":
                return value;
            case "Kilometer (km)":
                return value * 1e-3;
            case "Inch (in)":
                return value / 0.0254;
            case "Foot (ft)":
                return value / 0.3048;
            case "Yard (yd)":
                return value / 0.9144;
            case "Furlong":
                return value / 201.168;
            case "Mile (mi)":
                return value / 1609.34;
            default:
                throw new IllegalArgumentException("Satuan panjang tidak valid: " + toUnit);
        }
    }
}
