package ovh.witucki.signmeup.domain.Arena.dto;

public class ArenaDto {
    private Long id;
    private String name;
    private String city;
    private String street;
    private String additionalInfo;
    private String picture;

    public ArenaDto(Long id, String name, String city, String street, String additionalInfo, String picture) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.additionalInfo = additionalInfo;
        this.picture = picture;
    }

    public ArenaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
