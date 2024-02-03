//lab #1 read file input and output with data, and print min, max, average values.
//Mia Koppen :)
public class Main 
    {
    public static void main(String[] args) 
        {
        DataAnalyzer dataAnalyzer = new DataAnalyzer(); // create an instance of the DataAnalyzer class.
        DataAnalyzerTester dataAnalyzerTester = new DataAnalyzerTester(); // create an instance of the DataAnalyzerTester class.
        
        dataAnalyzerTester.readMyFile(dataAnalyzer); // calling the function to read the file.
        
        dataAnalyzer.calculateAverage();// Use the calculateAverage method to get the min, max, and average values.

        }
    }
        
    
    

        
