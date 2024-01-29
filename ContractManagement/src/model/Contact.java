package model;

public class Contact {
    private static int lastContactId = 0;

    private int contactId;
    private String fullName;
    private String group;
    private String address;
    private String phone;
    private String firstName;
    private String lastName;

    // Constructors, getters, and setters...

    public Contact(String fullName, String group, String address, String phone) {
        this.contactId = ++lastContactId;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;

        // Extract first name and last name from the full name
        String[] names = fullName.split(" ", 2);
        if (names.length > 1) {
            this.firstName = names[0];
            this.lastName = names[1];
        } else {
            this.firstName = fullName;
            this.lastName = "";
        }
    }

    // Getters and setters...

    public static int getLastContactId() {
        return lastContactId;
    }

    public static void setLastContactId(int lastContactId) {
        Contact.lastContactId = lastContactId;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
