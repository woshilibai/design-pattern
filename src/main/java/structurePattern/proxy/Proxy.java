package structurePattern.proxy;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 14:34
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        preRequest();
        subject.request();  //  请求被代理类的业务方法
        postRequest();
    }

    private void preRequest(){}
    private void postRequest(){}
}
