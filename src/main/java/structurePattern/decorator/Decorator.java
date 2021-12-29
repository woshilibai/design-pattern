package structurePattern.decorator;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 11:29
 */
public class Decorator implements Component {
    //  持有一个对被装饰对象的引用
    Component component;

    //  通过构造函数注入被装饰对象
    public Decorator(Component component) {
        this.component = component;
    }

    //  调用被装饰对象的原业务方法
    public void operation() {
        component.operation();
    }
}
