package org.zakharov.model;

public class User {

    private String id;
    private String fstName;
    private String lstName;
    private String brthDate;

    public User(){

    }

    public User(String id, String fstName, String lstName, String brthDate) {
        this.id = id;
        this.fstName = fstName;
        this.lstName = lstName;
        this.brthDate = brthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFstName() {
        return fstName;
    }

    public void setFstName(String fstName) {
        this.fstName = fstName;
    }

    public String getLstName() {
        return lstName;
    }

    public void setLstName(String lstName) {
        this.lstName = lstName;
    }

    public String getBrthDate() {
        return brthDate;
    }

    public void setBrthDate(String brthDate) {
        this.brthDate = brthDate;
    }
}
