package bg.tu_varna.sit.fragmentproject;

import java.util.ArrayList;

public class ContactSource {

    ArrayList<Contact> ContactArray;

    public ContactSource() {
        ContactArray = new ArrayList<Contact>() {{
            add(new Contact("https://st2.depositphotos.com/1007566/11569/v/950/depositphotos_115690782-stock-illustration-young-and-elegant-woman-avatar.jpg", "Name1", "Address1"));
            add(new Contact("https://previews.123rf.com/images/metelsky/metelsky1809/metelsky180900233/109815470-man-avatar-profile-male-face-icon-vector-illustration-.jpg", "Name2", "Address2"));
        }};
    }

    public ArrayList<Contact> getContactArray() {
        return ContactArray;
    }
}
