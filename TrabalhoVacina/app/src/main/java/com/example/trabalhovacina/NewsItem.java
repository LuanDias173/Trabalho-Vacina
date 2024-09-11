package com.example.trabalhovacina;

public class NewsItem {

    private String title;
    private String subtitle;
    private String description;

    public NewsItem(String title, String subtitle, String description) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }
}
