package ro.pub.cs.aipi.lab07.businesslogic;

import java.util.List;

import ro.pub.cs.aipi.lab07.result.BookInformation;
import ro.pub.cs.aipi.lab07.result.BookInformationDetailed;

public interface BookManagerInterface {

    public List<BookInformation> getBooksList();

    public List<BookInformationDetailed> getBooksListWithStockpile(int stockpile);

}
