package behavior.observer;

import java.util.List;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 11:05
 */
public abstract class Subject {
    //  观察者列表
    protected List<Observer> observers;
    //  添加到目标的观察者集合中
    abstract void attach(Observer observer);
    //  从目标的观察者集合中删除
    abstract void detach(Observer observer);
    //  通知目标的所有观察者
    abstract void notifyObservers();
}
