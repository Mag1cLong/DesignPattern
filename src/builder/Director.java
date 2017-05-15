package builder;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String from,String to){
        builder.buildFrom(from);
        builder.buildTo(to);
        builder.buildTitle();
        builder.buildBody();
        builder.buildSendDate("2017-05-15");
        builder.sendMessage();
    }

}
