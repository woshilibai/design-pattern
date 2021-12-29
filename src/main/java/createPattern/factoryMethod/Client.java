package createPattern.factoryMethod;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 11:50
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.createProduct();
    }
}
