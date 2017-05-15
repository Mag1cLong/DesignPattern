package cor;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Handler1 extends Handler {
    public Handler1() {
        super.setReqType(1);
    }

    @Override
    public void handle(Request request) {
        System.out.println("请求类型："+request.getReqType());
        System.out.println("请求内容："+request.getContent());
    }
}
