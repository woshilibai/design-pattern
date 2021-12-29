package behavior.strategy;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 15:31
 */
public class Client {
    public static void main(String[] args) {
        //  客户端需要选择某个策略
        Context ctx = new Context(new ConcreateStrategyA());
        ctx.algorithm();
    }
}
