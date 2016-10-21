import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

/**
 * Created by 张巍 on 2016/10/20.
 */
public class Human {
    static String name;
    private static String sex;
    static int age;

    public Human(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = 500;
    }

    public static void introduce(int i) {
        System.out.println("前辈#"+i);
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" +age);
        System.out.println("-----------------------------------------------------");
    }
}
