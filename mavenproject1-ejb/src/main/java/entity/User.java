package entity;



import javax.persistence.*;
import java.util.UUID;

/**
 * Created by eproskurin on 01.07.2016.
 */
@Entity(name = "users")
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @org.hibernate.annotations.Type(type="org.hibernate.type.PostgresUUIDType")
    private UUID id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "countries")
    private String countries;

    public User(String login, String password) {
        this.password = password;
        this.login = login;
    }

    public User(UUID id, String login, String password, String firstName, String lastName, String email, String countries) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.countries = countries;
    }


    public User() {

    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public void setSecondName(String secondName) {
        this.lastName = secondName;
    }

    public void setLogin(String login) {
        login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getFirsName() {
        return firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCountries() {
        return countries;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(UUID id) {  this.id = id;}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}




