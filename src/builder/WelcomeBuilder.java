package builder;

/**
 * Created by Administrator on 2017/5/15.
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        autoMessage = new WelcomeMessage();
    }

    @Override
    public void buildTitle() {
        autoMessage.setTitle("欢迎标题");
    }

    @Override
    public void buildBody() {
        autoMessage.setBody("欢迎内容");
    }
}
