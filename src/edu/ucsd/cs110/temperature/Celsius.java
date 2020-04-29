package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float c = this.getValue();
        float f = ((c*9)/5) + 32;
        return new Fahrenheit(f);
    }

    public String toString()
    {
        return this.getValue() + " C";
    }
}