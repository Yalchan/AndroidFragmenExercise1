package bg.tu_varna.sit.fragmentproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder>{

        private ArrayList<Contact> ContactList;

    public ContactAdapter(ArrayList<Contact> ContactList) {this.ContactList=ContactList; }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.cardlayout, parent, false);

        return new ContactViewHolder(contactView);
    }


    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

        Contact contact = ContactList.get(position);

        holder.setImageView(contact.getImageUrl());
        holder.setTextViewName(contact.getName());
        holder.setTextViewAddress(contact.getAddress());

    }

    @Override
    public int getItemCount() {
        return ContactList.size();
    }

    public void addContact(Contact contact) {
        ContactList.add(ContactList.size(),contact);
        notifyItemChanged(0);
    }


}
