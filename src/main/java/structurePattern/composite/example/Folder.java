package structurePattern.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 10:49
 */
public class Folder extends AbstractFile {

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    List<AbstractFile> children = new ArrayList<AbstractFile>();

    //  对组合成员的管理方法
    void add(AbstractFile child){
        children.add(child);
    }
    void remove(AbstractFile child){
        children.remove(child);
    }
    AbstractFile get(int i){
        return children.get(i);
    }
    //  业务方法
    void killVirus() {
        System.out.println("开始对目录{"+name+"}进行杀毒");
        for (AbstractFile child : children){
            child.killVirus();
        }
        System.out.println("结束对目录{"+name+"}进行杀毒");
    }
}
