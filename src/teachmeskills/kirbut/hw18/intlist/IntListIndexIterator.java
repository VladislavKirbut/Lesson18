package teachmeskills.kirbut.hw18.intlist;

import java.util.Iterator;

public class IntListIndexIterator implements Iterator<Integer> {
    private final IntList list;
    private int i = 0;

    public IntListIndexIterator(IntArrayList list) {
        if (list == null) throw new IllegalArgumentException("Enter a correct parameter");
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return i < list.size();
    }

    @Override
    public Integer next() {
        int element = list.get(i);
        i++;
        return element;
    }
}
