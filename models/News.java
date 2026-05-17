package models;

import java.util.ArrayList;
import java.util.List;

public class News {

    private String title;
    private String content;

    private List<String> comments =
            new ArrayList<>();

    private boolean priority;

    public News(String title,
                String content,
                boolean priority) {

        this.title = title;
        this.content = content;
        this.priority = priority;
    }

    public void addComment(String comment) {

        comments.add(comment);
    }

    public List<String> getComments() {

        return comments;
    }
}