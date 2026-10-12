package net.engineeringdigest.journalApp.services;

import jdk.javadoc.doclet.Reporter;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;

public class JournalEntryServices {
    @Autowired
    private JournalEntryServices journalEntryServices;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryServices.saveEntry(journalEntry);
    }
}


//controler--> service-->Reporter