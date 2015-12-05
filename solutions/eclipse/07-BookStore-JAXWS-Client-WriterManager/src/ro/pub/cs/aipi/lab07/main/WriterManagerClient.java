package ro.pub.cs.aipi.lab07.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ro.pub.cs.aipi.lab07.businesslogic.WriterInformation;
import ro.pub.cs.aipi.lab07.businesslogic.WriterManager;
import ro.pub.cs.aipi.lab07.businesslogic.WriterManager_Service;
import ro.pub.cs.aipi.lab07.general.Constants;
import ro.pub.cs.aipi.lab07.general.Utilities;

public class WriterManagerClient {

	public static void main(String[] args) {
		 WriterManager_Service service = new WriterManager_Service();
	     WriterManager port = service.getWriterManagerPort();

		try {
			int option = -1;
			do {
				Utilities.displayMenu();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				option = Integer.parseInt(bufferedReader.readLine());
				switch (option) {
				case Constants.OPTION_DELETE_WRITERS_WITHOUT_BOOKS:
					System.out.format("A number of %d writers without books have been deleted!%n",
							port.deleteWritersWithoutBooks());
					break;
				case Constants.OPTION_GET_WRITERS_BIBLIOGRAPHY:
					System.out.println("Enter number of books total: ");
					int numberOfBooksTotal = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter number of books alone: ");
					int numberOfBooksAlone = Integer.parseInt(bufferedReader.readLine());
					System.out.println("Enter number of books collaboration: ");
					int numberOfBooksCollaboration = Integer.parseInt(bufferedReader.readLine());
					Utilities.displayResults(port.getWritersBibliography(numberOfBooksTotal, numberOfBooksAlone,
							numberOfBooksCollaboration), WriterInformation.class);
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
