package cn.j2ee.response;

/**
 * Created by Rammus on 2017/11/15.
 */
public class ServerResponse<T> {
    private String msg;
    private int status;
    private T data;

    private ServerResponse() {
    }

    private ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(int status, T data) {
        this.status = status;
        this.data =data;
    }

    public static ServerResponse createBySuccess(String msg) {
        return new ServerResponse();
    }
}
