
//this is the tester.
//methods will be readFile.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataAnalyzerTester 
    {
    public static void readMyFile(DataAnalyzer dataAnalyzer)// method to read the file...
        {
        try {
            Scanner inFile = new Scanner(new File("myDataFile.dat"));// created a scanner to read from the file...
            while (inFile.hasNextLine())// created a while loop that checks if there is more input...true or false...
                {
                Scanner inLine = new Scanner(inFile.nextLine());// created a new Scanner that is initialized by the previous Scanner...
                while (inLine.hasNext()) 
                    {
                    int num = Integer.parseInt(inLine.next().trim());// gets the value, "trims" whitespaces, and converts the string to int...
                    dataAnalyzer.min(num);// these three lines are calling the method that will update the values...
                    dataAnalyzer.max(num);
                    dataAnalyzer.avg(num);
                    }
                inLine.close();// Closed the inLine Scanner.
                }
            inFile.close();// Closed File Scanner.
            } catch (FileNotFoundException e) 
                {
                e.printStackTrace();
                }
        }
    }
