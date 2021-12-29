package structurePattern.adapter.composite;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 9:49
 */
//  适配器与被适配者进行组合的方式实现适配器模式
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    //  将对目标对象的请求转换为被适配者的请求
    public void request() {
        adaptee.specificRequest();
    }
}
