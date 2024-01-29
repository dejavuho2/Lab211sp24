import java.util.ArrayList;
import java.util.List;
import model.Contact;
import view.ContactView;
import controller.ContactController;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();

        while (true) {
            int choice = ContactView.showMenu();

            switch (choice) {
                case 1:
                    Contact newContact = ContactView.getContactInput();
                    ContactController.addContact(contacts, newContact);
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    ContactController.displayAll(contacts);
                    break;

                case 3:
                    int contactIdToDelete = ContactView.getContactIdToDelete(contacts);
                    boolean deletionStatus = ContactController.deleteContact(contacts, contactIdToDelete);
                    if (deletionStatus) {
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
            }
        }
    }
}
