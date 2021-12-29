package createPattern.factoryMethod;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 11:48
 */
public class FactoryA implements Factory {
    public Product createProduct() {
        return new ProductA();
    }
}
