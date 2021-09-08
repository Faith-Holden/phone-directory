package solution;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        PhoneDirectory directory = new PhoneDirectory();
        getUserInput:
        while(true){
            Scanner phoneNumScanner = new Scanner(System.in);
            System.out.println("Would you like to add a phone directory entry, get a phone number, or finish? (Type \"add\", \"get\", or \"finish\")");
            String userInput = phoneNumScanner.nextLine();
            switch (userInput) {
                case "finish":
                    System.out.println("Alright. Goodbye.");
                    break getUserInput;
                case "add":
                    System.out.println("Ok, what is the name of the person you would like to add?");
                    String putName = phoneNumScanner.nextLine();
                    System.out.println("Ok, what is the phone number that you would like to add?");
                    String number = phoneNumScanner.nextLine();
                    directory.addEntry(putName, number);
                    System.out.println("Entry added.");
                    break;
                case "get":
                    if (directory.directorySize == 0) {
                        System.out.println("Sorry, no users in the directory yet!");
                    } else {
                        System.out.println("Ok, please type the name of the person whose number you would like to find.");
                        try {
                            String getName = phoneNumScanner.nextLine();
                            System.out.println(getName + "'s number is:");
                            System.out.println( directory.getNumber(getName));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                default:
                    System.out.println("Sorry " + userInput + " is not an option.");
                    break;
            }
        }
    }
}
