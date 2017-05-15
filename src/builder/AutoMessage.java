package builder;

/**
 * Created by Administrator on 2017/5/15.
 */
public abstract class AutoMessage {
    private String from;
    private String to;
    private String title;
    private String body;
    private String sendDate;

    public void send(){
        System.out.println("收件人："+to);
        System.out.println("发件人："+from);
        System.out.println("标题："+title);
        System.out.println("内容："+body);
        System.out.println("发送日期："+sendDate);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
}
