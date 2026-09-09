package net.engineeringdigest.journalApp.controler;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.*;
@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map< Long , JournalEntry> journalEntries =new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createJournalEntry(@RequestBody JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }
        @GetMapping("id/{myId}")
                public JournalEntry getjournalEntryById(@PathVariable long myId){
            return journalEntries.get(myId);
        }
    @GetMapping("id/{myId}")
    public JournalEntry deletejournalEntryById(@PathVariable long myId){
        return journalEntries.remove(myId);
    }
    }

