package behavior.templateMethod;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 16:08
 */
public class Client {
    public static void main(String[] args) {
        TemplateClass templateClass = new ConcrateTemplate();
        //  请求模板方法
        templateClass.templateMethod();
    }
}
