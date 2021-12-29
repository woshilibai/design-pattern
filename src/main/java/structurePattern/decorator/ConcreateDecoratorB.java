package structurePattern.decorator;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 11:47
 */
public class ConcreateDecoratorB extends Decorator {
    public ConcreateDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        //  调用原有业务方法
        super.operation();
        //  调用新增业务方法，完成额外职责的添加
        addedBehaviorB();
    }

    //  额外职责
    void addedBehaviorB(){
        System.out.println("这是为被装饰者对象添加的额外行为addedBehaviorB");
    }
}
