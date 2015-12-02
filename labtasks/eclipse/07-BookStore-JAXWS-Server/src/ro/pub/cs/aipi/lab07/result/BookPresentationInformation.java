package ro.pub.cs.aipi.lab07.result;

import ro.pub.cs.aipi.lab07.entities.PersistentEntity;

// TODO: exercise 5b1
public class BookPresentationInformation extends PersistentEntity {

	protected Long id;
	protected Long bookId;
	protected Long formatId;
	protected Double price;

	public BookPresentationInformation() {
	}

	public BookPresentationInformation(Long id, Long bookId, Long formatId, Double price) {
		this.id = id;
		this.bookId = bookId;
		this.formatId = formatId;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// TODO: exercise 5b2
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	// TODO: exercise 5b2
	public Long getFormatId() {
		return formatId;
	}

	public void setFormatId(Long formatId) {
		this.formatId = formatId;
	}

	// TODO: exercise 5b3
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
