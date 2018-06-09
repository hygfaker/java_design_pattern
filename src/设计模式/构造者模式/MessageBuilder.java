package 设计模式.构造者模式;

/**
 * Created by yans67 on 2018/6/9.
 */
public class MessageBuilder {
    private String toUser;
    private String msgType;
    private String content;
    private String mediaId;
    private String thumbMediaId;
    private String title;
    private String description;

    public MessageBuilder toUser(String toUser){
        this.toUser = toUser;
        return this;
    }
    public MessageBuilder msgType(String msgType){
        this.msgType = msgType;
        return this;
    }
    public MessageBuilder content(String content){
        this.content = content;
        return this;
    }
    public MessageBuilder mediaId(String mediaId){
        this.mediaId = mediaId;
        return this;
    }
    public MessageBuilder thumbMediaId(String thumbMediaId){
        this.thumbMediaId = thumbMediaId;
        return this;
    }

    public MessageBuilder title(String title){
        this.title = title;
        return this;
    }
    public MessageBuilder description(String description){
        this.description = description;
        return this;
    }

    public Message build(){
        Message message = new Message();
        message.setToUser(this.toUser);
        message.setMsgType(this.msgType);
        message.setContent(this.content);
        message.setMediaId(this.mediaId);
        message.setMediaId(this.thumbMediaId);
        message.setTitle(this.title);
        message.setDescription(this.description);
        return message;

    }

}
