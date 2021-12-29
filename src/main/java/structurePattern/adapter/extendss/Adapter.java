package structurePattern.adapter.extendss;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 9:41
 */
//  适配器继承被适配者方式实现适配器模式
public class Adapter extends Adaptee implements Target {
    //  将对目标对象的请求转换为被适配者的请求
    public void request() {
        super.specificRequest();
    }
}
