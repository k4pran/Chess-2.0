package com.neueda13;

/**
 * Holds information about a player in a chess 2.0 game
 */
public class Player {

    private String firstName;
    private String lastName;
    private String nickname;

    public Player(String firstName, String lastName, String nickname){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void playerWelcomeMsg() {
        System.out.println("Welcome to Chess 2.0 " + this.nickname);
    }
}
