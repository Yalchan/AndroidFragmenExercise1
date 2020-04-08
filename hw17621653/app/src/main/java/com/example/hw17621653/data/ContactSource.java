package com.example.hw17621653.data;

import com.example.hw17621653.model.Contact;

import java.util.LinkedList;
import java.util.List;

public class ContactSource {
    List<Contact> contacs;

    public ContactSource() {
        this.contacs=new LinkedList<>();
    }

    public List<Contact> getContacs() {
        return contacs;
    }

    public void setContacs(List<Contact> contacs) {
        this.contacs = contacs;
    }
}
