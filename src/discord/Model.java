package discord;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Model implements Serializable {

    // Fields:
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private Status status;
    private final LinkedList<String> friendRequests;
    private final LinkedList<String> friends;
    private final HashMap<String, Boolean> isInChat;
    private final HashMap<String, ArrayList<String>> privateChats;
    private final ArrayList<Integer> servers;

    // Constructors:
    public Model(String username, String password, String email, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        status = Status.Offline;
        friendRequests = new LinkedList<>();
        friends = new LinkedList<>();
        isInChat = new HashMap<>();
        privateChats = new HashMap<>();
        servers = new ArrayList<>();
    }

    // Getters:
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Status getStatus() {
        return status;
    }

    public LinkedList<String> getFriendRequests() {
        return friendRequests;
    }

    public LinkedList<String> getFriends() {
        return friends;
    }

    public HashMap<String, Boolean> getIsInChat() {
        return isInChat;
    }

    public HashMap<String, ArrayList<String>> getPrivateChats() {
        return privateChats;
    }

    public ArrayList<Integer> getServers() {
        return servers;
    }

    // Setters:
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Other Methods:
    public String toString() {
        return username + " " + password + " " + email + " " + phoneNumber;
    }
}
