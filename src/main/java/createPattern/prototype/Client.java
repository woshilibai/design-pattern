package createPattern.prototype;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 16:10
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setAttr("abc");
        Prototype clone = prototype.clone();
    }
}
