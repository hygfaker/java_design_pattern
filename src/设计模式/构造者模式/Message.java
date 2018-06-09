package 设计模式.构造者模式;

import java.io.Serializable;

/**
 * Created by yans67 on 2018/6/9.
 */

public class Message implements Serializable{
    private static final long serialVersionUID = -9196732086954365246L;
    private String toUser;
    private String msgType;
    private String content;
    private String mediaId;
    private String thumbMediaId;
    private String title;
    private String description;


    public static MessageBuilder ALL(){
        return new MessageBuilder();
    }
    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Message{" +
                "toUser='" + toUser + '\'' +
                ", msgType='" + msgType + '\'' +
                ", content='" + content + '\'' +
                ", mediaId='" + mediaId + '\'' +
                ", thumbMediaId='" + thumbMediaId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
