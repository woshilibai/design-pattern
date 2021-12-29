package createPattern.builder;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 15:28
 */
public abstract class Builder {
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //  返回产品对象
    public Product getResult(){
        return product;
    }
}
