package cor;

/**
 * Created by Administrator on 2017/5/15.
 */
public abstract class Handler {
    private Handler nextHandler;
    private int reqType;

    public void doHandler(Request request){
        if(request!=null){
            if(request.getReqType()==getReqType()){
                handle(request);
            }else{
                if(getNextHandler()!=null){
                    getNextHandler().doHandler(request);
                }else{
                    System.out.println("责任链无对应handler");
                }
            }
        }else{
            System.out.println("请求为空");
        }

    }
    public abstract void handle(Request request);

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public int getReqType() {
        return reqType;
    }

    public void setReqType(int reqType) {
        this.reqType = reqType;
    }
}
