package structurePattern.facade;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 14:05
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.setSubSystemA(new SubSystemA());
        facade.setSubSystemB(new SubSystemB());
        facade.setSubSystemC(new SubSystemC());
        facade.method1();
        facade.method2();
    }
}
