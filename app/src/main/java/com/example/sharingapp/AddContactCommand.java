package com.example.sharingapp;

import android.content.Context;

public class AddContactCommand extends Command{

    private Contact contact;
    private ContactList contact_list;
    private Context context;
    public AddContactCommand(ContactList contact_list, Contact contact, Context context) {
        this.contact_list = contact_list;
        this.contact = contact;
        this.context = context;
    }
    @Override
    public void execute() {
        this.contact_list.addContact(contact);
        // saveContacts return bool now ( to be aligned with saveItems method)
        setIsExecuted(this.contact_list.saveContacts(this.context));
    }
}
