package com.example.hw17621653.model;

public class Contact {
    private String imageUrl;
    private String name;
    private String address;

    public Contact(String imageUrl, String name, String address) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
