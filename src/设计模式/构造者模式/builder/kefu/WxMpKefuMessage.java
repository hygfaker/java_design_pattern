package 设计模式.构造者模式.builder.kefu;

import java.io.Serializable;

/**
 * 客服消息
 *
 * @author chanjarster
 */

public class WxMpKefuMessage implements Serializable {
  private static final long serialVersionUID = -9196732086954365246L;

  private String toUser;
  private String msgType;
  private String content;
  private String mediaId;
  private String thumbMediaId;
  private String title;
  private String description;
  private String musicUrl;
  private String hqMusicUrl;
  private String kfAccount;
  private String cardId;
  private String mpNewsMediaId;

  /**
   * 获得文本消息builder
   */
  public static TextBuilder TEXT() {
    return new TextBuilder();
  }

  /**
   * 获得图片消息builder
   */
  public static ImageBuilder IMAGE() {
    return new ImageBuilder();
  }

  /**
   * 获得语音消息builder
   */
  public static VoiceBuilder VOICE() {
    return new VoiceBuilder();
  }

  /**
   * 获得视频消息builder
   */
  public static VideoBuilder VIDEO() {
    return new VideoBuilder();
  }

  /**
   * 获得音乐消息builder
   */
  public static MusicBuilder MUSIC() {
    return new MusicBuilder();
  }


  /**
   * 获得图文消息（点击跳转到图文消息页面）builder
   */
  public static MpNewsBuilder MPNEWS() {
    return new MpNewsBuilder();
  }

  /**
   * 获得卡券消息builder
   */
  public static WxCardBuilder WXCARD() {
    return new WxCardBuilder();
  }

  public void setMsgType(String msgType) {
    this.msgType = msgType;
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

    public String getMusicUrl() {
        return musicUrl;
    }

    public void setMusicUrl(String musicUrl) {
        this.musicUrl = musicUrl;
    }

    public String getHqMusicUrl() {
        return hqMusicUrl;
    }

    public void setHqMusicUrl(String hqMusicUrl) {
        this.hqMusicUrl = hqMusicUrl;
    }

    public String getKfAccount() {
        return kfAccount;
    }

    public void setKfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getMpNewsMediaId() {
        return mpNewsMediaId;
    }

    public void setMpNewsMediaId(String mpNewsMediaId) {
        this.mpNewsMediaId = mpNewsMediaId;
    }



}
