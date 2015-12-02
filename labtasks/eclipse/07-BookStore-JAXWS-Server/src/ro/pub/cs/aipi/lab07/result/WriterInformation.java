package ro.pub.cs.aipi.lab07.result;

import ro.pub.cs.aipi.lab07.entities.PersistentEntity;

// TODO: exercise 7b1
public class WriterInformation extends PersistentEntity {

	protected String writer;
	protected String books;
	protected Long numberOfBooksTotal;
	protected Long numberOfBooksAlone;
	protected Long numberOfBooksCollaboration;

	public WriterInformation() {
	}

	public WriterInformation(String writer, String books, Long numberOfBooksTotal, Long numberOfBooksAlone,
			Long numberOfBooksCollaboration) {
		this.writer = writer;
		this.books = books;
		this.numberOfBooksTotal = numberOfBooksTotal;
		this.numberOfBooksAlone = numberOfBooksAlone;
		this.numberOfBooksCollaboration = numberOfBooksCollaboration;
	}

	// TODO: exercise 7b2
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	// TODO: exercise 7b2
	public String getBooks() {
		return books;
	}

	public void setBooks(String books) {
		this.books = books;
	}

	// TODO: exercise 7b2
	public Long getNumberOfBooksTotal() {
		return numberOfBooksTotal;
	}

	public void setNumberOfBooksTotal(Long numberOfBooksTotal) {
		this.numberOfBooksTotal = numberOfBooksTotal;
	}
	
	// TODO: exercise 7b2
	public Long getNumberOfBooksAlone() {
		return numberOfBooksAlone;
	}

	public void setNumberOfBooksAlone(Long numberOfBooksAlone) {
		this.numberOfBooksAlone = numberOfBooksAlone;
	}

	// TODO: exercise 7b2
	public Long getNumberOfBooksCollaboration() {
		return numberOfBooksCollaboration;
	}

	public void setNumberOfBooksCollaboration(Long numberOfBooksCollaboration) {
		this.numberOfBooksCollaboration = numberOfBooksCollaboration;
	}

}
