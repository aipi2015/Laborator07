package ro.pub.cs.aipi.lab07.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ro.pub.cs.aipi.lab07.entities.PersistentEntity;

@XmlRootElement
@XmlType(name = "BookInformation")
public class BookInformation extends PersistentEntity {

    protected Long id;
    protected String title;
    protected String writers;
    protected String collection;
    protected String publishingHouse;
    protected Long edition;
    protected Long printingYear;
    protected String country;

    public BookInformation() {
    }

    public BookInformation(Long id, String title, String writers, String collection, String publishingHouse,
            Long edition, Long printingYear, String country) {
        this.id = id;
        this.title = title;
        this.writers = writers;
        this.collection = collection;
        this.publishingHouse = publishingHouse;
        this.edition = edition;
        this.printingYear = printingYear;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    @XmlElement
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    @XmlElement
    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @XmlElement
    public Long getEdition() {
        return edition;
    }

    public void setEdition(Long edition) {
        this.edition = edition;
    }

    @XmlElement
    public Long getPrintingYear() {
        return printingYear;
    }

    public void setPrintingYear(Long printingYear) {
        this.printingYear = printingYear;
    }

    @XmlElement
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
