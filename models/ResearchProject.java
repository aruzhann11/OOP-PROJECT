package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.Researcher;

public class ResearchProject {

    private String topic;

    private List<Researcher> participants =
            new ArrayList<>();

    private List<ResearchPaper> papers =
            new ArrayList<>();

    public ResearchProject(String topic) {

        this.topic = topic;
    }

    public void joinProject(
            Researcher researcher
    ) {

        participants.add(researcher);
    }

    public void addPaper(
            ResearchPaper paper
    ) {

        papers.add(paper);
    }
}