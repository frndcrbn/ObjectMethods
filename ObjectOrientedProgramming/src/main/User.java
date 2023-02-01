package main;

public class User {

    private int userId;
    private String userName;
    private String firstName, lastName;

    User(int userId, String userName, String firstName, String lastName){
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    int getUserId(){
        return userId;
    }

    String getUserName(){
        return userName;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }
}
