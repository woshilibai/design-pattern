package createPattern.prototype;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/27 16:03
 */
public class Prototype {
    private String attr;

    public Prototype clone(){
        Prototype prototype = new Prototype();
        prototype.setAttr(this.attr);
        return prototype;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }
}
