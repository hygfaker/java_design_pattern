package 设计模式.构造者模式.builder.kefu;

/**
 * 获得消息builder
 * <pre>
 * 用法: WxMpKefuMessage m = WxMpKefuMessage.IMAGE().mediaId(...).toUser(...).build();
 * </pre>
 *
 * @author chanjarster
 */
public final class ImageBuilder extends BaseBuilder<ImageBuilder> {
  private String mediaId;

  public ImageBuilder() {
    this.msgType = WxConsts.KefuMsgType.IMAGE;
  }

  public ImageBuilder mediaId(String media_id) {
    this.mediaId = media_id;
    return this;
  }

  @Override
  public WxMpKefuMessage build() {
    WxMpKefuMessage m = super.build();
    m.setMediaId(this.mediaId);
    return m;
  }
}
