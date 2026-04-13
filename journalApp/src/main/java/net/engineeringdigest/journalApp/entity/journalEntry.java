package net.engineeringdigest.journalApp.entity;

public class journalEntry {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return title;
    }

    public void setText(String text) {
        this.title = title;
    }

    public String getCobtent() {
        return cobtent;
    }

    public void setCobtent(String cobtent) {
        this.cobtent = cobtent;
    }

    private long id;
    private String title;
    private String cobtent;
}
