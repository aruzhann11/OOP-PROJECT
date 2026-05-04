import java.util.List;

public class ResearchProject {
    private String topic;
    private List<Researcher> participants;
    private List<ResearchPaper> papers;

    public ResearchProject() {}

    public ResearchProject(String topic, List<Researcher> participants, List<ResearchPaper> papers) {
        this.topic = topic;
        this.participants = participants;
        this.papers = papers;
    }

    public void addParticipant(Researcher researcher) {
    }

    public void addPaper(ResearchPaper paper) {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<Researcher> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Researcher> participants) {
        this.participants = participants;
    }

    public List<ResearchPaper> getPapers() {
        return papers;
    }

    public void setPapers(List<ResearchPaper> papers) {
        this.papers = papers;
    }
}