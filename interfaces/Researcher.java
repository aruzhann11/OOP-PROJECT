package interfaces;

import java.util.Comparator;
import java.util.List;
import models.ResearchPaper;

public interface Researcher {

    int getHIndex();

    List<ResearchPaper> getPapers();

    void printPapers(
            Comparator<ResearchPaper> comparator
    );
}