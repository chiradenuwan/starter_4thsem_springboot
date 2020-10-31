package lk.ijse.ws.day4.mywork.starter.data;

import java.util.Date;

public class Message {
    private String sender;
    private String message;
    private Date sendTime;

    public Message() {
    }

    public Message(String sender, String message, Date sendTime) {
        this.sender = sender;
        this.message = message;
        this.sendTime = sendTime;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
