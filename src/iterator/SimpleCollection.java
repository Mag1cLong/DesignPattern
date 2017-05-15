package iterator;

/**
 * 迭代子模式
 * Created by Administrator on 2017/5/15.
 */
public class SimpleCollection implements Collection {
    private String[] array = {"A", "B", "C", "D", "E", "F", "G"};

    @Override
    public Iterator iterator() {
        return new SimpleIterator(this);
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        Collection collection = new SimpleCollection();
        Iterator iter = collection.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
