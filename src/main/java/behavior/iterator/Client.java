package behavior.iterator;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 16:35
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreateAggregate();
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            //...
        }
    }
}
