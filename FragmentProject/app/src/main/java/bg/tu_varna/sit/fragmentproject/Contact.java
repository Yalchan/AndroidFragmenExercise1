package bg.tu_varna.sit.fragmentproject;

public class Contact {

    public String ImageUrl;
    public String Name;
    public String Address;

    public Contact(String image, String name, String address) {
        ImageUrl = image;
        Name = name;
        Address = address;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }
}
