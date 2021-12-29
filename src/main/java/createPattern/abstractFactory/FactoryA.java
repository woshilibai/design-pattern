package createPattern.abstractFactory;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 13:56
 */
public class FactoryA implements Factory {
    public Product1 createProduct1() {
        return new ProductA1();
    }

    public Product2 createProduct2() {
        return new ProductA2();
    }
}
