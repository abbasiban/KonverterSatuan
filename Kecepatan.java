/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frisdi
 */
public class Kecepatan extends UnitConverter {
    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            case "Centimeter per Detik (cm/s)": return value * 0.01;
            case "Meter per Detik (m/s)": return value;
            case "Kilometer per Jam (km/h)": return value / 3.6;
            case "Feet per Second (ft/s)": return value * 0.3048;
            case "Miles per Hour (mph)": return value * 0.44704;
            default: throw new IllegalArgumentException("Satuan kecepatan tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            case "Centimeter per Detik (cm/s)": return value / 0.01;
            case "Meter per Detik (m/s)": return value;
            case "Kilometer per Jam (km/h)": return value * 3.6;
            case "Feet per Second (ft/s)": return value / 0.3048;
            case "Miles per Hour (mph)": return value / 0.44704;
            default: throw new IllegalArgumentException("Satuan kecepatan tidak valid: " + toUnit);
        }
    }
}
