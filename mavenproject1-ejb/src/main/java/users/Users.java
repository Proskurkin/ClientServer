package users;

/**
 * Created by eproskurin on 27.06.2016.
 */
public class Users  {
    private String firsName;
    private String secondName;
    private String Login;
    private String password;
    private String email;
    private Countries countries;

    public Users(String password, String login) {
        this.password = password;
        Login = login;
    }

    public Users(String firsName, String secondName, String login, String password, String email, Countries countries) {

        this.firsName = firsName;
        this.secondName = secondName;
        Login = login;
        this.password = password;
        this.email = email;
        this.countries = countries;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLogin(String login) {
        Login = login;
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

        return firsName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLogin() {
        return Login;
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
