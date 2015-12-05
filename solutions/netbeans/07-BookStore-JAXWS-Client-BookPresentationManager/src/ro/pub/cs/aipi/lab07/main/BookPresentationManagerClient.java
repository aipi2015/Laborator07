package ro.pub.cs.aipi.lab07.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ro.pub.cs.aipi.lab07.businesslogic.BookPresentationInformation;
import ro.pub.cs.aipi.lab07.businesslogic.BookPresentationManager;
import ro.pub.cs.aipi.lab07.businesslogic.BookPresentationManager_Service;
import ro.pub.cs.aipi.lab07.businesslogic.SupplyOrderInformation;
import ro.pub.cs.aipi.lab07.general.Constants;
import ro.pub.cs.aipi.lab07.general.Utilities;

public class BookPresentationManagerClient {

    public static void main(String[] args) {
        BookPresentationManager_Service service = new BookPresentationManager_Service();
        BookPresentationManager port = service.getBookPresentationManagerPort();

        try {
            int option = -1;
            do {
                Utilities.displayMenu();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                option = Integer.parseInt(bufferedReader.readLine());
                switch (option) {
                    case Constants.OPTION_UPDATE_BOOK_PRESENTATION_PRICE_FOR_BOOKS_WITH_MULTIPLE_FORMATS:
                        System.out.println("Enter number of formats: ");
                        int numberOfFormats = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter percent amount: ");
                        double amount = Double.parseDouble(bufferedReader.readLine());
                        Utilities.displayResults(
                                port.updateBookPresentationPriceForBooksWithMultipleFormats(numberOfFormats, amount),
                                BookPresentationInformation.class);
                        break;
                    case Constants.OPTION_MAKE_SUPPLY_ORDER_BASED_ON_STOCKPILE:
                        System.out.println("Enter stockpile: ");
                        int stockpile = Integer.parseInt(bufferedReader.readLine());
                        Utilities.displayResults(port.makeSupplyOrderBasedOnStockpile(stockpile),
                                SupplyOrderInformation.class);
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
