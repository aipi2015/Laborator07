package ro.pub.cs.aipi.lab07.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ro.pub.cs.aipi.lab07.businesslogic.BookInformation;
import ro.pub.cs.aipi.lab07.businesslogic.BookInformationDetailed;
import ro.pub.cs.aipi.lab07.businesslogic.BookManager;
import ro.pub.cs.aipi.lab07.businesslogic.BookManager_Service;
import ro.pub.cs.aipi.lab07.general.Constants;
import ro.pub.cs.aipi.lab07.general.Utilities;

public class BookManagerClient {

    public static void main(String[] args) {
        BookManager_Service service = new BookManager_Service();
        BookManager port = service.getBookManagerPort();

        try {
            int option = -1;
            do {
                Utilities.displayMenu();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                option = Integer.parseInt(bufferedReader.readLine());
                switch (option) {
                    case Constants.OPTION_GET_BOOKS_LIST:
                        Utilities.displayResults(port.getBooksList(), BookInformation.class);
                        break;
                    case Constants.OPTION_GET_BOOKS_LIST_WITH_STOCKPILE:
                        System.out.println("Enter stockpile: ");
                        int stockpile = Integer.parseInt(bufferedReader.readLine());
                        Utilities.displayResults(port.getBooksListWithStockpile(stockpile),
                                BookInformationDetailed.class);
                        break;
                    case Constants.OPTION_QUIT:
                        break;
                    default:
                        System.out.println("You have entered an invalid option");
                        break;
                }
            } while (option != Constants.OPTION_QUIT);
        } catch (Exception exception) {
            System.out.println("An exception has occurred: " + exception.getMessage());
            if (Constants.DEBUG) {
                exception.printStackTrace();
            }
        }
    }

}
