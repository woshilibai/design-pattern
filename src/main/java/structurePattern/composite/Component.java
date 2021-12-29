package structurePattern.composite;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 10:27
 */
public abstract class Component {
    abstract void add(Component c);
    abstract void remove(Component c);
    abstract Component get(int i);
    abstract void operation();
}
