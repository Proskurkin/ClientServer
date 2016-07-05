package entity;

import com.sun.javafx.beans.IDProperty;
import users.Countries;

import javax.persistence.*;

/**
 * Created by eproskurin on 01.07.2016.
 */
@Entity(name = "user")
@NamedQuery(name ="User.getAll", query = "SELECT u FROM User u ")

public class User {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "firsName")
    private String firstName;

    @Column(name ="lastname")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name= "countries")
    private Countries countries;

    public User(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public User( String login, String password,String firsName, String secondName, String email, Countries countries) {
        this.firstName = firsName;
        this.lastName = secondName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.countries = countries;
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

    public void setCountries(Countries countries) {
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

    public Countries getCountries() {
        return countries;
    }
}



