package behavior.iterator;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 16:32
 */
public class ConcreateAggregate implements Aggregate {
    //  其他属性和方法

    //  获取当前聚合对象的迭代器对象
    public Iterator createIterator() {
        return new ConcreateIterator();
    }
}
