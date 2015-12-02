package ro.pub.cs.aipi.lab07.businesslogic;

import java.util.List;

import ro.pub.cs.aipi.lab07.result.BookPresentationInformation;
import ro.pub.cs.aipi.lab07.result.SupplyOrderInformation;

public interface BookPresentationManagerInterface {

    public List<BookPresentationInformation> updateBookPresentationPriceForBooksWithMultipleFormats(int numberOfFormats,
            double amount);

    public List<SupplyOrderInformation> makeSupplyOrderBasedOnStockpile(int stockpile);

}
