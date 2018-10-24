package lk.ijse.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: sadeesha
 * Date: 2018-10-24
 * Time: 7:46 PM
 */
@Entity
public class User {

    @Id
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
