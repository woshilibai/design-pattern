package behavior.state;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 14:50
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new ConcreateStateA());
        ctx.request();
    }
}
