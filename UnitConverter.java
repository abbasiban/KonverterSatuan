/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public abstract class UnitConverter {
    public abstract double toBaseUnit(double value, String fromUnit);
    public abstract double fromBaseUnit(double value, String toUnit);

    public double convert(double value, String fromUnit, String toUnit) {
        double baseValue = toBaseUnit(value, fromUnit);
        return fromBaseUnit(baseValue, toUnit);
    }
}
    
