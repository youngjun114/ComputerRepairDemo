/**
 * The Costs class stores information on the costs.
 */

public class Costs
{
    private double laborCost;
    private double computerCost;
    private int workHours;

    /**
     * Constructor
     * @param lab The labor cost of the employee.
     * @param com The cost of the computer.
     * @param work The working hours of the employee.
     */

    public Costs(double lab, double com, int work)
    {
        laborCost = lab;
        computerCost = com;
        workHours = work;
    }

    /**
     * The setLabCost method stores a value in the laborCost field
     * @param lab The value to store in laborCost
     */

    public void setLabCost(double lab)
    {
        laborCost = lab;
    }

    /**
     * The setComputerCost method stores a value in the
     * computerCost field
     * @param com The value to store in computerCost
     */

    public void setComputerCost(double com)
    {
        computerCost = com;
    }

    /**
     * The setWorkHours method stores a value in the workHours field
     * @param work The value to store in workHours
     */

    public void setWorkHours(int work)
    {
        workHours = work;
    }

    /**
     * The getLabCost method returns the employee's labor cost
     * @return The value in the laborCost field
     */

    public double getLabCost()
    {
        return laborCost;
    }

    /**
     * The getComputerCost method returns the cost of the computer
     * @return The value in the computerCost field
     */

    public double getComputerCost()
    {
        return computerCost;
    }

    /**
     * The getWorkHours method returns the working hours of the employee
     * @return The value in workHours
     */

    public int getWorkHours()
    {
        return workHours;
    }
}