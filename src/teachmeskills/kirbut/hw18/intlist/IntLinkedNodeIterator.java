package teachmeskills.kirbut.hw18.intlist;

import java.util.Iterator;

public class IntLinkedNodeIterator implements Iterator<Integer> {
    private IntLinkedNode node;

    public IntLinkedNodeIterator(IntLinkedNode node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public Integer next() {
        if (node != null) {
            int element = node.getElement();
            node = node.getNextNode();
            return element;
        }

        throw new IllegalArgumentException("The element doesn't exist.");
    }
}
