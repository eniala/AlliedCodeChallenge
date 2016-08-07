package com.allied.chat.web;
import java.io.Serializable;
import java.util.Date;
 
/**
 * Represents message
 * @author aaarocreo
 */
public class Message implements Serializable {
    private Date dateSent;
    private String user;
    private String message;
 
    public Date getDateSent() {
        return dateSent;
    }
 
    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    public String getUser() {
        return user;
    }
 
    public void setUser(String user) {
        this.user = user;
    }
}