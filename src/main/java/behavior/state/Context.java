package behavior.state;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 14:39
 */
//  环境类（存在状态）
public class Context {
    //  表示类的状态，用于接收外界的请求委派给state，并在state内部实现状态的切换
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    void request(){
        state.handle();
    }
}
