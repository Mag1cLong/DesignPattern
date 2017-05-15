package cor;

/**
 * Created by Administrator on 2017/5/15.
 */
public  class Request {
    private int reqType = 0;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReqType() {
        return reqType;
    }

    public void setReqType(int reqType) {
        this.reqType = reqType;
    }
}
