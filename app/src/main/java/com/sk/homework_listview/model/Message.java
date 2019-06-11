package com.sk.homework_listview.model;

public class Message {
    private String number;
    private String message_content;

    public Message(String number, String message_content) {
        this.number = number;
        this.message_content = message_content;
    }

    public String getNumber() {
        return number;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }
}
