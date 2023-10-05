package driver;

import contacts.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ContactMenu {

    // constructed once(final) to hold a list of contact objects
    private final List<Contact> LIST = new ArrayList<>();

    /**
     * Default constructor creates a list of Contacts by opening a file
     * and reading in the contents and constructing a contact object from each line of the file
     * Adds the contact object to the list
     */
    public ContactMenu(String fileInputName) {
       /* your code goes here */

    }

    /**
     * This method displays a menu of options for the user
     */
    public static void displayMenu() {
        System.out.println();
        System.out.println("Welcome to my contacts list!");
        System.out.println("1.  Display all contacts.");
        System.out.println("2.  Display favorites.");
        System.out.println("3.  Exit.");
        System.out.println();
    }

    /**
     * This method displays all the contacts in the contact list
     */
    public void displayAllContacts() {
        /* Your code goes here */
    }

    /**
     * This method displays all the contacts that are marked as a favorite in the
     * contact list
     */
    public void displayFavorites() {
       /* Your code goes here */
    }

    /**
     * Allows the user to choose how to display
     * the contact list via a menu of options
     *
     * @param in - Scanner object to get user's input
     */
    public void displayOption(Scanner in) {
        String choice = "";
        // while the user has not chosen to exit

        while (!choice.equals("3")) {

            displayMenu();

            // get menu choice
            System.out.print("Enter your numerical choice: ");
            choice = in.next();
            System.out.println();

            switch (choice) {
                case "1":
                    displayAllContacts();
                    break;
                case "2":
                    displayFavorites();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }
            System.out.println();
        }
        System.out.println("Goodbye");
        in.close();
    }

    /**
     * The main method provides the user with a display menu
     *
     * @param args - not used
     */
    public static void main(String[] args) {

        ContactMenu contacts = new ContactMenu("data/in_contacts.txt");
        contacts.displayOption(new Scanner(System.in));

    }


}
