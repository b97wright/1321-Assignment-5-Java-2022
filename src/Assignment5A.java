import java.util.Scanner;
import java.util.*;

public class Assignment5A {
    public static void main(String[] args) throws Exception {

        Scanner myObj = new Scanner(System.in);
        int choice, addCount = 0, intTemp;
        String strTemp;
        String[] strArray = initiaizeArray();
        boolean isPlaying = true;

        System.out.println("[Top 5 Friend's List]");

        while(isPlaying)
        {
            printMenu();
            choice = myObj.nextInt();


            System.out.print(" \n");
            switch(choice)
            {
                case 1:
                {
                    if(addCount <= 4)
                    {
                        System.out.print("Enter a name: ");
                        strTemp = myObj.next();
                        if(isInArray(strTemp, strArray) == true)
                        {
                            System.out.println("Sorry, they're already on the list! \n");
                        }
                        else
                        {
                            strArray[addCount] = strTemp;
                            System.out.print(" \n");
                            addCount++;
                        }
                    }
                    else
                    {
                        System.out.println("Sorry, they're already on the list! \n");
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("Enter a name: ");
                    strTemp = myObj.next();
                    System.out.print("Enter an index: ");
                    intTemp = myObj.nextInt();
                    if(isInArray(strTemp, strArray) == false)
                    {
                        if(intTemp >= 0 && intTemp < 5)
                        {
                            strArray[intTemp] = strTemp;
                        }
                        else
                        {
                            System.out.println("Sorry, that's an invalid command!\n");
                        }
                    }
                    else
                    {
                        System.out.println("Sorry, they're already on the list! \n");
                    }

                    break;
                }
                case 3:
                {
                    for (int i = 0; i < strArray.length; i++)
                    {
                        System.out.println((i+1) + ") " + strArray[i]);
                    }
                    System.out.print(" \n");
                    break;
                }
                case 4:
                {
                    isPlaying = false;
                    System.out.println("[Program Ends]\n");
                    break;
                }
                default:
                {
                    break;
                }
            }

            
        }
    }

    public static void printMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1) Enter a friend's name");
        System.out.println("2) Replace a friend's name");
        System.out.println("3) Display your friends list");
        System.out.println("4) Quit");
        System.out.print("Your choice: ");
    }

    public static String[] initiaizeArray()
    {
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = " ";
        }

        return array;
    }

    public static boolean isInArray(String inputStr, String[] arr)
    {
        String strTemp1;
        for (int i = 0; i < arr.length; i++)
        {
            strTemp1 = arr[i];
            if(strTemp1.equals(inputStr))
            {
                return true;
            }
        }
        return false;
    }
}