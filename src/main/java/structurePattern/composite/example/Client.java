package structurePattern.composite.example;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2021/12/28 10:35
 */
public class Client {
    public static void main(String[] args) {
        TextFile textFile1 = new TextFile("1号文件");
        TextFile textFile2 = new TextFile("2号文件");
        TextFile textFile3 = new TextFile("3号文件");
        TextFile textFile4 = new TextFile("4号文件");

        Folder folder1 = new Folder("1级目录");
        Folder folder2 = new Folder("2级目录");
        Folder folder3 = new Folder("3级目录");
        Folder folder4 = new Folder("4级目录");

        folder1.add(textFile1);
        folder2.add(textFile2);
        folder2.add(folder1);
        //....
        folder1.killVirus();
    }
}
