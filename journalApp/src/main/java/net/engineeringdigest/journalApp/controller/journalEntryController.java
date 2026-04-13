package net.engineeringdigest.journalApp.controller;
import net.engineeringdigest.journalApp.entity.journalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/journal")

public class journalEntryController {
    private Map<Long, journalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<journalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());

    }
    @PostMapping
    public boolean createEntry(@RequestBody journalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }
    @GetMapping("id/{myId}")
    public journalEntry getJournalEntryById(@PathVariable long myId){
       return  journalEntries.get(myId);
    }
    @DeleteMapping("id/{myId}")
        public journalEntry deleteJournalEntryById(@PathVariable long myId){
        return journalEntries.remove(myId);

    }
    @PutMapping("id/{myId}")
    public journalEntry UpdateJournalEntryById(@PathVariable long myId,@RequestBody journalEntry myEntry){
        return journalEntries.put(myId,myEntry);
    }
}
