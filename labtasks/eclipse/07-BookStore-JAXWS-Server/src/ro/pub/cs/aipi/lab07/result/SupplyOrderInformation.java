package ro.pub.cs.aipi.lab07.result;

import ro.pub.cs.aipi.lab07.entities.PersistentEntity;

// TODO: exercise 5b1
public class SupplyOrderInformation extends PersistentEntity {

	protected Long publishingHouseId;
	protected Long bookPresentationId;
	protected Long quantity;

	public SupplyOrderInformation() {
	}

	public SupplyOrderInformation(Long publishingHouseId, Long bookPresentationId, Long quantity) {
		this.publishingHouseId = publishingHouseId;
		this.bookPresentationId = bookPresentationId;
		this.quantity = quantity;
	}

	// TODO: exercise 5b2
	public Long getPublishingHouseId() {
		return publishingHouseId;
	}

	public void setPublishingHouseId(Long publishingHouseId) {
		this.publishingHouseId = publishingHouseId;
	}

	// TODO: exercise 5b2
	public Long getBookPresentationId() {
		return bookPresentationId;
	}

	public void setBookPresentationId(Long bookPresentationId) {
		this.bookPresentationId = bookPresentationId;
	}

	// TODO: exercise 5b2
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
