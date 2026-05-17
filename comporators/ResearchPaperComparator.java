package comporators;

import java.util.Comparator;
import models.ResearchPaper;

public class ResearchPaperComparator
        implements Comparator<ResearchPaper> {

    @Override
    public int compare(ResearchPaper p1,
                       ResearchPaper p2) {

        return Integer.compare(
                p2.getCitations(),
                p1.getCitations()
        );
    }
}