package controller;

import java.util.List;
import model.Contact;
import view.ContactView;

public class ContactController {
    public static boolean addContact(List<Contact> contacts, Contact contact) {
        return contacts.add(contact);
    }

    public static void displayAll(List<Contact> contacts) {
        ContactView.displayContacts(contacts);
    }

    public static boolean deleteContact(List<Contact> contacts, int contactId) {
        Contact contactToDelete = getContactById(contacts, contactId);
        if (contactToDelete != null) {
            return contacts.remove(contactToDelete);
        }
        return false;
    }

    private static Contact getContactById(List<Contact> contacts, int contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId() == contactId) {
                return contact;
            }
        }
        return null;
    }
}
