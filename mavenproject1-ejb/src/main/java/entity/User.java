package entity;

import com.sun.javafx.beans.IDProperty;
import users.Countries;

import javax.persistence.*;

/**
 * Created by eproskurin on 01.07.2016.
 */
@Entity(name = "user")
@Table(name= "user")
@NamedQuery(name ="User.getAll", query = "SELECT u FROM user u ")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "firstName")
    private String firstName;

    @Column(name ="lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name= "countries")
    private String countries;

    public User(String login, String password) {
        this.password = password;
        this.login = login;
    }

    public User(String firsName, String lastName,String login, String password, String email, String countries) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
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
}




