package behavior.chain;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 15:57
 */
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreateHandlerA();
        Handler handlerB = new ConcreateHandlerB();
        //  创建责任链
        handlerA.setNext(handlerB);
        handlerB.setNext(null);
        //  发送请求
        handlerA.handleRequest("request");
    }
}
