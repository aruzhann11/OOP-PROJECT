import java.util.List;

public interface Researcher {
    void addPaper(ResearchPaper paper);
    List<ResearchPaper> getPapers();
    void printPapers();
}