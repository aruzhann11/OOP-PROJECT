package models;

import enums.MessageStatus;
import enums.UrgencyLevel;

import java.time.LocalDateTime;

public class Message {

    private Employee sender;
    private User recipient;
    private String content;

    private LocalDateTime timestamp;

    private UrgencyLevel urgencyLevel;
    private MessageStatus status;

    public Message(Employee sender,
                   User recipient,
                   String content,
                   UrgencyLevel urgencyLevel) {

        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.urgencyLevel = urgencyLevel;

        this.status = MessageStatus.SENT;
        this.timestamp = LocalDateTime.now();
    }

    public Employee getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }
}