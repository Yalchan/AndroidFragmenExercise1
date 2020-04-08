package bg.tu_varna.sit.fragmentproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ContactViewHolder extends RecyclerView.ViewHolder{

    private ImageView Image;
    private TextView Name;
    private TextView Address;

    public ContactViewHolder(@NonNull View itemView){
        super(itemView);
        Image = itemView.findViewById(R.id.ImageView);
        Name = itemView.findViewById(R.id.TextView1);
        Address = itemView.findViewById(R.id.TextView2);
    }

    public void setImageView(String image) {
        Picasso.
                get()
                .load(image).placeholder(R.drawable.imageholder)
                .error(R.drawable.imageholder)
                .resize(110, 110).centerCrop()
                .into(Image);
    }

    public void setTextViewName(String name) {
        this.Name.setText(name);
    }

    public void setTextViewAddress(String address) {
        this.Address.setText(address);
    }
}
