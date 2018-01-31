/**
 * The Computer class stores information about the customer's computer.
 */

public class Computer
{
    private String make;
    private String model;
    private int year;

    /**
     * Constructor
     * @param make The make of the computer.
     * @param mod The model of the computer.
     * @param yr The year of the computer.
     */

    public Computer(String mak, String mod, int yr)
    {
        make = mak;
        model = mod;
        year = yr;
    }

    /**
     * The setMake method stores a value in the make field
     * @param mak The value to store in make
     */

    public void setMake(String mak)
    {
        make = mak;
    }

    /**
     * The setModel method stores a value in the model field
     * @param mod The value to store in model
     */

    public void setModel(String mod)
    {
        model = mod;
    }

    /**
     * The setYear method stores a value in the model field
     * @param yr The value to store in year
     */

    public void setYear(int yr)
    {
        year = yr;
    }

    /**
     * The getMake method returns a Computer object's make
     * @return The value in the make field
     */

    public String getMake()
    {
        return make;
    }

    /**
     * The getModel method returns a Computer object's model
     * @return The value in the model field
     */

    public String getModel()
    {
        return model;
    }

    /**
     * The getYear method returns a Computer object's year
     * @return The valued in the year field
     */

    public int getYear()
    {
        return year;
    }
}