package behavior.observer;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 11:06
 */
public interface Observer {
    //  观察者被通知时执行的业务方法
    void update(Object state);
}
