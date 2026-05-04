import java.util.List;

public class ResearchPaper {
    private String title;
    private List<Researcher> authors;
    private int citations;
    private int pages;
    private String doi;

    public ResearchPaper() {}

    public ResearchPaper(String title, List<Researcher> authors, int citations, int pages, String doi) {
        this.title = title;
        this.authors = authors;
        this.citations = citations;
        this.pages = pages;
        this.doi = doi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Researcher> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Researcher> authors) {
        this.authors = authors;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
}