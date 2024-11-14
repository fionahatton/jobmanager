import java.util.Scanner;
public class main {

    //display welcome menu, calls to main menu
    public static void WelcomeMenu() {
        System.out.println("\n\nWelcome to the best job tracking app EVER...no seriously\n");
        System.out.println();
        MainMenu();
    }
    //displays Main menu to choose from which action to do within the app
    public static void MainMenu() {
        Scanner scnr = new Scanner(System.in); 
        System.out.println("Please pick from the following options...\n");
        System.out.println("""
                            1. View Company repository
                            2. Add/remove company from repository
                            3. View list of current interviews
                            4. Add/remove interview from schedule
                            """);
        int userChoice = scnr.nextInt();
        System.out.println();
        
        //prints entire list of repositiory, prints all object instances in the Company Class 
        if(userChoice == 1) {
            //TODO: do somthing 
            Company newPlace = new Company();
            newPlace.SetCompany("Google");

            System.out.println(newPlace.companyMap);
        }
        // 
        if(userChoice == 2) {
            //TODO: do something
        }
        if(userChoice == 3) {
            //TODO: do something
        }
        if(userChoice == 4) {
            //TODO: do something
        }
        else {
            System.out.println("Invalid entry, please try again\n");
            MainMenu();

        }
        
        
    }
    public static void main(String []args) {
        Scanner scnr = new Scanner(System.in);

        WelcomeMenu();








    }
}
 