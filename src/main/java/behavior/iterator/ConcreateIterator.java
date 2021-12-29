package behavior.iterator;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 16:32
 */
public class ConcreateIterator implements Iterator {
    //  持有一个对聚合对象的引用，以便访问存储在聚合对象中的元素
    private Aggregate aggregate;
    //  定义一个游标，记录当前访问的位置
    private int cursor;

    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}
