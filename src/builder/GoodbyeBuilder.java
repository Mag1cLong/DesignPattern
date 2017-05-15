package builder;

/**
 * Created by Administrator on 2017/5/15.
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        autoMessage = new GoodbyeMessage();
    }

    @Override
    public void buildTitle() {
        autoMessage.setTitle("欢送标题");
    }

    @Override
    public void buildBody() {
        autoMessage.setBody("欢送内容");
    }
}
