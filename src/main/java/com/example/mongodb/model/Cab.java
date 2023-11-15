package com.example.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
public class Cab {
    @Id
    private String id;
    private String cabname;
    private String cabtime;

    public Cab(String cabname, String cabtime) {
        this.cabname = cabname;
        this.cabtime = cabtime;
    }

    public Cab() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCabname() {
        return cabname;
    }

    public void setCabname(String cabname) {
        this.cabname = cabname;
    }

    public String getCabtime() {
        return cabtime;
    }

    public void setCabtime(String cabtime) {
        this.cabtime = cabtime;
    }
}