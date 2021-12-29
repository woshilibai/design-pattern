package behavior.observer;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 11:12
 */
public class ConcreateSubject extends Subject {
    //  表示目标的状态
    private int state;

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer observer:observers){
            observer.update(state);
        }
    }
}
