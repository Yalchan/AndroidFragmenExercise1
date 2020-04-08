package bg.tu_varna.sit.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements AddContactDialogListener{

    RecyclerView RecyclerView;
    ContactAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView = findViewById(R.id.RecyclerView);

        ContactSource contacts = new ContactSource();

        Adapter = new ContactAdapter(contacts.getContactArray());

        RecyclerView.setAdapter(Adapter);

        RecyclerView.setLayoutManager(new LinearLayoutManager(this));


        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                ContactFragment contactFragment = ContactFragment.newInstance();
                contactFragment.show(fm, "fragment_contact");
            }
        });
    }

    @Override
    public void onFinishAddDialog(Contact contact) {
        Adapter.addContact(contact);
    }
}
