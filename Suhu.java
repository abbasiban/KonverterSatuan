/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Suhu extends UnitConverter {

     @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            // Metrik
            case "Celsius (°C)":
                return value + 273.15;
            case "Kelvin (K)":
                return value;
            case "Reaumur (°Re)":
                return (value * 5.0 / 4.0) + 273.15;
            // Imperial
            case "Fahrenheit (°F)":
                return (value - 32) * 5.0 / 9.0 + 273.15;
            case "Rankine (°R)":
                return value * 5.0 / 9.0;
            default:
                throw new IllegalArgumentException("Satuan suhu tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            // Metrik
            case "Celsius (°C)":
                return value - 273.15;
            case "Kelvin (K)":
                return value;
            case "Reaumur (°Re)":
                return (value - 273.15) * 4.0 / 5.0;
            // Imperial
            case "Fahrenheit (°F)":
                return (value - 273.15) * 9.0 / 5.0 + 32;
            case "Rankine (°R)":
                return value * 9.0 / 5.0;
            default:
                throw new IllegalArgumentException("Satuan suhu tidak valid: " + toUnit);
        }
    }
}