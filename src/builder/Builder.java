package builder;

/**
 * Created by Administrator on 2017/5/15.
 */
public abstract class Builder {
    protected AutoMessage autoMessage;

    public abstract void buildTitle();

    public abstract void buildBody();

    public void buildTo(String to) {
        autoMessage.setTo(to);
    }

    public void buildFrom(String from) {
        autoMessage.setFrom(from);
    }
    public void buildSendDate(String sendDate){
        autoMessage.setSendDate(sendDate);
    }
    public void sendMessage(){
        autoMessage.send();
    }
}
