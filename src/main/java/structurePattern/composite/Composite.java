package structurePattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 10:32
 */
public class Composite extends Component {

    List<Component> children = new ArrayList<Component>();

    void add(Component c) {
        children.add(c);
    }

    void remove(Component c) {
        children.remove(c);
    }

    Component get(int i) {
        return children.get(i);
    }

    //  容器构件具体业务方法实现，将递归调用成员构件的业务方法
    void operation() {
        for (Component child : children){
            child.operation();
        }
    }
}
