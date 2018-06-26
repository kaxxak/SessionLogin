package am.aro.model;

import java.time.LocalDate;

public class User {
    private String name;
    private String password;
    private LocalDate birthDaye;


    public User(String name, String password, LocalDate birthDaye) {
        this.name = name;
        this.password = password;
        this.birthDaye = birthDaye;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDaye() {
        return birthDaye;
    }

    public void setBirthDaye(LocalDate birthDaye) {
        this.birthDaye = birthDaye;
    }
}
