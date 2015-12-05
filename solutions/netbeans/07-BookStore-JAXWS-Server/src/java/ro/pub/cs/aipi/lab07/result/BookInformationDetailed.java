package ro.pub.cs.aipi.lab07.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ro.pub.cs.aipi.lab07.entities.PersistentEntity;

@XmlRootElement
@XmlType(name = "BookInformationDetailed")
public class BookInformationDetailed extends PersistentEntity {

    protected Long id;
    protected String title;
    protected String subtitle;
    protected String writers;
    protected String categories;
    protected String formats;
    protected String languages;

    public BookInformationDetailed() {
    }

    public BookInformationDetailed(Long id, String title, String subtitle, String writers, String categories,
            String formats, String languages) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.writers = writers;
        this.categories = categories;
        this.formats = formats;
        this.languages = languages;
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
    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @XmlElement
    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    @XmlElement
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @XmlElement
    public String getFormats() {
        return formats;
    }

    public void setFormats(String formats) {
        this.formats = formats;
    }

    @XmlElement
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

}
