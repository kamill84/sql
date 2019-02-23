package domain;

import java.util.PriorityQueue;

public class User {

    // wszystkie kolumny z bazy jako skladowe

    private int id;
    private String firstNami;
    private String lastNami;
    private String email;

    public int getId() {
        return id;
    }

    public String getFirstNami() {
        return firstNami;
    }

    public String getLastNami() {
        return lastNami;
    }

    public String getEmail() {
        return email;
    }

    public User(String firstNami, String lastNami, String email) {
        this.firstNami = firstNami;
        this.lastNami = lastNami;
        this.email = email;
    }

    public User(int id, String firstNami, String lastNami, String email) {
        this.id = id;
        this.firstNami = firstNami;
        this.lastNami = lastNami;
        this.email = email;
    }
}
