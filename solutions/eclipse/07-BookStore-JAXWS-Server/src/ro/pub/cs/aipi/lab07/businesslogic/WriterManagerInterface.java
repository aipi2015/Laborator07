package ro.pub.cs.aipi.lab07.businesslogic;

import java.util.List;

import ro.pub.cs.aipi.lab07.result.WriterInformation;

public interface WriterManagerInterface {

	public int deleteWritersWithoutBooks();

	public List<WriterInformation> getWritersBibliography(int numberOfBooksTotal, int numberOfBooksAlone,
			int numberOfBooksCollaboration);

}
