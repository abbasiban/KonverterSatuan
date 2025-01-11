/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Daya extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Watt (W)":
                return value;
            case "Kilowatt (kW)":
                return value * 1e3;
            case "Megawatt (MW)":
                return value * 1e6;
            case "BTU per Hour (BTU/h)":
                return value * 0.293071;
            case "Horsepower (hp)":
                return value * 745.7;
            default:
                throw new IllegalArgumentException("Satuan daya tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Watt (W)":
                return value;
            case "Kilowatt (kW)":
                return value / 1e3;
            case "Megawatt (MW)":
                return value / 1e6;
            case "BTU per Hour (BTU/h)":
                return value / 0.293071;
            case "Horsepower (hp)":
                return value / 745.7;
            default:
                throw new IllegalArgumentException("Satuan daya tidak valid: " + toUnit);
        }
    }
}

