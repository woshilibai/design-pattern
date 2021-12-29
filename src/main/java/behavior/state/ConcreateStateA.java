package behavior.state;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 14:40
 */
public class ConcreateStateA extends State {

    public void handle() {
        System.out.println("行为A");
        //  状态切换到B
        ctx.setState(new ConcreateStateB());
    }
}
