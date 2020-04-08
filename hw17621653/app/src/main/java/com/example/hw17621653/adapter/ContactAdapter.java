package com.example.hw17621653.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.example.hw17621653.R;
import com.example.hw17621653.holder.ContactViewHolder;
import com.example.hw17621653.model.Contact;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    private List<Contact> contactList;

    public ContactAdapter(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.contact_item, parent, false);

        return new ContactViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
    Contact contact = this.contactList.get(position);
    holder.setImageView(contact.getImageUrl());
    holder.setName(contact.getName());
    holder.setAddress(contact.getAddress());
    }

    @Override
    public int getItemCount() {
        return this.contactList.size();
    }
    public void addContact(Contact contact) {
        contactList.add(contactList.size(),contact);
        notifyItemChanged(0);
    }
}

