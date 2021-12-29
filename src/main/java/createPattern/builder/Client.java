package createPattern.builder;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 15:34
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreateBuilder());
        Product product = director.construct();
    }
}
