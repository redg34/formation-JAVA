package fr.aelion.models;

/**
 * @name Student
 * @version 1.0.0
 */
public class Student {
    public String lasName;
    public String firstName;
    private String email;
    private String userName;
    private String password;
    private Boolean  isLoggedIn = false;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //construtor

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Student(String lasName, String firstName, String email) {
        this.lasName = lasName;
        this.firstName = firstName;
        this.email = email;

    }
    public Boolean login(String userName, String password){
        if (userName.equals(this.userName) && password.equals(this.password)){
            this.isLoggedIn = true;
            return true;
        }
        return false;
    }
    public void logout() {
        this.isLoggedIn = false;
    }
    public Boolean IsLoggedIn(){
        return  this.isLoggedIn;
    }
}


