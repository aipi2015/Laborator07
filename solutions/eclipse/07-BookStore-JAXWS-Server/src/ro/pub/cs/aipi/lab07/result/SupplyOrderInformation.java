package ro.pub.cs.aipi.lab07.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ro.pub.cs.aipi.lab07.entities.PersistentEntity;

@XmlRootElement
@XmlType(name="SupplyOrderInformation")
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

	@XmlElement
	public Long getPublishingHouseId() {
		return publishingHouseId;
	}

	public void setPublishingHouseId(Long publishingHouseId) {
		this.publishingHouseId = publishingHouseId;
	}

	@XmlElement
	public Long getBookPresentationId() {
		return bookPresentationId;
	}

	public void setBookPresentationId(Long bookPresentationId) {
		this.bookPresentationId = bookPresentationId;
	}

	@XmlElement
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
