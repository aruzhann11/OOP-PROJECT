package services;

import interfaces.Researcher;
import models.ResearchPaper;

public class ResearchService {

    public void addResearchPaper(
            ResearchPaper paper,
            Researcher researcher
    ) {

        researcher
                .getPapers()
                .add(paper);
    }

    public void printResearchPapers(
            Researcher researcher
    ) {

        for(ResearchPaper paper :
                researcher.getPapers()) {

            System.out.println(paper);
        }
    }
}