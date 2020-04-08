package com.example.hw17621653;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.hw17621653.adapter.ContactAdapter;
import com.example.hw17621653.data.ContactSource;
import com.example.hw17621653.fragment.ContactFragment;
import com.example.hw17621653.listener.AddContactDialogListener;
import com.example.hw17621653.model.Contact;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements AddContactDialogListener {
    private RecyclerView recyclerView;
    private ContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.recyclerView = findViewById(R.id.recycler_view);

        ContactSource contacts = new ContactSource();
        this.adapter = new ContactAdapter(contacts.getContacs());
        recyclerView.setAdapter(this.adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FloatingActionButton fab=findViewById(R.id.floating_action_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                ContactFragment contactFragment = ContactFragment.newInstance();
                contactFragment.show(fm, "fragment_contact");
            }
        });

    }
    @Override
    public void onFinishAddDialog(Contact contact) {
        adapter.addContact(contact);
    }
}
