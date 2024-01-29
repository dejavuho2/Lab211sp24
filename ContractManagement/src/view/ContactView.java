package view;

import java.util.List;
import model.Contact;

public class ContactView {
    public static int showMenu() {
        System.out.println("1. Add a contact");
        System.out.println("2. Display all contacts");
        System.out.println("3. Delete a contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return Common.Validation.checkInputIntLimit(1, 4);
    }

    public static Contact getContactInput() {
        System.out.print("Enter full name: ");
        String fullName = Common.Validation.checkInputString();
        System.out.print("Enter group: ");
        String group = Common.Validation.checkInputString();
        System.out.print("Enter address: ");
        String address = Common.Validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = Common.Validation.checkInputPhone();

        return new Contact(fullName, group, address, phone);
    }

    public static int getContactIdToDelete(List<Contact> contacts) {
        System.out.print("Enter the contact ID to delete: ");
        return Common.Validation.checkInputInt();
    }

    public static void displayContacts(List<Contact> contacts) {
        System.out.println("Display all Contact ----------------------------");
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (Contact contact : contacts) {
            System.out.printf("%-5d%-15s%-15s%-15s%-15s%-15s%-15s\n", contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(), contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }
}
