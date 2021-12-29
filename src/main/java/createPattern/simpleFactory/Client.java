package createPattern.simpleFactory;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 11:27
 */
public class Client {
    public static void main(String[] args) {
        //  通过工厂类创建具体产品对象
        Product product = Factory.createProduct("A");
    }
}
