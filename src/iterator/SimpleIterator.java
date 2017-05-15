package iterator;

/**
 * Created by Administrator on 2017/5/15.
 */
public class SimpleIterator implements Iterator {
    private Collection collection;
    private int position = -1;

    public SimpleIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size() - 1 ? true : false;
    }

    @Override
    public Object next() {
        return collection.get(++position);
    }
}
