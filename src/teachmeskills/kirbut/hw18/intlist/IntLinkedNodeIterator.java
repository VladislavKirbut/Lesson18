package teachmeskills.kirbut.hw18.intlist;

import java.util.Iterator;

public class IntLinkedNodeIterator implements Iterator<Integer> {
    private IntLinkedNode node;

    public IntLinkedNodeIterator(IntLinkedNode node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        if (node != null) {
            node = node.getNextNode();
            return true;
        }

        return false;
    }

    @Override
    public Integer next() {
        if (node != null) {
            return node.getElement();
        }

        throw new IllegalArgumentException("The element doesn't exist.");
    }
}
