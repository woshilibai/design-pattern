package behavior.observer;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 11:14
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreateSubject();
        Observer observer = new ConcreateObserver();
        //  将observer添加到subject的观察者列表中
        subject.attach(observer);
        //  subject的状态state发生变化
        subject.notifyObservers();
    }
}
