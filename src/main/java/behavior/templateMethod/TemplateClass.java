package behavior.templateMethod;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/29 16:02
 */
public abstract class TemplateClass {
    //  模板方法定义为final,避免子类重写
    public final void templateMethod(){
        operation1();
        operation2();
        operation3();
    }

    public abstract void operation1();
    public void operation2(){
        //  共享的方法
    }
    public abstract void operation3();
}
