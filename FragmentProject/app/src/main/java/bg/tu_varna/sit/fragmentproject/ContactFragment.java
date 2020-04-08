package bg.tu_varna.sit.fragmentproject;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends DialogFragment implements View.OnClickListener {

    private EditText Name;
    private EditText Address;
    private EditText ImageUrl;
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

        ImageUrl = view.findViewById(R.id.EditText1);
        Name = view.findViewById(R.id.EditText2);
        Address = view.findViewById(R.id.EditText3);
        add = view.findViewById(R.id.button);
        add.setOnClickListener(this);

        Name.requestFocus();
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (AddContactDialogListener) context;
    }

    @Override
    public void onClick(View view) {
        Contact contact = new Contact(ImageUrl.getText().toString(), Name.getText().toString(), Address.getText().toString());
        listener.onFinishAddDialog(contact);
        dismiss();
    }
}
