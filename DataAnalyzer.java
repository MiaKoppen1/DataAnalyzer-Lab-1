
// this is where my methods will be.

public class DataAnalyzer 
    {
    private int min = Integer.MAX_VALUE;
    private int max = 0;
    private int sum = 0;
    private int count = 0;

    public void min(int minValue) 
        {
        if (minValue < min) 
            {
            min = minValue;
            }
        }

    public void max(int maxValue) 
        {
        if (maxValue > max) 
            {
            max = maxValue;
            }
        }

    public void avg(int value) 
        {
        sum += value;
        count++;
        }

    public void calculateAverage()// method that calculates the values adn prints them to the screen...
        {
        int average = (count == 0) ? 0 : sum / count;
        System.out.println("the min is..." + min);
        System.out.println("the max is..." + max);
        System.out.println("the average is..." + average);
        }

    public int getMin()// get method for the min value...
        {
        return min;
        }

    public int getMax()// get method for the max value...
        {
        return max;
        }

    public int getSum()// get method for the sum of the values...
        {
        return sum;
        }
        
    public int getCount()// get method that returns the count...
        {
        return count;
        }
    }
