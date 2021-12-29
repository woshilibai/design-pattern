package structurePattern.facade;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 14:02
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    void method1(){
        subSystemA.methodA();
        subSystemB.methodB();
    }

    void method2(){
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
