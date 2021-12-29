package createPattern.abstractFactory;


/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 11:47
 */
public interface Factory {
    //Product1和Product2属于一个产品族
    Product1 createProduct1();
    Product2 createProduct2();
}
