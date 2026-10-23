package net.engineeringdigest.journalApp.controler;

import net.engineeringdigest.journalApp.Repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.services.JournalEntryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryServices journalEntryServices;
    @GetMapping
    public List<JournalEntry> getAll(){
    return null;
    }

    @PostMapping
    public boolean createJournalEntry(@RequestBody JournalEntry myEntry) {
        return true;
    }
        @GetMapping("id/{myId}")
                public JournalEntry getjournalEntryById(@PathVariable long myId){
                    return null;

        }
    @GetMapping("id/{myId}")
    public JournalEntry deletejournalEntryById(@PathVariable long myId){
        return null;

    }
    }

