package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式-浅度克隆
 * 浅度克隆只复制值对象，引用对象只是复制了地址
 * Created by Administrator on 2017/5/5.
 */
public class ShallowClone implements Cloneable{
    private String name;
    private List<String> list;
    public ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static void main(String[] args) throws Exception{
        ShallowClone s1 = new ShallowClone();
        s1.setName("s1");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        s1.setList(list);
        ShallowClone s2 = s1.clone();
        System.out.println("s1==s2?"+(s1==s2));
        System.out.println("s1.name="+s1.getName());
        System.out.println("s1.list="+s1.getList());
        s2.setName("s2");
        list.add("d");
        System.out.println("s2.name="+s2.getName());
        System.out.println("s2.list="+s2.getList());
        System.out.println("s1.name="+s1.getName());
        System.out.println("s1.list="+s1.getList());
    }
}
