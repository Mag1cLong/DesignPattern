package cor;

/**
 * Created by Administrator on 2017/5/15.
 */
public class Test {
    public static void main(String[] args) {
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        Request request1 = new Request();
        request1.setReqType(1);
        request1.setContent("请求handler1");

        Request request2 = new Request();
        request2.setReqType(2);
        request2.setContent("请求handler2");

        Request request3 = new Request();
        request3.setReqType(3);
        request3.setContent("请求handler3");

        Request request4 = new Request();
        request4.setReqType(4);
        request4.setContent("请求handler4");

        handler1.doHandler(request1);
        handler1.doHandler(request2);
        handler1.doHandler(request3);
        handler1.doHandler(request4);

    }
}
