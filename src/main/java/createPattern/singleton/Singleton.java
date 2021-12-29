package createPattern.singleton;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 11:55
 */
//volatile+DCL
public class Singleton {
    // volatile保证线程间变量可见性
    private static volatile Singleton instance = null;
    public static Singleton getInstance(){
        if (instance == null){  //第一重判断
            synchronized (Singleton.class){ //  进行锁定
                if (instance == null) { //第二重判断
                    return new Singleton(); //  创建实例
                }
            }
        }
        return instance;
    }
}
