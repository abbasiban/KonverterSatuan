/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Massa extends UnitConverter {

    @Override
    public double toBaseUnit(double value, String fromUnit) {
        switch (fromUnit) {
            // Metrik
            case "Milligram (mg)":
                return value * 1e-3;
            case "Gram (g)":
                return value;
            case "Kilogram (kg)":
                return value * 1e3;
            case "Quintal (q)":
                return value * 1e5;
            case "Ton (t)":
                return value * 1e6;
            // Imperial
            case "Ounce (oz)":
                return value * 28.3495;
            case "Pound (lb)":
                return value * 453.592;
            case "Stone (st)":
                return value * 6350.29;
            case "Slug":
                return value * 14593.9;
            default:
                throw new IllegalArgumentException("Satuan massa tidak valid: " + fromUnit);
        }
    }

    @Override
    public double fromBaseUnit(double value, String toUnit) {
        switch (toUnit) {
            // Metric
            case "Milligram (mg)":
                return value * 1e3;
            case "Gram (g)":
                return value;
            case "Kilogram (kg)":
                return value * 1e-3;
            case "Quintal (q)":
                return value * 1e-5;
            case "Ton (t)":
                return value * 1e-6;
            // Imperial
            case "Ounce (oz)":
                return value / 28.3495;
            case "Pound (lb)":
                return value / 453.592;
            case "Stone (st)":
                return value / 6350.29;
            case "Slug":
                return value / 14593.9;
            default:
                throw new IllegalArgumentException("Satuan massa tidak valid: " + toUnit);
        }
    }
}
