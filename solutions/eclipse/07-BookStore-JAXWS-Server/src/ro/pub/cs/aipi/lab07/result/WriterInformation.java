package ro.pub.cs.aipi.lab07.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ro.pub.cs.aipi.lab07.entities.PersistentEntity;

@XmlRootElement
@XmlType(name="WriterInformation")
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

	@XmlElement
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@XmlElement
	public String getBooks() {
		return books;
	}

	public void setBooks(String books) {
		this.books = books;
	}

	@XmlElement
	public Long getNumberOfBooksTotal() {
		return numberOfBooksTotal;
	}

	public void setNumberOfBooksTotal(Long numberOfBooksTotal) {
		this.numberOfBooksTotal = numberOfBooksTotal;
	}
	
	@XmlElement
	public Long getNumberOfBooksAlone() {
		return numberOfBooksAlone;
	}

	public void setNumberOfBooksAlone(Long numberOfBooksAlone) {
		this.numberOfBooksAlone = numberOfBooksAlone;
	}

	@XmlElement
	public Long getNumberOfBooksCollaboration() {
		return numberOfBooksCollaboration;
	}

	public void setNumberOfBooksCollaboration(Long numberOfBooksCollaboration) {
		this.numberOfBooksCollaboration = numberOfBooksCollaboration;
	}

}
