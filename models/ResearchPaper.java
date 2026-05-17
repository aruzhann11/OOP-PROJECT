package models;

import java.time.LocalDate;

public class ResearchPaper {

    private String title;
    private int citations;
    private String journal;
    private int pages;

    private LocalDate publishDate;

    public ResearchPaper(String title,
                         int citations,
                         String journal,
                         int pages,
                         LocalDate publishDate) {

        this.title = title;
        this.citations = citations;
        this.journal = journal;
        this.pages = pages;
        this.publishDate = publishDate;
    }

    public int getCitations() {
        return citations;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {

        return title
                + " citations="
                + citations;
    }
}