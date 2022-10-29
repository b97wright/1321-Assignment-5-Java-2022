import java.util.Scanner;
import java.util.*;

public class Assignment5B {
    public static void main(String[] args)
    {
        String[][] monthArray = initiaizeArray();

        Scanner myObj = new Scanner(System.in);
        int month, day;

        System.out.println("[What's your sign?]");

        System.out.print("What month were you born in? ");
        month = (myObj.nextInt() - 1);

        if(month >= 0 && month < 11)
        {
            System.out.print("And what day? ");
            day = (myObj.nextInt() - 1);

            System.out.println(" ");

            if(month == 2)
            {
                if(day > 28 || day < 0)
                {
                    System.out.println("This is not a valid day...");
                }
                else
                {
                    System.out.println(monthArray[month][day]);
                }
            }
            else if(month == 3 || month == 5 || month == 8 || month == 10)
            {
                if(day > 30 || day < 0)
                {
                    System.out.println("This is not a valid day...");
                }
                else
                {
                    System.out.println(monthArray[month][day]);
                }
            }
            else
            {
                System.out.println(monthArray[month][day]);
            }
        }
        else
        {
            System.out.println("This is not a valid month...");
        }
        
    }
    public static String[][] initiaizeArray()
    {
        String[][] array = new String[12][31];

        for(int i = 0; i < array.length; i++)
        {
            // January
            if (i == 0)
            {
                for(int j = 0; j < 19; j++)
                {
                    array[i][j] = "Your sign is Capricornus!";
                }
                for(int j = 19; j < 31; j++)
                {
                    array[i][j] = "Your sign is Aquarius!";
                }
            }
            // February
            if (i == 1)
            {
                for(int j = 0; j < 17; j++)
                {
                    array[i][j] = "Your sign is Aquarius!";
                }
                for(int j = 17; j < 28; j++)
                {
                    array[i][j] = "Your sign is Pisces!";
                }
                for(int j = 28; j < 31; j++)
                {
                    array[i][j] = "That is not a valid day...";
                }
            }
            // March
            if (i == 2)
            {
                for(int j = 0; j < 20; j++)
                {
                    array[i][j] = "Your sign is Pisces!";
                }
                for(int j = 20; j < 31; j++)
                {
                    array[i][j] = "Your sign is Aries!";
                }
            }
            // April
            if (i == 3)
            {
                for(int j = 0; j < 19; j++)
                {
                    array[i][j] = "Your sign is Aries!";
                }
                for(int j = 19; j < 31; j++)
                {
                    array[i][j] = "Your sign is Taurus!";
                }
            }
            // May
            if (i == 4)
            {
                for(int j = 0; j < 20; j++)
                {
                    array[i][j] = "Your sign is Taurus!";
                }
                for(int j = 20; j < 31; j++)
                {
                    array[i][j] = "Your sign is Gemini!";
                }
            }
            // June
            if (i == 5)
            {
                for(int j = 0; j < 21; j++)
                {
                    array[i][j] = "Your sign is Gemini!";
                }
                for(int j = 21; j < 31; j++)
                {
                    array[i][j] = "Your sign is Cancer!";
                }
            }
            // July
            if (i == 6)
            {
                for(int j = 0; j < 22; j++)
                {
                    array[i][j] = "Your sign is Cancer!";
                }
                for(int j = 22; j < 31; j++)
                {
                    array[i][j] = "Your sign is Leo!";
                }
            }
            // Aug
            if (i == 7)
            {
                for(int j = 0; j < 22; j++)
                {
                    array[i][j] = "Your sign is Leo!";
                }
                for(int j = 22; j < 31; j++)
                {
                    array[i][j] = "Your sign is Virgo!";
                }
            }
            // Sep
            if (i == 8)
            {
                for(int j = 0; j < 22; j++)
                {
                    array[i][j] = "Your sign is Virgo!";
                }
                for(int j = 22; j < 31; j++)
                {
                    array[i][j] = "Your sign is Libra!";
                }
            }
            // Oct
            if (i == 9)
            {
                for(int j = 0; j < 23; j++)
                {
                    array[i][j] = "Your sign is Libra!";
                }
                for(int j = 23; j < 31; j++)
                {
                    array[i][j] = "Your sign is Scorpius!";
                }
            }
            // Nov
            if (i == 10)
            {
                for(int j = 0; j < 21; j++)
                {
                    array[i][j] = "Your sign is Scorpius!";
                }
                for(int j = 21; j < 31; j++)
                {
                    array[i][j] = "Your sign is Sagittarius!";
                }
            }
            // Dec
            if (i == 11)
            {
                for(int j = 0; j < 21; j++)
                {
                    array[i][j] = "Your sign is Sagittarius!";
                }
                for(int j = 21; j < 31; j++)
                {
                    array[i][j] = "Your sign is Capricornus!";
                }
            }

        }


        return array;
    }
    // Debug Function 
    public static void printArray(String[][] array)
    {
        for(int i = 0; i < 12; i++)
        {
            // Jan
            if(i == 0)
            {
                    for(int j = 0; j < 31; j++)
                {
                    System.out.println("Jan: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Feb
            else if(i == 1)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Feb: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Mar
            else if(i == 2)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Mar: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Apr
            else if(i == 3)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Apr: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // May
            else if(i == 4)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("May: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // June
            else if(i == 5)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Jun: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // July
            else if(i == 6)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("July: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Aug
            else if(i == 7)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Aug: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Sep
            else if(i == 8)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Sep: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Oct
            else if(i == 9)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Oct: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Nov
            else if(i == 10)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Nov: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            // Dec
            else if(i == 11)
            {
                for(int j = 0; j < 31; j++)
                {
                    System.out.println("Dec: " + (i + 1) + " Day: " + (j + 1) + " Sign: " + array[i][j]);
                }
            }
            
        }
    }
}
