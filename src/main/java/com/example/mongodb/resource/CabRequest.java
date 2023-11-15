package com.example.mongodb.resource;

public class CabRequest {


    private String cabname;
    private String cabtime;

    public CabRequest() {
    }

    public CabRequest(String cabname, String cabtime) {
        this.cabname = cabname;
        this.cabtime = cabtime;
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