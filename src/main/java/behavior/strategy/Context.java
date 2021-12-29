package behavior.strategy;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 15:28
 */
public class Context {
    //  具体的策略
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void algorithm(){
        strategy.algorithm();
    }
}
