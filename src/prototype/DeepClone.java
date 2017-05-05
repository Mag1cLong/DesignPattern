package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式-深度克隆
 * 深度克隆要深入到多少层，是一个不易确定的问题。
 * 在决定以深度克隆的方式复制一个对象的时候，必须决定对间接复制的对象时采取浅度克隆还是继续 采用深度克隆。
 * 因此，在采取深度克隆时，需要决定多深才算深。此外，在深度克隆的过程中，很可能会出现循环引用的问题，必须小心处理。
 */
public class DeepClone implements Cloneable{
    private List<String> list;


    public DeepClone clone() throws CloneNotSupportedException {
        DeepClone d = (DeepClone) super.clone();
        if (list != null) {
            List<String> l = new ArrayList<>();
            for (String str : list) {
                l.add(str);
            }
            setList(l);
        }
        return d;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public static void main(String[] args) throws Exception {
        DeepClone s1 = new DeepClone();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        s1.setList(list);
        DeepClone s2 = s1.clone();
        System.out.println("s1==s2?" + (s1 == s2));
        System.out.println("s1.list=" + s1.getList());
        System.out.println("s2.list=" + s2.getList());
        list.add("d");
        System.out.println("s1.list=" + s1.getList());
        System.out.println("s2.list=" + s2.getList());

    }
}
