package com.example.hw17621653.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw17621653.R;
import com.squareup.picasso.Picasso;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView name;
    private TextView address;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView=itemView.findViewById(R.id.contact_image);
        this.name=itemView.findViewById(R.id.contact_name);
        this.address=itemView.findViewById(R.id.contact_address);
    }

    public void setImageView(String imageView) {
        Picasso.
                get()
                .load(imageView).placeholder(R.drawable.imageholder)
                .error(R.drawable.imageholder)
                .resize(110, 110).centerCrop()
                .into(this.imageView);
    }

    public void setName(String name) {
        this.name.setText(name);
    }

    public void setAddress(String address) {
        this.address.setText(address);
    }
}
