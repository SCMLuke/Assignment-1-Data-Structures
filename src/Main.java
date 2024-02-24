import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        DataStructure list = new DataStructure();
        Scanner userInput = new Scanner(System.in);
        int menuChoice;
        int inputValue;

        while (running == true) {
            System.out.println("Data Structure. Select an option below.");
            System.out.println("1. Append Value");
            System.out.println("2. Prepend Value");
            System.out.println("3. Get Size");
            System.out.println("4. Get Head Value");
            System.out.println("5. Get Tail Value");
            System.out.println("6. Get Value at Given Index");
            System.out.println("7. Remove Last Element From List");
            System.out.println("8. Check if Value is Found in List");
            System.out.println("9. Check if Value is Found at Given Index");
            System.out.println("10. Quit");

            if (userInput.hasNextInt()) {
                menuChoice = userInput.nextInt();
                if (menuChoice > 0 && menuChoice <11) {

                    switch (menuChoice) {
                        case 1:

                            System.out.println("Enter a value to add:");
                            if (userInput.hasNextInt()) {
                                inputValue = userInput.nextInt();
                                list.append(inputValue);
                                System.out.println("Added value: "+inputValue);
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                userInput.next();
                            }

                            break;
                        case 2:

                            System.out.println("Enter a value to add:");
                            if (userInput.hasNextInt()) {
                                inputValue = userInput.nextInt();
                                list.prepend(inputValue);
                                System.out.println("Added value: "+inputValue);
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                userInput.next();
                            }

                            break;
                        case 3:

                            System.out.println("List Size: "+list.size());

                            break;
                        case 4:

                            System.out.println("First Item: "+list.getHead());

                            break;
                        case 5:

                            System.out.println("First Item: "+list.getTail());

                            break;
                        case 6:

                            System.out.println("Enter a value to find:");
                            if (userInput.hasNextInt()) {
                                inputValue = userInput.nextInt();
                                System.out.println("Value at location: "+list.at(inputValue).value);
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                userInput.next();
                            }

                            break;
                        case 7:

                            System.out.println("Removed "+list.getTail()+" from list.");
                            list.pop();

                            break;
                        case 8:

                            System.out.println("Enter a value to check is present:");
                            if (userInput.hasNextInt()) {
                                inputValue = userInput.nextInt();
                                System.out.println(list.contains(inputValue));
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                userInput.next();
                            }

                            break;
                        case 9:

                            System.out.println("Enter a value to check its index:");
                            if (userInput.hasNextInt()) {
                                inputValue = userInput.nextInt();
                                System.out.println(list.find(inputValue));
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                userInput.next();
                            }

                            break;
                        case 10:
                            break;
                    }

                } else {
                    System.out.println("Please select a valid number from the list above.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                userInput.next();
            }
        }
    }
}