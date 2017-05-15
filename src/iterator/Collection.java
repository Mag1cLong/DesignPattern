package iterator;

/**
 * Created by Administrator on 2017/5/15.
 */
public interface Collection {
    Iterator iterator();
    int size();
    Object get(int index);
}
