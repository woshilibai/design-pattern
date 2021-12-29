package createPattern.simpleFactory;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 11:20
 */
public class Factory {
    public static Product createProduct(String name){
        Product product = null;
        if (name.equals("A")) {
            product = new ProductA();
        } else if (name.equals("B")){
            product = new ProductB();
        }
        return product;
    }
}
