package behavior.state;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 14:42
 */
public class ConcreateStateB extends State {
    public void handle() {
        System.out.println("行为B");
        //  状态切换到null,可以定义一个终止状态，这里躲懒
        ctx.setState(null);
    }
}
