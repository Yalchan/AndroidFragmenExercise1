package com.example.hw17621653.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import android.view.WindowManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.hw17621653.R;
import com.example.hw17621653.listener.AddContactDialogListener;
import com.example.hw17621653.model.Contact;


public class ContactFragment extends DialogFragment implements View.OnClickListener{
    private EditText name;
    private EditText address;
    private EditText imageUrl;
    private Button add;
    private AddContactDialogListener listener;

    public ContactFragment() {

    }

    public static ContactFragment newInstance() {
        return new ContactFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_contact, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.imageUrl = view.findViewById(R.id.image_url);
        this.name = view.findViewById(R.id.name);
        this.address = view.findViewById(R.id.address);
        this.add = view.findViewById(R.id.button);
        this.add.setOnClickListener(this);

        name.requestFocus();
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (AddContactDialogListener) context;
    }

    @Override
    public void onClick(View view) {
        Contact contact = new Contact(imageUrl.getText().toString(), name.getText().toString(), address.getText().toString());
        listener.onFinishAddDialog(contact);
        dismiss();
    }
}
