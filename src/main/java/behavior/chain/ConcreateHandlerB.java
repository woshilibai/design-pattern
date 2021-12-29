package behavior.chain;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 15:54
 */
public class ConcreateHandlerB extends Handler {

    public void handleRequest(String request) {
        if(true){
            //  处理请求
        } else {
            next.handleRequest(request);
        }
    }
}
