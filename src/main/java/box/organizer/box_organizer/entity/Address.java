package box.organizer.box_organizer.entity;

import jakarta.persistence.*;

import java.util.UUID;
import java.lang.String;
import java.lang.Long;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(length = 255, nullable = true)
    private String street;

    @Column(length = 100, nullable = true)
    private String city;

    @Column(length = 100, nullable = true)
    private String state;

    @Column(length = 20, nullable = true)
    private String cep;

    @Column(columnDefinition = "TEXT")
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", cep='" + cep + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
