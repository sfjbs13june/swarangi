package com.swarangi.app.model;

public class Data {
    String id;
    String message;
    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Data() {
    }

    public Data(String id, String message) {
        this.id = id;
        this.message = message;
    }
    @Override
    public String toString() {
        return "Data [id=" + id + ", message=" + message + "]";
    }


}
