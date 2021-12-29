package behavior.state;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 14:39
 */
public abstract class State {
    //  持有一个环境类的引用，用于切换环境对象的状态
    protected Context ctx;
    abstract void handle();
}
