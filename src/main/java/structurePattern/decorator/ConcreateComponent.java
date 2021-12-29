package structurePattern.decorator;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 11:28
 */
public class ConcreateComponent implements Component {
    public void operation() {
        System.out.println("被装饰者对象ConcreateComponent执行operation方法");
    }
}
